package is.idega.idegaweb.egov.gumbo.licenses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.util.text.Item;

@Service("fishingLicenseUser")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class FishingLicenseUser {
	
	public List<Item> getVesselsForUser() {
		
		final List<Item> items = new ArrayList<Item>(3);
		
		items.add(new Item("id1", "vessel 1 by user"));
		items.add(new Item("id2", "vessel 2 by user"));
		items.add(new Item("id3", "vessel 3 by user"));
		
		return items;
	}
	
	public VesselData getUserVesselData(String vesselId) {
		
		return new VesselData()

		.setRegistryNr("reg nr " + vesselId)

		.setName("vessel name")

		.setOwnersName("owners name")

		.setOwnersSocialSecurityNr("owners soc id");
	}
	
	/**
	 * used in the forms: general fishing license
	 * 
	 * @return types of licenses depending on logged in user
	 */
	public List<Item> getTypesOfFishingLicenses() {
		
		final List<Item> items = new ArrayList<Item>(2);
		
		items.add(new Item("aflamarks", "Aflamarks"));
		items.add(new Item("krokaaflamarks", "Krókaaflamarks"));
		
		return items;
	}
	
	/**
	 * used in the forms: grasleppa
	 * 
	 * @return fishing areas depending on logged in user
	 */
	public List<Item> getFishingAreas() {
		
		final List<Item> items = new ArrayList<Item>(2);
		
		items.add(new Item("area1", "Fishing area 1"));
		items.add(new Item("area2", "Fishing area 2"));
		
		return items;
	}
	
	/**
	 * used in the forms: draganotaveidi
	 * 
	 * @return TODO: Areas are defined in the Admin environment in the solution. Now there are 4
	 *         areas: A: Out of the Verstfjords and Breidafjordur B: Out of the north coast C: Out
	 *         of north-east coast and Eastfjords D: Out of the south- and vestcoast
	 */
	public List<Item> getFishingAreasForDraganotaveidi() {
		
		final List<Item> items = new ArrayList<Item>(2);
		
		items.add(new Item("area1", "Fishing area for draganotaveidi 1"));
		items.add(new Item("area2", "Fishing area for draganotaveidi 2"));
		
		return items;
	}
	
	/**
	 * used in the forms: general fishing license
	 * 
	 * @return text informing user that he has some kind of a license (which is not in the available
	 *         selection of license types). empty - if user doesn't have any license.
	 */
	public String getHasLicenseText() {
		return "";
	}
	
	/**
	 * used in the forms: general fishing license, strandveidileyfi, grasleppa
	 * 
	 * @return string "true" or "false"
	 */
	public String getVesselHasValidHaffairisskirteini(String vesselId) {
		
		return "true";
	}
	
	/**
	 * used in the forms: grasleppa
	 * 
	 * @return string "true" or "false"
	 */
	public String getVesselHasValidGeneralFishingLicense(String vesselId) {
		
		return "true";
	}
	
	/**
	 * used in forms: general fishing license, strandveidileyfi, grasleppa
	 * <p>
	 * informs the user that he's in debt for fiskistofa (after he submits the application)
	 * </p>
	 * 
	 * @return string true or false
	 */
	public String getIsInDebt() {
		
		return "true";
	}
	
	/**
	 * used in forms: strandveidileyfi
	 * 
	 * @return string true or false
	 */
	public String getVesselHasValidStrandveidileyfi(String vesselId) {
		
		return "false";
	}
	
	/**
	 * used in forms: draganotaveidi
	 * 
	 * @return string true or false
	 */
	public String getCompanyAddressFallsInArea(String areaId) {
		
		return "true";
	}
	
	/**
	 * used in forms: draganotaveidi
	 * 
	 * @return string true or false
	 */
	public String getVesselHasValidAflamarksleyfi(String vesselId) {
		
		return "true";
	}
	
	/**
	 * used in forms: grasleppa
	 * 
	 * @return string true or false
	 */
	public String getCompanyHasValidGrasleppa() {
		
		return "false";
	}
	
	/**
	 * used in forms: strandveidileyfi
	 * 
	 * @return string true or false
	 */
	public String getFishingCompanyHasValidStrandveidileyfi() {
		
		return "false";
	}
	
	/**
	 * used in forms: strandveidileyfi
	 * 
	 * @return string true or false
	 */
	public String getFishingQuotaWithinLimits(String vesselId) {
		
		return "true";
	}
	
	/**
	 * used in forms: strandveidileyfi
	 * 
	 * @return label of the company's fishing area
	 */
	public String getFishingArea() {
		
		return "13th fishing zone";
	}
	
	public static final class VesselData {
		
		private String registryNr;
		private String name;
		private String ownersName;
		private String ownersSocialSecurityNr;
		
		public String getRegistryNr() {
			return registryNr;
		}
		
		public VesselData setRegistryNr(String registryNr) {
			this.registryNr = registryNr;
			return this;
		}
		
		public String getName() {
			return name;
		}
		
		public VesselData setName(String name) {
			this.name = name;
			return this;
		}
		
		public String getOwnersName() {
			return ownersName;
		}
		
		public VesselData setOwnersName(String ownersName) {
			this.ownersName = ownersName;
			return this;
		}
		
		public String getOwnersSocialSecurityNr() {
			return ownersSocialSecurityNr;
		}
		
		public VesselData setOwnersSocialSecurityNr(
		        String ownersSocialSecurityNr) {
			this.ownersSocialSecurityNr = ownersSocialSecurityNr;
			return this;
		}
	}
}