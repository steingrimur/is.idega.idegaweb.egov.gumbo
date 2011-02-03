package is.idega.idegaweb.egov.gumbo.business;

import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;
import is.idega.idegaweb.egov.gumbo.util.GumboUtil;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.company.data.Company;
import com.idega.core.accesscontrol.business.LoginSession;

@Scope("session")
@Service("gumboSession")
public class GumboSession {

	@Autowired
	private LoginSession loginSession;

	@Autowired
	private GumboBusiness business;
	
	@Autowired
	@Qualifier(DOFWSClient.WEB_SERVICE)
	private DOFWSClient client;
	
	private Company company;
	public SkipInfoTypeUser ship;
	public String season;
	
	public Company getCompany() {
		if (company == null) {
			company = business.getCompanyForUser(loginSession.getUser());
		}
		
		return company;
	}
	
	public void setCompany(Company company) {
		this.company = company;
	}

	public SkipInfoTypeUser getShip() {
		if (ship == null) {
			Company company = getCompany();
			if (company != null) {
				SkipInfoTypeUser[] ships = client.getShipInfoByCompanySSN(company.getPersonalID());
				if (ships != null && ships.length > 0) {
					ship = ships[0];
				}
			}
		}
		return ship;
	}

	public void setShip(SkipInfoTypeUser ship) {
		this.ship = ship;
	}

	public String getSeason() {
		if (season == null) {
			season = GumboUtil.getCurrentPeriod().getPeriod();
		}
		
		return season;
	}

	public void setSeason(String season) {
		this.season = season;
	}
}