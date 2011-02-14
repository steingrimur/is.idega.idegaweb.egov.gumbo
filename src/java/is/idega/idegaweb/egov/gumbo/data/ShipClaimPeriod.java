package is.idega.idegaweb.egov.gumbo.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = ShipClaimPeriod.ENTITY_NAME)
@NamedQueries({
	@NamedQuery(name = "processPaymentCode.findByID", query = "select s from ShipClaimPeriod s where s.id = :id")
})
public class ShipClaimPeriod implements Serializable {

	private static final long serialVersionUID = 1485663552671951664L;

	public static final String ENTITY_NAME = "gumbo_ship_claim_period";

	private static final String COLUMN_WEEK = "week";
	private static final String COLUMN_YEAR = "year";
	private static final String COLUMN_PERIOD = "period";
	
	@EmbeddedId
	private ShipClaimPeriodPK id;
	
	@Column(name = COLUMN_WEEK)
	private int week;

	@Column(name = COLUMN_YEAR)
	private int year;

	@Column(name = COLUMN_PERIOD)
	private String period;

	public ShipClaimPeriodPK getId() {
		return id;
	}

	public void setId(ShipClaimPeriodPK id) {
		this.id = id;
	}

	public int getWeek() {
		return week;
	}

	public void setWeek(int week) {
		this.week = week;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}
}