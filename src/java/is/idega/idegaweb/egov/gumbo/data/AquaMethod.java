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
@Table(name = AquaMethod.ENTITY_NAME)
@NamedQueries({ @NamedQuery(name = "aquaMethod.findAll", query = "select a from AquaMethod a order by methodName") })
public class AquaMethod {
	public static final String ENTITY_NAME = "aqua_method";

	private static final String COLUMN_AQUA_METHOD_ID = "aqua_method_id";
	private static final String COLUMN_METHOD_NAME = "method_name";
	private static final String COLUMN_UNIT = "unit";
	private static final String COLUMN_UNIT_LABEL = "unit_label";

	@Id
	@Column(name = COLUMN_AQUA_METHOD_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = COLUMN_METHOD_NAME)
	private String methodName;

	@Column(name = COLUMN_UNIT)
	private String unit;

	@Column(name = COLUMN_UNIT_LABEL)
	private String unitLabel;

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String name) {
		this.methodName = name;
	}

	public String getUnit() {
		return unit;
	}

	public void setUnit(String unit) {
		this.unit = unit;
	}

	public String getUnitLabel() {
		return unitLabel;
	}

	public void setUnitLabel(String unitLabel) {
		this.unitLabel = unitLabel;
	}

}