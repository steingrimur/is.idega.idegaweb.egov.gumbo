package is.idega.idegaweb.egov.gumbo.bpm.violation;

import java.util.List;

import com.idega.util.CoreConstants;
import com.idega.util.text.Item;

public interface ViolationDataProvider {
	
	public static final String MOCK = "mock";
	public static final String WEB_SERVICE = "webservice";
	
	public abstract PersonData getViolationPersonData(String socialNr);
	
	public abstract PersonData getViolationCompanyData(String socialNr);
	
	public abstract PersonData getRecipientPersonDataForWriteLetter(
	        String socialNr);
	
	public abstract List<Item> getViolationTypes();
	
	public abstract List<Item> getOtherInspectorsThanCurrentlyLoggedIn();
	
	public abstract List<Item> getFiskistofaOffices();
	
	public abstract List<Item> getFishingGears();
	
	public abstract List<Item> getHarbours();
	
	public abstract List<Item> getLettersTypes();
	
	public abstract List<Item> getLetters(String type);
	
	public abstract String getLetterText(String byLetterId);
	
	public abstract List<Item> getDecisionRulings();
	
	public abstract String getTypeLabelOfPermissionForViolationCompany(
	        String socialNr);
	
	public abstract EquipmentData getEquipmentData(String byVesselRegistryNr);
	
	public abstract List<Item> getLawyersUsers();
	
	public static final class EquipmentData {
		private String name;
		private String ownersName;
		private String fishingType;
		private String fishingLicense;
		private String revokeLicense = CoreConstants.EMPTY;
		private String fisheriesName;
		
		public String getName() {
			return name;
		}
		
		public EquipmentData setName(String name) {
			this.name = name;
			return this;
		}
		
		public String getOwnersName() {
			return ownersName;
		}
		
		public EquipmentData setOwnersName(String ownersName) {
			this.ownersName = ownersName;
			return this;
		}
		
		public String getFishingType() {
			return fishingType;
		}
		
		public EquipmentData setFishingType(String fishingType) {
			this.fishingType = fishingType;
			return this;
		}
		
		public String getFishingLicense() {
			return fishingLicense;
		}
		
		public EquipmentData setFishingLicense(String fishingLicense) {
			this.fishingLicense = fishingLicense;
			return this;
		}
		
		public String getRevokeLicense() {
			return revokeLicense;
		}
		
		public EquipmentData setRevokeLicense(String revokeLicense) {
			this.revokeLicense = revokeLicense != null ? revokeLicense
			        : CoreConstants.EMPTY;
			return this;
		}
		
		public String getFisheriesName() {
			return fisheriesName;
		}
		
		public EquipmentData setFisheriesName(String fisheriesName) {
			this.fisheriesName = fisheriesName;
			return this;
		}
		
	}
	
	public static final class PersonData {
		
		private final String socialSecurityNr;
		private String name;
		private String address;
		private String postalCode;
		
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
		
		public String getSocialSecurityNr() {
			return socialSecurityNr;
		}
		
		public String getPostalCode() {
			return postalCode;
		}
		
		public PersonData setPostalCode(String postalCode) {
			this.postalCode = postalCode;
			return this;
		}
	}
	
}