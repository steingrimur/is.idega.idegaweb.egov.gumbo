package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.AflamarkTypeUser;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeUser;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;
import is.idega.idegaweb.egov.gumbo.licenses.FishingLicenseUser.CompanyData;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Calendar;

import com.idega.user.data.User;

public interface DOFWSClient {
	
	public static final String MOCK = "mock";
	public static final String WEB_SERVICE = "webservice";
	
	public abstract CompanyData getCompanyForUser(User user);
	
	public SkipInfoTypeUser[] getShipInfoByCompanySSN(String companySSN);
	
	public BigDecimal[] getGrasleppuShipNrByCompanySSN(String companySSN);

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
	
	public LicenseCheckContainer getHasRevokedFishingLicense(String shipID);
	
	public String getFishingAreaForDraganotaveidi(String shipId);
	
	public String getFishingArea(String shipId, Timestamp validFrom);
}