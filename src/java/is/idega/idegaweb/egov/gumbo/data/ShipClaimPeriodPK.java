package is.idega.idegaweb.egov.gumbo.data;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

@Embeddable
public class ShipClaimPeriodPK implements Serializable {
	private static final long serialVersionUID = 2436617170886314327L;

	@Basic
	private String shipNr;
	
	@Basic
	private String personalID;
	
	public ShipClaimPeriodPK(String shipNr, String personalID) {
		this.shipNr = shipNr;
		this.personalID = personalID;
	}

	public boolean equals(Object object) {
		if (object instanceof ShipClaimPeriodPK) {
			ShipClaimPeriodPK pk = (ShipClaimPeriodPK) object;
			
			if (shipNr.equals(pk.shipNr) && personalID.equals(pk.personalID)) {
				return true;
			}
		} 
	
		return false;
	}
	
	public int hasCode() {
		return shipNr.hashCode() + personalID.hashCode();
	}
	
	public String getShipNr() {
		return shipNr;
	}

	public void setShipNr(String shipNr) {
		this.shipNr = shipNr;
	}

	public String getPersonalID() {
		return personalID;
	}

	public void setPersonalID(String personalID) {
		this.personalID = personalID;
	}
}