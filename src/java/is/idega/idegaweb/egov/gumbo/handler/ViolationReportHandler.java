package is.idega.idegaweb.egov.gumbo.handler;

import is.idega.idegaweb.egov.gumbo.bpm.violation.ViolationService;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.chiba.ChibaUtils;
import com.idega.core.business.DefaultSpringBean;
import com.idega.data.SimpleQuerier;
import com.idega.util.ListUtil;
import com.idega.util.StringHandler;
import com.idega.util.StringUtil;
import com.idega.util.expression.ELUtil;

@Service("fiskistofaViolationReportHandler")
@Scope("session")
public class ViolationReportHandler extends DefaultSpringBean implements ActionHandler {

	private static final long serialVersionUID = -2164372283418007751L;
	
	private String taskInstanceId;
	
	@Autowired
	private ViolationService violationService;
	
	@Autowired
	private ChibaUtils chibaUtils;
	
	public String getTaskInstanceId() {
		return taskInstanceId;
	}

	public void setTaskInstanceId(String taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

	private ViolationService getViolationService() {
		if (violationService == null)
			ELUtil.getInstance().autowire(this);
		return violationService;
	}
	
	private ChibaUtils getChibaUtils() {
		if (chibaUtils == null)
			ELUtil.getInstance().autowire(this);
		return chibaUtils;
	}
	
	private void setValue(String query, String name, String value) {
		if (name != null)
			query = query.concat(name).concat("'");
		query = StringHandler.replace(query, "$value$", (value == null ? "null" : "'".concat(value).concat("'")));
		try {
			SimpleQuerier.executeUpdate(query, false);
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error executing query: " + query, e);
		}
	}

	public void execute(ExecutionContext executionContext) throws Exception {
		if 	(StringUtil.isEmpty(getTaskInstanceId()))
			return;
		
		Long piId = executionContext.getProcessInstance().getId();
		Long tiId = Long.valueOf(getTaskInstanceId());
		String query = "update jbpm_variableinstance set stringvalue_ = $value$ where processinstance_ = " + piId + " and taskinstance_ = " + tiId + " and name_ = '";
		
		// Violation types
		Object violationTypes = executionContext.getVariable("list_violationTypes");
		setValue(query, "string_violationTypesSummary", violationTypes instanceof Collection<?> ?
			getViolationService().getSelectedLabelsForValue(getViolationService().getViolationTypes(), (Collection<?>) violationTypes) : null);
		
		//	Fishing gears
		Object selectedFishingGears = executionContext.getVariable("list_vesselFishingGear");
		setValue(query, "string_vesselFishingGearsSummary", selectedFishingGears instanceof Collection<?> ?
				getViolationService().getSelectedLabelsForValue(getViolationService().getFishingGears(), (Collection<?>) selectedFishingGears) : null);
		
		//	Other inspectors
		Object otherInspectors = executionContext.getVariable("list_otherInspectors");
		setValue(query, "string_otherInspectorsSummary", otherInspectors instanceof Collection<?> ?
			getViolationService().getSelectedLabelsForValue(getViolationService().getOtherInspectorsThanCurrentlyLoggedIn(), (Collection<?>) otherInspectors) : null);
		
		//	Office
		updateOffice(executionContext.getVariable("string_fiskistofaOffice"), query, piId);
	}
	
	private void updateOffice(Object value, String query, Long piId) {
		if (value == null)
			return;
			
		List<String> keys = getChibaUtils().getKeysOfXFormSessions(getChibaUtils().getCurrentHttpSessionId());
		if (ListUtil.isEmpty(keys))
			return;	
		
		Map<String, String> offices = getViolationService().getOffices();
		if (offices == null || offices.isEmpty())
			return;
		
		String office = null;
		String previousValue = value.toString();
		for (String key: keys) {
			office = offices.remove(key);
			if (office == null)
				continue;
			
			if (!previousValue.equals(office)) {
				setValue(query, "string_fiskistofaOffice", StringUtil.isEmpty(office) ? null : office);
				setValue("update jbpm_variableinstance set stringvalue_ = $value$ where processinstance_ = " + piId +
							" and taskinstance_ is null and name_ = 'string_fiskistofaOffice' and TOKENVARIABLEMAP_ is not null", null, StringUtil.isEmpty(office) ? null : office);
			}
		}
	}
	
}