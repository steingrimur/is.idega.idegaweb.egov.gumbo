package is.idega.idegaweb.egov.gumbo.bpm.violation;

import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.business.IBORuntimeException;
import com.idega.data.IDOFinderException;
import com.idega.idegaweb.IWMainApplication;
import com.idega.user.business.GroupBusiness;
import com.idega.user.data.Group;
import com.idega.user.data.User;
import com.idega.util.text.Item;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
@Qualifier(DOFWSClient.MOCK)
public class ViolationDataProviderMock implements ViolationDataProvider {
	
	@Override
	public PersonData getViolationPersonData(String socialNr) {
		return new PersonData(socialNr).setName("violation person mock name")
		        .setAddress("violation person mock address");
	}
	
	@Override
	public PersonData getViolationCompanyData(String socialNr) {
		return new PersonData(socialNr).setName("violation company mock name")
		        .setAddress("violation company mock address");
	}
	
	@Override
	public List<Item> getViolationTypes() {
		return Arrays.asList(new Item[] {
		        new Item("item1", "violation type 1"),
		        new Item("item2", "violation type 2") });
	}
	
	@Override
	public List<Item> getOtherInspectorsThanCurrentlyLoggedIn() {
		return Arrays.asList(new Item[] {
		        new Item("insp1", "other inspector 1"),
		        new Item("insp2", "other inspector 2") });
	}
	
	@Override
	public List<Item> getFiskistofeOffices() {
		return Arrays.asList(new Item[] {
		        new Item("office1", "fiskistofa1 office 1"),
		        new Item("office2", "fiskistofa2 office 2") });
	}
	
	@Override
	public List<Item> getHarbours() {
		return Arrays.asList(new Item[] { new Item("item1", "harbour 1"),
		        new Item("item2", "harbour 2") });
	}
	
	@Override
	public String getTypeLabelOfPermissionForViolationCompany(String socialNr) {
		return "type label for soc nr: " + socialNr;
	}
	
	@Override
	public EquipmentData getEquipmentData(String byVesselRegistryNr) {
		
		return new EquipmentData().setFishingLicense("342435")
		        .setFishingType("fishing type x").setName("some name")
		        .setOwnersName("owners name")
		        .setRevokeLicense("revoke license");
	}
	
	@Override
	public List<Item> getLawyersUsers() {
		
		try {
			final GroupBusiness groupBusiness = getGroupBusiness();
			
			final List<Group> lawyersGroups = (List<Group>) groupBusiness
			        .getGroupsByGroupName("fiskistofa_lawyers");
			
			final Group lawyersGroup = lawyersGroups.isEmpty() ? null
			        : lawyersGroups.iterator().next();
			
			final List<User> lawyersUsers = lawyersGroup != null ? (List<User>) groupBusiness
			        .getUsers(lawyersGroup) : Collections.EMPTY_LIST;
			
			final List<Item> lawyersUsersItems = new ArrayList<Item>(
			        lawyersUsers.size());
			
			for (User user : lawyersUsers) {
				lawyersUsersItems.add(new Item(user.getPrimaryKey().toString(),
				        user.getName()));
			}
			
			return lawyersUsersItems;
			
		} catch (IDOFinderException e) {
			// TODO: log
			return Collections.EMPTY_LIST;
		} catch (RuntimeException e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	
	private GroupBusiness getGroupBusiness() {
		try {
			return (GroupBusiness) IBOLookup.getServiceInstance(
			    IWMainApplication.getDefaultIWApplicationContext(),
			    GroupBusiness.class);
		} catch (IBOLookupException ile) {
			throw new IBORuntimeException(ile);
		}
	}
}