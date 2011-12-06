package is.idega.idegaweb.egov.gumbo.handler;

import is.idega.idegaweb.egov.gumbo.bpm.violation.ViolationService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
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
import com.idega.util.text.Item;

@Scope("session")
@Service("fiskistofaViolationReportHandler")
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

	private static final List<String> FIXED_VARIABLES = Collections.unmodifiableList(Arrays.asList(
			"string_violationTypesSummary",		//	0
			"string_vesselFishingGearsSummary",	//	1
			"string_otherInspectorsSummary",	//	2
			"string_fiskistofaOffice"			//	3
	));
	
	public void execute(ExecutionContext executionContext) throws Exception {
		if 	(StringUtil.isEmpty(getTaskInstanceId()))
			return;
		
		Long piId = executionContext.getProcessInstance().getId();
		Long tiId = Long.valueOf(getTaskInstanceId());
		String query = "update jbpm_variableinstance set stringvalue_ = $value$ where processinstance_ = " + piId + " and taskinstance_ = " + tiId + " and name_ = '";
		
		// Violation types
		Object violationTypes = executionContext.getVariable("list_violationTypes");
		setValue(query, FIXED_VARIABLES.get(0), violationTypes instanceof Collection<?> ?
				getViolationService().getSelectedLabelsForValue(getViolationService().getViolationTypes(), (Collection<?>) violationTypes) : null);
		
		//	Fishing gears
		List<Item> fishingGears = getViolationService().getFishingGears();
		Object selectedFishingGears = getSelectedItems(executionContext, "list_vesselFishingGear", fishingGears);
		setValue(query, FIXED_VARIABLES.get(1), selectedFishingGears instanceof Collection<?> ?
				getViolationService().getSelectedLabelsForValue(fishingGears, (Collection<?>) selectedFishingGears) : null);
		
		//	Other inspectors
		List<Item> inspectors = getViolationService().getOtherInspectorsThanCurrentlyLoggedIn();
		Object otherInspectors = getSelectedItems(executionContext, "list_otherInspectors", inspectors);
		setValue(query, FIXED_VARIABLES.get(2), otherInspectors instanceof Collection<?> ?
			getViolationService().getSelectedLabelsForValue(inspectors, (Collection<?>) otherInspectors) : null);
		
		//	Office
		updateOffice(executionContext.getVariable(FIXED_VARIABLES.get(3)), query, piId);
	}
	
	private Object getSelectedItems(ExecutionContext context, String variableName, List<Item> availableItems) {
		Object items = null;
		if (!ListUtil.isEmpty(availableItems)) {
			items = context.getVariable(variableName);
			if (items instanceof Collection<?>) {
				Collection<?> providedItems = (Collection<?>) items;
				Collection<String> itemsToSubmit = new ArrayList<String>();
				for (Item item: availableItems) {
					if (providedItems.contains(item.getItemValue()))
						itemsToSubmit.add(item.getItemValue());
				}
				items = itemsToSubmit;
			}
		}
		context.setVariable(variableName, items);
		return items;
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
				setValue(query, FIXED_VARIABLES.get(3), StringUtil.isEmpty(office) ? null : office);
				setValue("update jbpm_variableinstance set stringvalue_ = $value$ where processinstance_ = " + piId +
							" and taskinstance_ is null and name_ = '" + FIXED_VARIABLES.get(3) + "' and TOKENVARIABLEMAP_ is not null", null,
							StringUtil.isEmpty(office) ? null : office);
			}
		}
	}
	
}