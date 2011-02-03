package is.idega.idegaweb.egov.gumbo.search;


import java.util.Collection;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.builder.bean.AdvancedProperty;
import com.idega.jbpm.variables.MultipleSelectionVariablesResolver;

@Scope("request")
@Service(MultipleSelectionVariablesResolver.BEAN_NAME_PREFIX + "objlist_violationCompanies")
public class ViolatorsCompaniesResolver extends ViolatorsPersonsResolver {
	
	@Override
	public Collection<AdvancedProperty> getValues(String procDefName, String variableName) {
		return super.getValues(procDefName, variableName);
	}
	
	@Override
	protected String getNoValuesLocalizationKey() {
		return "no_companies_found";
	}
	
	@Override
	protected String getNoValuesDefaultString() {
		return "No companies found";
	}
	
	@Override
	public String getIdKey() {
		return "socialSecurityNr";
	}

	@Override
	public String getValueKey() {
		return "violationPersonName";
	}
}