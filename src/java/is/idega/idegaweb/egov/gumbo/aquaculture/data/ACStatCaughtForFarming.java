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
@Table(name = ACStatCaughtForFarming.ENTITY_NAME)
public class ACStatCaughtForFarming {
	public static final String ENTITY_NAME = "aqua_stat_caught_farming";

	private static final String COLUMN_ENTRY_ID = "entry_id";
	private static final String COLUMN_HEADER_ID = "header_id";
	
	private static final String COLUMN_CATEGORY = "category";
	private static final String COLUMN_TYPE = "species";
	private static final String COLUMN_UNITS_CAUGHT = "units_caught";
	private static final String COLUMN_WEIGHT = "weight";
	private static final String COLUMN_PRICE = "price";
	
	@Id
	@Column(name = ACStatCaughtForFarming.COLUMN_ENTRY_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = ACStatCaughtForFarming.COLUMN_HEADER_ID)
	private ACStatHeader header;

	@Column(name = ACStatCaughtForFarming.COLUMN_CATEGORY)
	private String category;
	
	@Column(name = ACStatCaughtForFarming.COLUMN_TYPE)
	private String type;

	@Column(name = ACStatCaughtForFarming.COLUMN_UNITS_CAUGHT)
	private String unitsCaught;
	
	@Column(name = ACStatCaughtForFarming.COLUMN_WEIGHT)
	private Float weight;

	@Column(name = ACStatCaughtForFarming.COLUMN_PRICE)
	private Float price;

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

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getUnitsCaught() {
		return unitsCaught;
	}

	public void setUnitsCaught(String unitsCaught) {
		this.unitsCaught = unitsCaught;
	}

	public Float getWeight() {
		return weight;
	}

	public void setWeight(Float weight) {
		this.weight = weight;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}	

}
