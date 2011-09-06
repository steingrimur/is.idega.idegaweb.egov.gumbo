package is.idega.idegaweb.egov.gumbo.aquaculture.timer;

import is.idega.idegaweb.egov.gumbo.aquaculture.dao.AquaDAO;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatHeader;

import java.util.Collection;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;

import com.idega.block.process.business.CaseBusiness;
import com.idega.block.process.data.Case;
import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.egov.bpm.data.CaseProcInstBind;
import com.idega.idegaweb.egov.bpm.data.dao.CasesBPMDAO;
import com.idega.jbpm.bean.VariableInstanceInfo;
import com.idega.jbpm.data.VariableInstanceQuerier;
import com.idega.util.expression.ELUtil;
import com.idega.util.timer.TimerEntry;
import com.idega.util.timer.TimerListener;

public class AquaCultureStatisticsTimer implements TimerListener {

	//private static final String LAST_AQUA_TIMER_RUN = "last_aqua_run";
	
	@Autowired
	private AquaDAO aquaDAO;
	
	@Autowired
	private CasesBPMDAO casesBPMDAO;
	
	@Autowired
	private VariableInstanceQuerier variablesQuerier;

	private static final Logger LOGGER = Logger
			.getLogger(AquaCultureStatisticsTimer.class.getName());

	public void handleTimer(TimerEntry entry) {
		System.out.println("STARTING AQUA STATISTICS TIMER!!!!");

		try {
/*			IWMainApplicationSettings settings = IWMainApplication
					.getDefaultIWApplicationContext().getApplicationSettings();
			
			IWTimestamp now = IWTimestamp.RightNow();
			boolean firstRun = true;
			
			String lastRun = settings.getProperty(AquaCultureStatisticsTimer.LAST_AQUA_TIMER_RUN);
			if (lastRun != null) {
				firstRun = false;
			}*/

			List<Long> cases = getCasesBPMDAO().getCaseIdsByProcessDefinition("Aquaculture");
			for (Long caseId : cases) {
				Case procCase = getCaseBusiness().getCase(caseId.intValue());
				List<ACStatHeader> headers = getAquaDAO().getACStatHeaderByCaseUniqueID(procCase.getUniqueId());
				if (headers == null || headers.isEmpty()) {
					/*String personalID = null;
					String name = null;
					String address = null;
					String farm = null;
					String year = null;
					String comment = null;
					boolean canSendInfo = false;*/
					
					CaseProcInstBind bind = getCasesBPMDAO().getCaseProcInstBindByCaseId((Integer)procCase.getPrimaryKey());
					if (bind == null) {
						LOGGER.warning("Case and process instance bind can not be found by case ID: "
								+ procCase.getPrimaryKey());
						return;
					}
					
					Long procInstId = bind.getProcInstId();
					Collection<VariableInstanceInfo> variables = null;
					try {
						variables = variablesQuerier.getVariablesByProcessInstanceId(procInstId);
					} catch(Exception e) {
						LOGGER.log(Level.WARNING, "Error getting variables from process instance: " + procInstId, e);
					}
					
					for (VariableInstanceInfo variable: variables) {	
						String varName = variable.getName();

						if (variable.getValue() != null) {
							System.out.println("variable " + varName + " = " + (String) variable.getValue());														
						} else {
							System.out.println("variable " + varName + " = " + variable.getValue());							
						}
						
					}
					
					//ACStatHeader header = getAquaDAO().createHeader(personalID, name, address, farm, year, comment, canSendInfo, procCase.getUniqueId());
				}
			}
			
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