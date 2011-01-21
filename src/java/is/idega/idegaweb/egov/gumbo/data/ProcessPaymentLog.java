package is.idega.idegaweb.egov.gumbo.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = ProcessPaymentLog.ENTITY_NAME)
public class ProcessPaymentLog implements Serializable {
	private static final long serialVersionUID = 735619622590040183L;
	
	public static final String ENTITY_NAME = "gumbo_payment_log";

	private static final String COLUMN_PROCESS_PAYMENT_LOG_ID = "payment_log_id";
	private static final String COLUMN_PROCESS_PAYMENT_LOG_HEADER_ID = "header_id";
	
	
	@Id
	@Column(name = COLUMN_PROCESS_PAYMENT_LOG_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = ProcessPaymentLog.COLUMN_PROCESS_PAYMENT_LOG_HEADER_ID)
	private ProcessPaymentLogHeader header;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ProcessPaymentLogHeader getHeader() {
		return header;
	}

	public void setHeader(ProcessPaymentLogHeader header) {
		this.header = header;
	}
}