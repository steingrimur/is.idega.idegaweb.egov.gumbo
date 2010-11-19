package is.idega.idegaweb.egov.gumbo.util;

import java.util.ArrayList;
import java.util.List;

import com.idega.util.IWTimestamp;

public class GumboUtil {

	public static List<Period> getPeriods() {
		List<Period> periods = new ArrayList<Period>();
		
		IWTimestamp stamp = new IWTimestamp();
		int year = stamp.getYear();
		
		while (stamp.getYear() >= year - 10) {
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
}