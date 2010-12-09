package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.AflamarkTypeUser;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeUser;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;
import is.idega.idegaweb.egov.gumbo.GumboConstants;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.util.CoreConstants;
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
	
	@Override
	public LicenseCheckContainer getHasValidCoastFishingLicense(String shipID) {
		return new LicenseCheckContainer(false,
		        "Error message from getHasValidCoastFishingLicense");
	}
	
	@Override
	public LicenseCheckContainer getHasValidQuotaLimitFishingLicense(
	        String shipID) {
		return new LicenseCheckContainer(false,
		        "Error message from getHasValidQuotaLimitFishingLicense");
	}
	
	@Override
	public LicenseCheckContainer getHasRevokedFishingLicense(String shipID) {
		
		return new LicenseCheckContainer(true,
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
	public String getFishingAreaForDraganotaveidi(String shipId) {		
		return "Fishing area for draganotaveidi";
	}
	
	@Override
	public String getFishingArea(String shipId, Timestamp validFrom) {	
		return "13th fishing zone";
	}
}