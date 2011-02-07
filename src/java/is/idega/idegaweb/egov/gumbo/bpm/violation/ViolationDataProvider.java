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
	
	public abstract List<Item> getDecisionRulings();
	
	public abstract String getTypeLabelOfPermissionForViolationCompany(
	        String socialNr);
	
	public abstract ViolationLocationData getViolationPlaceData(
	        String byPostalCode);
	
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
	
	public static final class ViolationLocationData {
		
		private final String postalCode;
		
		private String latitudeDegree;
		private String latitudeMinute;
		private String latitudeSecond;
		private String latitudePole;
		
		private String longitudeDegree;
		private String longitudeMinute;
		private String longitudeSecond;
		private String longitudeAngle;
		
		private String harbourNr;
		private String harbourName;
		private String violationAddress;
		
		public ViolationLocationData(String postalCode) {
			
			this.postalCode = postalCode;
		}
		
		public String getLatitudeDegree() {
			return latitudeDegree;
		}
		
		public ViolationLocationData setLatitudeDegree(String latitudeDegree) {
			this.latitudeDegree = latitudeDegree;
			return this;
		}
		
		public String getLatitudeMinute() {
			return latitudeMinute;
		}
		
		public ViolationLocationData setLatitudeMinute(String latitudeMinute) {
			this.latitudeMinute = latitudeMinute;
			return this;
		}
		
		public String getLatitudeSecond() {
			return latitudeSecond;
		}
		
		public ViolationLocationData setLatitudeSecond(String latitudeSecond) {
			this.latitudeSecond = latitudeSecond;
			return this;
		}
		
		public String getLatitudePole() {
			return latitudePole;
		}
		
		public ViolationLocationData setLatitudePole(String latitudePole) {
			this.latitudePole = latitudePole;
			return this;
		}
		
		public String getLongitudeDegree() {
			return longitudeDegree;
		}
		
		public ViolationLocationData setLongitudeDegree(String longitudeDegree) {
			this.longitudeDegree = longitudeDegree;
			return this;
		}
		
		public String getLongitudeMinute() {
			return longitudeMinute;
		}
		
		public ViolationLocationData setLongitudeMinute(String longitudeMinute) {
			this.longitudeMinute = longitudeMinute;
			return this;
		}
		
		public String getLongitudeSecond() {
			return longitudeSecond;
		}
		
		public ViolationLocationData setLongitudeSecond(String longitudeSecond) {
			this.longitudeSecond = longitudeSecond;
			return this;
		}
		
		public String getLongitudeAngle() {
			return longitudeAngle;
		}
		
		public ViolationLocationData setLongitudeAngle(String longitudeAngle) {
			this.longitudeAngle = longitudeAngle;
			return this;
		}
		
		public String getHarbourNr() {
			return harbourNr;
		}
		
		public ViolationLocationData setHarbourNr(String harbourNr) {
			this.harbourNr = harbourNr;
			return this;
		}
		
		public String getHarbourName() {
			return harbourName;
		}
		
		public ViolationLocationData setHarbourName(String harbourName) {
			this.harbourName = harbourName;
			return this;
		}
		
		public String getViolationAddress() {
			return violationAddress;
		}
		
		public ViolationLocationData setViolationAddress(String violationAddress) {
			this.violationAddress = violationAddress;
			return this;
		}
		
		public String getPostalCode() {
			return postalCode;
		}
	}
}