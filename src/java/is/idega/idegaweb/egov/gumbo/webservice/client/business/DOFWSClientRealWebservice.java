package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.AflamarkTypeUser;
import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.FSWebServiceAFLAMARK_PortType;
import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.FSWebServiceAFLAMARK_ServiceLocator;
import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.GetaflamarkElement;
import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.GetaflamarksumbyutgerdElement;
import is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.FSWebserviceHLUTDEILD_PortType;
import is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.FSWebserviceHLUTDEILD_ServiceLocator;
import is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.GethlutdeildskipsElement;
import is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.GetuthlutanirskipElement;
import is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.HlutdeildTypeUser;
import is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.UthlutanirTypeUser;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIR_PortType;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.FSWebServiceLANDANIR_ServiceLocator;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlandanirbyskipElement;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlastlandanirbyskipElement;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlastlandanirbyutgerdElement;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlonduninfoElement;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.GetlonduninfoResponseElement;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeUser;
import is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.FSWebserviceMILLIFAERSLUR_PortType;
import is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.FSWebserviceMILLIFAERSLUR_ServiceLocator;
import is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslabytilvisunElement;
import is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslabytilvisunResponseElement;
import is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.GetmillifaerslurbyskipElement;
import is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser;
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
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetgrasleppuskipnrutgerdarElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefuraflamarksveidilElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefuraflamarksveidilResponseElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurstrandveidileyfiElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurstrandveidileyfiResponseElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurveidileyfiElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GethefurveidileyfiResponseElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforskipElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetstrandvlcodeforskipResponseElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetveidileyfagerdElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetveidileyfibyidElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.GetveidileyfibyidResponseElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfagerdTypeUser;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfiTypeUser;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.FSWebServiceVeidileyfiUpdate_PortType;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.FSWebServiceVeidileyfiUpdate_ServiceLocator;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiWithPasswordElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.CreateveidileyfiWithPasswordResponseElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiWithPasswordElement;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVeidileyfiUpdate_wsdl.types.VirkjaveidileyfiWithPasswordResponseElement;
import is.idega.idegaweb.egov.gumbo.business.GumboBusiness;
import is.idega.idegaweb.egov.gumbo.licenses.FishingLicenseUser.CompanyData;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.company.data.Company;
import com.idega.core.business.DefaultSpringBean;
import com.idega.idegaweb.IWMainApplication;
import com.idega.user.data.User;
import com.idega.util.IWTimestamp;
import com.idega.util.text.Item;

@Scope("singleton")
@Service("dofWSClient")
@Qualifier(DOFWSClient.WEB_SERVICE)
public class DOFWSClientRealWebservice extends DefaultSpringBean implements
		DOFWSClient {
	private static final String SHIP_DEFAULT_ENDPOINT = "http://hafrok.hafro.is/FSWebServices_testing/FSWebServiceSKIPSoap12HttpPort";
	private static final String SHIP_ENDPOINT_ATTRIBUTE_NAME = "dofws_ship_endpoint";

	private static final String CATCH_DEFAULT_ENDPOINT = "http://hafrok.hafro.is/FSWebServices_testing/FSWebServiceLANDANIRSoap12HttpPort";
	private static final String CATCH_ENDPOINT_ATTRIBUTE_NAME = "dofws_catch_endpoint";

	private static final String CATCH_QUOTA_DEFAULT_ENDPOINT = "http://hafrok.hafro.is/FSWebServices_testing/FSWebServiceAFLAMARKSoap12HttpPort";
	private static final String CATCH_QUOTA_ENDPOINT_ATTRIBUTE_NAME = "dofws_catch_quota_endpoint";

	private static final String LICENSE_DEFAULT_ENDPOINT = "http://hafrok.hafro.is/FSWebServices_testing/FSWebServiceVEIDILEYFISoap12HttpPort";
	private static final String LICENSE_ENDPOINT_ATTRIBUTE_NAME = "dofws_license_endpoint";

	private static final String LICENSE_UPDATE_DEFAULT_ENDPOINT = "http://hafrok.hafro.is/FSWebServices_testing/FSWebServiceVeidileyfiUpdateSoap12HttpPort";
	private static final String LICENSE_UPDATE_ENDPOINT_ATTRIBUTE_NAME = "dofws_license_update_endpoint";

	private static final String LICENSE_UPDATE_USER = "dofws_license_update_user";
	private static final String LICENSE_UPDATE_PASSWORD = "dofws_license_update_password";

	private static final String PORTION_DEFAULT_ENDPOINT = "http://hafrok.hafro.is/FSWebServices_testing/FSWebserviceHLUTDEILDSoap12HttpPort";
	private static final String PORTION_ENDPOINT_ATTRIBUTE_NAME = "dofws_portion_endpoint";

	private static final String TRANSFERS_DEFAULT_ENDPOINT = "http://hafrok.hafro.is/FSWebServices_testing/FSWebserviceMILLIFAERSLURSoap12HttpPort";
	private static final String TRANSFERS_ENDPOINT_ATTRIBUTE_NAME = "dofws_transfers_endpoint";

	private static final String GUMBO_FISHING_AREAS_CACHE = "fishing_areas_cache";
	private static final String GUMBO_COMPANY_SHIPS_CACHE = "company_ships_cache";
	private static final String GUMBO_COMPANY_CATCH_QUOTA_CACHE = "company_catch_quota_cache";
	private static final String GUMBO_COMPANY_LATEST_CATCHES_CACHE = "company_latest_catches_cache";
	private static final String GUMBO_SHIP_INFO_CACHE = "ship_info_cache";

	@Autowired
	private GumboBusiness gumboBusiness;

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

	/*
	 * private FSWebServiceADILI_PortType getMemberPort() { try { String
	 * endPoint = IWMainApplication .getDefaultIWApplicationContext()
	 * .getApplicationSettings() .getProperty(MEMBER_ENDPOINT_ATTRIBUTE_NAME,
	 * MEMBER_DEFAULT_ENDPOINT);
	 * 
	 * FSWebServiceADILI_ServiceLocator locator = new
	 * FSWebServiceADILI_ServiceLocator(); FSWebServiceADILI_PortType port =
	 * locator .getFSWebServiceADILISoap12HttpPort(new URL(endPoint));
	 * 
	 * // ((org.apache.axis.client.Stub) port).setTimeout(timeout)
	 * 
	 * return port; } catch (Exception e) { e.printStackTrace(); }
	 * 
	 * return null; }
	 */

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

	private FSWebServiceVeidileyfiUpdate_PortType getLicenseUpdatePort() {
		try {
			String endPoint = IWMainApplication
					.getDefaultIWApplicationContext()
					.getApplicationSettings()
					.getProperty(LICENSE_UPDATE_ENDPOINT_ATTRIBUTE_NAME,
							LICENSE_UPDATE_DEFAULT_ENDPOINT);

			FSWebServiceVeidileyfiUpdate_ServiceLocator locator = new FSWebServiceVeidileyfiUpdate_ServiceLocator();
			FSWebServiceVeidileyfiUpdate_PortType port = locator
					.getFSWebServiceVeidileyfiUpdateSoap12HttpPort(new URL(
							endPoint));

			// ((org.apache.axis.client.Stub) port).setTimeout(timeout)

			return port;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private FSWebserviceHLUTDEILD_PortType getPortionPort() {
		try {
			String endPoint = IWMainApplication
					.getDefaultIWApplicationContext()
					.getApplicationSettings()
					.getProperty(PORTION_ENDPOINT_ATTRIBUTE_NAME,
							PORTION_DEFAULT_ENDPOINT);

			FSWebserviceHLUTDEILD_ServiceLocator locator = new FSWebserviceHLUTDEILD_ServiceLocator();
			FSWebserviceHLUTDEILD_PortType port = locator
					.getFSWebserviceHLUTDEILDSoap12HttpPort(new URL(endPoint));

			// ((org.apache.axis.client.Stub) port).setTimeout(timeout)

			return port;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	private FSWebserviceMILLIFAERSLUR_PortType getTransfersPort() {
		try {
			String endPoint = IWMainApplication
					.getDefaultIWApplicationContext()
					.getApplicationSettings()
					.getProperty(TRANSFERS_ENDPOINT_ATTRIBUTE_NAME,
							TRANSFERS_DEFAULT_ENDPOINT);

			FSWebserviceMILLIFAERSLUR_ServiceLocator locator = new FSWebserviceMILLIFAERSLUR_ServiceLocator();
			FSWebserviceMILLIFAERSLUR_PortType port = locator
					.getFSWebserviceMILLIFAERSLURSoap12HttpPort(new URL(
							endPoint));

			// ((org.apache.axis.client.Stub) port).setTimeout(timeout)

			return port;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public MillifaerslaTypeUser[] getTransfers(BigDecimal shipNr, String type,
			String period) {
		try {
			GetmillifaerslurbyskipElement parameters = new GetmillifaerslurbyskipElement(
					shipNr, type, period);
			return getTransfersPort().getmillifaerslurbyskip(parameters);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}

	public MillifaerslaTypeUser getTransferInfo(BigDecimal reference) {
		try {
			GetmillifaerslabytilvisunElement parameters = new GetmillifaerslabytilvisunElement(
					reference);
			GetmillifaerslabytilvisunResponseElement res = getTransfersPort()
					.getmillifaerslabytilvisun(parameters);
			return res.getResult();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}

	public HlutdeildTypeUser[] getCatchPortion(BigDecimal shipID, String season) {
		try {
			GethlutdeildskipsElement parameters = new GethlutdeildskipsElement(
					shipID, season);
			return getPortionPort().gethlutdeildskips(parameters);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}

	public UthlutanirTypeUser[] getShipPortions(BigDecimal shipID, String season) {
		try {
			GetuthlutanirskipElement parameters = new GetuthlutanirskipElement(
					shipID, season);
			return getPortionPort().getuthlutanirskip(parameters);
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#
	 * getShipInfoByCompanySSN(java.lang.String)
	 */
	@Override
	public SkipInfoTypeUser[] getShipInfoByCompanySSN(String companySSN) {
		Map cache = getCache(GUMBO_COMPANY_SHIPS_CACHE, 60 * 60 * 24l);
		if (cache != null && !cache.isEmpty()) {
			if (cache.containsKey(companySSN)) {
				return (SkipInfoTypeUser[]) cache.get(companySSN);
			}

		}

		try {
			GetskipinfobyutgerdElement parameter = new GetskipinfobyutgerdElement(
					companySSN);
			SkipInfoTypeUser[] ships = getShipPort().getskipinfobyutgerd(
					parameter);

			if (cache != null) {
				cache.put(companySSN, ships);
			}

			return ships;
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#
	 * getShipInfo(java.lang.String)
	 */
	@Override
	public SkipInfoTypeUser getShipInfo(String shipID) {
		Map cache = getCache(GUMBO_SHIP_INFO_CACHE, 60 * 60 * 24l);
		if (cache != null && !cache.isEmpty()) {
			if (cache.containsKey(shipID)) {
				return (SkipInfoTypeUser) cache.get(shipID);
			}

		}

		GetskipinfoElement parameter = new GetskipinfoElement(new BigDecimal(
				shipID));

		try {
			GetskipinfoResponseElement res = getShipPort().getskipinfo(
					parameter);
			SkipInfoTypeUser ship = res.getResult();

			if (cache != null) {
				cache.put(shipID, ship);
			}

			return ship;
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#
	 * getCatchInfoByShipNumber(java.math.BigDecimal, java.util.Calendar,
	 * java.util.Calendar)
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#
	 * getCatchInfoByNumberAndPort(java.math.BigDecimal, java.math.BigDecimal)
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
		Map cache = getCache(GUMBO_COMPANY_LATEST_CATCHES_CACHE, 60 * 60 * 24l);
		if (cache != null && !cache.isEmpty()) {
			if (cache.containsKey(personalID)) {
				return (LondunTypeUser[]) cache.get(personalID);
			}

		}

		try {
			GetlastlandanirbyutgerdElement parameter = new GetlastlandanirbyutgerdElement(
					personalID, new BigDecimal(numberOfResults));
			LondunTypeUser[] catches = getCatchPort().getlastlandanirbyutgerd(
					parameter);

			if (cache != null) {
				cache.put(personalID, catches);
			}
		} catch (RemoteException re) {
			re.printStackTrace();
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#
	 * getCatchQuota(java.math.BigDecimal, java.lang.String)
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#
	 * getCatchQuota(java.lang.String, java.lang.String)
	 */
	@Override
	public AflamarkTypeUser[] getCatchQuota(String personalID, String period) {
		Map cache = getCache(GUMBO_COMPANY_CATCH_QUOTA_CACHE, 60 * 60 * 24l);
		if (cache != null && !cache.isEmpty()) {
			if (cache.containsKey(personalID + "_" + period)) {
				return (AflamarkTypeUser[]) cache
						.get(personalID + "_" + period);
			}

		}

		try {
			GetaflamarksumbyutgerdElement parameter = new GetaflamarksumbyutgerdElement(
					personalID, period);
			AflamarkTypeUser[] quota = getCatchQuotaPort()
					.getaflamarksumbyutgerd(parameter);

			if (cache != null) {
				cache.put(personalID + "_" + period, quota);
			}

			return quota;
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#
	 * getHasValidSeafaringLicense(java.lang.String)
	 */
	@Override
	public LicenseCheckContainer getHasValidSeafaringLicense(String shipID) {
		IWTimestamp now = new IWTimestamp();
		// now.setDay(14);

		GetskiphefurgilthaffaeriElement parameters = new GetskiphefurgilthaffaeriElement(
				new BigDecimal(shipID), now.getCalendar());
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#
	 * getHasValidGeneralFishingLicense(java.lang.String)
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#
	 * getHasValidCoastFishingLicense(java.lang.String)
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

	/*
	 * (non-Javadoc)
	 * 
	 * @see is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient#
	 * getHasValidQuotaLimitFishingLicense(java.lang.String)
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
		DOFWSClientRealWebservice real = new DOFWSClientRealWebservice();
		real.doSecurityTest();
	}

	public void doSecurityTest() {
		try {
			//String endPoint =
			// "http://hafrok.hafro.is/FSWebServices_testing/FSWebServiceVeidileyfiUpdateSoap12HttpPort";
			String endPoint = "http://localhost:8080/FSWebServices_testing/FSWebServiceVeidileyfiUpdateSoap12HttpPort";

			FSWebServiceVeidileyfiUpdate_ServiceLocator locator = new FSWebServiceVeidileyfiUpdate_ServiceLocator();
			FSWebServiceVeidileyfiUpdate_PortType port = locator
					.getFSWebServiceVeidileyfiUpdateSoap12HttpPort(new URL(
							endPoint));

			// stub._getServiceClient().getOptions().setProperty(WSDL2Constants.ATTRIBUTE_MUST_UNDERSTAND,"0");

			CreateveidileyfiWithPasswordElement parameters = new CreateveidileyfiWithPasswordElement(
					new BigDecimal(2471), "1274",
					new IWTimestamp().getCalendar(),
					new IWTimestamp().getCalendar(), "Test á móti Svenna með usr/pwd", "", "");
			CreateveidileyfiWithPasswordResponseElement res = port
					.createveidileyfiWithPassword(parameters);
			if (res.getResult() != null) {
				System.out.println("res = " + res.getResult().intValue());
				VirkjaveidileyfiWithPasswordElement param = new VirkjaveidileyfiWithPasswordElement(
						res.getResult(), "", "");
				VirkjaveidileyfiWithPasswordResponseElement res2 = port
						.virkjaveidileyfiWithPassword(param);
				System.out.println("res2.text = " + res2.getResult().getText());
				System.out.println("res2.code = " + res2.getResult().getCode());
			} else {
				System.out.println("got null as response");
			}

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (ServiceException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		} 
	}

	@Override
	public LicenseCheckContainer getHasRevokedFishingLicense(String shipID) {
		GetersviptingElement parameters = new GetersviptingElement(
				new BigDecimal(shipID));
		try {
			GetersviptingResponseElement res = getLicensePort().getersvipting(
					parameters);

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

	@Override
	public String getFishingAreaForDraganotaveidi(String shipId) {
		GetdragnotvlcodeforskipElement parameters = new GetdragnotvlcodeforskipElement(
				new BigDecimal(shipId));
		;
		try {
			GetdragnotvlcodeforskipResponseElement res = getLicensePort()
					.getdragnotvlcodeforskip(parameters);
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

		GetstrandvlcodeforskipElement parameters = new GetstrandvlcodeforskipElement(
				new BigDecimal(shipId), period.toString());
		try {
			GetstrandvlcodeforskipResponseElement res = getLicensePort()
					.getstrandvlcodeforskip(parameters);
			return res.getResult().getText();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return "error_from_web_service";
	}

	@Override
	public CompanyData getCompanyForUser(User user) {
		final Company comp = getGumboBusiness().getCompanyForUser(user);

		CompanyData ret = new CompanyData(comp.getPersonalID());
		ret.setName(comp.getName());
		if (comp.getAddress() != null) {
			ret.setAddress(comp.getAddress().getStreetAddress());

			if (comp.getAddress().getPostalCode() != null) {
				ret.setPostalCode(comp.getAddress().getPostalCode()
						.getPostalCode());
			} else {
				ret.setPostalCode("");
			}

			if (comp.getAddress().getCity() != null) {
				ret.setPlace(comp.getAddress().getCity());
			} else {
				ret.setPlace("");
			}
		} else {
			ret.setAddress("");
			ret.setPostalCode("");
			ret.setPlace("");
		}

		if (comp.getPhone() != null) {
			ret.setPhoneNumber(comp.getPhone().getNumber());
		} else {
			ret.setPhoneNumber("");
		}

		if (comp.getEmail() != null) {
			ret.setEmail(comp.getEmail().getEmailAddress());
		} else {
			ret.setEmail("");
		}

		if (comp.getFax() != null) {
			ret.setFaxNumber(comp.getFax().getNumber());
		} else {
			ret.setFaxNumber("");
		}

		return ret;
	}

	private GumboBusiness getGumboBusiness() {
		return gumboBusiness;
	}

	@Override
	public BigDecimal[] getGrasleppuShipNrByCompanySSN(String companySSN) {
		GetgrasleppuskipnrutgerdarElement parameters = new GetgrasleppuskipnrutgerdarElement(
				companySSN);
		try {
			return getLicensePort().getgrasleppuskipnrutgerdar(parameters);
		} catch (RemoteException e) {
		}

		return null;
	}

	@Override
	public Map<BigDecimal, VeidileyfagerdTypeUser> getGrasleppaAreas() {
		return getFishingAreasByType("11", null);
	}

	private Map<BigDecimal, VeidileyfagerdTypeUser> getFishingAreasByType(
			String type, String period) {
		Map cache = getCache(GUMBO_FISHING_AREAS_CACHE, 60 * 60 * 24l);
		if (cache != null && !cache.isEmpty()) {
			if (cache.containsKey(type)) {
				return (Map<BigDecimal, VeidileyfagerdTypeUser>) cache
						.get(type);
			}

		}

		GetveidileyfagerdElement parameters = new GetveidileyfagerdElement(
				type, period);
		try {
			Map<BigDecimal, VeidileyfagerdTypeUser> map = new LinkedHashMap<BigDecimal, VeidileyfagerdTypeUser>();
			VeidileyfagerdTypeUser[] ret = getLicensePort().getveidileyfagerd(
					parameters);
			if (ret != null && ret.length > 0) {
				for (VeidileyfagerdTypeUser veidileyfagerdTypeUser : ret) {
					map.put(veidileyfagerdTypeUser.getVlyfId(),
							veidileyfagerdTypeUser);
				}

				if (cache != null) {
					cache.put(type, map);
				}
			}

			return map;
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}

	public BigDecimal createFishingLicense(String shipNr, String areaID,
			IWTimestamp from, IWTimestamp to, String info) {
		String user = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getProperty(LICENSE_UPDATE_USER, "");

		String password = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getProperty(LICENSE_UPDATE_PASSWORD, "");

		CreateveidileyfiWithPasswordElement parameters = new CreateveidileyfiWithPasswordElement(
				new BigDecimal(shipNr), areaID, from.getCalendar(),
				to.getCalendar(), info, user, password);

		try {
			CreateveidileyfiWithPasswordResponseElement res = getLicenseUpdatePort()
					.createveidileyfiWithPassword(parameters);
			return res.getResult();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return new BigDecimal(-1);
	}

	public boolean activateFishingLicense(BigDecimal fishingLicenseID) {
		VirkjaveidileyfiElement parameters = new VirkjaveidileyfiElement(
				fishingLicenseID);
		try {
			getLicenseUpdatePort().virkjaveidileyfi(parameters);
			return true;
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return false;
	}

	public VeidileyfiTypeUser getFishingLicenseInfo(BigDecimal id) {
		GetveidileyfibyidElement parameters = new GetveidileyfibyidElement(id);
		try {
			GetveidileyfibyidResponseElement ret = getLicensePort()
					.getveidileyfibyid(parameters);
			return ret.getResult();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return null;
	}

	public boolean emptyCache() {
		Map cache = getCache(GUMBO_FISHING_AREAS_CACHE, 0l);
		if (cache != null) {
			cache.clear();
		}

		return true;
	}

	@Override
	public List<Item> getGrasleppaVesselsForUser(String companyPersonalID) {
		List<Item> items = null;
		BigDecimal shipNr[] = getGrasleppuShipNrByCompanySSN(companyPersonalID);
		if (shipNr != null && shipNr.length > 0) {
			items = new ArrayList<Item>(shipNr.length);
			for (BigDecimal nr : shipNr) {
				SkipInfoTypeUser vessel = getShipInfo(nr.toString());
				items.add(new Item(vessel.getSkipNr().toString(), vessel
						.getNafn()));
			}
		}
		return items;
	}

	@Override
	public List<Item> getVesselsForUser(User user) {
		List<Item> items = null;
		SkipInfoTypeUser vessels[] = getShipInfoByCompanySSN(user
				.getPersonalID());
		if (vessels != null && vessels.length > 0) {
			items = new ArrayList<Item>(vessels.length);
			for (int i = 0; i < vessels.length; i++) {
				SkipInfoTypeUser vessel = vessels[i];
				items.add(new Item(vessel.getSkipNr().toString(), vessel
						.getNafn()));
			}
		}

		return items;
	}
}