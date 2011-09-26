package is.idega.idegaweb.egov.gumbo.data;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = FocalCase.ENTITY_NAME)
@NamedQueries({
	@NamedQuery(name = "focalCase.findByCaseUniqueID", query = "select f from FocalCase f where f.caseUniqueID = :caseUniqueID and (f.error is null or f.error = false)"),
	@NamedQuery(name = "focalCase.findByFocalCaseID", query = "select f from FocalCase f where f.focalCaseID = :focalCaseID and (f.error is null or f.error = false)")
})
public class FocalCase {
	public static final String ENTITY_NAME = "gumbo_sent_to_focal";

	private static final String COLUMN_FOCAL_CASE_ID = "focal_case_id";
	private static final String COLUMN_SENT_DATE = "sent_date";
	private static final String COLUMN_CASE_UNIQUE_ID = "case_unique_id";
	private static final String COLUMN_NUMBER_OF_ATTACHMENTS = "number_of_attachments";
	private static final String COLUMN_ERROR_IN_SENDING = "error_sending";
	private static final String COLUMN_ERROR_MESSAGE = "error_message";
	
	@Id
	@Column(name = FocalCase.COLUMN_FOCAL_CASE_ID)
	private String focalCaseID;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = FocalCase.COLUMN_SENT_DATE)
	private Date sentDate;

	@Column(name = FocalCase.COLUMN_CASE_UNIQUE_ID)
	private String caseUniqueID;

	@Column(name = FocalCase.COLUMN_NUMBER_OF_ATTACHMENTS)
	private Long numberOfAttachments;

	@Column(name = FocalCase.COLUMN_ERROR_IN_SENDING)
	private boolean error;

	@Column(name = FocalCase.COLUMN_ERROR_MESSAGE, length = 1000)
	private String errorMessage;

	
	public String getFocalCaseID() {
		return focalCaseID;
	}

	public void setFocalCaseID(String focalCaseID) {
		this.focalCaseID = focalCaseID;
	}

	public Date getSentDate() {
		return sentDate;
	}

	public void setSentDate(Date sentDate) {
		this.sentDate = sentDate;
	}

	public String getCaseUniqueID() {
		return caseUniqueID;
	}

	public void setCaseUniqueID(String caseUniqueID) {
		this.caseUniqueID = caseUniqueID;
	}

	public Long getNumberOfAttachments() {
		return numberOfAttachments;
	}

	public void setNumberOfAttachments(Long numberOfAttachments) {
		this.numberOfAttachments = numberOfAttachments;
	}

	public Boolean getError() {
		return error;
	}

	public void setError(Boolean error) {
		this.error = error;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
}