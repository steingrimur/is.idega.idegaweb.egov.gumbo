package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.fjs.secure.Gjald;
import is.fjs.secure.Haus;
import is.fjs.secure.ServiceLocator;
import is.fjs.secure.ServiceSoap;
import is.fjs.secure.TBRGjaldskra;
import is.fjs.secure.TBRGjaldskraSvar;
import is.fjs.secure.TBRStadaKrofu;
import is.fjs.secure.TBRStadaKrofuSvar;
import is.fjs.secure.TBRStadaSkips;
import is.fjs.secure.TBRStadaSkipsSvar;
import is.fjs.secure.TBRStofnaKrofu;
import is.fjs.secure.TBRStofnaKrofuSvar;
import is.fjs.secure.TBRSundurlidun;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.List;

import javax.xml.rpc.ServiceException;

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
		try {
			TBRStadaSkips iStadaSkips = new TBRStadaSkips(getHeader(), shipNr);
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

	private Haus getHeader() {
		Haus header = new Haus();

		IWMainApplicationSettings settings = IWMainApplication
				.getDefaultIWApplicationContext().getApplicationSettings();
		header.setAdgangsord(settings.getProperty(PASSWORD_ATTRIBUTE_NAME,
				"FKS_Ysa"));
		header.setKerfi(settings.getProperty(SYSTEM_ATTRIBUTE_NAME, "FKS"));
		header.setNotandi(settings.getProperty(USER_NAME_ATTRIBUTE_NAME,
				"FKS_Test"));
		// header.setRadnrSkeytis(radnrSkeytis);

		return header;
	}

	public String createLicenseFeeClaim(String ssn, String shipNr, List<FeeEntry> entries) {
		IWMainApplicationSettings settings = IWMainApplication
				.getDefaultIWApplicationContext().getApplicationSettings();

		String DOFSSN = "6608922069";
		String DOFCode = "9635";

		String period = getPeriod(ssn, shipNr);

		TBRSundurlidun wsEntries[] = new TBRSundurlidun[entries.size()];
		int counter = 0;
		for (FeeEntry entry : entries) {
			wsEntries[counter++] = new TBRSundurlidun(entry.getCode(), new BigDecimal(entry.getAmount()), new BigDecimal(1), new BigDecimal(entry.getAmount()), entry.getReference());
		}
		
		TBRStofnaKrofu iStofnaKrofu = new TBRStofnaKrofu(getHeader(),
				wsEntries, DOFCode, ssn, "FV2", shipNr, period, DOFSSN);
		try {
			TBRStofnaKrofuSvar ret = getPort().stofnaKrofuVeidileyfi(iStofnaKrofu);
			if (ret.getSvarHaus().getKodi() == 0l) {
				return ret.getLykill();
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}

	public class FeeEntry {
		private String code = null;
		private int amount = 0;
		private String reference = null;
		
		public FeeEntry(String code, int amount, String reference) {
			this.code = code;
			this.amount = amount;
			this.reference = reference;
		}
		
		public void setCode(String code) {
			this.code = code;
		}
		
		public void setAmount(int amount) {
			this.amount = amount;
		}
		
		public void setReference(String reference) {
			this.reference = reference;
		}
		
		public String getCode() {
			return this.code;
		}
		
		public int getAmount() {
			return this.amount;
		}
		
		public String getReference() {
			return this.reference;
		}
	}
	
	private String getPeriod(String ssn, String shipNr) {
		IWTimestamp now = new IWTimestamp();
		now.setMinimalDaysInFirstWeek(7);
		
		int week = now.getWeekOfYear();
		int year = now.getYear();

		
		
		return now.getDateString("yyyy-ww");
	}

	public boolean cancelLicenseFeeClaim() {

		return false;
	}

	public boolean getIsLicenseFeeClaimPaid(String ssn, String shipNr,
			String claimNumber) {

		try {
			TBRStadaKrofu iStadaKrofu = new TBRStadaKrofu(getHeader(), ssn,
					shipNr, claimNumber);
			TBRStadaKrofuSvar ret = getPort().saekjaStoduKrofu(iStadaKrofu);

			// ret.getSvarHaus().get
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return false;
	}

	public static void main(String args[]) {
		IWTimestamp now = new IWTimestamp();
		now.setMinimalDaysInFirstWeek(7);
		System.out.println("week = " + now.getWeekOfYear());
		System.out.println("period = " + now.getDateString("yyyy-ww"));
/*		try {
			ServiceLocator locator = new ServiceLocator();
			ServiceSoap port = locator.getServiceSoap(new URL(
					"http://securep.fjs.is/webfjs/ws-fks/service.asmx"));

			Haus haus = new Haus();
			haus.setAdgangsord("FKS_Ysa");
			haus.setKerfi("FKS");
			haus.setNotandi("FKS_Test");
			// haus.setRadnrSkeytis("1");

//			TBRStadaSkips iStadaSkips = new TBRStadaSkips(haus, "2478");
//			TBRStadaSkipsSvar ret = port.saekjaStoduSkips(iStadaSkips);
//
//			if (ret != null) {
//				System.out.println("ret.getSkuldMillifaerslnaKvota() = "
//						+ ret.getSkuldMillifaerslnaKvota().intValue());
//				System.out.println("ret.getSkuldVeidigjalds() = "
//						+ ret.getSkuldVeidigjalds().intValue());
//				System.out.println("ret.getSkuldVeidileyfis() = "
//						+ ret.getSkuldVeidileyfis().intValue());
//			} else {
//				System.out.println("nothing returned");
//			}

			
			 TBRGjaldskra iGjaldskra = new TBRGjaldskra(haus, "6608922069");
			  TBRGjaldskraSvar ret = port.saekjaGjaldskra(iGjaldskra);
			  
			  if (ret.getSvarHaus().getKodi() == 0) { Gjald fees[] =
			  ret.getGjold(); for (int i = 0; i < fees.length; i++) {
			  System.out.println("fee: " + fees[i].getSkyrsluform() + ", " +
			  fees[i].getGjaldkodi() + ", " + fees[i].getUpphaed() + ", " +
			  fees[i].getTexti()); } } else { System.out.println("error : " +
			  ret.getSvarHaus().getSkyring() + ", " +
			  ret.getSvarHaus().getNanariSkyring()); }
			 

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}*/
	}
}