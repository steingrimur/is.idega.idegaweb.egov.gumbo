package is.idega.idegaweb.egov.gumbo.bean;

import is.fiskistofa.webservices.landanir.FSWebServiceLANDANIR_wsdl.LondunTypeUser;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("gumboBean")
@Scope("request")
public class GumboBean {

	private SkipInfoTypeUser[] ships;
	private LondunTypeUser[] catches;

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
}