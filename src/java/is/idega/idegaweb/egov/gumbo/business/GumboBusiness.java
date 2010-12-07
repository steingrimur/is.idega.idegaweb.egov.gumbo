package is.idega.idegaweb.egov.gumbo.business;

import is.idega.idegaweb.egov.company.business.CompanyPortalBusiness;

import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.FinderException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.business.IBORuntimeException;
import com.idega.company.business.CompanyBusiness;
import com.idega.company.data.Company;
import com.idega.idegaweb.IWMainApplication;
import com.idega.user.data.Group;
import com.idega.user.data.User;
import com.idega.util.expression.ELUtil;

@Scope("singleton")
@Service("gumboBusiness")
public class GumboBusiness {

	@Autowired
	private CompanyPortalBusiness companyBusiness;
	
	public Company getCompanyForUser(User user) {
		List<Group> companies = getCompanyPortalBusiness().getAllUserCompanies(user);
		if (companies != null && companies.size() > 0) {
			Group group = companies.iterator().next();
			
			String personalID = group.getMetaData("COMPANY_PERSONAL_ID");
			if (personalID != null) {
				try {
					return getCompanyBusiness().getCompany(personalID);
				}
				catch (FinderException fe) {
					fe.printStackTrace();
				}
				catch (RemoteException re) {
					throw new IBORuntimeException(re);
				}
			}
		}
		
		return null;
	}
	
	private CompanyPortalBusiness getCompanyPortalBusiness() {
		if (this.companyBusiness == null) {
			ELUtil.getInstance().autowire(this);
		}
		
		return this.companyBusiness;
	}
	
	private CompanyBusiness getCompanyBusiness() {
		try {
			return IBOLookup.getServiceInstance(IWMainApplication.getDefaultIWApplicationContext(), CompanyBusiness.class);
		}
		catch (IBOLookupException ile) {
			throw new IBORuntimeException(ile);
		}
	}
}