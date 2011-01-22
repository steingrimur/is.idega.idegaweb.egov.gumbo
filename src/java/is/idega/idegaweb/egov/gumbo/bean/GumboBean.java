package is.idega.idegaweb.egov.gumbo.bean;

import is.fiskistofa.webservices.aflamark.FSWebServiceAFLAMARK_wsdl.AflamarkTypeUser;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunAfliTypeUser;
import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeUser;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("gumboBean")
@Scope("request")
public class GumboBean {

	private Class eventHandler;
	
	private BigDecimal shipNumber;
	private String period;
	
	private SkipInfoTypeUser[] ships;
	private SkipInfoTypeUser shipInfo;
	private LondunTypeUser[] catches;
	private LondunTypeUser catchInfo;
	private LondunAfliTypeUser[] catchInfoResult;
	private AflamarkTypeUser[] catchQuota;
	
	private Date fromDate;
	private Date toDate;
	
	private String responseURL;
	private String catchesURL;

	public Class getEventHandler() {
		return eventHandler;
	}

	public void setEventHandler(Class eventHandler) {
		this.eventHandler = eventHandler;
	}

	public BigDecimal getShipNumber() {
		return shipNumber;
	}

	public void setShipNumber(BigDecimal shipNumber) {
		this.shipNumber = shipNumber;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public SkipInfoTypeUser[] getShips() {
		return ships;
	}

	public void setShips(SkipInfoTypeUser[] ships) {
		this.ships = ships;
	}

	public SkipInfoTypeUser getShipInfo() {
		return shipInfo;
	}

	public void setShipInfo(SkipInfoTypeUser shipInfo) {
		this.shipInfo = shipInfo;
	}

	public LondunTypeUser[] getCatches() {
		return catches;
	}

	public void setCatches(LondunTypeUser[] catches) {
		this.catches = catches;
	}

	public LondunTypeUser getCatchInfo() {
		return catchInfo;
	}

	public void setCatchInfo(LondunTypeUser catchInfo) {
		this.catchInfo = catchInfo;
	}

	public LondunAfliTypeUser[] getCatchInfoResult() {
		return catchInfoResult;
	}

	public void setCatchInfoResult(LondunAfliTypeUser[] catchInfoResult) {
		this.catchInfoResult = catchInfoResult;
	}

	public AflamarkTypeUser[] getCatchQuota() {
		return catchQuota;
	}

	public void setCatchQuota(AflamarkTypeUser[] catchQuota) {
		this.catchQuota = catchQuota;
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

	public String getCatchesURL() {
		return catchesURL;
	}

	public void setCatchesURL(String catchesURL) {
		this.catchesURL = catchesURL;
	}
}