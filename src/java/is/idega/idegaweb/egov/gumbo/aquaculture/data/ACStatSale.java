package is.idega.idegaweb.egov.gumbo.aquaculture.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = ACStatSale.ENTITY_NAME)
public class ACStatSale {
	public static final String ENTITY_NAME = "aqua_stat_sale";

	private static final String COLUMN_ENTRY_ID = "entry_id";
	private static final String COLUMN_HEADER_ID = "header_id";
	
	private static final String COLUMN_CATEGORY = "category";
	private static final String COLUMN_METHOD = "method";
	private static final String COLUMN_ENVIRONMENT = "environment";
	private static final String COLUMN_TYPE = "species";
	private static final String COLUMN_PROCESS = "process";
	private static final String COLUMN_CONDITION = "condition";
	private static final String COLUMN_NUMBER_OF_UNITS = "number_of_units";
	private static final String COLUMN_UNIT = "unit";
	private static final String COLUMN_PRICE_PR_UNIT = "unit_price";
	private static final String COLUMN_PRICE_UNIT = "price_unit";
	private static final String COLUMN_AMOUNT = "amount";
	private static final String COLUMN_SOLD_TO = "sold_to_country";
	private static final String COLUMN_BUYERS_PERSONAL_ID = "buyers_personal_id";
	private static final String COLUMN_BUYERS_NAME = "buyers_name";
	private static final String COLUMN_FARM = "farm";
	
	@Id
	@Column(name = ACStatSale.COLUMN_ENTRY_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = ACStatSale.COLUMN_HEADER_ID)
	private ACStatHeader header;

	@Column(name = ACStatSale.COLUMN_CATEGORY)
	private String category;
	
	@Column(name = ACStatSale.COLUMN_METHOD)
	private String method;

	@Column(name = ACStatSale.COLUMN_ENVIRONMENT)
	private String environment;

	@Column(name = ACStatSale.COLUMN_TYPE)
	private String type;

	@Column(name = ACStatSale.COLUMN_PROCESS)
	private String process;

	@Column(name = ACStatSale.COLUMN_CONDITION)
	private String condition;

	@Column(name = ACStatSale.COLUMN_NUMBER_OF_UNITS)
	private String numberOfUnits;

	@Column(name = ACStatSale.COLUMN_UNIT)
	private String unit;

	@Column(name = ACStatSale.COLUMN_PRICE_PR_UNIT)
	private String pricePrUnit;

	@Column(name = ACStatSale.COLUMN_PRICE_UNIT)
	private String priceUnit;

	@Column(name = ACStatSale.COLUMN_AMOUNT)
	private String amount;

	@Column(name = ACStatSale.COLUMN_SOLD_TO)
	private String soldTo;

	@Column(name = ACStatSale.COLUMN_BUYERS_PERSONAL_ID)
	private String buyersPersonalID;

	@Column(name = ACStatSale.COLUMN_BUYERS_NAME)
	private String buyersName;

	@Column(name = ACStatSale.COLUMN_FARM)
	private String farm;

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getMethod() {
		return method;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getProcess() {
		return process;
	}

	public void setProcess(String process) {
		this.process = process;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public String getNumberOfUnits() {
		return numberOfUnits;
	}

	public void setNumberOfUnits(String numberOfUnits) {
		this.numberOfUnits = numberOfUnits;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getPricePrUnit() {
		return pricePrUnit;
	}

	public void setPricePrUnit(String pricePrUnit) {
		this.pricePrUnit = pricePrUnit;
	}

	public String getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public String getSoldTo() {
		return soldTo;
	}

	public void setSoldTo(String soldTo) {
		this.soldTo = soldTo;
	}

	public String getBuyersPersonalID() {
		return buyersPersonalID;
	}

	public void setBuyersPersonalID(String buyersPersonalID) {
		this.buyersPersonalID = buyersPersonalID;
	}

	public String getBuyersName() {
		return buyersName;
	}

	public void setBuyersName(String buyersName) {
		this.buyersName = buyersName;
	}

	public String getFarm() {
		return farm;
	}

	public void setFarm(String farm) {
		this.farm = farm;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ACStatHeader getHeader() {
		return header;
	}

	public void setHeader(ACStatHeader header) {
		this.header = header;
	}	

}
