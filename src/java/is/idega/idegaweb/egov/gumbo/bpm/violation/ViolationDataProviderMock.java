package is.idega.idegaweb.egov.gumbo.bpm.violation;

import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.presentation.IWContext;
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
		        new Item("item1", "other inspector 1"),
		        new Item("item2", "other inspector 2") });
	}
	
	@Override
	public List<Item> getFiskistofeOffices() {
		return Arrays.asList(new Item[] {
		        new Item("item1", "fiskistofa office 1"),
		        new Item("item2", "fiskistofa office 2") });
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
		
		final User currentUser = IWContext.getCurrentInstance()
		        .getCurrentUser();
		
		return Arrays.asList(new Item[] { new Item(currentUser.getPrimaryKey()
		        .toString(), currentUser.getName()) });
	}
}