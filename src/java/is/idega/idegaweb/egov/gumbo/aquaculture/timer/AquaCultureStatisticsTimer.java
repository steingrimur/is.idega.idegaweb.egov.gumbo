package is.idega.idegaweb.egov.gumbo.aquaculture.timer;

import is.idega.idegaweb.egov.gumbo.aquaculture.dao.AquaDAO;

import org.springframework.beans.factory.annotation.Autowired;

import com.idega.block.process.business.CaseBusiness;
import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWMainApplicationSettings;
import com.idega.idegaweb.egov.bpm.data.dao.CasesBPMDAO;
import com.idega.util.IWTimestamp;
import com.idega.util.expression.ELUtil;
import com.idega.util.timer.TimerEntry;
import com.idega.util.timer.TimerListener;

public class AquaCultureStatisticsTimer implements TimerListener {

	private static final String LAST_AQUA_TIMER_RUN = "last_aqua_run";
	
	@Autowired
	private AquaDAO aquaDAO;
	
	@Autowired
	private CasesBPMDAO casesBPMDAO;

	public void handleTimer(TimerEntry entry) {
		System.out.println("STARTING AQUA STATISTICS TIMER!!!!");

		try {
			IWMainApplicationSettings settings = IWMainApplication
					.getDefaultIWApplicationContext().getApplicationSettings();
			
			IWTimestamp now = IWTimestamp.RightNow();
			boolean firstRun = true;
			
			String lastRun = settings.getProperty(AquaCultureStatisticsTimer.LAST_AQUA_TIMER_RUN);
			if (lastRun != null) {
				firstRun = false;
			}

			//getCaseBusiness().getall
			
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("AQUA STATISTICS TIMER DONE!!!!");

	}

	private AquaDAO getAquaDAO() {
		if (this.aquaDAO == null) {
			ELUtil.getInstance().autowire(this);
		}

		return this.aquaDAO;
	}
	
	private CasesBPMDAO getCasesBPMDAO() {
		if (this.casesBPMDAO == null) {
			ELUtil.getInstance().autowire(this);
		}
		return this.casesBPMDAO;
	}
	
	CaseBusiness getCaseBusiness() {
		try {
			return IBOLookup.getServiceInstance(
					IWMainApplication.getDefaultIWApplicationContext(),
					CaseBusiness.class);
		} catch (IBOLookupException e) {
			e.printStackTrace();
		}
		return null;
	}

}