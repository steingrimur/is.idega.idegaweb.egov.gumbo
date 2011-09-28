package is.idega.idegaweb.egov.gumbo.search;


import java.rmi.RemoteException;
import java.util.Collection;
import java.util.logging.Level;

import javax.ejb.FinderException;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.builder.bean.AdvancedProperty;
import com.idega.company.business.CompanyBusiness;
import com.idega.company.data.Company;
import com.idega.jbpm.variables.MultipleSelectionVariablesResolver;
import com.idega.util.StringUtil;

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
	
	@Override
	protected String getName(String personalId) {
		String name = super.getName(personalId);
		if (!StringUtil.isEmpty(name))
			return name;
		
		if (StringUtil.isEmpty(personalId))
			return null;
		
		CompanyBusiness companyBusiness = getServiceInstance(CompanyBusiness.class);
		Company company = null;
		try {
			company = companyBusiness.getCompany(personalId);
		} catch (RemoteException e) {
			getLogger().log(Level.WARNING, "Error getting company by ID: " + personalId, e);
		} catch (FinderException e) {
		}
		
		return company == null ? null : company.getName();
	}
}