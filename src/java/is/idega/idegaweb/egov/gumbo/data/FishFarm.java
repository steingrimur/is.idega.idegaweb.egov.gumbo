package is.idega.idegaweb.egov.gumbo.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = FishFarm.ENTITY_NAME)
@NamedQueries({
	@NamedQuery(name = "fishFarm.findAllByCompany", query = "select f from FishFarm f where f.companyID = :companyID and (f.hasFiledReport is null or f.hasFiledReport = false)")
})
public class FishFarm {
	public static final String ENTITY_NAME = "gumbo_fish_farm";

	private static final String COLUMN_FISH_FARM_ID = "fish_farm_id";
	private static final String COLUMN_COMPANY_ID = "company_id";
	private static final String COLUMN_PERMIT_NUBMER = "permit_number";
	private static final String COLUMN_NAME = "name";
	private static final String COLUMN_HAS_FILED_REPORT = "has_filed_report";
	
	@Id
	@Column(name = COLUMN_FISH_FARM_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = COLUMN_COMPANY_ID)
	private String companyID;

	@Column(name = COLUMN_PERMIT_NUBMER)
	private String permitNumber;

	@Column(name = COLUMN_NAME)
	private String name;

	@Column(name = COLUMN_HAS_FILED_REPORT)
	private boolean hasFiledReport;

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	public void setId(Long id) {
		this.id = id;
	}

	public String getCompanyID() {
		return companyID;
	}

	public void setCompanyID(String companyID) {
		this.companyID = companyID;
	}

	public String getPermitNumber() {
		return permitNumber;
	}

	public void setPermitNumber(String permitNumber) {
		this.permitNumber = permitNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isHasFiledReport() {
		return hasFiledReport;
	}

	public void setHasFiledReport(boolean hasFiledReport) {
		this.hasFiledReport = hasFiledReport;
	}	
}