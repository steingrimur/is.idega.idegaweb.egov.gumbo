package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.AflaHeimildSkerdingAlltTypUser;
import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.AflamarkTypeUser;
import is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.HlutdeildTypeUser;
import is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.UthlutanirTypeUser;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeUser;
import is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.CheckReplyTypeUser;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.CodeTypeUser;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfagerdTypeUser;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfiTypeUser;
import is.idega.idegaweb.egov.gumbo.licenses.FishingLicenseType;
import is.idega.idegaweb.egov.gumbo.licenses.FishingLicenseUser.CompanyData;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.user.data.User;
import com.idega.util.IWTimestamp;
import com.idega.util.text.Item;

@Scope("singleton")
@Service
@Qualifier(DOFWSClient.MOCK)
public class DOFWSClientMock implements DOFWSClient {
	
	@Override
	public SkipInfoTypeUser[] getShipInfoByCompanySSN(String companySSN) {
		
		final SkipInfoTypeUser v1info = new SkipInfoTypeUser();
		v1info.setSkipNr(new BigDecimal(123));
		v1info.setNafn("vessel 123");
		
		final SkipInfoTypeUser v2info = new SkipInfoTypeUser();
		v2info.setSkipNr(new BigDecimal(456));
		v2info.setNafn("vessel 456");
		
		return new SkipInfoTypeUser[] { v1info, v2info };
	}
	
	@Override
	public SkipInfoTypeUser getShipInfo(String shipID) {
		
		final SkipInfoTypeUser v1info = new SkipInfoTypeUser();
		v1info.setSkipNr(new BigDecimal(shipID));
		v1info.setNafn("vessel " + shipID);
		v1info.setEigandiNafn("EigandiNafn " + shipID);
		v1info.setEigandiKt("EigandiKt " + shipID);
		
		return v1info;
	}
	
	@Override
	public CheckReplyTypeUser getQuotaTransferCheckForShip(String vesselID) {
		throw new UnsupportedOperationException();		
	}
	
	@Override
	public CheckReplyTypeUser getFishingCompanyHasValidStrandveidileyfi(String companySSN) {
		throw new UnsupportedOperationException();				
	}
	
	@Override
	public LondunTypeUser[] getCatchInfoByShipNumber(BigDecimal shipNumber,
	        Calendar from, Calendar to) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public LondunTypeUser getCatchInfoByNumberAndPort(BigDecimal catchNumber,
	        BigDecimal port) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public CodeTypeUser getFishingAreaStrandveidi(String postNr) {
		return null;
	}
	
	@Override
	public AflamarkTypeUser[] getCatchQuota(BigDecimal shipNumber, String period) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public AflamarkTypeUser[] getCatchQuota(String personalID, String period) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public LicenseCheckContainer getHasValidSeafaringLicense(String shipID) {
		
		return new LicenseCheckContainer(true,
		        "Error message from getHasValidSeafaringLicense");
	}
	
	@Override
	public LicenseCheckContainer getHasValidGeneralFishingLicense(String shipID) {
		return new LicenseCheckContainer(true,
		        "Error message from getHasValidGeneralFishingLicens");
	}
	
	public LicenseCheckContainer getHasValidFishingLicense(String shipID, String licenseType) {
		return new LicenseCheckContainer(true,
        	"Error message from getHasValidFishingLicense");
	}
	
	@Override
	public LicenseCheckContainer getHasValidCoastFishingLicense(String shipID) {
		return new LicenseCheckContainer(false,
		        "Error message from getHasValidCoastFishingLicense");
	}
	
	@Override
	public LicenseCheckContainer getHasValidQuotaLimitFishingLicense(
	        String shipID) {
		return new LicenseCheckContainer(true,
		        "Error message from getHasValidQuotaLimitFishingLicense");
	}

	@Override
	public LicenseCheckContainer getHasValidHookQuotaLimitFishingLicense(
			String shipID) {
		return new LicenseCheckContainer(true,
        "Error message from getHasValidQuotaLimitFishingLicense");
	}
	
	@Override
	public LicenseCheckContainer getHasRevokedFishingLicense(String shipID) {
		
		return new LicenseCheckContainer(false,
		        "Error message from getHasRevokedFishingLicense");
	}
	
	@Override
	public LondunTypeUser[] getLatestCatchInfoByShip(BigDecimal shipNumber,
	        int numberOfResults) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public LondunTypeUser[] getLatestCatchInfo(String personalID,
	        int numberOfResults) {
		throw new UnsupportedOperationException();
	}
	
	@Override
	public CodeTypeUser getFishingAreaForDraganotaveidi(String shipId) {
		return null;
	}
	
	@Override
	public String getFishingArea(String shipId, Timestamp validFrom) {
		return "13th fishing zone. shipId: " + shipId + ", validFrom: "
		        + validFrom;
	}
	
	@Override
	public CompanyData getCompanyForUser(User user) {
		return new CompanyData("4252345234").setName("company name")
		        .setAddress("company address").setPostalCode("5432345")
		        .setPhoneNumber("222222").setEmail("x@xx.lt")
		        .setFaxNumber("452342543").setPlace("comp place");
	}
	
	@Override
	public BigDecimal[] getGrasleppuShipNrByCompanySSN(String companySSN) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public BigDecimal[] getStrandveidiShipNrByCompanySSN(String companySSN) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public Map<BigDecimal, VeidileyfagerdTypeUser> getGrasleppaAreas() {
		Map<BigDecimal, VeidileyfagerdTypeUser> map = new HashMap<BigDecimal, VeidileyfagerdTypeUser>();
		
		map.put(new BigDecimal(1), new VeidileyfagerdTypeUser(
		        new BigDecimal(1), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Faxafloi", "1",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(2), new VeidileyfagerdTypeUser(
		        new BigDecimal(2), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Breidafjordur",
		        "2", new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(3), new VeidileyfagerdTypeUser(
		        new BigDecimal(3), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Vestfirdir", "3",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(4), new VeidileyfagerdTypeUser(
		        new BigDecimal(4), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Hunafloi", "4",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(5), new VeidileyfagerdTypeUser(
		        new BigDecimal(5), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Nordurland", "5",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(6), new VeidileyfagerdTypeUser(
		        new BigDecimal(6), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Austurland", "6",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(7), new VeidileyfagerdTypeUser(
		        new BigDecimal(7), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Sudurland", "7",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		
		return map;
	}
	
	@Override
	public Map<BigDecimal, VeidileyfagerdTypeUser> getStrandveidiAreas() {
		Map<BigDecimal, VeidileyfagerdTypeUser> map = new HashMap<BigDecimal, VeidileyfagerdTypeUser>();
		
		map.put(new BigDecimal(1), new VeidileyfagerdTypeUser(
		        new BigDecimal(1), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Faxafloi", "1",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(2), new VeidileyfagerdTypeUser(
		        new BigDecimal(2), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Breidafjordur",
		        "2", new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(3), new VeidileyfagerdTypeUser(
		        new BigDecimal(3), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Vestfirdir", "3",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(4), new VeidileyfagerdTypeUser(
		        new BigDecimal(4), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Hunafloi", "4",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(5), new VeidileyfagerdTypeUser(
		        new BigDecimal(5), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Nordurland", "5",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(6), new VeidileyfagerdTypeUser(
		        new BigDecimal(6), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Austurland", "6",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(7), new VeidileyfagerdTypeUser(
		        new BigDecimal(7), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Sudurland", "7",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		
		return map;		
	}
	
	@Override
	public HlutdeildTypeUser[] getCatchPortion(BigDecimal skipID, String season) {
		return null;
	}
	
	@Override
	public UthlutanirTypeUser[] getShipPortions(BigDecimal shipID, String season) {
		return null;
	}
	
	public BigDecimal createFishingLicense(String shipNr, String licenseType,
	        IWTimestamp from, IWTimestamp to, String info) {
		return new BigDecimal(-1);
	}
	
	public boolean activateFishingLicense(BigDecimal fishingLicenseID) {
		return false;
	}

	public boolean cancelFishingLicense(BigDecimal fishingLicenseID) {
		return false;
	}

	public VeidileyfiTypeUser getFishingLicenseInfo(BigDecimal id) {
		return null;
	}
	
	@Override
	public MillifaerslaTypeUser[] getTransfers(BigDecimal shipNr, String type,
	        String period) {
		return null;
	}
	
	@Override
	public MillifaerslaTypeUser getTransferInfo(BigDecimal reference) {
		return null;
	}
	
	@Override
	public List<Item> getGrasleppaVesselsForUser(String companyPersonalID) {
		
		return getVesselsForUser(null);
	}
	
	@Override
	public List<Item> getStrandveidiVesselsForUser(String companyPersonalID) {
		
		return getVesselsForUser(null);
	}

	
	@Override
	public List<Item> getVesselsForUser(User user) {
		return Arrays.asList(new Item[] { new Item("1", "Vessel 1"),
		        new Item("2", "Vessel 2") });
	}

	@Override
	public Map<BigDecimal, VeidileyfagerdTypeUser> getAlmennAreas(FishingLicenseType type) {
		Map<BigDecimal, VeidileyfagerdTypeUser> map = new HashMap<BigDecimal, VeidileyfagerdTypeUser>();
		
		map.put(new BigDecimal(1), new VeidileyfagerdTypeUser(
		        new BigDecimal(1), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Faxafloi", "1",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(2), new VeidileyfagerdTypeUser(
		        new BigDecimal(2), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Breidafjordur",
		        "2", new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(3), new VeidileyfagerdTypeUser(
		        new BigDecimal(3), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Vestfirdir", "3",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(4), new VeidileyfagerdTypeUser(
		        new BigDecimal(4), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Hunafloi", "4",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(5), new VeidileyfagerdTypeUser(
		        new BigDecimal(5), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Nordurland", "5",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(6), new VeidileyfagerdTypeUser(
		        new BigDecimal(6), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Austurland", "6",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(7), new VeidileyfagerdTypeUser(
		        new BigDecimal(7), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Sudurland", "7",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		
		return map;
	}

	@Override
	public Map<BigDecimal, VeidileyfagerdTypeUser> getDragnotaAreas() {
		Map<BigDecimal, VeidileyfagerdTypeUser> map = new HashMap<BigDecimal, VeidileyfagerdTypeUser>();
		
		map.put(new BigDecimal(1), new VeidileyfagerdTypeUser(
		        new BigDecimal(1), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Faxafloi", "1",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(2), new VeidileyfagerdTypeUser(
		        new BigDecimal(2), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Breidafjordur",
		        "2", new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(3), new VeidileyfagerdTypeUser(
		        new BigDecimal(3), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Vestfirdir", "3",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(4), new VeidileyfagerdTypeUser(
		        new BigDecimal(4), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Hunafloi", "4",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(5), new VeidileyfagerdTypeUser(
		        new BigDecimal(5), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Nordurland", "5",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(6), new VeidileyfagerdTypeUser(
		        new BigDecimal(6), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Austurland", "6",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		map.put(new BigDecimal(7), new VeidileyfagerdTypeUser(
		        new BigDecimal(7), new BigDecimal(11), IWTimestamp.RightNow()
		                .getCalendar(), "Faxafloi", "1011", "Sudurland", "7",
		        new BigDecimal(62), "herna", IWTimestamp.RightNow()
		                .getCalendar()));
		
		return map;
	}

	@Override
	public is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.SkipInfoTypeUser[] getCatchDelimiterShips(
			String personalID) {
		return null;
	}

	@Override
	public AflaHeimildSkerdingAlltTypUser getCatchDelimiterShipInfo(
			BigDecimal shipNumber) {
		return null;
	}

	@Override
	public AflaHeimildSkerdingAlltTypUser calculateCatchDelimiter(
			AflaHeimildSkerdingAlltTypUser delimiter) {
		return null;
	}

	@Override
	public AflaHeimildSkerdingAlltTypUser sendCatchDelimiter(
			AflaHeimildSkerdingAlltTypUser delimiter) {
		return null;
	}
	
	public LicenseCheckContainer getMaximumLength(
			BigDecimal shipID) {
		return new LicenseCheckContainer(true,
        "Error message from getMaximumLength");
	}

	public LicenseCheckContainer getMaximumPower(
			BigDecimal shipID) {
		return new LicenseCheckContainer(true,
        "Error message from getMaximumPower");
	}
}