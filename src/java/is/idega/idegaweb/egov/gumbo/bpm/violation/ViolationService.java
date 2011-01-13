package is.idega.idegaweb.egov.gumbo.bpm.violation;

import is.idega.idegaweb.egov.gumbo.bpm.violation.ViolationDataProvider.EquipmentData;
import is.idega.idegaweb.egov.gumbo.bpm.violation.ViolationDataProvider.PersonData;
import is.idega.idegaweb.egov.gumbo.licenses.FishingLicenseUser.XFormsBooleanResult;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

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
		return setLabelForValue(getViolationDataProvider()
		        .getOtherInspectorsThanCurrentlyLoggedIn());
	}
	
	public List<Item> getFiskistofaOffices() {
		return setLabelForValue(getViolationDataProvider()
		        .getFiskistofaOffices());
	}
	
	public List<Item> getFishingGears() {
		return setLabelForValue(getViolationDataProvider().getFishingGears());
	}
	
	public List<Item> getLettersTypes() {
		return getViolationDataProvider().getLettersTypes();
	}
	
	public List<Item> getEmptyList() {
		return Collections.emptyList();
	}
	
	public List<Item> getLetters(String type) {
		
		if (!com.idega.util.StringUtil.isEmpty(type))
			return getViolationDataProvider().getLetters(type);
		else
			return Collections.emptyList();
	}
	
	public List<Item> getDecisionRulings() {
		return getViolationDataProvider().getDecisionRulings();
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
	
	public String hasNativeRole(String role) {
		
		return new XFormsBooleanResult(

		getRolesManager().getUserNativeRoles(getCurrentUser()).contains(role)

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