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
@Table(name = ACStatInventory.ENTITY_NAME)
public class ACStatInventory {
	public static final String ENTITY_NAME = "aqua_stat_inventory";

	private static final String COLUMN_ENTRY_ID = "entry_id";
	private static final String COLUMN_HEADER_ID = "header_id";
	
	private static final String COLUMN_CATEGORY = "category";
	private static final String COLUMN_TYPE = "type";
	private static final String COLUMN_NUMBER_OF_UNITS = "number_of_units";
	private static final String COLUMN_UNIT = "unit";
	private static final String COLUMN_COMMENT = "comment";

	@Id
	@Column(name = ACStatInventory.COLUMN_ENTRY_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = ACStatInventory.COLUMN_HEADER_ID)
	private ACStatHeader header;

	@Column(name = ACStatInventory.COLUMN_CATEGORY)
	private String category;
	
	@Column(name = ACStatInventory.COLUMN_TYPE)
	private String type;

	@Column(name = ACStatInventory.COLUMN_NUMBER_OF_UNITS)
	private String numberOfUnits;

	@Column(name = ACStatInventory.COLUMN_UNIT)
	private String unit;

	@Column(name = ACStatInventory.COLUMN_COMMENT)
	private String comment;
	
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}	

}
