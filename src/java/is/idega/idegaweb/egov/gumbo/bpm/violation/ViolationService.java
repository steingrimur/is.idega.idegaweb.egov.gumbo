package is.idega.idegaweb.egov.gumbo.bpm.violation;

import is.idega.idegaweb.egov.gumbo.bpm.violation.ViolationDataProvider.EquipmentData;
import is.idega.idegaweb.egov.gumbo.bpm.violation.ViolationDataProvider.PersonData;
import is.idega.idegaweb.egov.gumbo.licenses.FishingLicenseUser.XFormsBooleanResult;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.business.DefaultSpringBean;
import com.idega.jbpm.identity.Role;
import com.idega.jbpm.identity.RolesManager;
import com.idega.util.text.Item;

@Service("violationService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ViolationService extends DefaultSpringBean {
	
	@Autowired
	@Qualifier(DOFWSClient.WEB_SERVICE)
	private ViolationDataProvider violationDataProvider;
	
	@Autowired
	private RolesManager rolesManager;
	
	public PersonData getViolationPersonData(String socialNr) {
		return getViolationDataProvider().getViolationPersonData(socialNr);
	}
	
	public PersonData getViolationCompanyData(String socialNr) {
		return getViolationDataProvider().getViolationCompanyData(socialNr);
	}
	
	public List<Item> getViolationTypes() {
		return setLabelForValue(getViolationDataProvider().getViolationTypes());
	}
	
	private List<Item> setLabelForValue(List<Item> items) {
		
		final List<Item> modifiedItems = new ArrayList<Item>(items.size());
		
		for (Item item : items) {
			
			modifiedItems
			        .add(new Item(item.getItemLabel(), item.getItemLabel()));
			
		}
		
		return modifiedItems;
	}
	
	public List<Item> getOtherInspectorsThanCurrentlyLoggedIn() {
		return getViolationDataProvider()
		        .getOtherInspectorsThanCurrentlyLoggedIn();
	}
	
	public List<Item> getFiskistofeOffices() {
		return getViolationDataProvider().getFiskistofeOffices();
	}
	
	public List<Item> getFishingGears() {
		return setLabelForValue(getViolationDataProvider().getFishingGears());
	}
	
	public List<Item> getHarbours() {
		return getViolationDataProvider().getHarbours();
	}
	
	public String getTypeLabelOfPermissionForViolationCompany(String socialNr) {
		return getViolationDataProvider()
		        .getTypeLabelOfPermissionForViolationCompany(socialNr);
	}
	
	public List<Item> getLawyersUsers() {
		
		return getViolationDataProvider().getLawyersUsers();
	}
	
	public String hasRole(String role, String processInstanceId) {
		
		return new XFormsBooleanResult(

		contains(
		    
		    getRolesManager().getUserRoles(new Long(processInstanceId),
		        getCurrentUser()), role)

		).getResult();
	}
	
	private boolean contains(List<Role> inRoles, String role) {
		
		for (Role r : inRoles) {
			if (r.getRoleName().equals(role))
				return true;
		}
		
		return false;
	}
	
	public EquipmentData getEquipmentData(String byVesselRegistryNr) {
		return getViolationDataProvider().getEquipmentData(byVesselRegistryNr);
	}
	
	private ViolationDataProvider getViolationDataProvider() {
		return violationDataProvider;
	}
	
	private RolesManager getRolesManager() {
		return rolesManager;
	}
}