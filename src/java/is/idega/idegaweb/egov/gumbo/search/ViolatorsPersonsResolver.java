package is.idega.idegaweb.egov.gumbo.search;

import is.idega.idegaweb.egov.gumbo.GumboConstants;

import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;

import javax.ejb.FinderException;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.builder.bean.AdvancedProperty;
import com.idega.builder.business.AdvancedPropertyComparator;
import com.idega.jbpm.bean.BPMProcessVariable;
import com.idega.jbpm.bean.VariableInstanceInfo;
import com.idega.jbpm.variables.MultipleSelectionVariablesResolver;
import com.idega.user.business.UserBusiness;
import com.idega.user.data.User;
import com.idega.util.CoreConstants;
import com.idega.util.ListUtil;
import com.idega.util.StringUtil;

@Scope("request")
@Service(MultipleSelectionVariablesResolver.BEAN_NAME_PREFIX + "objlist_violationPersons")
public class ViolatorsPersonsResolver extends MultipleSelectionVariablesResolver {

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
		
		Collection<AdvancedProperty> converted = getBinaryVariablesValues(vars);
		if (ListUtil.isEmpty(converted)) {
			addEmptyLabel(GumboConstants.IW_BUNDLE_IDENTIFIER);
			return values;
		}
		
		List<AdvancedProperty> persons = new ArrayList<AdvancedProperty>(converted);
		Collections.sort(persons, new AdvancedPropertyComparator(getCurrentLocale()));
		
		for (AdvancedProperty prop: persons) {
			String value = prop.getValue();
			value = value == null ? CoreConstants.EMPTY : value;
			
			AdvancedProperty result = new AdvancedProperty(prop.getId(),
							new StringBuilder(prop.getId()).append(StringUtil.isEmpty(value) ? CoreConstants.EMPTY : " (".concat(value).concat(")")).toString());
			if (!values.contains(result))
				values.add(result);
		}
		
		if (values.size() == 0) {
			addEmptyLabel(GumboConstants.IW_BUNDLE_IDENTIFIER);
		}
		
		return values;
	}
	
	@Override
	protected String getNoValuesLocalizationKey() {
		return "no_persons_found";
	}
	
	@Override
	protected String getNoValuesDefaultString() {
		return "No persons found";
	}

	@Override
	public String getIdKey() {
		return "socialSecurityNr";
	}

	@Override
	public String getValueKey() {
		return "violationPersonName";
	}

	@Override
	public String getPresentation(BPMProcessVariable variable) {
		if (variable == null)
			return CoreConstants.MINUS;
		Object realValue = variable.getRealValue();
		if (realValue instanceof Collection<?>)
			return getPresentation(getValues((Collection<?>) realValue));
		return CoreConstants.MINUS;
	}

	@Override
	public String getPresentation(String value) {
		return StringUtil.isEmpty(value) ? CoreConstants.EMPTY : getPresentation(Arrays.asList(getValueFromString(value)));
	}

	@Override
	public String getPresentation(VariableInstanceInfo variable) {
		return (variable == null || variable.getValue() == null) ? CoreConstants.MINUS : getPresentation(getBinaryVariablesValues(Arrays.asList(variable)));
	}
	
	private String getPresentation(Collection<AdvancedProperty> values) {
		if (ListUtil.isEmpty(values))
			return CoreConstants.MINUS;
		StringBuilder concatinatedValues = new StringBuilder();
		for (Iterator<AdvancedProperty> valuesIter = values.iterator(); valuesIter.hasNext();) {
			concatinatedValues.append(valuesIter.next().getId());
			if (valuesIter.hasNext())
				concatinatedValues.append(CoreConstants.COMMA).append(CoreConstants.SPACE);
		}
		String result = concatinatedValues.toString();
		return StringUtil.isEmpty(result) ? CoreConstants.MINUS : result;
	}
	
	protected String getName(String personalId) {
		if (StringUtil.isEmpty(personalId))
			return null;
		
		UserBusiness userBusiness = getServiceInstance(UserBusiness.class);
		User user = null;
		try {
			user = userBusiness.getUser(personalId);
		} catch (RemoteException e) {
			getLogger().log(Level.WARNING, "Error getting user by personal ID: " + personalId, e);
		} catch (FinderException e) {
		}
		
		return user == null ? null : user.getName();
	}

	@Override
	protected AdvancedProperty getValueFromString(String value) {
		AdvancedProperty person = super.getValueFromString(value);
		if (person == null)
			return null;
		
		String name = person.getValue();
		if (StringUtil.isEmpty(name) || "No user found".equals(name)) {
			String personName = getName(person.getId());
			name = StringUtil.isEmpty(personName) ? name : personName;
			person.setValue(name);
		}
		
		return person;
	}

}