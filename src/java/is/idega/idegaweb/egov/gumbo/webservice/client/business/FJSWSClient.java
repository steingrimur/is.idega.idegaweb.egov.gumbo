package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.fjs.secure.Haus;
import is.fjs.secure.ServiceLocator;
import is.fjs.secure.ServiceSoap;
import is.fjs.secure.TBRStadaSkips;
import is.fjs.secure.TBRStadaSkipsSvar;

import java.net.URL;
import java.rmi.RemoteException;

import com.idega.idegaweb.IWMainApplication;

public class FJSWSClient {
	private static final String DEFAULT_ENDPOINT = "http://securep.fjs.is/webfjs/ws-fks/service.asmx";
	private static final String ENDPOINT_ATTRIBUTE_NAME = "fjsws_endpoint";
	
	private ServiceSoap getPort() {
		try {
			String endPoint = IWMainApplication
			        .getDefaultIWApplicationContext()
			        .getApplicationSettings()
			        .getProperty(ENDPOINT_ATTRIBUTE_NAME,
			        		DEFAULT_ENDPOINT);
			
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
				if (ret.getSkuldMillifaerslnaKvota().intValue() > 0 || ret.getSkuldVeidigjalds().intValue() > 0 || ret.getSkuldVeidileyfis().intValue() > 0) {
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
		
		return header;
	}
	
}