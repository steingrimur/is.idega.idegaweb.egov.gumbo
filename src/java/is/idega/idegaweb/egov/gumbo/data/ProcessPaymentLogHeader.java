package is.idega.idegaweb.egov.gumbo.data;

import java.io.Serializable;
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
@Table(name = ProcessPaymentLogHeader.ENTITY_NAME)
public class ProcessPaymentLogHeader implements Serializable {
	private static final long serialVersionUID = 1729438721605585029L;

	public static final String ENTITY_NAME = "gumbo_payment_log_header";

	private static final String COLUMN_PROCESS_PAYMENT_LOG_HEADER_ID = "payment_log_header_id";
	private static final String COLUMN_CREATED_DATE = "created_date";
	private static final String COLUMN_STATUS_CODE = "status_code";
	private static final String COLUMN_ERROR_MESSAGE = "error_message";
	private static final String COLUMN_EXTERNAL_KEY = "external_key";
	
	@Id
	@Column(name = COLUMN_PROCESS_PAYMENT_LOG_HEADER_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = ProcessPaymentLogHeader.COLUMN_CREATED_DATE)
	private Date createdDate;

	@Column(name = ProcessPaymentLogHeader.COLUMN_STATUS_CODE)
	private Long statusCode;

	@Column(name = ProcessPaymentLogHeader.COLUMN_ERROR_MESSAGE)
	private String errorMessage;

	@Column(name = ProcessPaymentLogHeader.COLUMN_EXTERNAL_KEY)
	private String externalKey;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(Long statusCode) {
		this.statusCode = statusCode;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getExternalKey() {
		return externalKey;
	}

	public void setExternalKey(String externalKey) {
		this.externalKey = externalKey;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public Date getCreatedDate() {
		return createdDate;
	}
}