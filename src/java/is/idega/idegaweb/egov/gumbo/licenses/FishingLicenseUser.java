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

		.setRegistryNr("reg nr "+vesselId)

		.setName("vessel name")

		.setIdentificationLetters("ident letters")

		.setOwnersName("owners name")

		.setOwnersSocialSecurityNr("owners soc id");
	}
	
	public static final class VesselData {
		
		private String registryNr;
		private String name;
		private String identificationLetters;
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
		
		public String getIdentificationLetters() {
			return identificationLetters;
		}
		
		public VesselData setIdentificationLetters(String identificationLetters) {
			this.identificationLetters = identificationLetters;
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