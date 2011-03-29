package is.idega.idegaweb.egov.gumbo.aquaculture;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.business.DefaultSpringBean;
import com.idega.util.CoreConstants;
import com.idega.util.StringUtil;
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
		
		items.add(new Item("fiskur", "Fiskur"));
		items.add(new Item("seidi", "Seiði"));
		items.add(new Item("hrogn", "Hrogn"));
		items.add(new Item("lindyr", "Lindýr"));
		items.add(new Item("krabbadyr", "Krabbadýr"));
		items.add(new Item("fari", "Þari"));
		
		return items;
	}
	
	private static enum Aquamethods {
		
		sjokviar("Sjókvíar", "rumm", "Rúmm."), jardtjarnir("Jarðtjarnir", "m2",
		        "m2"), kerogrennslisfrair("Ker og rennslisþrær", "rumm",
		        "Rúmm."), botnraikt("Botnrækt", "m2", "m2"), raiktunmeflinum(
		        "Ræktun með línum", "m", "m"), afrarafferfir("Aðrar aðferðir",
		        "rumm", "Rúmm.");
		
		private final String label, unitId, unitLabel;
		
		private Aquamethods(String label, String unitId, String unitLabel) {
			
			this.label = label;
			this.unitId = unitId;
			this.unitLabel = unitLabel;
		}
		
		public String getLabel() {
			return label;
		}
		
		public String getUnitId() {
			return unitId;
		}
		
		public String getUnitLabel() {
			return unitLabel;
		}
	}
	
	public List<Item> getAquamethods() {
		
		final List<Item> items = new ArrayList<Item>(
		        Aquamethods.values().length);
		
		for (Aquamethods meth : Aquamethods.values()) {
			
			items.add(new Item(meth.name(), meth.getLabel()));
		}
		
		return items;
	}
	
	public List<Item> getAquaEnvironments() {
		
		final List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("ferskvatn", "Ferskvatn"));
		items.add(new Item("fullsalt", "Fullsalt"));
		items.add(new Item("halfsalt", "Hálfsalt"));
		
		return items;
	}
	
	public List<Item> getSpecies() {
		
		final List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("barri", "Barri"));
		items.add(new Item("bleikja", "Bleikja"));
		items.add(new Item("lax", "Lax"));
		items.add(new Item("luda", "Lúða"));
		items.add(new Item("regnbogasilungur", "Regnbogasilungur"));
		items.add(new Item("senegalflura", "Senegalflúra"));
		items.add(new Item("sandhverfa", "Sandhverfa"));
		items.add(new Item("ufsi", "Ufsi"));
		items.add(new Item("ysa", "Ýsa"));
		items.add(new Item("forskur", "Þorskur"));
		items.add(new Item("annaf", "Annað"));
		
		return items;
	}
	
	public List<Item> getFarminPurposes() {
		
		final List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("aframeldi", "Áframeldi"));
		items.add(new Item("aleldi", "Aleldi"));
		items.add(new Item("fiskraikt", "Fiskrækt"));
		items.add(new Item("raiktun", "Ræktun"));
		
		return items;
	}
	
	public List<Item> getStatusNows() {
		
		final List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("slaigt", "Slægt"));
		items.add(new Item("oslaigt", "Óslægt"));
		items.add(new Item("lifandi", "Lifandi"));
		items.add(new Item("unnif", "Unnið"));
		items.add(new Item("ounnif", "Óunnið"));
		
		return items;
	}
	
	public List<Item> getSoldTos() {
		
		final List<Item> items = new ArrayList<Item>();
		
		items.add(new Item("island", "Ísland"));
		items.add(new Item("usa", "USA"));
		items.add(new Item("noregur", "Noregur"));
		
		// TODO: add countries from table
		
		return items;
	}
	
	public String getQuantityUnitByAquamethodId(String aquamethodId) {
		
		return StringUtil.isEmpty(aquamethodId) ? CoreConstants.EMPTY
		        : Aquamethods.valueOf(aquamethodId).getUnitId();
	}
	
	public String getQuantityUnitOutputByAquamethodId(String aquamethodId) {
		
		return StringUtil.isEmpty(aquamethodId) ? CoreConstants.EMPTY
		        : Aquamethods.valueOf(aquamethodId).getUnitLabel();
	}
	
	public String getQuantityUnitBySpeciesGroupId(String speciesGroupId) {
		
		return "unit_" + speciesGroupId;
	}
	
	public String getQuantityUnitOutputBySpeciesGroupId(String speciesGroupId) {
		
		return "Quantity unit by " + speciesGroupId;
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