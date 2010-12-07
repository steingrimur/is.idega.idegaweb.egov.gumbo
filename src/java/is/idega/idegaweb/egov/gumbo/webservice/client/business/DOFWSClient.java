package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.AflamarkTypeUser;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeUser;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;

import java.math.BigDecimal;
import java.util.Calendar;

public interface DOFWSClient {
	
	public static final String MOCK = "mock";
	public static final String WEB_SERVICE = "webservice";
	
	public SkipInfoTypeUser[] getShipInfoByCompanySSN(String companySSN);
	
	public SkipInfoTypeUser getShipInfo(String shipID);
	
	public LondunTypeUser[] getCatchInfoByShipNumber(
	        BigDecimal shipNumber, Calendar from, Calendar to);
	
	public LondunTypeUser getCatchInfoByNumberAndPort(BigDecimal catchNumber, BigDecimal port);
	
	public AflamarkTypeUser[] getCatchQuota(BigDecimal shipNumber,  String period);
	
	public AflamarkTypeUser[] getCatchQuota(String personalID, String period);
	
	public LicenseCheckContainer getHasValidSeafaringLicense(String shipID);
	
	public LicenseCheckContainer getHasValidGeneralFishingLicense(String shipID);
	
	public LicenseCheckContainer getHasValidCoastFishingLicense(String shipID);
	
	public LicenseCheckContainer getHasValidQuotaLimitFishingLicense(String shipID);
	
}