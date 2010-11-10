package is.idega.idegaweb.egov.gumbo.licenses;

import is.idega.idegaweb.egov.gumbo.licenses.Inteval.XFormsInteval;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.bpm.xformsview.converters.DateConverter;

@Service("fishingLicensesService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class FishingLicensesService {
	
	@Autowired
	private DateConverter dateConverter;
	
	public XFormsInteval getLicenseIntervalForGrasleppa(String fishingAreaId) {
		
		final LicenseStartEndMonthAndDay licenseStartEnd = getLicenseStartEndByArea(fishingAreaId);
		
		final Inteval iv;
		
		final Calendar now = Calendar.getInstance();
		now.set(Calendar.HOUR, 0);
		now.set(Calendar.MINUTE, 0);
		now.set(Calendar.SECOND, 0);
		now.set(Calendar.MILLISECOND, 0);
		
		final Calendar licenseStart = Calendar.getInstance();
		licenseStart.set(now.get(Calendar.YEAR), licenseStartEnd.startMonth,
		    licenseStartEnd.startDay, 0, 0, 0);
		
		final Calendar licenseEnd = Calendar.getInstance();
		licenseEnd.set(now.get(Calendar.YEAR), licenseStartEnd.endMonth,
		    licenseStartEnd.endDay, 0, 0, 0);
		
		if (now.after(licenseStart) && now.before(licenseEnd)) {
			
			iv = new Inteval(now.getTime(), licenseEnd.getTime());
			
		} else {
			
			iv = findNearestPeriod(now, licenseStartEnd);
		}
		
		return fromIntervalToXFormsInterval(iv);
	}
	
	private static final class LicenseStartEndMonthAndDay {
		
		private int startMonth;
		private int startDay;
		private int endMonth;
		private int endDay;
		
		private LicenseStartEndMonthAndDay() {
			
		}
		
		public static LicenseStartEndMonthAndDay getForMarch10July5() {
			
			final LicenseStartEndMonthAndDay startEnd = new LicenseStartEndMonthAndDay();
			startEnd.startMonth = Calendar.MARCH;
			startEnd.startDay = 10;
			startEnd.endMonth = Calendar.JULY;
			startEnd.endDay = 5;
			
			return startEnd;
		}
		
		public static LicenseStartEndMonthAndDay getForMarch10August12() {
			
			final LicenseStartEndMonthAndDay startEnd = new LicenseStartEndMonthAndDay();
			startEnd.startMonth = Calendar.MARCH;
			startEnd.startDay = 10;
			startEnd.endMonth = Calendar.AUGUST;
			startEnd.endDay = 12;
			
			return startEnd;
		}
		
		public static LicenseStartEndMonthAndDay getForMarch1July25() {
			
			final LicenseStartEndMonthAndDay startEnd = new LicenseStartEndMonthAndDay();
			startEnd.startMonth = Calendar.MARCH;
			startEnd.startDay = 1;
			startEnd.endMonth = Calendar.JULY;
			startEnd.endDay = 25;
			
			return startEnd;
		}
	}
	
	private LicenseStartEndMonthAndDay getLicenseStartEndByArea(
	        String fishingAreaId) {
		
		final LicenseStartEndMonthAndDay startEnd;
		
		if ("A".equals(fishingAreaId) || "C".equals(fishingAreaId)
		        || "D".equals(fishingAreaId) || "E".equals(fishingAreaId)
		        || "F".equals(fishingAreaId)) {
			
			startEnd = LicenseStartEndMonthAndDay.getForMarch10July5();
			
		} else if ("B".equals(fishingAreaId)) {
			
			startEnd = LicenseStartEndMonthAndDay.getForMarch10August12();
			
		} else if ("G".equals(fishingAreaId)) {
			
			startEnd = LicenseStartEndMonthAndDay.getForMarch1July25();
			
		} else {
			throw new IllegalArgumentException("Illegal fishingAreaId: "
			        + fishingAreaId);
		}
		
		return startEnd;
	}
	
	private XFormsInteval fromIntervalToXFormsInterval(Inteval iv) {
		
		return new XFormsInteval(getDateConverter()
		        .convertDateToComplyWithXForms(iv.getFrom()),
		        getDateConverter().convertDateToComplyWithXForms(iv.getTo()));
	}
	
	private Inteval findNearestPeriod(Calendar now,
	        LicenseStartEndMonthAndDay licenseStartEnd) {
		
		final int year;
		
		if (now.get(Calendar.MONTH) > licenseStartEnd.endMonth) {
			
			year = now.get(Calendar.YEAR) + 1;
			
		} else {
			year = now.get(Calendar.YEAR);
		}
		
		final Calendar licenseStart = Calendar.getInstance();
		licenseStart.set(year, licenseStartEnd.startMonth,
		    licenseStartEnd.startDay, 0, 0, 0);
		
		final Calendar licenseEnd = Calendar.getInstance();
		licenseEnd.set(year, licenseStartEnd.endMonth, licenseStartEnd.endDay,
		    0, 0, 0);
		
		return new Inteval(licenseStart.getTime(), licenseEnd.getTime());
	}
	
	private DateConverter getDateConverter() {
		return dateConverter;
	}
}