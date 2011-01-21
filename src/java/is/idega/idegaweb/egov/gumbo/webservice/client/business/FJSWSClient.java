package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.fjs.secure.Gjald;
import is.fjs.secure.Haus;
import is.fjs.secure.ServiceLocator;
import is.fjs.secure.ServiceSoap;
import is.fjs.secure.TBRGjaldskra;
import is.fjs.secure.TBRGjaldskraSvar;
import is.fjs.secure.TBRStadaSkips;
import is.fjs.secure.TBRStadaSkipsSvar;

import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;

import javax.xml.rpc.ServiceException;

import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWMainApplicationSettings;

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

	public boolean getIsInDept(String shipNr) {
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
		header.setAdgangsord(settings.getProperty(PASSWORD_ATTRIBUTE_NAME, "FKS_Ysa"));
		header.setKerfi(settings.getProperty(SYSTEM_ATTRIBUTE_NAME, "FKS"));
		header.setNotandi(settings.getProperty(USER_NAME_ATTRIBUTE_NAME, "FKS_Test"));
		// header.setRadnrSkeytis(radnrSkeytis);

		return header;
	}

	public boolean createLicenseFeeClaim() {
		// TBRStofnaKrofu iStofnaKrofu = new TBRStofnaKrofu(haus, sundurlidun,
		// embaetti, ktalaGjaldanda, skyrsluform, gjaldgrunnur, timabil,
		// ktalaStarfsmanns);
		// TBRStofnaKrofuSvar ret = getPort().stofnaVeidileyfi(iStofnaKrofu);

		return false;
	}

	public static void main(String args[]) {
		try {
			ServiceLocator locator = new ServiceLocator();
			ServiceSoap port = locator.getServiceSoap(new URL(
					"http://securep.fjs.is/webfjs/ws-fks/service.asmx"));

			Haus haus = new Haus();
			haus.setAdgangsord("FKS_Ysa");
			haus.setKerfi("FKS");
			haus.setNotandi("FKS_Test");
			// haus.setRadnrSkeytis("1");

			TBRGjaldskra iGjaldskra = new TBRGjaldskra(haus, "6608922069");
			TBRGjaldskraSvar ret = port.saekjaGjaldskra(iGjaldskra);

			if (ret.getSvarHaus().getKodi() == 0) {
				Gjald fees[] = ret.getGjold();
				for (int i = 0; i < fees.length; i++) {
					System.out.println("fee: " + fees[i].getSkyrsluform()
							+ ", " + fees[i].getGjaldkodi() + ", "
							+ fees[i].getUpphaed() + ", " + fees[i].getTexti());
				}
			} else {
				System.out.println("error : " + ret.getSvarHaus().getSkyring()
						+ ", " + ret.getSvarHaus().getNanariSkyring());
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
	}
}