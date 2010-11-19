package is.idega.idegaweb.egov.gumbo.bpm.violation;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.util.StringUtil;

@Service("violationService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ViolationService {
	
	public PersonData getViolationPersonData(String socialNr) {
		
		return !StringUtil.isEmpty(socialNr) ? new PersonData(socialNr)
		        .setName("violator name")
		        .setAddress("address 1234 " + socialNr).setPlace("landan")
		        .setPostalCode("1245 " + socialNr) : new PersonData(socialNr);
	}
	
	public String getTypeLabelOfPermissionForViolationPerson(String socialNr) {
		
		// endurvigtun, heimavigtun, vigtun eftir slægingu, ofl.
		
		return "some type: " + socialNr;
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