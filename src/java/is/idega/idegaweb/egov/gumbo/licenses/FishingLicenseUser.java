package is.idega.idegaweb.egov.gumbo.licenses;

import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;
import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.LicenseCheckContainer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.business.DefaultSpringBean;
import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.user.data.User;
import com.idega.util.text.Item;

@Service("fishingLicenseUser")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class FishingLicenseUser extends DefaultSpringBean {
	
	@Autowired
	@Qualifier(DOFWSClient.WEB_SERVICE)
	private DOFWSClient client;
	
	public List<Item> getVesselsForUser() {
		List<Item> items = null;
		User user = getCurrentUser();
		SkipInfoTypeUser vessels[] = getClient().getShipInfoByCompanySSN(
		    user.getPersonalID());
		if (vessels != null && vessels.length > 0) {
			items = new ArrayList<Item>(vessels.length);
			for (int i = 0; i < vessels.length; i++) {
				SkipInfoTypeUser vessel = vessels[i];
				items.add(new Item(vessel.getSkipNr().toString(), vessel
				        .getNafn()));
			}
		}
		
		return items;
	}
	
	public VesselData getUserVesselData(String vesselId) {
		VesselData data = new VesselData();
		
		SkipInfoTypeUser wsRes = getClient().getShipInfo(vesselId);
		if (wsRes != null) {
			data.setName(wsRes.getNafn());
			data.setOwnersName(wsRes.getEigandiNafn());
			data.setOwnersSocialSecurityNr(wsRes.getEigandiKt());
			data.setRegistryNr(wsRes.getSkipNr().toString());
		}
		
		return data;
	}
	
	/**
	 * used in the forms: general fishing license
	 * 
	 * @return types of licenses depending on logged in user
	 */
	public List<Item> getTypesOfFishingLicenses() {
		IWBundle iwb = getBundle(GumboConstants.IW_BUNDLE_IDENTIFIER);
		IWResourceBundle iwrb = getResourceBundle(iwb);
		
		final List<Item> items = new ArrayList<Item>(2);
		
		items.add(new Item("aflamarks", iwrb.getLocalizedString(
		    "LICENSE_TYPE_AFLAMARK", "Aflamarks")));
		items.add(new Item("krokaaflamarks", iwrb.getLocalizedString(
		    "LICENSE_TYPE_KROKAFLAMARK", "Krókaaflamarks")));
		
		return items;
	}
	
	/**
	 * used in the forms: grasleppa
	 * 
	 * @return fishing areas depending on logged in user
	 */
	public List<Item> getFishingAreas() {
		IWBundle iwb = getBundle(GumboConstants.IW_BUNDLE_IDENTIFIER);
		IWResourceBundle iwrb = getResourceBundle(iwb);
		
		final List<Item> items = new ArrayList<Item>(2);
		
		items.add(new Item("A", iwrb.getLocalizedString("AREA_A", "Faxaflói")));
		items.add(new Item("B", iwrb.getLocalizedString("AREA_B",
		    "Breiðafjörður")));
		items.add(new Item("C", iwrb.getLocalizedString("AREA_C", "Vestfirðir")));
		items.add(new Item("D", iwrb.getLocalizedString("AREA_D", "Húnaflói")));
		items.add(new Item("E", iwrb.getLocalizedString("AREA_E", "Norðurland")));
		items.add(new Item("F", iwrb.getLocalizedString("AREA_F", "Austurland")));
		items.add(new Item("G", iwrb.getLocalizedString("AREA_G", "Suðurland")));
		
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
		LicenseCheckContainer res = getClient().getHasValidSeafaringLicense(vesselId);
		if (res.isHasLicense()) {
			return "true";
		} else {
			return "false";
		}
	}
	
	/**
	 * used in the forms: grasleppa
	 * 
	 * @return string "true" or "false"
	 */
	public String getVesselHasValidGeneralFishingLicense(String vesselId) {
		LicenseCheckContainer res = getClient().getHasValidGeneralFishingLicense(vesselId);
		
		if (res.isHasLicense()) {
			return "true";
		} else {
			return "false";
		}
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
		
		return "false";
	}
	
	/**
	 * used in forms: strandveidileyfi
	 * 
	 * @return string true or false
	 */
	public String getVesselHasValidStrandveidileyfi(String vesselId) {
		LicenseCheckContainer res = getClient().getHasValidCoastFishingLicense(vesselId);
		
		if (res.isHasLicense()) {
			return "true";
		} else {
			return "false";
		}
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
	 * @return Result With Message
	 */
	public ResultWithMessage getVesselHasValidAflamarksleyfi(String vesselId) {
		
		final LicenseCheckContainer res = getClient().getHasValidQuotaLimitFishingLicense(
		    vesselId);
		
		return new ResultWithMessage(res.isHasLicense(), res.getMessage());
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
	
	public static final class ResultWithMessage {
		
		private final String message;
		private final String result;
		
		public ResultWithMessage(boolean result, String message) {
			
			this.message = message;
			this.result = result ? "true" : "false";
		}
		
		public String getMessage() {
			return message;
		}
		
		public String getResult() {
			return result;
		}
	}
	
	private DOFWSClient getClient() {
		return client;
	}
}