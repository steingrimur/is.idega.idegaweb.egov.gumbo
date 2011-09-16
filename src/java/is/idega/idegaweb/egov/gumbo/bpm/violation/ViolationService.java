package is.idega.idegaweb.egov.gumbo.bpm.violation;

import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.LetterType;
import is.idega.idegaweb.egov.gumbo.bpm.violation.ViolationDataProvider.EquipmentData;
import is.idega.idegaweb.egov.gumbo.bpm.violation.ViolationDataProvider.PersonData;
import is.idega.idegaweb.egov.gumbo.bpm.violation.ViolationDataProvider.ViolationLocationData;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.Letter;
import is.idega.idegaweb.egov.gumbo.licenses.FishingLicenseUser.XFormsBooleanResult;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.business.DefaultSpringBean;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.jbpm.identity.Role;
import com.idega.jbpm.identity.RolesManager;
import com.idega.util.ArrayUtil;
import com.idega.util.CoreConstants;
import com.idega.util.ListUtil;
import com.idega.util.LocaleUtil;
import com.idega.util.StringUtil;
import com.idega.util.text.Item;

@Service("violationService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ViolationService extends DefaultSpringBean {
	
	@Autowired
	@Qualifier(DOFWSClient.WEB_SERVICE)
	private ViolationDataProvider violationDataProvider;
	
	@Autowired
	private RolesManager rolesManager;
	
	@Autowired
	private GumboDao dao;
	
	public PersonData getViolationPersonData(String socialNr) {
		return getViolationDataProvider().getViolationPersonData(socialNr);
	}
	
	public PersonData getViolationCompanyData(String socialNr) {
		return getViolationDataProvider().getViolationCompanyData(socialNr);
	}
	
	public PersonData getRecipientPersonDataForWriteLetter(String socialNr) {
		
		return getViolationDataProvider().getRecipientPersonDataForWriteLetter(
		    socialNr);
	}
	
	public List<Item> getViolationTypes() {
		return getViolationDataProvider().getViolationTypes();
	}
	
	public Map<Locale, Map<String, String>> getAvailableViolationTypes() {
		return getAvailableOptions(getViolationTypes());
	}
	
	public String getSelectedViolations(String value) {
		return getSelectedLabelsForValue(getViolationTypes(), value);
	}
	
	public String getSelectedLabelsForValue(List<Item> items, Collection<?> values) {
		String value = CoreConstants.EMPTY;
		if (!ListUtil.isEmpty(values)) {
			for (Iterator<?> iter = values.iterator(); iter.hasNext();) {
				value = value.concat(iter.next().toString());
				if (iter.hasNext())
					value = value.concat(CoreConstants.SPACE);
			}
		}
		return getSelectedLabelsForValue(items, value);
	}
	
	private String getSelectedLabelsForValue(List<Item> items, String value) {
		if (ListUtil.isEmpty(items) || StringUtil.isEmpty(value))
			return null;
		
		String[] values = value.split(CoreConstants.SPACE);
		if (ArrayUtil.isEmpty(values))
			return null;

		List<String> valuesList = Arrays.asList(values);
		
		List<String> labelsList = new ArrayList<String>();
		for (Item item: items) {
			if (valuesList.contains(item.getItemValue()))
				labelsList.add(item.getItemLabel());
		}
		if (ListUtil.isEmpty(labelsList))
			return null;
		
		StringBuffer labels = new StringBuffer();
		for (Iterator<String> labelsIter = labelsList.iterator(); labelsIter.hasNext();) {
			labels.append(labelsIter.next());
			if (labelsIter.hasNext())
				labels.append(CoreConstants.COMMA).append(CoreConstants.SPACE);
		}
		return labels.toString();
	}
	
	public List<Item> getOtherInspectorsThanCurrentlyLoggedIn() {
		return getViolationDataProvider()
		        .getOtherInspectorsThanCurrentlyLoggedIn();
	}
	
	public Map<Locale, Map<String, String>> getAvailableInspectors() {
		return getAvailableOptions(getOtherInspectorsThanCurrentlyLoggedIn());
	}
	
	public String getSelectedOtherInspectors(String value) {
		return getSelectedLabelsForValue(getOtherInspectorsThanCurrentlyLoggedIn(), value);
	}
	
	public List<Item> getFiskistofaOffices() {
		return getViolationDataProvider().getFiskistofaOffices();
	}
	
	public Map<Locale, Map<String, String>> getAvailableOffices() {
		return getAvailableOptions(getFiskistofaOffices());
	}
	
	public List<Item> getFishingGears() {
		return getViolationDataProvider().getFishingGears();
	}
	
	private Map<Locale, Map<String, String>> getAvailableOptions(List<Item> items) {
		Map<Locale, Map<String, String>> allOptions = new LinkedHashMap<Locale, Map<String, String>>();

		Locale locale = getCurrentLocale();
		Map<String, String> options = new LinkedHashMap<String, String>();
		allOptions.put(locale, options);
		
		if (!ListUtil.isEmpty(items)) {
			for (Item item: items) {
				options.put(item.getItemValue(), item.getItemLabel());
			}
		}
		
		return allOptions;
	}
	
	public Map<Locale, Map<String, String>> getAvailableFishingGears() {
		return getAvailableOptions(getFishingGears());
	}
	
	public String getSelectedFishingGears(String value) {
		return getSelectedLabelsForValue(getFishingGears(), value);
	}
	
	public List<Item> getLettersTypes() {
		
		final List<LetterType> types = getDao().getLetterTypes();
		
		final List<Item> items = new ArrayList<Item>();
		
		IWResourceBundle iwrb = IWMainApplication
		        .getDefaultIWApplicationContext().getIWMainApplication()
		        .getBundle(GumboConstants.IW_BUNDLE_IDENTIFIER)
		        .getResourceBundle(LocaleUtil.getIcelandicLocale());
		
		if (types != null) {
			for (LetterType letterType : types) {
				items.add(new Item(letterType.toString(), iwrb.getLocalizedString(
				    "letter_type." + letterType.toString(), letterType.toString())));
			}
		}
		
		return items;
	}
	
	public List<Item> getEmptyList() {
		return Arrays.asList(new Item());
	}
	
	public List<Item> getLetters(String letterType) {
		
		if (!com.idega.util.StringUtil.isEmpty(letterType)) {
			
			final List<Item> items = new ArrayList<Item>();
			
			List<Letter> letters = getDao().getLetters(
			    LetterType.valueOf(letterType));
			if (letters != null && letters.size() > 0) {
				for (Letter letter : letters) {
					items.add(new Item(letter.getId().toString(), letter
					        .getName()));
				}
			} else {
				items.add(new Item("", "No letters in database..."));
			}
			
			return items;
		} else
			return Collections.emptyList();
	}
	
	private GumboDao getDao() {
		return dao;
	}
	
	public String getLetterText(String byLetterId) {
		final String text;
		
		if (!StringUtil.isEmpty(byLetterId)) {
			
			final Letter letter = findLetter(byLetterId);
			text = letter != null ? letter.getText() : CoreConstants.EMPTY;
			
		} else {
			text = CoreConstants.EMPTY;
		}
		
		return text;
	}
	
	private Letter findLetter(String byLetterId) {
		return getDao().find(Letter.class, new Long(byLetterId));
	}
	
	public String getLetterName(String byLetterId) {
		
		final String name;
		
		if (!StringUtil.isEmpty(byLetterId)) {
			
			final Letter letter = findLetter(byLetterId);
			name = letter != null ? letter.getName() : CoreConstants.EMPTY;
			
		} else {
			name = CoreConstants.EMPTY;
		}
		
		return name;
	}
	
	public List<Item> getDecisionRulings() {
		return getViolationDataProvider().getDecisionRulings();
	}
	
	public String getSelectedDecisionRulings(String value) {
		return getSelectedLabelsForValue(getDecisionRulings(), value);
	}
	
	public List<Item> getHarbours() {
		return getViolationDataProvider().getHarbours();
	}
	
	public Map<Locale, Map<String, String>> getAvailableHarbours() {
		return getAvailableOptions(getHarbours());
	}
	
	public String getTypeLabelOfPermissionForViolationCompany(String socialNr) {
		return getViolationDataProvider()
		        .getTypeLabelOfPermissionForViolationCompany(socialNr);
	}
	
	public List<Item> getLawyersUsers() {
		
		return getViolationDataProvider().getLawyersUsers();
	}
	
	public String hasNativeRole(String role) {
		
		return new XFormsBooleanResult(

		getRolesManager().getUserNativeRoles(getCurrentUser()).contains(role)

		).getResult();
	}
	
	public ViolationLocationData getViolationPlaceData(String byPostalCode) {
		
		return getViolationDataProvider().getViolationPlaceData(byPostalCode);
	}
	
	@SuppressWarnings("unused")
	private boolean contains(List<Role> inRoles, String role) {
		
		for (Role r : inRoles) {
			if (r.getRoleName().equals(role))
				return true;
		}
		
		return false;
	}
	
	public EquipmentData getEquipmentData(String byVesselRegistryNr) {
		return getViolationDataProvider().getEquipmentData(byVesselRegistryNr);
	}
	
	private ViolationDataProvider getViolationDataProvider() {
		return violationDataProvider;
	}
	
	private RolesManager getRolesManager() {
		return rolesManager;
	}
	
	private Map<String, String> offices = new HashMap<String, String>();
	
	public Boolean setSelectedOffice(String value, String xformSessionId) {
		if (StringUtil.isEmpty(xformSessionId))
			return Boolean.FALSE;
		
		if (StringUtil.isEmpty(value))
			value = CoreConstants.EMPTY;
		
		offices.put(xformSessionId, value);
		
		return Boolean.TRUE;
	}
	
	public Map<String, String> getOffices() {
		return offices;
	}
}