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
	
	private static final String COLUMN_PAYERS_PERSONAL_ID = "payers_personal_id";
	private static final String COLUMN_SHIP_NUMBER = "ship_number";
	private static final String COLUMN_PERIOD = "period";
	private static final String COLUMN_PAYMENT_CODE = "payment_code";
	private static final String COLUMN_NUMBER_OF_UNITS = "number_of_units";
	private static final String COLUMN_UNIT_PRICE = "unit_price";
	private static final String COLUMN_AMOUNT = "amount";
	private static final String COLUMN_CANCEL_CLAIM_KEY = "cancel_claim_key";
	
	@Id
	@Column(name = COLUMN_PROCESS_PAYMENT_LOG_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = ProcessPaymentLog.COLUMN_PROCESS_PAYMENT_LOG_HEADER_ID)
	private ProcessPaymentLogHeader header;
	
	@Column(name = ProcessPaymentLog.COLUMN_PAYERS_PERSONAL_ID)
	private String payersPersonalID;

	@Column(name = ProcessPaymentLog.COLUMN_SHIP_NUMBER)
	private String shipNumber;

	@Column(name = ProcessPaymentLog.COLUMN_PERIOD)
	private String period;

	@Column(name = ProcessPaymentLog.COLUMN_PAYMENT_CODE)
	private String paymentCode;

	@Column(name = ProcessPaymentLog.COLUMN_NUMBER_OF_UNITS)
	private Integer numberOfUnits;

	@Column(name = ProcessPaymentLog.COLUMN_UNIT_PRICE)
	private Integer unitPrice;

	@Column(name = ProcessPaymentLog.COLUMN_AMOUNT)
	private Integer amount;

	@Column(name = ProcessPaymentLog.COLUMN_CANCEL_CLAIM_KEY)
	private String claimKeyToCancel;

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

	public String getPayersPersonalID() {
		return payersPersonalID;
	}

	public void setPayersPersonalID(String payersPersonalID) {
		this.payersPersonalID = payersPersonalID;
	}

	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getPaymentCode() {
		return paymentCode;
	}

	public void setPaymentCode(String paymentCode) {
		this.paymentCode = paymentCode;
	}

	public Integer getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(Integer numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public String getShipNumber() {
		return shipNumber;
	}

	public void setShipNumber(String shipNumber) {
		this.shipNumber = shipNumber;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getClaimKeyToCancel() {
		return claimKeyToCancel;
	}

	public void setClaimKeyToCancel(String claimKeyToCancel) {
		this.claimKeyToCancel = claimKeyToCancel;
	}
}