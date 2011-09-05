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
@Table(name = ACStatFarmingSpace.ENTITY_NAME)
public class ACStatFarmingSpace {
	public static final String ENTITY_NAME = "aqua_stat_farm_space";

	private static final String COLUMN_ENTRY_ID = "entry_id";
	private static final String COLUMN_HEADER_ID = "header_id";
	
	private static final String COLUMN_CATEGORY = "category";
	private static final String COLUMN_METHOD = "method";
	private static final String COLUMN_ENVIRONMENT = "environment";
	private static final String COLUMN_SIZE = "size";
	private static final String COLUMN_UNIT = "unit";

	@Id
	@Column(name = ACStatFarmingSpace.COLUMN_ENTRY_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = ACStatFarmingSpace.COLUMN_HEADER_ID)
	private ACStatHeader header;

	@Column(name = ACStatFarmingSpace.COLUMN_CATEGORY)
	private String category;

	@Column(name = ACStatFarmingSpace.COLUMN_METHOD)
	private String method;

	@Column(name = ACStatFarmingSpace.COLUMN_ENVIRONMENT)
	private String environment;

	@Column(name = ACStatFarmingSpace.COLUMN_SIZE)
	private String size;

	@Column(name = ACStatFarmingSpace.COLUMN_UNIT)
	private String unit;

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

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}	
}