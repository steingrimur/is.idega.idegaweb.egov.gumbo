package is.idega.idegaweb.egov.gumbo.util;

import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIP_PortType;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIP_ServiceLocator;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoElement;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoResponseElement;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;

import java.math.BigDecimal;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.idega.core.cache.IWCacheManager2;
import com.idega.idegaweb.IWMainApplication;
import com.idega.util.IWTimestamp;

public class GumboUtil {

	private static final String GUMBO_SHIP_INFO_CACHE = "ship_info_cache";
	private static final String SHIP_DEFAULT_ENDPOINT = "http://hafrok.hafro.is/FSWebServices_testing/FSWebServiceSKIPSoap12HttpPort";
	private static final String SHIP_ENDPOINT_ATTRIBUTE_NAME = "dofws_ship_endpoint";

	public static List<Period> getPeriods() {
		List<Period> periods = new ArrayList<Period>();

		IWTimestamp stamp = new IWTimestamp();
		if (stamp.getMonth() < 9) {
			stamp.addYears(-1);
		}

		while (stamp.getYear() >= 2000) {
			String yearString = String.valueOf(stamp.getYear());
			String stampYear = yearString.substring(2);

			stamp.addYears(1);
			String nextYearString = String.valueOf(stamp.getYear());
			String stampNextYear = nextYearString.substring(2);

			Period period = new Period(stampYear + stampNextYear, yearString
					+ " - " + nextYearString);
			periods.add(period);

			stamp.addYears(-2);
		}

		return periods;
	}

	public static SkipInfoTypeUser getShip(BigDecimal shipID) {
		IWCacheManager2 manager = IWCacheManager2.getInstance(IWMainApplication.getDefaultIWMainApplication());
		Map cache = null;
		if (manager != null) {
			cache = manager.getCache(GUMBO_SHIP_INFO_CACHE, 60 * 60 * 24l);
		}

		if (cache != null && !cache.isEmpty()) {
			if (cache.containsKey(shipID)) {
				return (SkipInfoTypeUser) cache.get(shipID);
			}

		}

		GetskipinfoElement parameter = new GetskipinfoElement(shipID);

		try {
			String endPoint = IWMainApplication
					.getDefaultIWApplicationContext()
					.getApplicationSettings()
					.getProperty(SHIP_ENDPOINT_ATTRIBUTE_NAME,
							SHIP_DEFAULT_ENDPOINT);

			FSWebServiceSKIP_ServiceLocator locator = new FSWebServiceSKIP_ServiceLocator();
			FSWebServiceSKIP_PortType port = locator.getFSWebServiceSKIPSoap12HttpPort(new URL(endPoint));

			GetskipinfoResponseElement res = port.getskipinfo(
					parameter);
			SkipInfoTypeUser ship = res.getResult();

			if (cache != null) {
				cache.put(shipID, ship);
			}

			return ship;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public static Period getCurrentPeriod() {
		return getPeriods().iterator().next();
	}

	public static String getEncryptedClassName(Class classToInstanciate) {
		return IWMainApplication.getEncryptedClassName(classToInstanciate);
	}

	public static void main(String[] arguments) {
		System.out.println(GumboUtil.getCurrentPeriod());
	}
}