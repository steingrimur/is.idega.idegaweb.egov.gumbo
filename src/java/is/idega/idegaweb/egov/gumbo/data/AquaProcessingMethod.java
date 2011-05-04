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
@Table(name = AquaProcessingMethod.ENTITY_NAME)
@NamedQueries({ @NamedQuery(name = "aquaProcessingMethod.findAll", query = "select a from AquaProcessingMethod a") })
public class AquaProcessingMethod {
	public static final String ENTITY_NAME = "aqua_processing_method";

	private static final String COLUMN_AQUA_PROCESSING_METHOD_ID = "aqua_proc_meth_id";
	private static final String COLUMN_PROCESS_NAME = "processing_method_name";

	@Id
	@Column(name = COLUMN_AQUA_PROCESSING_METHOD_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = COLUMN_PROCESS_NAME)
	private String processingMethodName;

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	public void setId(Long id) {
		this.id = id;
	}

	public String getProcessingMethodName() {
		return processingMethodName;
	}

	public void setProcessingMethodName(String name) {
		this.processingMethodName = name;
	}
}