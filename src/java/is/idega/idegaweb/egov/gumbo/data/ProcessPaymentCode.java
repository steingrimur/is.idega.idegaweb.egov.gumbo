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
	@NamedQuery(name = "processPaymentCode.findAll", query = "select p from ProcessPaymentCode p"),
	@NamedQuery(name = "processPaymentCode.findAllByProcessName", query = "select p from ProcessPaymentCode p where p.processName = :processName"),
	@NamedQuery(name = "processPaymentCode.findAllByProcessNameAndSubName", query = "select p from ProcessPaymentCode p where p.processName = :processName and p.subName = :subName")
})
public class ProcessPaymentCode implements Serializable {
	private static final long serialVersionUID = -7596351095320646602L;

	public static final String ENTITY_NAME = "gumbo_payment_code";

	private static final String COLUMN_PROCESS_PAYMENT_CODE_ID = "payment_code_id";
	private static final String COLUMN_PROCESS_NAME = "process_name";
	private static final String COLUMN_SUB_NAME = "sub_name";
	private static final String COLUMN_PAYMENT_CODE = "payment_code";
	private static final String COLUMN_AMOUNT = "amount";
	
	@Id
	@Column(name = COLUMN_PROCESS_PAYMENT_CODE_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = COLUMN_PROCESS_NAME)
	private String processName;

	@Column(name = COLUMN_SUB_NAME)
	private String subName;

	@Column(name = COLUMN_PAYMENT_CODE)
	private String paymentCode;

	@Column(name = COLUMN_AMOUNT)
	private Integer ordering;

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

	public String getPaymentCode() {
		return paymentCode;
	}

	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}

	public Integer getOrdering() {
		return ordering;
	}

	public void setOrdering(Integer ordering) {
		this.ordering = ordering;
	}

	

}