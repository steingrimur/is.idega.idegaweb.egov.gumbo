package is.idega.idegaweb.egov.gumbo.bean;

import java.util.Date;

import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunAfliTypeUser;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeUser;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("gumboBean")
@Scope("request")
public class GumboBean {

	private SkipInfoTypeUser[] ships;
	private LondunTypeUser[] catches;
	private LondunAfliTypeUser[] catchInfo;
	
	private Date fromDate;
	private Date toDate;
	
	private String responseURL;

	public SkipInfoTypeUser[] getShips() {
		return ships;
	}

	public void setShips(SkipInfoTypeUser[] ships) {
		this.ships = ships;
	}

	public LondunTypeUser[] getCatches() {
		return catches;
	}

	public void setCatches(LondunTypeUser[] catches) {
		this.catches = catches;
	}

	public LondunAfliTypeUser[] getCatchInfo() {
		return catchInfo;
	}

	public void setCatchInfo(LondunAfliTypeUser[] catchInfo) {
		this.catchInfo = catchInfo;
	}

	public Date getFromDate() {
		return fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public Date getToDate() {
		return toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public String getResponseURL() {
		return responseURL;
	}

	public void setResponseURL(String responseURL) {
		this.responseURL = responseURL;
	}
}