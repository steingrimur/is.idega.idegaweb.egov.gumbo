package is.idega.idegaweb.egov.gumbo.aquaculture;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.business.DefaultSpringBean;
import com.idega.util.text.Item;

@Service("aquaCultureService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AquaCultureService extends DefaultSpringBean {
	
	public AquaCultureCompanyData getCompanyForCurrentUser() {
		return new AquaCultureCompanyData("4252345234").setName("company name")
		        .setAddress("company address");
	}
	
	public String getReportForTheYear() {
		return "2011";
	}
	
	public List<Item> getFarms() {
		
		final List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("id1", "farm 1"));
		items.add(new Item("id2", "farm 2"));
		
		return items;
	}
	
	public List<Item> getSpeciesGroups() {
		
		final List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("id1", "specie group 1"));
		items.add(new Item("id2", "specie group 2"));
		
		return items;
	}
	
	public List<Item> getAquamethods() {
		
		final List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("id1", "aquamethod 1"));
		items.add(new Item("id2", "aquamethod 2"));
		
		return items;
	}
	
	public List<Item> getAquaEnvironments() {
		
		final List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("id1", "aquaEnvironment 1"));
		items.add(new Item("id2", "aquaEnvironment 2"));
		
		return items;
	}
	
	public List<Item> getSpecies() {
		
		final List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("id1", "specie 1"));
		items.add(new Item("id2", "specie 2"));
		
		return items;
	}
	
	public List<Item> getFarminPurposes() {
		
		final List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("id1", "farm purp 1"));
		items.add(new Item("id2", "farm purp 2"));
		
		return items;
	}
	
	public List<Item> getStatusNows() {
		
		final List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("id1", "status now 1"));
		items.add(new Item("id2", "status now 2"));
		
		return items;
	}
	
	public List<Item> getSoldTos() {
		
		final List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("id1", "sold to 1"));
		items.add(new Item("id2", "sold to 2"));
		
		return items;
	}
	
	public String getFarmStructureQuantityUnit(String byAquamethodId) {
		
		return "unit_" + byAquamethodId;
	}
	
	public String getFarmStructureQuantityUnitOutput(String byAquamethodId) {
		
		return "Quantity unit by " + byAquamethodId;
	}
	
	public String getSalesQuantityUnit(String bySpeciesGroupId) {
		
		return "unit_" + bySpeciesGroupId;
	}
	
	public String getSalesQuantityUnitOutput(String bySpeciesGroupId) {
		
		return "Quantity unit by " + bySpeciesGroupId;
	}
	
	public String getSalesPriceUnit(String bySpeciesGroupId) {
		
		return "unit_" + bySpeciesGroupId;
	}
	
	public String getSalesPriceUnitOutput(String bySpeciesGroupId) {
		
		return "Price unit by " + bySpeciesGroupId;
	}
	
	public static final class AquaCultureCompanyData {
		
		private final String socialSecurityNr;
		private String name;
		private String address;
		
		public AquaCultureCompanyData(String socialSecurityNr) {
			
			this.socialSecurityNr = socialSecurityNr;
		}
		
		public String getName() {
			return name;
		}
		
		public AquaCultureCompanyData setName(String name) {
			this.name = name;
			return this;
		}
		
		public String getAddress() {
			return address;
		}
		
		public AquaCultureCompanyData setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public String getSocialSecurityNr() {
			return socialSecurityNr;
		}
	}
}