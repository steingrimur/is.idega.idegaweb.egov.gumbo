package is.idega.idegaweb.egov.gumbo;

import is.idega.idegaweb.egov.gumbo.aquaculture.timer.AquaCultureStatisticsTimer;

import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWBundleStartable;
import com.idega.util.timer.PastDateException;
import com.idega.util.timer.TimerManager;

public class IWBundleStarter implements IWBundleStartable {

	public void start(IWBundle starterBundle) {
		TimerManager mgr = new TimerManager();

		try {
			mgr.addTimer(1, false, new AquaCultureStatisticsTimer());

			// mgr.addTimer(0, 10, -1, -1, -1, -1, new MentorAbsentTimer(),
			// "MentorAbsentTimer");
		} catch (PastDateException e) {
			e.printStackTrace();
		}
	}

	public void stop(IWBundle starterBundle) {
	}
}