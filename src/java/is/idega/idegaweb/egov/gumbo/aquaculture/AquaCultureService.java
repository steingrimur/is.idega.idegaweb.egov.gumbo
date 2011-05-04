package is.idega.idegaweb.egov.gumbo.aquaculture;

import is.idega.block.nationalregister.webservice.client.business.CompanyHolder;
import is.idega.block.nationalregister.webservice.client.business.SkyrrClient;
import is.idega.block.nationalregister.webservice.client.business.UserHolder;
import is.idega.idegaweb.egov.gumbo.business.GumboBusiness;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.AquaCountry;
import is.idega.idegaweb.egov.gumbo.data.AquaEnvironment;
import is.idega.idegaweb.egov.gumbo.data.AquaFarmingType;
import is.idega.idegaweb.egov.gumbo.data.AquaMethod;
import is.idega.idegaweb.egov.gumbo.data.AquaProcessingMethod;
import is.idega.idegaweb.egov.gumbo.data.AquaSpecies;
import is.idega.idegaweb.egov.gumbo.data.AquaSpeciesGroup;
import is.idega.idegaweb.egov.gumbo.data.FishFarm;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.business.IBORuntimeException;
import com.idega.company.business.CompanyBusiness;
import com.idega.company.data.Company;
import com.idega.core.business.DefaultSpringBean;
import com.idega.idegaweb.IWMainApplication;
import com.idega.user.business.UserBusiness;
import com.idega.user.data.User;
import com.idega.util.CoreConstants;
import com.idega.util.IWTimestamp;
import com.idega.util.StringUtil;
import com.idega.util.expression.ELUtil;
import com.idega.util.text.Item;

@Service("aquaCultureService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AquaCultureService extends DefaultSpringBean {

	@Autowired
	private GumboBusiness gumboBusiness;

	@Autowired
	private GumboDao dao;

	@Autowired
	private SkyrrClient skyrrClient;

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
		now.addYears(-1);
		return now.getDateString("yyyy");
	}

	public List<Item> getFarms() {
		final List<Item> items = new ArrayList<Item>();

		Company comp = getGumboBusiness().getCompanyForUser(getCurrentUser());
		if (comp != null) {
			List<FishFarm> fishFarms = getDao().getFishFarms(
					comp.getPersonalID());
			for (FishFarm fishFarm : fishFarms) {
				items.add(new Item(fishFarm.getId().toString(), fishFarm
						.getName() + " (" + fishFarm.getAddress() + ")"));
			}
		}

		return items;
	}

	public List<Item> getAllFarms() {
		final List<Item> items = new ArrayList<Item>();

		Company comp = getGumboBusiness().getCompanyForUser(getCurrentUser());
		if (comp != null) {
			List<FishFarm> fishFarms = getDao().getAllFishFarms();
			for (FishFarm fishFarm : fishFarms) {
				items.add(new Item(fishFarm.getId().toString(), fishFarm
						.getName() + " (" + fishFarm.getAddress() + ")"));
			}
		}

		return items;
	}

	public String getBuyersName(String personalID) {
		String name = null;

		try {
			Company company = getCompanyBusiness().getCompany(personalID);
			name = company.getName();
		} catch (Exception e) {
		}

		try {
			if (name == null) {
				User user = getUserBusiness().getUser(personalID);
				name = user.getName();
			}
		} catch (Exception e) {
		}

		if (name == null) {
			CompanyHolder holder = getSkyrrClient().getCompany(personalID);
			if (holder != null) {
				name = holder.getName();
			} else {
				UserHolder userHolder = getSkyrrClient().getUser(
						personalID);
				if (userHolder != null) {
					name = userHolder.getName();
				}
			}
		}

		if (name == null) {
			name = "";
		}
		return name;
	}

	public List<Item> getSpeciesGroups() {
		final List<Item> items = new ArrayList<Item>();

		List<AquaSpeciesGroup> speciesGroup = getDao().getAquaSpeciesGroups();
		for (AquaSpeciesGroup aquaSpeciesGroup : speciesGroup) {
			items.add(new Item(aquaSpeciesGroup.getId().toString(), aquaSpeciesGroup.getSpeciesGroupName()));
		}

		return items;
	}

	public List<Item> getAquamethods() {

		final List<Item> items = new ArrayList<Item>();

		List<AquaMethod> method = getDao().getAquaMethods();
		for (AquaMethod aquaMethod : method) {
			items.add(new Item(aquaMethod.getId().toString(), aquaMethod.getMethodName()));			
		}

		return items;
	}

	public List<Item> getAquaEnvironments() {

		final List<Item> items = new ArrayList<Item>();

		List<AquaEnvironment> environment = getDao().getAquaEnvironments();
		for (AquaEnvironment aquaEnvironment : environment) {
			items.add(new Item(aquaEnvironment.getId().toString(), aquaEnvironment.getEnvironmentName()));
		}

//		items.add(new Item("ferskvatn", "Ferskvatn"));
//		items.add(new Item("fullsalt", "Fullsalt"));
//		items.add(new Item("halfsalt", "Hálfsalt"));

		return items;
	}

	public List<Item> getSpecies() {

		final List<Item> items = new ArrayList<Item>();

		List<AquaSpecies> species = getDao().getAquaSpecies();
		for (AquaSpecies aquaSpecies : species) {
			items.add(new Item(aquaSpecies.getId().toString(), aquaSpecies.getSpeciesName()));			
		}

//		items.add(new Item("barri", "Barri"));
//		items.add(new Item("bleikja", "Bleikja"));
//		items.add(new Item("lax", "Lax"));
//		items.add(new Item("luda", "Lúða"));
//		items.add(new Item("regnbogasilungur", "Regnbogasilungur"));
//		items.add(new Item("senegalflura", "Senegalflúra"));
//		items.add(new Item("sandhverfa", "Sandhverfa"));
//		items.add(new Item("ufsi", "Ufsi"));
//		items.add(new Item("ysa", "Ýsa"));
//		items.add(new Item("forskur", "Þorskur"));
//		items.add(new Item("annaf", "Annað"));

		return items;
	}

	public List<Item> getFarminPurposes() {

		final List<Item> items = new ArrayList<Item>();

		List<AquaFarmingType> farmingType = getDao().getAquaFarmingTypes();
		for (AquaFarmingType aquaFarmingType : farmingType) {
			items.add(new Item(aquaFarmingType.getId().toString(), aquaFarmingType.getFarmingTypeName()));						
		}

//		items.add(new Item("aframeldi", "Áframeldi"));
//		items.add(new Item("aleldi", "Aleldi"));
//		items.add(new Item("fiskraikt", "Fiskrækt"));
//		items.add(new Item("raiktun", "Ræktun"));

		return items;
	}

	public List<Item> getStatusNows() {

		final List<Item> items = new ArrayList<Item>();

		List<AquaProcessingMethod> method = getDao().getAquaProcessingMethods();
		for (AquaProcessingMethod aquaProcessingMethod : method) {
			items.add(new Item(aquaProcessingMethod.getId().toString(), aquaProcessingMethod.getProcessingMethodName()));
		}

//		items.add(new Item("slaigt", "Slægt"));
//		items.add(new Item("oslaigt", "Óslægt"));
//		items.add(new Item("lifandi", "Lifandi"));
//		items.add(new Item("unnif", "Unnið"));
//		items.add(new Item("ounnif", "Óunnið"));

		return items;
	}

	public List<Item> getSoldTos() {
		final List<Item> items = new ArrayList<Item>();

		List<AquaCountry> countries = getDao().getAquaCountries();
		for (AquaCountry aquaCountry : countries) {
			items.add(new Item(aquaCountry.getId().toString(), aquaCountry.getCountryName()));			
		}
		
//		items.add(new Item("island", "Ísland"));
//		items.add(new Item("usa", "USA"));
//		items.add(new Item("noregur", "Noregur"));
		return items;
	}

	public String getQuantityUnitByAquamethodId(String aquamethodId) {
		if (StringUtil.isEmpty(aquamethodId)) {
			return CoreConstants.EMPTY;
		}
		
		try {
			Long id = new Long(aquamethodId);
			AquaMethod method = getDao().getAquaMethod(id);
			return method.getUnit();
		} catch (Exception e) {
		}
		
		return CoreConstants.EMPTY;
//		return StringUtil.isEmpty(aquamethodId) ? CoreConstants.EMPTY
//				: Aquamethods.valueOf(aquamethodId).getUnitId();
	}

	public String getQuantityUnitOutputByAquamethodId(String aquamethodId) {
		if (StringUtil.isEmpty(aquamethodId)) {
			return CoreConstants.EMPTY;
		}

		try {
			Long id = new Long(aquamethodId);
			AquaMethod method = getDao().getAquaMethod(id);
			return method.getUnitLabel();
		} catch (Exception e) {
		}
		
		return CoreConstants.EMPTY;
//		return StringUtil.isEmpty(aquamethodId) ? CoreConstants.EMPTY
//				: Aquamethods.valueOf(aquamethodId).getUnitLabel();
	}

	public String getQuantityUnitBySpeciesGroupIdForQuantity(
			String speciesGroupId) {
		if (StringUtil.isEmpty(speciesGroupId)) {
			return CoreConstants.EMPTY;
		}

		try {
			Long id = new Long(speciesGroupId);
			AquaSpeciesGroup group = getDao().getAquaSpeciesGroup(id);
			return group.getQuantityUnit();
		} catch (Exception e) {
		}
		
		return CoreConstants.EMPTY;		
//		return StringUtil.isEmpty(speciesGroupId) ? CoreConstants.EMPTY
//				: SpeciesGroups.valueOf(speciesGroupId).getQuantityUnit()
//						.getUnitId();
	}

	public String getQuantityUnitOutputBySpeciesGroupIdForQuantity(
			String speciesGroupId) {
		if (StringUtil.isEmpty(speciesGroupId)) {
			return CoreConstants.EMPTY;
		}

		try {
			Long id = new Long(speciesGroupId);
			AquaSpeciesGroup group = getDao().getAquaSpeciesGroup(id);
			return group.getQuantityUnitLabel();
		} catch (Exception e) {
		}
		
		return CoreConstants.EMPTY;				
//		return StringUtil.isEmpty(speciesGroupId) ? CoreConstants.EMPTY
//				: SpeciesGroups.valueOf(speciesGroupId).getQuantityUnit()
//						.getUnitLabel();
	}

	public String getQuantityUnitBySpeciesGroupIdForPrice(String speciesGroupId) {
		if (StringUtil.isEmpty(speciesGroupId)) {
			return CoreConstants.EMPTY;
		}

		try {
			Long id = new Long(speciesGroupId);
			AquaSpeciesGroup group = getDao().getAquaSpeciesGroup(id);
			return group.getPriceUnit();
		} catch (Exception e) {
		}
		
		return CoreConstants.EMPTY;		
//		return StringUtil.isEmpty(speciesGroupId) ? CoreConstants.EMPTY
//				: SpeciesGroups.valueOf(speciesGroupId).getPriceUnit()
//						.getUnitId();
	}

	public String getQuantityUnitOutputBySpeciesGroupIdForPrice(
			String speciesGroupId) {
		if (StringUtil.isEmpty(speciesGroupId)) {
			return CoreConstants.EMPTY;
		}

		try {
			Long id = new Long(speciesGroupId);
			AquaSpeciesGroup group = getDao().getAquaSpeciesGroup(id);
			return group.getPriceUnitLabel();
		} catch (Exception e) {
		}
		
		return CoreConstants.EMPTY;		
//		return StringUtil.isEmpty(speciesGroupId) ? CoreConstants.EMPTY
//				: SpeciesGroups.valueOf(speciesGroupId).getPriceUnit()
//						.getUnitLabel();
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

	private CompanyBusiness getCompanyBusiness() {
		try {
			return IBOLookup.getServiceInstance(
					IWMainApplication.getDefaultIWApplicationContext(),
					CompanyBusiness.class);
		} catch (IBOLookupException ile) {
			throw new IBORuntimeException(ile);
		}
	}

	private UserBusiness getUserBusiness() {
		try {
			return IBOLookup.getServiceInstance(
					IWMainApplication.getDefaultIWApplicationContext(),
					UserBusiness.class);
		} catch (IBOLookupException ile) {
			throw new IBORuntimeException(ile);
		}
	}

	public SkyrrClient getSkyrrClient() {
		if (skyrrClient == null) {
			ELUtil.getInstance().autowire(this);
		}
		return skyrrClient;
	}
}