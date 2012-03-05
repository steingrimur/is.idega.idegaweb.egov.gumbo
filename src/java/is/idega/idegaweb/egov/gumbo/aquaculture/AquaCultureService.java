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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.logging.Level;

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
import com.idega.core.localisation.business.ICLocaleBusiness;
import com.idega.core.persistence.Param;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.egov.bpm.data.dao.CasesBPMDAO;
import com.idega.jbpm.bean.VariableInstanceInfo;
import com.idega.jbpm.data.VariableInstanceQuerier;
import com.idega.presentation.IWContext;
import com.idega.user.business.UserBusiness;
import com.idega.user.data.User;
import com.idega.util.CoreConstants;
import com.idega.util.CoreUtil;
import com.idega.util.IWTimestamp;
import com.idega.util.ListUtil;
import com.idega.util.StringUtil;
import com.idega.util.datastructures.map.MapUtil;
import com.idega.util.expression.ELUtil;
import com.idega.util.text.Item;

@Service("aquaCultureService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AquaCultureService extends DefaultSpringBean {

	private List<String> countriesRequiringBuyerSocialId = Arrays.asList("is_IS");

	@Autowired
	private GumboBusiness gumboBusiness;

	@Autowired
	private GumboDao dao;

	@Autowired
	private SkyrrClient skyrrClient;

	@Autowired
	private VariableInstanceQuerier querier;

	@Autowired
	private CasesBPMDAO casesBPMDAO;

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
			name = CoreConstants.EMPTY;
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

		return items;
	}

	public List<Item> getSpecies() {
		final List<Item> items = new ArrayList<Item>();

		List<AquaSpecies> species = getDao().getAquaSpecies();
		for (AquaSpecies aquaSpecies : species) {
			items.add(new Item(aquaSpecies.getId().toString(), aquaSpecies.getSpeciesName()));
		}

		return items;
	}

	public List<Item> getFarminPurposes() {
		final List<Item> items = new ArrayList<Item>();

		List<AquaFarmingType> farmingType = getDao().getAquaFarmingTypes();
		for (AquaFarmingType aquaFarmingType : farmingType) {
			items.add(new Item(aquaFarmingType.getId().toString(), aquaFarmingType.getFarmingTypeName()));
		}

		return items;
	}

	public List<Item> getStatusNows() {
		final List<Item> items = new ArrayList<Item>();

		List<AquaProcessingMethod> method = getDao().getAquaProcessingMethods();
		for (AquaProcessingMethod aquaProcessingMethod : method) {
			items.add(new Item(aquaProcessingMethod.getId().toString(), aquaProcessingMethod.getProcessingMethodName()));
		}

		return items;
	}

	public List<Item> getSoldTos() {
		final List<Item> items = new ArrayList<Item>();

		List<AquaCountry> countries = getDao().getAquaCountries();
		for (AquaCountry aquaCountry : countries) {
			items.add(new Item(aquaCountry.getId().toString(), aquaCountry.getCountryName()));
		}

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

	public boolean isSocialIdRequired(String aquaCountryId) {
		if (StringUtil.isEmpty(aquaCountryId))
			return false;

		AquaCountry country = null;
		try {
			country = getDao().getSingleResult(AquaCountry.QUERY_FIND_BY_ID, AquaCountry.class,
					new Param(AquaCountry.PARAMETER_COUNTRY_ID, Long.valueOf(aquaCountryId)));
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error getting aqua contry by ID: " + aquaCountryId, e);
		}

		return isCountryRequiringBuyerSocialId(country);
	}

	private boolean isCountryRequiringBuyerSocialId(AquaCountry country) {
		if (country == null)
			return false;

		String countryName = country.getCountryName();
		if (StringUtil.isEmpty(countryName))
			return false;

		Locale currentLocale = getCurrentLocale();
		if (currentLocale == null)
			return false;

		for (String localeId: countriesRequiringBuyerSocialId) {
			Locale locale = ICLocaleBusiness.getLocaleFromLocaleString(localeId);
			if (locale == null) {
				getLogger().warning("Unable to get locale by ID: " + localeId);
				continue;
			}

			if (countryName.equals(locale.getDisplayCountry(currentLocale)))
				return true;
		}

		return false;
	}

	public boolean isAbleToSubmitReport(String reportYear) {
		if (StringUtil.isEmpty(reportYear))
			return false;		//	Year must be provided

		IWContext iwc = CoreUtil.getIWContext();
		if (iwc == null)
			return false;		//	A request must be issued

		if (!iwc.isLoggedOn())
			return false;		//	User must be logged on

		if (iwc.hasRole("bpm_aquaculture_handler"))
			return true;		//	Handler can submit unlimited amount of reports

		User user = getCurrentUser();
		if (user == null)
			return false;		//	User must be logged on

		List<Long> userCasesIds = casesBPMDAO.getCaseIdsByUserIds(user.getId());
		if (ListUtil.isEmpty(userCasesIds))
			return true;		//	Current user has not submitted any case yet

		Map<String, List<Serializable>> values = new HashMap<String, List<Serializable>>();
		values.put("string_reportForTheYear", Arrays.asList((Serializable) reportYear));
		Map<Long, Map<String, VariableInstanceInfo>> data = querier.getVariablesByNamesAndValuesByProcesses(values, null,
				Arrays.asList("Aquaculture"), null, null);
		if (MapUtil.isEmpty(data))
			return true;		//	The report was not submitted for the given year

		List<Long> allCasesIds = casesBPMDAO.getCaseIdsByProcessInstanceIds(new ArrayList<Long>(data.keySet()));
		if (ListUtil.isEmpty(allCasesIds))
			return true;		//	No applications submitted yet

		for (Long userCaseId: userCasesIds) {
			if (allCasesIds.contains(userCaseId))
				return false;	//	Such report was already submitted by the current user
		}

		return true;
	}

	public boolean isReportYearCorrect(String year) {
		if (StringUtil.isEmpty(year))
			return false;

		Integer yearFromThePast = null;
		try {
			yearFromThePast = Integer.valueOf(year);
		} catch (NumberFormatException e) {
			getLogger().warning("Error converting provided value '" + year + "' to the years");
		}
		if (yearFromThePast == null)
			return false;

		int currentYear = IWTimestamp.RightNow().getYear();
		return yearFromThePast < currentYear && isAbleToSubmitReport(String.valueOf(yearFromThePast));
	}

	public String getNextYear(String year) {
		if (StringUtil.isEmpty(year))
			return null;

		Integer yearFromThePast = null;
		try {
			yearFromThePast = Integer.valueOf(year);
		} catch (NumberFormatException e) {
			getLogger().warning("Error converting provided value '" + year + "' to the years");
		}
		if (yearFromThePast == null)
			return year;

		return String.valueOf(yearFromThePast + 1);
	}
}