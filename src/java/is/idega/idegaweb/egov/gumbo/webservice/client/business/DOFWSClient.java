package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl.FSWebServiceADILI_PortType;
import is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl.FSWebServiceADILI_ServiceLocator;
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
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiphefurgilthaffaeriElement;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskiphefurgilthaffaeriResponseElement;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoElement;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoResponseElement;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfobyutgerdElement;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.FSWebServiceVEIDILEYFI_PortType;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.FSWebServiceVEIDILEYFI_ServiceLocator;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefuraflamarksveidilElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefuraflamarksveidilResponseElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurstrandveidileyfiElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurstrandveidileyfiResponseElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurveidileyfiElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.types.GethefurveidileyfiResponseElement;

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

	private static final String MEMBER_DEFAULT_ENDPOINT = "http://hafrok.hafro.is/FSWebServices/FSWebServiceADILISoap12HttpPort";
	private static final String MEMBER_ENDPOINT_ATTRIBUTE_NAME = "dofws_member_endpoint";

	private static final String LICENSE_DEFAULT_ENDPOINT = "http://hafrok.hafro.is/FSWebServices/FSWebServiceVEIDILEYFISoap12HttpPort";
	private static final String LICENSE_ENDPOINT_ATTRIBUTE_NAME = "dofws_license_endpoint";

	private FSWebServiceSKIP_PortType getShipPort() {
		try {
			String endPoint = IWMainApplication
					.getDefaultIWApplicationContext()
					.getApplicationSettings()
					.getProperty(SHIP_ENDPOINT_ATTRIBUTE_NAME,
							SHIP_DEFAULT_ENDPOINT);

			FSWebServiceSKIP_ServiceLocator locator = new FSWebServiceSKIP_ServiceLocator();
			FSWebServiceSKIP_PortType port = locator
					.getFSWebServiceSKIPSoap12HttpPort(new URL(endPoint));

			// ((org.apache.axis.client.Stub) port).setTimeout(timeout)

			return port;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private FSWebServiceLANDANIR_PortType getCatchPort() {
		try {
			String endPoint = IWMainApplication
					.getDefaultIWApplicationContext()
					.getApplicationSettings()
					.getProperty(CATCH_ENDPOINT_ATTRIBUTE_NAME,
							CATCH_DEFAULT_ENDPOINT);

			FSWebServiceLANDANIR_ServiceLocator locator = new FSWebServiceLANDANIR_ServiceLocator();
			FSWebServiceLANDANIR_PortType port = locator
					.getFSWebServiceLANDANIRSoap12HttpPort(new URL(endPoint));

			// ((org.apache.axis.client.Stub) port).setTimeout(timeout)

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


			return port;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private FSWebServiceADILI_PortType getMemberPort() {
		try {
			String endPoint = IWMainApplication
					.getDefaultIWApplicationContext()
					.getApplicationSettings()
					.getProperty(MEMBER_ENDPOINT_ATTRIBUTE_NAME,
							MEMBER_DEFAULT_ENDPOINT);

			FSWebServiceADILI_ServiceLocator locator = new FSWebServiceADILI_ServiceLocator();
			FSWebServiceADILI_PortType port = locator
					.getFSWebServiceADILISoap12HttpPort(new URL(endPoint));

			// ((org.apache.axis.client.Stub) port).setTimeout(timeout)

			return port;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private FSWebServiceVEIDILEYFI_PortType getLicensePort() {
		try {
			String endPoint = IWMainApplication
					.getDefaultIWApplicationContext()
					.getApplicationSettings()
					.getProperty(LICENSE_ENDPOINT_ATTRIBUTE_NAME,
							LICENSE_DEFAULT_ENDPOINT);

			FSWebServiceVEIDILEYFI_ServiceLocator locator = new FSWebServiceVEIDILEYFI_ServiceLocator();
			FSWebServiceVEIDILEYFI_PortType port = locator
					.getFSWebServiceVEIDILEYFISoap12HttpPort(new URL(endPoint));

			// ((org.apache.axis.client.Stub) port).setTimeout(timeout)

			return port;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public SkipInfoTypeUser[] getShipInfoByCompanySSN(String companySSN) {
		try {
			GetskipinfobyutgerdElement parameter = new GetskipinfobyutgerdElement(
					companySSN);
			return getShipPort().getskipinfobyutgerd(parameter);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}

	public SkipInfoTypeUser getShipInfo(String shipID) {
		GetskipinfoElement parameter = new GetskipinfoElement(new BigDecimal(
				shipID));

		try {
			GetskipinfoResponseElement res = getShipPort().getskipinfo(
					parameter);
			return res.getResult();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}

	public LondunTypeUser[] getCatchInfoByShipNumber(BigDecimal shipNumber,
			Calendar from, Calendar to) {
		try {
			GetlandanirbyskipElement parameter = new GetlandanirbyskipElement(
					shipNumber, from, to);
			return getCatchPort().getlandanirbyskip(parameter);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}

	public LondunAfliTypeUser[] getCatchInfoByNumberAndPort(
			BigDecimal catchNumber, BigDecimal port) {
		try {
			GetlondunafliElement parameter = new GetlondunafliElement(port,
					catchNumber);
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
	
	
	public boolean getHasValidSeafaringLicense(String shipID) {
		GetskiphefurgilthaffaeriElement parameters = new GetskiphefurgilthaffaeriElement(
				new BigDecimal(shipID), IWTimestamp.RightNow().getCalendar());
		try {
			GetskiphefurgilthaffaeriResponseElement res = getShipPort()
					.getskiphefurgilthaffaeri(parameters);
			return (res.getResult().getIsok().intValue() > 0);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean getHasValidGeneralFishingLicense(String shipID) {
		GethefurveidileyfiElement parameters = new GethefurveidileyfiElement(
				new BigDecimal(shipID), IWTimestamp.RightNow().getCalendar());
		try {
			GethefurveidileyfiResponseElement res = getLicensePort()
					.gethefurveidileyfi(parameters);
			return (res.getResult().getIsok().intValue() > 0);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean getHasValidCoastFishingLicense(String shipID) {
		GethefurstrandveidileyfiElement parameters = new GethefurstrandveidileyfiElement(
				new BigDecimal(shipID), IWTimestamp.RightNow().getCalendar());
		try {
			GethefurstrandveidileyfiResponseElement res = getLicensePort()
					.gethefurstrandveidileyfi(parameters);
			return (res.getResult().getIsok().intValue() > 0);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return false;
	}

	public boolean getHasValidQuotaLimitFishingLicense(String shipID) {
		GethefuraflamarksveidilElement parameters = new GethefuraflamarksveidilElement(
				new BigDecimal(shipID), IWTimestamp.RightNow().getCalendar());
		try {
			GethefuraflamarksveidilResponseElement res = getLicensePort()
					.gethefuraflamarksveidil(parameters);
			return (res.getResult().getIsok().intValue() > 0);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return false;
	}

	public static void main(String[] arguments) {
		try {
			FSWebServiceLANDANIR_ServiceLocator locator = new FSWebServiceLANDANIR_ServiceLocator();
			FSWebServiceLANDANIR_PortType port = locator
					.getFSWebServiceLANDANIRSoap12HttpPort(new URL(
							"http://hafrok.hafro.is/FSWebServices/FSWebServiceLANDANIRSoap12HttpPort"));

			GetlandanirbyskipElement parameter = new GetlandanirbyskipElement(
					new BigDecimal(1578),
					new IWTimestamp(1, 1, 2010).getCalendar(), new IWTimestamp(
							31, 12, 2010).getCalendar());
			LondunTypeUser[] array = port.getlandanirbyskip(parameter);
			for (LondunTypeUser afli : array) {
				System.out.println(afli.getKomunr() + " - " + afli.getHofn());
			}
		} catch (ServiceException se) {
			se.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException re) {
			re.printStackTrace();
		}
	}
}