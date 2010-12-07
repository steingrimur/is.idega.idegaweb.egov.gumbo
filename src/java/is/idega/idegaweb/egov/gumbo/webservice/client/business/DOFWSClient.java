package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.AflamarkTypeUser;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunAfliTypeUser;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeUser;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;

import java.math.BigDecimal;
import java.util.Calendar;

public interface DOFWSClient {
	
	public static final String MOCK = "mock";
	public static final String WEB_SERVICE = "webservice";
	
	public abstract SkipInfoTypeUser[] getShipInfoByCompanySSN(String companySSN);
	
	public abstract SkipInfoTypeUser getShipInfo(String shipID);
	
	public abstract LondunTypeUser[] getCatchInfoByShipNumber(
	        BigDecimal shipNumber, Calendar from, Calendar to);
	
	public abstract LondunAfliTypeUser[] getCatchInfoByNumberAndPort(
	        BigDecimal catchNumber, BigDecimal port);
	
	public abstract AflamarkTypeUser[] getCatchQuota(BigDecimal shipNumber,
	        String period);
	
	public AflamarkTypeUser[] getCatchQuota(String personalID, String period);
	
	public abstract boolean getHasValidSeafaringLicense(String shipID);
	
	public abstract boolean getHasValidGeneralFishingLicense(String shipID);
	
	public abstract boolean getHasValidCoastFishingLicense(String shipID);
	
	public abstract boolean getHasValidQuotaLimitFishingLicense(String shipID);
	
}