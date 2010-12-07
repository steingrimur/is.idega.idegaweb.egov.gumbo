package is.idega.idegaweb.egov.gumbo.business;

import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Scope("session")
@Service("gumboSession")
public class GumboSession {

	public SkipInfoTypeUser ship;

	public SkipInfoTypeUser getShip() {
		return ship;
	}

	public void setShip(SkipInfoTypeUser ship) {
		this.ship = ship;
	}	
}