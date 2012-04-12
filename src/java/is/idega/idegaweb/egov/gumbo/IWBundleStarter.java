package is.idega.idegaweb.egov.gumbo;

import is.idega.idegaweb.egov.gumbo.aquaculture.timer.AquaCultureStatisticsTimer;
import is.idega.idegaweb.egov.gumbo.timer.FocalTimer;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;

import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWBundleStartable;
import com.idega.jbpm.data.VariableInstanceQuerier;
import com.idega.util.expression.ELUtil;
import com.idega.util.timer.PastDateException;
import com.idega.util.timer.TimerManager;

public class IWBundleStarter implements IWBundleStartable {

	@Autowired
	private VariableInstanceQuerier variablesQuerier;

	VariableInstanceQuerier getVariablesQuerier() {
		if (variablesQuerier == null)
			ELUtil.getInstance().autowire(this);
		return variablesQuerier;
	}

	@Override
	public void start(IWBundle starterBundle) {
		Thread variablesLoader = new Thread(new Runnable() {
			@Override
			public void run() {
				getVariablesQuerier().loadVariables(Arrays.asList(
						GumboConstants.VARIABLE_AQUA_REPORT_YEAR
				));
			}
		});
		variablesLoader.start();

		TimerManager mgr = new TimerManager();

		try {
			mgr.addTimer(30, true, new FocalTimer());

			mgr.addTimer(0, 2, -1, -1, -1, -1, new AquaCultureStatisticsTimer());
			// "MentorAbsentTimer");
		} catch (PastDateException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void stop(IWBundle starterBundle) {
	}
}