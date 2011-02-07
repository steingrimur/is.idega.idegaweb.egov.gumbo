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
import java.util.Collections;
import java.util.List;

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
import com.idega.util.CoreConstants;
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
	
	public List<Item> getOtherInspectorsThanCurrentlyLoggedIn() {
		return getViolationDataProvider()
		        .getOtherInspectorsThanCurrentlyLoggedIn();
	}
	
	public List<Item> getFiskistofaOffices() {
		
		return getViolationDataProvider().getFiskistofaOffices();
	}
	
	public List<Item> getFishingGears() {
		return getViolationDataProvider().getFishingGears();
	}
	
	public List<Item> getLettersTypes() {
		
		final LetterType[] types = LetterType.values();
		
		final List<Item> items = new ArrayList<Item>(types.length);
		
		IWResourceBundle iwrb = IWMainApplication
		        .getDefaultIWApplicationContext().getIWMainApplication()
		        .getBundle(GumboConstants.IW_BUNDLE_IDENTIFIER)
		        .getResourceBundle(LocaleUtil.getIcelandicLocale());
		
		for (LetterType letterType : types) {
			items.add(new Item(letterType.toString(), iwrb.getLocalizedString(
			    "letter_type." + letterType.toString(), letterType.toString())));
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
		
		if (false) {
			
			final String text;
			
			if (!StringUtil.isEmpty(byLetterId)) {
				
				final Letter letter = findLetter(byLetterId);
				text = letter != null ? letter.getText() : CoreConstants.EMPTY;
				// text = letter != null ?
				// "Samkvæmt upplýsingum Fiskistofu fór [skipsnafn, númer], sem hefur leyfi til strandveiða, í veiðiferð frá [..staðs. dags. tími]. Þessari veiðiferð lauk sama dag á sama stað [kl. &&&]. Tími veiðiferðar var því [&klst. og &&.mínútur]. Einnig fór báturinn í veiðiferð frá [&staðs&dags&tími]. Þessari veiðiferð lauk sama dag á sama stað [..kl. &]. Tími veiðiferðar var því [&&..klst. og &mín.] Einnig fór báturinn í veiðiferð frá [..staðs. dags. tími]. Þessari veiðiferð lauk sama dag á sama stað [..kl. &]. Tími veiðiferðar var því [&&..klst. og &mín.]. Í 2. tl. 6. mgr. 6. gr. a. laga nr. 116/2006 um stjórn fiskveiða, sbr. 1. gr. laga nr. 32/2010, um breytingu á lögum nr. 116/2006, um stjórn fiskveiða, með síðari breytingum segir: Hver veiðiferð skal eigi standa lengur en 14 klukkustundir. Miðað er við þann tíma er fiskiskip lætur úr höfn til veiða til þess er það kemur til hafnar aftur til löndunar. Aðeins er heimilt að fara í eina veiðiferða á hverjum degi. Viðurlög vegna brota á fyrrgreindum lögum, reglum settum samkvæmt þeim og ákvæðum leyfisbréfa fer skv. VI. Kafla laga nr. 116/2006, um stjórn fiskveiða, og IV. kafla laga nr. 57/1996, um umgengni um nytjastofna sjávar. Í 24. gr. laga nr. 116/2006, um stjórn fiskveiða, sbr. 5. gr. laga nr. 32/2010 um breytingu á lögum nr. 116/2006, um stjórn fiskveiða, með síðari breytingum, er kveðið á um að Fiskistofa skuli veita áminningar og svipta skip leyfi til veiða í atvinnuskyni fyrir brot á lögum þessum eða reglum settum samkvæmt þeim eftir því sem nánar er fyrir mælt í lögum um umgengni um nytjastofna sjávar. Í 15. gr. laga nr. 57/1996, um umgengni um nytjastofna sjávar er kveðið á um að Fiskistofa skuli svipta skip leyfi til veiða í atvinnuskyni ef útgerð eða áhöfn skips eða aðrir þeir sem í þágu útgerðar starfa hafa brotið gegn ákvæðum laga þessara eða reglum settum samkvæmt þeim. Við fyrsta brot, sem varðar sviptingu veiðileyfis skal leyfissvipting ekki standa skemur en eina viku og ekki lengur en tólf vikur eftir eðli og umfangi brots. Við ítrekuð brot skal svipting ekki standa skemur en fjórar vikur og ekki lengur en eitt ár. Við fyrsta minni háttar brot skal Fiskistofa, þrátt fyrir ákvæði 1. og 2. mgr., veita hlutaðeigandi útgerð skriflega áminningu. Fiskistofa hefur mál þetta til skoðunar. Áður en ákvörðun verður tekin um hvort tilefni er til beitingar viðurlaga svo sem veitingar skriflegrar áminninga eða hvort og til hve langs tíma [ skipsnafn og númer], verður svipt leyfi til strandveiða og/eða hvort kært verði til lögreglu vegna hins meinta brots er yður gefinn kostur á að koma andmælum yðar og skýringum á framfæri við Fiskistofu. Það skal gert skriflega eða með tölvupósti á póstfangið athugasemdir@fiskistofa.is eigi síðar en [&dags&..]."
				// + byLetterId
				// : CoreConstants.EMPTY;
				
			} else {
				text = CoreConstants.EMPTY;
			}
			
			/*
			final StringBuilder xxx = new StringBuilder();
			
			for (int i = 0; i < 1000; i++) {
			    
				xxx.append("Samkvæmt ");
			}
			
			System.out.println("text: " + text);
			System.out.println("text length: " + text.length());
			
			//		return text.substring(0, text.length() - 1700);
			//		return xxx.toString();
			
			
			System.out.println("WTF__2_____");
			
			*/
			System.out.println("by letter id: " + byLetterId);
			
			return byLetterId.equals("1") ? "Samkvæmt upplýsingum Fiskistofu fór [skipsnafn, númer], sem hefur leyfi til strandveiða, í veiðiferð frá [..staðs. dags. tími]. Þessari veiðiferð lauk sama dag á sama stað [kl. &&&]. Tími veiðiferðar var því [&klst. og &&.mínútur]. Einnig fór báturinn í veiðiferð frá [&staðs&dags&tími]. Þessari veiðiferð lauk sama dag á sama stað [..kl. &]. Tími veiðiferðar var því [&&..klst. og &mín.] Einnig fór báturinn í veiðiferð frá [..staðs. dags. tími]. Þessari veiðiferð lauk sama dag á sama stað [..kl. &]. Tími veiðiferðar var því [&&..klst. og &mín.]. Í 2. tl. 6. mgr. 6. gr. a. laga nr. 116/2006 um stjórn fiskveiða, sbr. 1. gr. laga nr. 32/2010, um breytingu á lögum nr. 116/2006, um stjórn fiskveiða, með síðari breytingum segir: Hver veiðiferð skal eigi standa lengur en 14 klukkustundir. Miðað er við þann tíma er fiskiskip lætur úr höfn til veiða til þess er það kemur til hafnar aftur til löndunar. Aðeins er heimilt að fara í eina veiðiferða á hverjum degi. Viðurlög vegna brota á fyrrgreindum lögum, reglum settum samkvæmt þeim og ákvæðum leyfisbréfa fer skv. VI. Kafla laga nr. 116/2006, um stjórn fiskveiða, og IV. kafla laga nr. 57/1996, um umgengni um nytjastofna sjávar. Í 24. gr. laga nr. 116/2006, um stjórn fiskveiða, sbr. 5. gr. laga nr. 32/2010 um breytingu á lögum nr. 116/2006, um stjórn fiskveiða, með síðari breytingum, er kveðið á um að Fiskistofa skuli veita áminningar og svipta skip leyfi til veiða í atvinnuskyni fyrir brot á lögum þessum eða reglum settum samkvæmt þeim eftir því sem nánar er fyrir mælt í lögum um umgengni um nytjastofna sjávar. Í 15. gr. laga nr. 57/1996, um umgengni um nytjastofna sjávar er kveðið á um að Fiskistofa skuli svipta skip leyfi til veiða í atvinnuskyni ef útgerð eða áhöfn skips eða aðrir þeir sem í þágu útgerðar starfa hafa brotið gegn ákvæðum laga þessara eða reglum settum samkvæmt þeim. Við fyrsta brot, sem varðar sviptingu veiðileyfis skal leyfissvipting ekki standa skemur en eina viku og ekki lengur en tólf vikur eftir eðli og umfangi brots. Við ítrekuð brot skal svipting ekki standa skemur en fjórar vikur og ekki lengur en eitt ár. Við fyrsta minni háttar brot skal Fiskistofa, þrátt fyrir ákvæði 1. og 2. mgr., veita hlutaðeigandi útgerð skriflega áminningu. Fiskistofa hefur mál þetta til skoðunar. Áður en ákvörðun verður tekin um hvort tilefni er til beitingar viðurlaga svo sem veitingar skriflegrar áminninga eða hvort og til hve langs tíma [ skipsnafn og númer], verður svipt leyfi til strandveiða og/eða hvort kært verði til lögreglu vegna hins meinta brots er yður gefinn kostur á að koma andmælum yðar og skýringum á framfæri við Fiskistofu. Það skal gert skriflega eða með tölvupósti á póstfangið athugasemdir@fiskistofa.is eigi síðar en [&dags&..]."
			        : "something simple " + byLetterId;
			
			// return text;
		} else {
			
			final String text;
			
			if (!StringUtil.isEmpty(byLetterId)) {
				
				final Letter letter = findLetter(byLetterId);
				text = letter != null ? letter.getText() : CoreConstants.EMPTY;
				
			} else {
				text = CoreConstants.EMPTY;
			}
			
			return text;
		}
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
	
	public List<Item> getHarbours() {
		return getViolationDataProvider().getHarbours();
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
}