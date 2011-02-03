package is.idega.idegaweb.egov.gumbo.util;

import java.util.ArrayList;
import java.util.List;

import com.idega.idegaweb.IWMainApplication;
import com.idega.util.IWTimestamp;

public class GumboUtil {

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
			
			Period period = new Period(stampYear + stampNextYear, yearString + " - " + nextYearString);
			periods.add(period);
			
			stamp.addYears(-2);
		}
		
		return periods;
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