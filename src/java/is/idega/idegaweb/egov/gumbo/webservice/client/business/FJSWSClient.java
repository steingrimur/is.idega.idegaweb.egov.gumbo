package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.fjs.secure.Haus;
import is.fjs.secure.ServiceLocator;
import is.fjs.secure.ServiceSoap;
import is.fjs.secure.TBRFellaNidurKrofu;
import is.fjs.secure.TBRFellaNidurKrofuSvar;
import is.fjs.secure.TBRStadaKrofu;
import is.fjs.secure.TBRStadaKrofuSvar;
import is.fjs.secure.TBRStadaSkips;
import is.fjs.secure.TBRStadaSkipsSvar;
import is.fjs.secure.TBRStofnaKrofu;
import is.fjs.secure.TBRStofnaKrofuSvar;
import is.fjs.secure.TBRSundurlidun;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.ProcessPaymentCode;
import is.idega.idegaweb.egov.gumbo.data.ProcessPaymentLog;
import is.idega.idegaweb.egov.gumbo.data.ProcessPaymentLogHeader;
import is.idega.idegaweb.egov.gumbo.data.ShipClaimPeriod;

import java.math.BigDecimal;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWMainApplicationSettings;
import com.idega.util.IWTimestamp;

@Service
@Scope("singleton")
public class FJSWSClient {
	private static final String DEFAULT_ENDPOINT = "http://securep.fjs.is/webfjs/ws-fks/service.asmx";
	private static final String ENDPOINT_ATTRIBUTE_NAME = "fjsws_endpoint";

	private static final String USER_NAME_ATTRIBUTE_NAME = "fjsws_user_name";
	private static final String PASSWORD_ATTRIBUTE_NAME = "fjsws_password";
	private static final String SYSTEM_ATTRIBUTE_NAME = "fjsws_system";

	@Autowired
	private GumboDao gumboDAO;

	private ServiceSoap getPort() {
		try {
			String endPoint = IWMainApplication
					.getDefaultIWApplicationContext().getApplicationSettings()
					.getProperty(ENDPOINT_ATTRIBUTE_NAME, DEFAULT_ENDPOINT);

			ServiceLocator locator = new ServiceLocator();
			ServiceSoap port = locator.getServiceSoap(new URL(endPoint));

			// ((org.apache.axis.client.Stub) port).setTimeout(timeout)

			return port;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public boolean getIsInDebt(String shipNr) {
		if (shipNr != null && !"".equals(shipNr)) {
			if (shipNr.length() < 4) {
				shipNr = "0000".substring(0, 4 - shipNr.length()) + shipNr;
			}
		} 
		
		try {
			TBRStadaSkips iStadaSkips = new TBRStadaSkips(getHeader(null),
					shipNr);
			TBRStadaSkipsSvar ret = getPort().saekjaStoduSkips(iStadaSkips);

			if (ret != null) {
				if (ret.getSkuldMillifaerslnaKvota().intValue() > 0
						|| ret.getSkuldVeidigjalds().intValue() > 0
						|| ret.getSkuldVeidileyfis().intValue() > 0) {
					return true;
				} else {
					return false;
				}
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return true;
	}

	private Haus getHeader(ProcessPaymentLogHeader logHeader) {
		Haus header = new Haus();

		IWMainApplicationSettings settings = IWMainApplication
				.getDefaultIWApplicationContext().getApplicationSettings();
		header.setAdgangsord(settings.getProperty(PASSWORD_ATTRIBUTE_NAME,
				"FKS_Ysa"));
		header.setKerfi(settings.getProperty(SYSTEM_ATTRIBUTE_NAME, "FKS"));
		header.setNotandi(settings.getProperty(USER_NAME_ATTRIBUTE_NAME,
				"FKS_Test"));
		if (logHeader != null) {
			header.setRadnrSkeytis(logHeader.getId().toString());
		}

		return header;
	}

	public String createLicenseFeeClaim(String ssn, String shipNr,
			List<ProcessPaymentCode> entries) {
		IWMainApplicationSettings settings = IWMainApplication
				.getDefaultIWApplicationContext().getApplicationSettings();

		String DOFSSN = settings.getProperty("DOFSSN", "6608922069");
		String DOFCode = settings.getProperty("DOFCompanyCode", "9635");

		String period = getPeriod(ssn, shipNr);

		ProcessPaymentLogHeader header = getGumboDAO().createHeader();

		if (shipNr != null && !"".equals(shipNr)) {
			if (shipNr.length() < 4) {
				shipNr = "0000".substring(0, 4 - shipNr.length()) + shipNr;
			}
		} 
		
		TBRSundurlidun wsEntries[] = new TBRSundurlidun[entries.size()];
		int counter = 0;
		ProcessPaymentLog log = null;
		for (ProcessPaymentCode entry : entries) {
			log = getGumboDAO().createLogEntry(header, ssn, shipNr, period,
					entry.getPaymentCode(), 1, entry.getAmount(),
					entry.getAmount());
			wsEntries[counter++] = new TBRSundurlidun(entry.getPaymentCode(),
					new BigDecimal(1), new BigDecimal(entry.getAmount()),
					new BigDecimal(entry.getAmount()), log.getId().toString());
		}

		TBRStofnaKrofu iStofnaKrofu = new TBRStofnaKrofu(getHeader(header),
				wsEntries, DOFCode, ssn, "FV2", shipNr, period, DOFSSN);
		try {
			TBRStofnaKrofuSvar ret = getPort().stofnaKrofuVeidileyfi(
					iStofnaKrofu);
			getGumboDAO().updateHeader(header, ret.getSvarHaus().getKodi(),
					ret.getSvarHaus().getSkyring(), ret.getLykill());
			if (ret.getSvarHaus().getKodi() != 0) {
				System.out.println("FJS ERROR = " + ret.getSvarHaus().getSkyring() + ", " + ret.getSvarHaus().getNanariSkyring());
			}
			return ret.getLykill();
		} catch (RemoteException e) {
			getGumboDAO().updateHeader(header, -1l, e.getMessage(), "-1"); // Have to get this to commit somehow, independant of the rest of the process?
			System.out.println("FJS ERROR = " + e.getMessage());
			e.printStackTrace();
		}

		return null;
	}

	private String getPeriod(String ssn, String shipNr) {
		IWTimestamp now = new IWTimestamp();
		now.setMinimalDaysInFirstWeek(7);

		int week = now.getWeekOfYear();
		int year = now.getYear();

		String period = now.getDateString("yyyyww");

		ShipClaimPeriod scp = getGumboDAO().getShipClaimPeriod(ssn, shipNr);
		if (scp == null) {
			getGumboDAO()
					.createShipClaimPeriod(ssn, shipNr, period, week, year);
			return period;
		} else {
			while (scp.getYear() >= year && scp.getWeek() >= week) {
				now.addDays(7);
				week = now.getWeekOfYear();
				year = now.getYear();
			}
		}

		period = now.getDateString("yyyyww");

		getGumboDAO().updateShipClaimPeriod(scp, period, week, year);

		return period;
	}

	public boolean cancelLicenseFeeClaim(String claimKey) {
		ProcessPaymentLogHeader header = getGumboDAO().createHeader();
		getGumboDAO().createLogEntry(header, claimKey);
		
		TBRFellaNidurKrofu iFellaNidur = new TBRFellaNidurKrofu(getHeader(header), claimKey);
		try {
			TBRFellaNidurKrofuSvar ret = getPort().fellaNidurKrofu(iFellaNidur);
			getGumboDAO().updateHeader(header, ret.getSvarHaus().getKodi(),
					ret.getSvarHaus().getSkyring(), claimKey);
			
			if (ret.getSvarHaus().getKodi() == 0) {
				return true;
			}
		} catch (RemoteException e) {
		}
		
		return false;
	}

	public boolean getIsLicenseFeeClaimPaid(String ssn, String shipNr,
			String claimNumber) {

		if (shipNr != null && !"".equals(shipNr)) {
			if (shipNr.length() < 4) {
				shipNr = "0000".substring(0, 4 - shipNr.length()) + shipNr;
			}
		} 

		try {
			TBRStadaKrofu iStadaKrofu = new TBRStadaKrofu(getHeader(null), ssn,
					shipNr, claimNumber);
			TBRStadaKrofuSvar ret = getPort().saekjaStoduKrofu(iStadaKrofu);
			
			if (ret.getAlagning().intValue() == 0) {
				//Krafa felld nidur, what to do!!!
				return false;
			}
			
			if (ret.getStada().intValue() <= 0 && ret.getAlagning().intValue() > 0) {
				return true;
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return false;
	}

	private GumboDao getGumboDAO() {
		return gumboDAO;
	}

	public static void main(String args[]) {
		String shipNr = "1002";
		
		if (shipNr != null && !"".equals(shipNr)) {
			if (shipNr.length() < 4) {
				shipNr = "0000".substring(0, 4 - shipNr.length()) + shipNr;
			}
		} 

		System.out.println("shipNr = " + shipNr);
	}
}