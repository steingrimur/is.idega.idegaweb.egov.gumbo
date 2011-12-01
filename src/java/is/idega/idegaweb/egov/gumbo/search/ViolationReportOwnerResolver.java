package is.idega.idegaweb.egov.gumbo.search;

import is.idega.idegaweb.egov.bpm.IWBundleStarter;
import is.idega.idegaweb.egov.bpm.cases.search.BPMCasesHandlersResolver;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.block.process.data.Case;
import com.idega.block.process.data.CaseHome;
import com.idega.builder.bean.AdvancedProperty;
import com.idega.builder.business.AdvancedPropertyComparator;
import com.idega.data.IDOLookup;
import com.idega.idegaweb.egov.bpm.data.dao.CasesBPMDAO;
import com.idega.jbpm.variables.MultipleSelectionVariablesResolver;
import com.idega.user.data.User;
import com.idega.util.ListUtil;
import com.idega.util.StringUtil;
import com.idega.util.expression.ELUtil;

@Scope("request")
@Service(MultipleSelectionVariablesResolver.BEAN_NAME_PREFIX + "string_responsibleInspector")
public class ViolationReportOwnerResolver extends BPMCasesHandlersResolver {

	@Autowired
	private CasesBPMDAO casesBPMDAO;
	
	CasesBPMDAO getCasesBPMDAO() {
		if (casesBPMDAO == null)
			ELUtil.getInstance().autowire(this);
		return casesBPMDAO;
	}
	
	@Override
	public Collection<AdvancedProperty> getValues(String procDefId, String variableName) {
		if (StringUtil.isEmpty(procDefId) || StringUtil.isEmpty(variableName)) {
			addEmptyLabel(IWBundleStarter.IW_BUNDLE_IDENTIFIER);
			return values;
		}
		
		String procDefName = getBpmDAO().getProcessDefinitionNameByProcessDefinitionId(Long.valueOf(procDefId));
		if (StringUtil.isEmpty(procDefName)) {
			addEmptyLabel(IWBundleStarter.IW_BUNDLE_IDENTIFIER);
			return values;
		}
		
		List<Long> procInstIds = getBpmDAO().getProcessInstanceIdsByProcessDefinitionNames(Arrays.asList(procDefName));
		if (ListUtil.isEmpty(procInstIds)) {
			addEmptyLabel(IWBundleStarter.IW_BUNDLE_IDENTIFIER);
			return values;
		}
		
		List<Integer> casesIds = getCasesBPMDAO().getCasesIdsByProcInstIds(procInstIds);
		if (ListUtil.isEmpty(casesIds)) {
			addEmptyLabel(IWBundleStarter.IW_BUNDLE_IDENTIFIER);
			return values;
		}
		
		Collection<Case> cases = null;
		try {
			CaseHome caseHome = (CaseHome) IDOLookup.getHome(Case.class);
			cases = caseHome.findAllByIds(casesIds);
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error resolving owners for the cases by IDs: " + casesIds, e);
		}
		if (ListUtil.isEmpty(cases)) {
			addEmptyLabel(IWBundleStarter.IW_BUNDLE_IDENTIFIER);
			return values;
		}
		
		values = new ArrayList<AdvancedProperty>();
		List<String> addedIds = new ArrayList<String>();
		for (Case theCase: cases) {
			User owner = theCase.getOwner();
			if (owner == null)
				continue;
			
			String id = owner.getId();
			if (!addedIds.contains(id)) {
				String name = owner.getName();
				values.add(new AdvancedProperty(name, name));
				addedIds.add(id);
			}
		}
		
		List<AdvancedProperty> sorted = new ArrayList<AdvancedProperty>(values);
		Collections.sort(sorted, new AdvancedPropertyComparator(getCurrentLocale()));
		values = new ArrayList<AdvancedProperty>(sorted);
		
		return values;
	}
	
	@Override
	protected String getNoValuesLocalizationKey() {
		return "no_owner_found";
	}

	@Override
	protected String getNoValuesDefaultString() {
		return "No owner found";
	}
	
}