package is.idega.idegaweb.egov.gumbo.aquaculture.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = ACStatHeader.ENTITY_NAME)
public class ACStatHeader {
	public static final String ENTITY_NAME = "aqua_stat_header";

	private static final String COLUMN_HEADER_ID = "header_id";
	private static final String COLUMN_CREATED_DATE = "created_date";
	private static final String COLUMN_PERSONAL_ID = "personal_id";
	private static final String COLUMN_NAME = "name";
	private static final String COLUMN_ADDRESS = "address";
	private static final String COLUMN_YEAR = "year";
	private static final String COLUMN_FARM = "farm";
	private static final String COLUMN_COMMENT = "comment";
	private static final String COLUMN_CAN_SEND_INFO = "can_send_info";
	
	private static final String COLUMN_CASE_UNIQUE_ID = "case_unique_id";
	
	private static final String COLUMN_DELETED = "deleted";

	@Id
	@Column(name = ACStatHeader.COLUMN_HEADER_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = ACStatHeader.COLUMN_CREATED_DATE)
	private Date createdDate;

	@Column(name = ACStatHeader.COLUMN_PERSONAL_ID)
	private String personalID;

	@Column(name = ACStatHeader.COLUMN_NAME)
	private String name;

	@Column(name = ACStatHeader.COLUMN_ADDRESS)
	private String address;

	@Column(name = ACStatHeader.COLUMN_YEAR)
	private String year;

	@Column(name = ACStatHeader.COLUMN_FARM)
	private String farm;

	@Column(name = ACStatHeader.COLUMN_COMMENT)
	private String comment;

	@Column(name = ACStatHeader.COLUMN_CAN_SEND_INFO)
	private boolean sendInfo;

	@Column(name = ACStatHeader.COLUMN_CASE_UNIQUE_ID)
	private String caseUniqueID;
	
	@Column(name = ACStatHeader.COLUMN_DELETED)
	private boolean deleted;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getPersonalID() {
		return personalID;
	}

	public void setPersonalID(String personalID) {
		this.personalID = personalID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public boolean getSendInfo() {
		return sendInfo;
	}

	public void setSendInfo(boolean sendInfo) {
		this.sendInfo = sendInfo;
	}

	public String getFarm() {
		return farm;
	}

	public void setFarm(String farm) {
		this.farm = farm;
	}

	public boolean getDeleted() {
		return deleted;
	}

	public void setDeleted(boolean deleted) {
		this.deleted = deleted;
	}

	public String getCaseUniqueID() {
		return caseUniqueID;
	}

	public void setCaseUniqueID(String caseUniqueID) {
		this.caseUniqueID = caseUniqueID;
	}
}