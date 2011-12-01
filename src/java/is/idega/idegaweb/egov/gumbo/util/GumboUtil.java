package is.idega.idegaweb.egov.gumbo.util;

import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIP_PortType;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.FSWebServiceSKIP_ServiceLocator;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoElement;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.GetskipinfoResponseElement;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;
import is.idega.idegaweb.egov.gumbo.GumboConstants;

import java.math.BigDecimal;
import java.net.URL;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.bpm.xformsview.converters.DateConverter;
import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.core.cache.IWCacheManager2;
import com.idega.idegaweb.IWMainApplication;
import com.idega.user.business.UserBusiness;
import com.idega.user.data.User;
import com.idega.util.CoreConstants;
import com.idega.util.IWTimestamp;
import com.idega.util.StringUtil;
import com.idega.util.text.Name;

@Service("gumboUtil")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class GumboUtil {

	@Autowired
	private DateConverter dateConverter;

	private static final String GUMBO_SHIP_INFO_CACHE = "ship_info_cache";
	private static final String SHIP_DEFAULT_ENDPOINT = GumboConstants.WEB_SERVICE_URL + "FSWebServiceSKIPSoap12HttpPort";
	private static final String SHIP_ENDPOINT_ATTRIBUTE_NAME = "dofws_ship_endpoint";

	public static String getUserName(Object userPK) {
		try {
			UserBusiness business = (UserBusiness) IBOLookup.getServiceInstance(IWMainApplication.getDefaultIWApplicationContext(), UserBusiness.class);
			User user = business.getUser(new Integer(userPK.toString()));
			if (user != null) {
				Name name = new Name(user.getFirstName(), user.getMiddleName(), user.getLastName());
				return name.getName(IWMainApplication.getDefaultIWApplicationContext().getApplicationSettings().getDefaultLocale());
			}
		}
		catch (IBOLookupException e) {
			e.printStackTrace();
		}
		catch (NumberFormatException e) {
			e.printStackTrace();
		}
		catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return "";
	}
	
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
	
	public static Period getPeriodByDate(Date date) {
		IWTimestamp stamp = new IWTimestamp(date);
		
		if (stamp.getMonth() < 9) {
			String yearString = String.valueOf(stamp.getYear());
			String stampYear = yearString.substring(2);

			stamp.addYears(-1);
			String previousYearString = String.valueOf(stamp.getYear());
			String stampPreviousYear = previousYearString.substring(2);
			
			Period period = new Period(stampPreviousYear + stampYear, previousYearString + " - " + yearString);
			return period;
		}
		else {
			String yearString = String.valueOf(stamp.getYear());
			String stampYear = yearString.substring(2);

			stamp.addYears(1);
			String nextYearString = String.valueOf(stamp.getYear());
			String stampNextYear = nextYearString.substring(2);
			
			Period period = new Period(stampYear + stampNextYear, yearString + " - " + nextYearString);
			return period;
		}
	}

	public static SkipInfoTypeUser getShip(BigDecimal shipID) {
		IWCacheManager2 manager = IWCacheManager2.getInstance(IWMainApplication.getDefaultIWMainApplication());
		Map<BigDecimal, SkipInfoTypeUser> cache = null;
		if (manager != null) {
			cache = manager.getCache(GUMBO_SHIP_INFO_CACHE, 60 * 60 * 24l);
		}

		if (cache != null && !cache.isEmpty()) {
			if (cache.containsKey(shipID)) {
				return cache.get(shipID);
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

	public static String getEncryptedClassName(Class<?> classToInstanciate) {
		return IWMainApplication.getEncryptedClassName(classToInstanciate);
	}

	public String formatDate(String date) {
		if (StringUtil.isEmpty(date))
			return CoreConstants.EMPTY;
		
		try {
			IWTimestamp stamp = new IWTimestamp(getDateConverter().convertStringFromXFormsToDate(date));
			return stamp.getDateString("dd.MM.yyyy");
		} catch (ParseException pe) {
			//No handling...
		}
		
		return CoreConstants.EMPTY;
	}

	private DateConverter getDateConverter() {
		return dateConverter;
	}

	public static void main(String[] arguments) {
		System.out.println(GumboUtil.getCurrentPeriod());
	}
}