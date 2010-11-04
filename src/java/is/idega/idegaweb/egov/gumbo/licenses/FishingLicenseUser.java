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
	 * @return types of licenses depending on logged in user
	 */
	public List<Item> getTypesOfFishingLicenses() {
		
		final List<Item> items = new ArrayList<Item>(2);
		
		items.add(new Item("aflamarks", "Aflamarks"));
		items.add(new Item("krokaaflamarks", "Krókaaflamarks"));
		
		return items;
	}
	
	public List<Item> getFishingAreas() {
		
		final List<Item> items = new ArrayList<Item>(2);
		
		items.add(new Item("area1", "Fishing area 1"));
		items.add(new Item("area2", "Fishing area 2"));
		
		return items;
	}
	
	public String getHasLicenseText() {
		return "";
	}
	
	/**
	 * used in the forms: general fishing license, strandveidileyfi, grasleppa
	 * 
	 * @return string "true" or "false"
	 */
	public String getVesselHasValidHaffairisskirteini(String vesselId) {
		
		return "false";
	}
	
	/**
	 * used in the forms: grasleppa
	 * 
	 * @return string "true" or "false"
	 */
	public String getVesselHasValidGeneralFishingLicense(String vesselId) {
		
		return "false";
	}
	
	public String getIsInDebt() {
		
		return "true";
	}
	
	public String getUserVesselHasValidLicense(String vesselId) {
		
		return "false";
	}
	
	public String getFishingCompanyHasValidLicense() {
		
		return "false";
	}
	
	public String getFishingQuotaWithinLimits() {
		
		return "true";
	}
	
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