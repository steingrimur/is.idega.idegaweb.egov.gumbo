package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIR_PortType;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIR_ServiceLocator;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlandanirbyskipElement;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeUser;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIP_PortType;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIP_ServiceLocator;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfobyutgerdElement;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;

import java.math.BigDecimal;
import java.net.URL;
import java.rmi.RemoteException;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.idegaweb.IWMainApplication;
import com.idega.util.IWTimestamp;

@Scope("singleton")
@Service("dofWSClient")
public class DOFWSClient {
	private static final String SHIP_DEFAULT_ENDPOINT = "http://hafrok.hafro.is/FSWebServices/FSWebServiceSKIPSoap12HttpPort";
	private static final String SHIP_ENDPOINT_ATTRIBUTE_NAME = "dofws_ship_endpoint";

	private static final String CATCH_DEFAULT_ENDPOINT = "http://hafrok.hafro.is/FSWebServices/FSWebServiceLANDANIRSoap12HttpPort";
	private static final String CATCH_ENDPOINT_ATTRIBUTE_NAME = "dofws_catch_endpoint";

	private FSWebServiceSKIP_PortType getShipPort() {
		try {
			String endPoint = IWMainApplication
					.getDefaultIWApplicationContext().getApplicationSettings()
					.getProperty(SHIP_ENDPOINT_ATTRIBUTE_NAME,
							SHIP_DEFAULT_ENDPOINT);

			FSWebServiceSKIP_ServiceLocator locator = new FSWebServiceSKIP_ServiceLocator();
			FSWebServiceSKIP_PortType port = locator.getFSWebServiceSKIPSoap12HttpPort(new URL(endPoint));

			//((org.apache.axis.client.Stub) port).setTimeout(timeout)

			return port;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private FSWebServiceLANDANIR_PortType getCatchPort() {
		try {
			String endPoint = IWMainApplication
					.getDefaultIWApplicationContext().getApplicationSettings()
					.getProperty(CATCH_ENDPOINT_ATTRIBUTE_NAME,
							CATCH_DEFAULT_ENDPOINT);

			FSWebServiceLANDANIR_ServiceLocator locator = new FSWebServiceLANDANIR_ServiceLocator();
			FSWebServiceLANDANIR_PortType port = locator.getFSWebServiceLANDANIRSoap12HttpPort(new URL(endPoint));

			//((org.apache.axis.client.Stub) port).setTimeout(timeout)

			return port;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}
	
	public SkipInfoTypeUser[] getShipInfoByCompanySSN(String companySSN) {
		try {
			GetskipinfobyutgerdElement parameter = new GetskipinfobyutgerdElement(companySSN);
			return getShipPort().getskipinfobyutgerd(parameter);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public LondunTypeUser[] getCatchInfoByShipNumber(BigDecimal shipNumber, IWTimestamp from, IWTimestamp to) {
		try {
			GetlandanirbyskipElement parameter = new GetlandanirbyskipElement(shipNumber, from.getCalendar(), to.getCalendar());
			return getCatchPort().getlandanirbyskip(parameter);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}