package is.idega.idegaweb.egov.gumbo.aquaculture;

import is.idega.idegaweb.egov.gumbo.business.GumboBusiness;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.FishFarm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.company.data.Company;
import com.idega.core.business.DefaultSpringBean;
import com.idega.util.CoreConstants;
import com.idega.util.IWTimestamp;
import com.idega.util.StringUtil;
import com.idega.util.text.Item;

@Service("aquaCultureService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AquaCultureService extends DefaultSpringBean {
	
	@Autowired
	private GumboBusiness gumboBusiness;
	
	@Autowired
	private GumboDao dao;
	
	public AquaCultureCompanyData getCompanyForCurrentUser() {
		Company comp = getGumboBusiness().getCompanyForUser(getCurrentUser());
		if (comp != null) {
			AquaCultureCompanyData ret = new AquaCultureCompanyData(
			        comp.getPersonalID());
			ret.setName(comp.getName());
			if (comp.getAddress() != null) {
				ret.setAddress(comp.getAddress().getStreetAddress());
			}
			
			return ret;
		}
		
		return new AquaCultureCompanyData("4252345234").setName("company name")
		        .setAddress("company address");
	}
	
	public String getReportForTheYear() {
		IWTimestamp now = new IWTimestamp();
		return now.getDateString("yyyy");
	}
	
	public List<Item> getFarms() {
		final List<Item> items = new ArrayList<Item>();
		
		// if(true) {
		//
		// items.add(new Item("x1", "farm1"));
		// items.add(new Item("x2", "farm2"));
		//
		// return items;
		// }
		
		Company comp = getGumboBusiness().getCompanyForUser(getCurrentUser());
		if (comp != null) {
			List<FishFarm> fishFarms = getDao().getFishFarms(
			    comp.getPersonalID());
			for (FishFarm fishFarm : fishFarms) {
				items.add(new Item(fishFarm.getId().toString(), fishFarm.getName() + " (" + fishFarm.getAddress() + ")"));
			}
		}
		
		return items;
	}
	
	public List<Item> getSpeciesGroups() {
		
		final List<Item> items = new ArrayList<Item>(
		        SpeciesGroups.values().length);
		
		for (SpeciesGroups gr : SpeciesGroups.values()) {
			
			items.add(new Item(gr.name(), gr.getLabel()));
		}
		
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
	
	private static enum SpeciesGroups {
		
		fiskur("Fiskur", UnitByQuantity.tonn, UnitByPrice.krkg), seidi("Seiði",
		        UnitByQuantity.stk, UnitByPrice.krstk), hrogn("Hrogn",
		        UnitByQuantity.ltr, UnitByPrice.krltr), lindyr("Lindýr",
		        UnitByQuantity.tonn, UnitByPrice.krkg), krabbadyr("Krabbadýr",
		        UnitByQuantity.tonn, UnitByPrice.krkg), fari("Þari",
		        UnitByQuantity.tonn, UnitByPrice.krkg);
		
		private final String label;
		private final UnitByQuantity unitByQuantity;
		private final UnitByPrice unitByPrice;
		
		private SpeciesGroups(String label, UnitByQuantity unitByQuantity,
		                      UnitByPrice unitByPrice) {
			
			this.label = label;
			this.unitByQuantity = unitByQuantity;
			this.unitByPrice = unitByPrice;
		}
		
		public String getLabel() {
			return label;
		}
		
		public UnitByQuantity getQuantityUnit() {
			return unitByQuantity;
		}
		
		public UnitByPrice getPriceUnit() {
			return unitByPrice;
		}
		
	}
	
	private static enum UnitByPrice {
		
		krkg("Kr/kg"), krstk("Kr/stk"), krltr("Kr/ltr");
		
		private final String unitLabel;
		
		private UnitByPrice(String unitLabel) {
			
			this.unitLabel = unitLabel;
		}
		
		public String getUnitId() {
			return name();
		}
		
		public String getUnitLabel() {
			return unitLabel;
		}
	}
	
	private static enum UnitByQuantity {
		
		tonn("tonn"), stk("stk"), ltr("ltr.");
		
		private final String unitLabel;
		
		private UnitByQuantity(String unitLabel) {
			
			this.unitLabel = unitLabel;
		}
		
		public String getUnitId() {
			return name();
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
	
	public String getQuantityUnitBySpeciesGroupIdForQuantity(
	        String speciesGroupId) {
		
		return StringUtil.isEmpty(speciesGroupId) ? CoreConstants.EMPTY
		        : SpeciesGroups.valueOf(speciesGroupId).getQuantityUnit()
		                .getUnitId();
	}
	
	public String getQuantityUnitOutputBySpeciesGroupIdForQuantity(
	        String speciesGroupId) {
		
		return StringUtil.isEmpty(speciesGroupId) ? CoreConstants.EMPTY
		        : SpeciesGroups.valueOf(speciesGroupId).getQuantityUnit()
		                .getUnitLabel();
	}
	
	public String getQuantityUnitBySpeciesGroupIdForPrice(String speciesGroupId) {
		
		return StringUtil.isEmpty(speciesGroupId) ? CoreConstants.EMPTY
		        : SpeciesGroups.valueOf(speciesGroupId).getPriceUnit()
		                .getUnitId();
	}
	
	public String getQuantityUnitOutputBySpeciesGroupIdForPrice(
	        String speciesGroupId) {
		
		return StringUtil.isEmpty(speciesGroupId) ? CoreConstants.EMPTY
		        : SpeciesGroups.valueOf(speciesGroupId).getPriceUnit()
		                .getUnitLabel();
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
	
	private GumboBusiness getGumboBusiness() {
		return gumboBusiness;
	}
	
	private GumboDao getDao() {
		return dao;
	}
}