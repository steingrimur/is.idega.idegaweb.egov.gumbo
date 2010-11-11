package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.FSWebServiceAFLAMARK_PortType;
import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.FSWebServiceAFLAMARK_ServiceLocator;
import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.types.AflamarkTypeUser;
import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.types.GetaflamarkElement;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIR_PortType;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIR_ServiceLocator;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlandanirbyskipElement;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlondunafliElement;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunAfliTypeUser;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeUser;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIP_PortType;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIP_ServiceLocator;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfobyutgerdElement;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.Calendar;

import javax.xml.rpc.ServiceException;

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

	private static final String CATCH_QUOTA_DEFAULT_ENDPOINT = "http://hafrok.hafro.is/FSWebServices/FSWebServiceAFLAMARKSoap12HttpPort";
	private static final String CATCH_QUOTA_ENDPOINT_ATTRIBUTE_NAME = "dofws_catch_quota_endpoint";

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
	
	private FSWebServiceAFLAMARK_PortType getCatchQuotaPort() {
		try {
			String endPoint = IWMainApplication
					.getDefaultIWApplicationContext().getApplicationSettings()
					.getProperty(CATCH_QUOTA_ENDPOINT_ATTRIBUTE_NAME,
							CATCH_QUOTA_DEFAULT_ENDPOINT);

			FSWebServiceAFLAMARK_ServiceLocator locator = new FSWebServiceAFLAMARK_ServiceLocator();
			FSWebServiceAFLAMARK_PortType port = locator.getFSWebServiceAFLAMARKSoap12HttpPort(new URL(endPoint));

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
	
	public LondunTypeUser[] getCatchInfoByShipNumber(BigDecimal shipNumber, Calendar from, Calendar to) {
		try {
			GetlandanirbyskipElement parameter = new GetlandanirbyskipElement(shipNumber, from, to);
			return getCatchPort().getlandanirbyskip(parameter);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public LondunAfliTypeUser[] getCatchInfoByNumberAndPort(BigDecimal catchNumber, BigDecimal port) {
		try {
			GetlondunafliElement parameter = new GetlondunafliElement(port, catchNumber);
			return getCatchPort().getlondunafli(parameter);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public AflamarkTypeUser[] getCatchQuota(BigDecimal shipNumber, String period) {
		try {
			GetaflamarkElement parameter = new GetaflamarkElement(shipNumber, period);
			return getCatchQuotaPort().getaflamark(parameter);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public static void main(String[] arguments) {
		try {
			FSWebServiceAFLAMARK_ServiceLocator locator = new FSWebServiceAFLAMARK_ServiceLocator();
			FSWebServiceAFLAMARK_PortType port = locator.getFSWebServiceAFLAMARKSoap12HttpPort(new URL("http://hafrok.hafro.is/FSWebServices/FSWebServiceAFLAMARKSoap12HttpPort"));
			
			GetaflamarkElement parameter = new GetaflamarkElement(new BigDecimal(1578), "0910");
			AflamarkTypeUser[] array = port.getaflamark(parameter);
			for (AflamarkTypeUser afli : array) {
				System.out.println(afli.getKvotategundHeiti() + " - " + afli.getAflamark());
			}
		}
		catch (ServiceException se) {
			se.printStackTrace();
		}
		catch (MalformedURLException e) {
			e.printStackTrace();
		}
		catch (RemoteException re) {
			re.printStackTrace();
		}
	}
}