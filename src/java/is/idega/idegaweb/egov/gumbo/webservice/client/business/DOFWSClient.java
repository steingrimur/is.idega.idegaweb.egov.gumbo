package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.AflamarkTypeUser;
import is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.HlutdeildTypeUser;
import is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.UthlutanirTypeUser;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeUser;
import is.fiskistofa.webservices.millifaerslur.FSWebserviceMILLIFAERSLUR_wsdl.MillifaerslaTypeUser;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.CheckReplyTypeUser;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfagerdTypeUser;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfiTypeUser;
import is.idega.idegaweb.egov.gumbo.licenses.FishingLicenseUser.CompanyData;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import com.idega.user.data.User;
import com.idega.util.IWTimestamp;
import com.idega.util.text.Item;

public interface DOFWSClient {
	
	public static final String MOCK = "mock";
	public static final String WEB_SERVICE = "webservice";
	
	public abstract CompanyData getCompanyForUser(User user);
	
	public SkipInfoTypeUser[] getShipInfoByCompanySSN(String companySSN);
	
	public BigDecimal[] getGrasleppuShipNrByCompanySSN(String companySSN);
	public BigDecimal[] getStrandveidiShipNrByCompanySSN(String companySSN);
	
	public String getFishingAreaStrandveidi(String postNr);
	
	public CheckReplyTypeUser getQuotaTransferCheckForShip(String vesselID);
	
	public CheckReplyTypeUser getFishingCompanyHasValidStrandveidileyfi(String companySSN);
	
	public SkipInfoTypeUser getShipInfo(String shipID);
	
	public LondunTypeUser[] getCatchInfoByShipNumber(BigDecimal shipNumber,
	        Calendar from, Calendar to);
	
	public LondunTypeUser getCatchInfoByNumberAndPort(BigDecimal catchNumber,
	        BigDecimal port);
	
	public LondunTypeUser[] getLatestCatchInfoByShip(BigDecimal shipNumber,
	        int numberOfResults);
	
	public LondunTypeUser[] getLatestCatchInfo(String personalID,
	        int numberOfResults);
	
	public AflamarkTypeUser[] getCatchQuota(BigDecimal shipNumber, String period);
	
	public AflamarkTypeUser[] getCatchQuota(String personalID, String period);
	
	public LicenseCheckContainer getHasValidSeafaringLicense(String shipID);
	
	public LicenseCheckContainer getHasValidGeneralFishingLicense(String shipID);
	
	public LicenseCheckContainer getHasValidCoastFishingLicense(String shipID);
	
	public LicenseCheckContainer getHasValidQuotaLimitFishingLicense(
	        String shipID);
	
	public LicenseCheckContainer getHasValidHookQuotaLimitFishingLicense(
	        String shipID);
	
	public LicenseCheckContainer getHasRevokedFishingLicense(String shipID);
	
	public String getFishingAreaForDraganotaveidi(String shipId);
	
	public String getFishingArea(String shipId, Timestamp validFrom);
	
	public Map<BigDecimal, VeidileyfagerdTypeUser> getGrasleppaAreas();
	
	public HlutdeildTypeUser[] getCatchPortion(BigDecimal skipID, String season);
	
	public UthlutanirTypeUser[] getShipPortions(BigDecimal shipID, String season);
	
	public BigDecimal createFishingLicense(String shipNr, String licenseType,
	        IWTimestamp from, IWTimestamp to, String info);
	
	public boolean activateFishingLicense(BigDecimal fishingLicenseID);

	public boolean cancelFishingLicense(BigDecimal fishingLicenseID);

	public VeidileyfiTypeUser getFishingLicenseInfo(BigDecimal id);
	
	public MillifaerslaTypeUser[] getTransfers(BigDecimal shipNr, String type,
	        String period);
	
	public MillifaerslaTypeUser getTransferInfo(BigDecimal reference);
	
	public abstract List<Item> getGrasleppaVesselsForUser(
	        String companyPersonalID);
	public abstract List<Item> getStrandveidiVesselsForUser(String companyPersonalID);

	
	public abstract List<Item> getVesselsForUser(User user);
}