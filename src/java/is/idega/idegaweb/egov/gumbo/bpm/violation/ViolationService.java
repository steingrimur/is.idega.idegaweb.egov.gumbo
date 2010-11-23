package is.idega.idegaweb.egov.gumbo.bpm.violation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.util.StringUtil;
import com.idega.util.text.Item;

@Service("violationService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ViolationService {
	
	public PersonData getViolationPersonData(String socialNr) {
		
		return !StringUtil.isEmpty(socialNr) ? new PersonData(socialNr)
		        .setName("violator name")
		        .setAddress("address 1234 " + socialNr).setPlace("landan")
		        .setPostalCode("1245 " + socialNr) : new PersonData(socialNr);
	}
	
	public PersonData getViolationCompanyData(String socialNr) {
		
		return !StringUtil.isEmpty(socialNr) ? new PersonData(socialNr)
		        .setName("violator company name")
		        .setAddress("address 1234 " + socialNr).setPlace("landan")
		        .setPostalCode("1245 " + socialNr) : new PersonData(socialNr);
	}
	
	public PersonData getViolationOtherPartyData(String socialNr) {
		
		return !StringUtil.isEmpty(socialNr) ? new PersonData(socialNr)
		        .setName("violator other party name")
		        .setAddress("address 1234 " + socialNr).setPlace("landan")
		        .setPostalCode("1245 " + socialNr) : new PersonData(socialNr);
	}
	
	public List<Item> getViolationTypes() {
		final List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("type1", "Violation type 1"));
		items.add(new Item("subtype1", " ---- Violation subtype 1"));
		items.add(new Item("type2", "Violation type 2"));
		items.add(new Item("subtype", " ---- Violation subtype 2"));
		
		return items;
	}
	
	public String getTypeLabelOfPermissionForViolationPerson(String socialNr) {
		
		// endurvigtun, heimavigtun, vigtun eftir slægingu, ofl.
		
		return "some type for person: " + socialNr;
	}
	
	public String getTypeLabelOfPermissionForViolationCompany(String socialNr) {
		
		// endurvigtun, heimavigtun, vigtun eftir slægingu, ofl.
		
		return "some type for company: " + socialNr;
	}
	
	public String getTypeLabelOfPermissionForViolationOtherParty(String socialNr) {
		
		// endurvigtun, heimavigtun, vigtun eftir slægingu, ofl.
		
		return "some type for other party: " + socialNr;
	}
	
	public static final class PersonData {
		
		private final String socialSecurityNr;
		private String name;
		private String address;
		private String postalCode;
		private String place;
		
		public PersonData(String socialSecurityNr) {
			
			this.socialSecurityNr = socialSecurityNr;
		}
		
		public String getName() {
			return name;
		}
		
		public PersonData setName(String name) {
			this.name = name;
			return this;
		}
		
		public String getAddress() {
			return address;
		}
		
		public PersonData setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public String getPostalCode() {
			return postalCode;
		}
		
		public PersonData setPostalCode(String postalCode) {
			this.postalCode = postalCode;
			return this;
		}
		
		public String getPlace() {
			return place;
		}
		
		public PersonData setPlace(String place) {
			this.place = place;
			return this;
		}
		
		public String getSocialSecurityNr() {
			return socialSecurityNr;
		}
	}
}