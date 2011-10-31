package is.idega.idegaweb.egov.gumbo.search;

import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.ViolationType;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.builder.bean.AdvancedProperty;
import com.idega.builder.business.AdvancedPropertyComparator;
import com.idega.core.persistence.Param;
import com.idega.jbpm.bean.BPMProcessVariable;
import com.idega.jbpm.bean.VariableInstanceInfo;
import com.idega.jbpm.variables.MultipleSelectionVariablesResolver;
import com.idega.util.ArrayUtil;
import com.idega.util.CoreConstants;
import com.idega.util.ListUtil;
import com.idega.util.StringUtil;
import com.idega.util.expression.ELUtil;

@Scope("request")
@Service(MultipleSelectionVariablesResolver.BEAN_NAME_PREFIX + "list_violationTypes")
public class ViolationTypesResolver extends MultipleSelectionVariablesResolver {

	@Autowired
	private GumboDao gumboDAO;
	
	private GumboDao getGumboDao() {
		if (gumboDAO == null)
			ELUtil.getInstance().autowire(this);
		return gumboDAO;
	}
	
	@Override
	public Collection<AdvancedProperty> getBinaryVariablesValues(Collection<VariableInstanceInfo> vars) {
		if (ListUtil.isEmpty(vars))
			return null;
		
		List<ViolationType> allViolations = getGumboDao().getViolationTypes();
		if (ListUtil.isEmpty(allViolations))
			return null;
		
		Map<Long, String> violations = new HashMap<Long, String>();
		for (ViolationType violation: allViolations) {
			violations.put(violation.getId(), violation.getNumber().concat(CoreConstants.SPACE).concat(violation.getName()));
		}
		
		List<String> addedIds = new ArrayList<String>();
		List<AdvancedProperty> results = new ArrayList<AdvancedProperty>();
		for (VariableInstanceInfo var: vars) {
			Serializable value = var.getValue();
			if (value instanceof Collection<?>) {
				Collection<?> ids = (Collection<?>) value;
				for (Object id: ids) {
					Long violationId = Long.valueOf(id.toString());
					String violationTypeValue = violations.get(violationId);
					if (!StringUtil.isEmpty(violationTypeValue) && !addedIds.contains(String.valueOf(violationId))) {
						results.add(new AdvancedProperty(String.valueOf(violationId), violationTypeValue));
						addedIds.add(String.valueOf(violationId));
					}
				}
			}
		}
		Collections.sort(results, new AdvancedPropertyComparator(getCurrentLocale()));
		return results;
	}
	
	@Override
	public Collection<AdvancedProperty> getValues(String procDefId, String variableName) {
		if (values != null)
			return values;
		
		values = new ArrayList<AdvancedProperty>();
		
		Collection<VariableInstanceInfo> vars = getVariables(getProcessDefNameByProcessDefId(procDefId), variableName);
		if (ListUtil.isEmpty(vars)) {
			addEmptyLabel(GumboConstants.IW_BUNDLE_IDENTIFIER);
			return values;
		}
		
		Collection<AdvancedProperty> realValues = getBinaryVariablesValues(vars);
		if (ListUtil.isEmpty(realValues)) {
			addEmptyLabel(GumboConstants.IW_BUNDLE_IDENTIFIER);
			return values;
		}
		
		values = realValues;
		return values;
	}

	@Override
	public String getIdKey() {
		return "violationTypeId";
	}

	@Override
	public String getValueKey() {
		return "violationTypeLabels";
	}

	@Override
	protected String getNoValuesLocalizationKey() {
		return "no_violation_types_found";
	}

	@Override
	protected String getNoValuesDefaultString() {
		return "No violation types found";
	}

	@Override
	public String getPresentation(BPMProcessVariable variable) {
		if (variable == null)
			return null;
		return getPresentation(variable.getValue());
	}

	@Override
	public String getPresentation(String value) {
		if (StringUtil.isEmpty(value))
			return null;
		
		String[] ids = value.split(CoreConstants.SEMICOLON);
		if (ArrayUtil.isEmpty(ids))
			return null;
		List<Long> violationTypeIds = new ArrayList<Long>();
		for (String id: ids) {
			if (StringUtil.isEmpty(id))
				continue;
			
			Long violationTypeId = Long.valueOf(id);
			if (!violationTypeIds.contains(violationTypeId))
				violationTypeIds.add(violationTypeId);
		}
		
		List<ViolationType> violations = null;
		try {
			violations = getGumboDao().getResultList(ViolationType.QUERY_FIND_BY_IDS, ViolationType.class, new Param("violationTypeIds", violationTypeIds));
		} catch(Exception e) {
			e.printStackTrace();
		}
		if (ListUtil.isEmpty(violations))
			return null;

		StringBuilder presentation = new StringBuilder();
		for (Iterator<ViolationType> typesIter = violations.iterator(); typesIter.hasNext();) {
			ViolationType violation = typesIter.next();
			presentation.append(violation.getNumber()).append(CoreConstants.SPACE).append(violation.getName());
			if (typesIter.hasNext())
				presentation.append(CoreConstants.COMMA).append(CoreConstants.SPACE);
		}
		return presentation.toString();
	}

	@Override
	public String getPresentation(VariableInstanceInfo variable) {
		if (variable == null)
			return null;
		Serializable value = variable.getValue();
		if (!(value instanceof Collection<?>))
			return null;
		
		Collection<?> ids = (Collection<?>) value;
		StringBuilder idsExpression = new StringBuilder();
		for (Iterator<?> idsIter = ids.iterator(); idsIter.hasNext();) {
			idsExpression.append(idsIter.next().toString());
			if (idsIter.hasNext())
				idsExpression.append(CoreConstants.SEMICOLON);
		}
		return getPresentation(idsExpression.toString());
	}

}