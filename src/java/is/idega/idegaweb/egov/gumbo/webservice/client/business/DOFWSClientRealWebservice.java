package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl.FSWebServiceADILI_PortType;
import is.fiskistofa.webservices.adili.FSWebServiceADILI_wsdl.FSWebServiceADILI_ServiceLocator;
import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.AflamarkTypeUser;
import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.FSWebServiceAFLAMARK_PortType;
import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.FSWebServiceAFLAMARK_ServiceLocator;
import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.GetaflamarkElement;
import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.GetaflamarksumbyutgerdElement;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIR_PortType;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIR_ServiceLocator;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlandanirbyskipElement;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlastlandanirbyskipElement;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlastlandanirbyutgerdElement;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlonduninfoElement;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlonduninfoResponseElement;
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
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforskipElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetdragnotvlcodeforskipResponseElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetersviptingElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetersviptingResponseElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefuraflamarksveidilElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefuraflamarksveidilResponseElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurstrandveidileyfiElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurstrandveidileyfiResponseElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurveidileyfiElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurveidileyfiResponseElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforskipElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforskipResponseElement;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.Calendar;

import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.idegaweb.IWMainApplication;
import com.idega.util.IWTimestamp;

@Scope("singleton")
@Service("dofWSClient")
@Qualifier(DOFWSClient.WEB_SERVICE)
public class DOFWSClientRealWebservice implements DOFWSClient {
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
			        .getDefaultIWApplicationContext()
			        .getApplicationSettings()
			        .getProperty(CATCH_QUOTA_ENDPOINT_ATTRIBUTE_NAME,
			            CATCH_QUOTA_DEFAULT_ENDPOINT);
			
			FSWebServiceAFLAMARK_ServiceLocator locator = new FSWebServiceAFLAMARK_ServiceLocator();
			FSWebServiceAFLAMARK_PortType port = locator
			        .getFSWebServiceAFLAMARKSoap12HttpPort(new URL(endPoint));
			
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
	
	/* (non-Javadoc)
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#getShipInfoByCompanySSN(java.lang.String)
	 */
	@Override
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
	
	/* (non-Javadoc)
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#getShipInfo(java.lang.String)
	 */
	@Override
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
	
	/* (non-Javadoc)
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#getCatchInfoByShipNumber(java.math.BigDecimal, java.util.Calendar, java.util.Calendar)
	 */
	@Override
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
	
	/* (non-Javadoc)
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#getCatchInfoByNumberAndPort(java.math.BigDecimal, java.math.BigDecimal)
	 */
	@Override
	public LondunTypeUser getCatchInfoByNumberAndPort(BigDecimal catchNumber,
	        BigDecimal port) {
		try {
			GetlonduninfoElement parameter = new GetlonduninfoElement(port,
			        catchNumber);
			GetlonduninfoResponseElement element = getCatchPort()
			        .getlonduninfo(parameter);
			return element.getResult();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	public LondunTypeUser[] getLatestCatchInfoByShip(BigDecimal shipNumber,
	        int numberOfResults) {
		try {
			GetlastlandanirbyskipElement parameter = new GetlastlandanirbyskipElement(
			        shipNumber, new BigDecimal(numberOfResults));
			return getCatchPort().getlastlandanirbyskip(parameter);
		} catch (RemoteException re) {
			re.printStackTrace();
		}
		
		return null;
	}
	
	public LondunTypeUser[] getLatestCatchInfo(String personalID,
	        int numberOfResults) {
		try {
			GetlastlandanirbyutgerdElement parameter = new GetlastlandanirbyutgerdElement(
			        personalID, new BigDecimal(numberOfResults));
			return getCatchPort().getlastlandanirbyutgerd(parameter);
		} catch (RemoteException re) {
			re.printStackTrace();
		}
		
		return null;
	}
	
	/* (non-Javadoc)
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#getCatchQuota(java.math.BigDecimal, java.lang.String)
	 */
	@Override
	public AflamarkTypeUser[] getCatchQuota(BigDecimal shipNumber, String period) {
		try {
			GetaflamarkElement parameter = new GetaflamarkElement(shipNumber,
			        period);
			return getCatchQuotaPort().getaflamark(parameter);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/* (non-Javadoc)
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#getCatchQuota(java.lang.String, java.lang.String)
	 */
	@Override
	public AflamarkTypeUser[] getCatchQuota(String personalID, String period) {
		try {
			GetaflamarksumbyutgerdElement parameter = new GetaflamarksumbyutgerdElement(
			        personalID, period);
			return getCatchQuotaPort().getaflamarksumbyutgerd(parameter);
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return null;
	}
	
	/* (non-Javadoc)
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#getHasValidSeafaringLicense(java.lang.String)
	 */
	@Override
	public LicenseCheckContainer getHasValidSeafaringLicense(String shipID) {
		GetskiphefurgilthaffaeriElement parameters = new GetskiphefurgilthaffaeriElement(
		        new BigDecimal(shipID), IWTimestamp.RightNow().getCalendar());
		try {
			GetskiphefurgilthaffaeriResponseElement res = getShipPort()
			        .getskiphefurgilthaffaeri(parameters);
			
			LicenseCheckContainer ret = null;
			if (res.getResult().getIsok().intValue() > 0) {
				ret = new LicenseCheckContainer(true, res.getResult()
				        .getMessage());
			} else {
				ret = new LicenseCheckContainer(false, res.getResult()
				        .getMessage());
			}
			
			return ret;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return new LicenseCheckContainer(false, "error_from_web_service");
	}
	
	/* (non-Javadoc)
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#getHasValidGeneralFishingLicense(java.lang.String)
	 */
	@Override
	public LicenseCheckContainer getHasValidGeneralFishingLicense(String shipID) {
		GethefurveidileyfiElement parameters = new GethefurveidileyfiElement(
		        new BigDecimal(shipID), IWTimestamp.RightNow().getCalendar());
		try {
			GethefurveidileyfiResponseElement res = getLicensePort()
			        .gethefurveidileyfi(parameters);
			
			LicenseCheckContainer ret = null;
			if (res.getResult().getIsok().intValue() > 0) {
				ret = new LicenseCheckContainer(true, res.getResult()
				        .getMessage());
			} else {
				ret = new LicenseCheckContainer(false, res.getResult()
				        .getMessage());
			}
			
			return ret;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return new LicenseCheckContainer(false, "error_from_web_service");
	}
	
	/* (non-Javadoc)
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#getHasValidCoastFishingLicense(java.lang.String)
	 */
	@Override
	public LicenseCheckContainer getHasValidCoastFishingLicense(String shipID) {
		GethefurstrandveidileyfiElement parameters = new GethefurstrandveidileyfiElement(
		        new BigDecimal(shipID), IWTimestamp.RightNow().getCalendar());
		try {
			GethefurstrandveidileyfiResponseElement res = getLicensePort()
			        .gethefurstrandveidileyfi(parameters);
			
			LicenseCheckContainer ret = null;
			if (res.getResult().getIsok().intValue() > 0) {
				ret = new LicenseCheckContainer(true, res.getResult()
				        .getMessage());
			} else {
				ret = new LicenseCheckContainer(false, res.getResult()
				        .getMessage());
			}
			
			return ret;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return new LicenseCheckContainer(false, "error_from_web_service");
	}
	
	/* (non-Javadoc)
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#getHasValidQuotaLimitFishingLicense(java.lang.String)
	 */
	@Override
	public LicenseCheckContainer getHasValidQuotaLimitFishingLicense(
	        String shipID) {
		GethefuraflamarksveidilElement parameters = new GethefuraflamarksveidilElement(
		        new BigDecimal(shipID), IWTimestamp.RightNow().getCalendar());
		try {
			GethefuraflamarksveidilResponseElement res = getLicensePort()
			        .gethefuraflamarksveidil(parameters);
			
			LicenseCheckContainer ret = null;
			if (res.getResult().getIsok().intValue() > 0) {
				ret = new LicenseCheckContainer(true, res.getResult()
				        .getMessage());
			} else {
				ret = new LicenseCheckContainer(false, res.getResult()
				        .getMessage());
			}
			
			return ret;
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return new LicenseCheckContainer(false, "error_from_web_service");
	}
	
	public static void main(String[] arguments) {
		
		
		try {
			FSWebServiceLANDANIR_ServiceLocator locator = new FSWebServiceLANDANIR_ServiceLocator();
			FSWebServiceLANDANIR_PortType port = locator
			        .getFSWebServiceLANDANIRSoap12HttpPort(new URL("http://hafrok.hafro.is/FSWebServices/FSWebServiceLANDANIRSoap12HttpPort"));
			
			GetlonduninfoElement parameter = new GetlonduninfoElement(new BigDecimal(33),
			        new BigDecimal(-184005));
			GetlonduninfoResponseElement element = port
			        .getlonduninfo(parameter);

			System.out.println(element.getResult().getHafnarHeiti());
		} catch (ServiceException se) {
			se.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException re) {
			re.printStackTrace();
		}
	}
	
	@Override
	public LicenseCheckContainer getHasRevokedFishingLicense(String shipID) {
		GetersviptingElement parameters = new GetersviptingElement(new BigDecimal(shipID));
		try {
			GetersviptingResponseElement res = getLicensePort().getersvipting(parameters);

			LicenseCheckContainer ret = null;
			if (res.getResult().getIsok().intValue() > 0) {
				ret = new LicenseCheckContainer(true, res.getResult()
				        .getMessage());
			} else {
				ret = new LicenseCheckContainer(false, res.getResult()
				        .getMessage());
			}
			
			return ret;

		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new LicenseCheckContainer(false, "error_from_web_service");
	}
		
	@Override
	public String getFishingAreaForDraganotaveidi(String shipId) {
		GetdragnotvlcodeforskipElement parameters = new GetdragnotvlcodeforskipElement(new BigDecimal(shipId));;
		try {
			GetdragnotvlcodeforskipResponseElement res = getLicensePort().getdragnotvlcodeforskip(parameters );
			return res.getResult().getText();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return "error_from_web_service";	
	}
	
	public String getFishingArea(String shipId, Timestamp validFrom) {
		
		StringBuilder period = new StringBuilder();
		IWTimestamp stamp = new IWTimestamp(validFrom);
		period.append(stamp.getDateString("yy"));
		stamp.addYears(1);
		period.append(stamp.getDateString("yy"));
		
		GetstrandvlcodeforskipElement parameters = new GetstrandvlcodeforskipElement(new BigDecimal(shipId), period.toString());
		try {
			GetstrandvlcodeforskipResponseElement res = getLicensePort().getstrandvlcodeforskip(parameters);
			return res.getResult().getText();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return "error_from_web_service";
	}
}