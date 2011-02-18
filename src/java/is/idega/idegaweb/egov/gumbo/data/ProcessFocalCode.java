package is.idega.idegaweb.egov.gumbo.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = ProcessPaymentCode.ENTITY_NAME)
@NamedQueries({
	@NamedQuery(name = "processFocalCode.findAll", query = "select p from ProcessFocalCode p"),
	@NamedQuery(name = "processFocalCode.findAllByProcessName", query = "select p from ProcessFocalCode p where p.processName = :processName"),
	@NamedQuery(name = "processFocalCode.findAllByProcessNameAndSubName", query = "select p from ProcessFocalCode p where p.processName = :processName and p.subName = :subName")
})
public class ProcessFocalCode implements Serializable {
	private static final long serialVersionUID = -3786660304518810871L;

	public static final String ENTITY_NAME = "gumbo_focal_code";

	private static final String COLUMN_PROCESS_PAYMENT_CODE_ID = "focal_code_id";
	private static final String COLUMN_PROCESS_NAME = "process_name";
	private static final String COLUMN_SUB_NAME = "sub_name";
	private static final String COLUMN_FOCAL_PROJECT_ID = "focal_project_id";
	private static final String COLUMN_FOCAL_DOCUMENT_KEY = "focal_document_key";
	
	@Id
	@Column(name = COLUMN_PROCESS_PAYMENT_CODE_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = COLUMN_PROCESS_NAME)
	private String processName;

	@Column(name = COLUMN_SUB_NAME)
	private String subName;

	@Column(name = COLUMN_FOCAL_PROJECT_ID)
	private String focalProjectID;

	@Column(name = COLUMN_FOCAL_DOCUMENT_KEY)
	private String focalDocumentKey;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProcessName() {
		return processName;
	}

	public void setProcessName(String processName) {
		this.processName = processName;
	}

	public String getSubName() {
		return subName;
	}

	public void setSubName(String subName) {
		this.subName = subName;
	}

	public String getFocalProjectID() {
		return focalProjectID;
	}

	public void setFocalProjectID(String focalProjectID) {
		this.focalProjectID = focalProjectID;
	}

	public String getFocalDocumentKey() {
		return focalDocumentKey;
	}

	public void setFocalDocumentKey(String focalDocumentKey) {
		this.focalDocumentKey = focalDocumentKey;
	}
}