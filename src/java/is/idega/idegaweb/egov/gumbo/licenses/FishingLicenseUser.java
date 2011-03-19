package is.idega.idegaweb.egov.gumbo.licenses;

import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfagerdTypeUser;
import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.licenses.Interval.XFormsInterval;
import is.idega.idegaweb.egov.gumbo.util.GumboUtil;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.FJSWSClient;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.LicenseCheckContainer;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.bpm.xformsview.converters.DateConverter;
import com.idega.core.business.DefaultSpringBean;
import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.util.IWTimestamp;
import com.idega.util.text.Item;

@Service("fishingLicenseUser")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class FishingLicenseUser extends DefaultSpringBean {

	@Autowired
	@Qualifier(DOFWSClient.MOCK)
	private DOFWSClient client;

	@Autowired
	private FJSWSClient fjsClient;

	@Autowired
	private DateConverter dateConverter;

	@Autowired
	private GumboUtil gumboUtil;

	public CompanyData getCompanyForCurrentUser() {
		return getClient().getCompanyForUser(getCurrentUser());
	}

	public List<Item> getVesselsForUser() {

		return getClient().getVesselsForUser(getCurrentUser());
	}

	public List<Item> getGrasleppaVesselsForUser(String companyPersonalID) {

		return getClient().getGrasleppaVesselsForUser(companyPersonalID);
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
				"LICENSE_TYPE_KROKAFLAMARK", "Krokaaflamarks")));

		return items;
	}

	/**
	 * used in the forms: grasleppa
	 * 
	 * @return fishing areas depending on logged in user
	 */
	public List<Item> getFishingAreas() {
		List<Item> items = new ArrayList<Item>();

		Map<BigDecimal, VeidileyfagerdTypeUser> ret = getClient()
				.getGrasleppaAreas();
		if (ret != null && !ret.isEmpty()) {

			for (Iterator iterator = ret.keySet().iterator(); iterator
					.hasNext();) {
				VeidileyfagerdTypeUser item = ret.get(iterator.next());
				items.add(new Item(item.getVlyfId().toString(), item
						.getKodiSvaedis() + " - " + item.getHeitiSvaedis()));
			}
		}

		return items;
	}

	/**
	 * used in the forms: draganotaveidi
	 * 
	 * @return
	 */
	public String getFishingAreaForDraganotaveidi(String shipId) {
		return getClient().getFishingAreaForDraganotaveidi(shipId);
	}

	/**
	 * used in the forms: general fishing license
	 * 
	 * @return text informing user that he has some kind of a license (which is
	 *         not in the available selection of license types). empty - if user
	 *         doesn't have any license.
	 */
	public String getHasLicenseText() {
		return "";
	}

	/**
	 * used in the forms: general fishing license, strandveidileyfi, grasleppa
	 * 
	 * @return
	 */
	public XFormsBooleanResult getVesselHasValidHaffairisskirteini(
			String vesselId) {
		final LicenseCheckContainer res = getClient()
				.getHasValidSeafaringLicense(vesselId);

		return new XFormsBooleanResult(res.isHasLicense(), res.getMessage());
	}

	/**
	 * used in the forms: grasleppa
	 * 
	 * @return
	 */
	public XFormsBooleanResult getVesselHasValidGeneralFishingLicense(
			String vesselId) {
/*		final LicenseCheckContainer res = getClient()
				.getHasValidGeneralFishingLicense(vesselId);*/

		LicenseCheckContainer res = getClient()
		.getHasValidQuotaLimitFishingLicense(vesselId);
		if (!res.isHasLicense()) {
			res = getClient().getHasValidHookQuotaLimitFishingLicense(vesselId);
		}

		if (res.isHasLicense()) {
			return new XFormsBooleanResult(res.isHasLicense(), res.getMessage());
		} else {
			IWBundle iwb = getBundle(GumboConstants.IW_BUNDLE_IDENTIFIER);
			IWResourceBundle iwrb = getResourceBundle(iwb);
			
			return new XFormsBooleanResult(res.isHasLicense(), iwrb.getLocalizedString("NO_VALID_LICENSE_GRASLEPPA", "Ship has no valid general fishing license (aflamark or krokaflamark)"));			
		}
	}

	/**
	 * used in forms: general fishing license, strandveidileyfi, grasleppa
	 * <p>
	 * informs the user that he's in debt for fiskistofa (after he submits the
	 * application)
	 * </p>
	 * 
	 * @return string true or false
	 */
	public String getIsInDebt(String vesselId) {
		return new Boolean(getFJSClient().getIsInDebt(vesselId)).toString();
	}

	/**
	 * used in forms: strandveidileyfi
	 * 
	 * @return
	 */
	public XFormsBooleanResult getVesselHasValidStrandveidileyfi(String vesselId) {
		final LicenseCheckContainer res = getClient()
				.getHasValidCoastFishingLicense(vesselId);

		return new XFormsBooleanResult(res.isHasLicense(), res.getMessage());
	}

	/**
	 * used in forms: draganotaveidi
	 * 
	 * @return string true or false
	 */
	public String getCompanyAddressFallsInArea(String areaId) {
		// TODO is this needed? I'm not using this in the form now

		return "true";
	}

	/**
	 * used in forms: draganotaveidi
	 * 
	 * @return Result With Message
	 */
	public XFormsBooleanResult getVesselHasValidAflamarksleyfi(String vesselId) {

		final LicenseCheckContainer res = getClient()
				.getHasValidQuotaLimitFishingLicense(vesselId);

		return new XFormsBooleanResult(res.isHasLicense(), res.getMessage());
	}

	/**
	 * used in forms: all forms
	 * 
	 * @return Result With Message
	 */
	public XFormsBooleanResult getHasRevokedFishingLicense(String vesselId) {

		final LicenseCheckContainer res = getClient()
				.getHasRevokedFishingLicense(vesselId);

		return new XFormsBooleanResult(res.isHasLicense(), res.getMessage());
	}

	/**
	 * used in forms: grasleppa
	 * 
	 * @return string true or false
	 */
	public String getCompanyHasValidGrasleppa() {
		// Is always true, since Fiskisofa only returns us the ships that have
		// this license.
		return "true";
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
	 * @return label of the fishing area for vessel
	 */
	public String getFishingArea(String shipId, String validFrom) {

		try {
			return getClient()
					.getFishingArea(
							shipId,
							new Timestamp(getDateConverter()
									.convertStringFromXFormsToDate(validFrom)
									.getTime()));

		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	public IWTimestamp getEndDateOfFishing(IWTimestamp from, String areaID) {
		Map<BigDecimal, VeidileyfagerdTypeUser> map = getClient()
				.getGrasleppaAreas();
		int daysToAdd = 0;
		IWTimestamp lastPossibleDate = new IWTimestamp(from);
		if (map != null && !map.isEmpty()) {
			VeidileyfagerdTypeUser item = map.get(new BigDecimal(areaID));
			if (item != null) {
				daysToAdd = item.getDagafjoldi().intValue() - 1;
				lastPossibleDate = new IWTimestamp(item.getUrGildi().getTime());
			}
		}

		IWTimestamp to = new IWTimestamp(from);
		to.addDays(daysToAdd);

		if (to.isLaterThan(lastPossibleDate)) {
			return lastPossibleDate;
		}

		return to;
	}

	public String getLicenseEndDate(String from, String area) {
		if (from == null || from.isEmpty() || !isInTimeframe(from, area)) {
			return "";
		}
		
		try {
			IWTimestamp stamp = new IWTimestamp(getDateConverter()
					.convertStringFromXFormsToDate(from));
			IWTimestamp to = getEndDateOfFishing(stamp, area);

			return getDateConverter().convertDateToComplyWithXForms(
					to.getDate());
		} catch (ParseException e) {
			//Screw you, hippie!!
		}

		return "";
	}
	
	public String getLicenseEndDateFormatted(String from, String area) {
		return getGumboUtil().formatDate(getLicenseEndDate(from, area));
	}

	public boolean isInTimeframe(String date, String areaID) {
		Map<BigDecimal, VeidileyfagerdTypeUser> map = getClient()
				.getGrasleppaAreas();

		IWTimestamp firstPossibleDate = null;
		IWTimestamp lastPossibleDate = null;
		if (map != null && !map.isEmpty()) {
			VeidileyfagerdTypeUser item = map.get(new BigDecimal(areaID));
			if (item != null) {
				firstPossibleDate = new IWTimestamp(item.getUpphafVeiditimabils().getTime());
				lastPossibleDate = new IWTimestamp(item.getUrGildi().getTime());
			}
		}

		if (date != null && !date.isEmpty()) {
			IWTimestamp stamp = new IWTimestamp(date);
			if (firstPossibleDate != null && lastPossibleDate != null) {
				return stamp.isBetween(firstPossibleDate, lastPossibleDate);
			}
		}
		
		return false;
	}
	
	public XFormsInterval getLicenseIntervalForGrasleppa(String fishingAreaId) {

		Map<BigDecimal, VeidileyfagerdTypeUser> ret = getClient()
				.getGrasleppaAreas();
		VeidileyfagerdTypeUser type = ret.get(new BigDecimal(fishingAreaId));

		final Interval iv = new Interval(type.getUpphafVeiditimabils()
				.getTime(), type.getUrGildi().getTime());

		return fromIntervalToXFormsInterval(iv);
	}

	private XFormsInterval fromIntervalToXFormsInterval(Interval iv) {
		return new XFormsInterval(getDateConverter()
				.convertDateToComplyWithXForms(iv.getFrom()),
				getDateConverter().convertDateToComplyWithXForms(iv.getTo()));
	}

	public String getLicenseIntervalForGrasleppaLabel(String fishingAreaId) {

		Map<BigDecimal, VeidileyfagerdTypeUser> ret = getClient()
				.getGrasleppaAreas();
		VeidileyfagerdTypeUser type = ret.get(new BigDecimal(fishingAreaId));

		IWTimestamp from = new IWTimestamp(type.getUpphafVeiditimabils().getTime());
		IWTimestamp to = new IWTimestamp(type.getUrGildi().getTime());

		StringBuilder builder = new StringBuilder(from.getDateString("dd.MM.yyyy")).append(" - ").append(to.getDateString("dd.MM.yyyy"));
		
		return builder.toString();
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

	public static final class XFormsBooleanResult {

		private final String message;
		private final String result;

		public XFormsBooleanResult(boolean result, String message) {

			this.message = message;
			this.result = result ? "true" : "false";
		}

		public XFormsBooleanResult(boolean result) {

			this.message = null;
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

	private FJSWSClient getFJSClient() {
		return fjsClient;
	}

	private DateConverter getDateConverter() {
		return dateConverter;
	}

	private GumboUtil getGumboUtil() {
		return gumboUtil;
	}

	public static final class CompanyData {

		private final String socialSecurityNr;
		private String name;
		private String address;
		private String postalCode;
		private String phoneNumber;
		private String email;
		private String faxNumber;
		private String place;

		public CompanyData(String socialSecurityNr) {

			this.socialSecurityNr = socialSecurityNr;
		}

		public String getName() {
			return name;
		}

		public CompanyData setName(String name) {
			this.name = name;
			return this;
		}

		public String getAddress() {
			return address;
		}

		public CompanyData setAddress(String address) {
			this.address = address;
			return this;
		}

		public String getSocialSecurityNr() {
			return socialSecurityNr;
		}

		public String getPostalCode() {
			return postalCode;
		}

		public CompanyData setPostalCode(String postalCode) {
			this.postalCode = postalCode;
			return this;
		}

		public String getPhoneNumber() {
			return phoneNumber;
		}

		public CompanyData setPhoneNumber(String phoneNumber) {
			this.phoneNumber = phoneNumber;
			return this;
		}

		public String getEmail() {
			return email;
		}

		public CompanyData setEmail(String email) {
			this.email = email;
			return this;
		}

		public String getFaxNumber() {
			return faxNumber;
		}

		public CompanyData setFaxNumber(String faxNumber) {
			this.faxNumber = faxNumber;
			return this;
		}

		public String getPlace() {
			return place;
		}

		public CompanyData setPlace(String place) {
			this.place = place;
			return this;
		}
	}
}