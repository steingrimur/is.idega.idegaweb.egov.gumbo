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
@Table(name = AquaFarmingType.ENTITY_NAME)
@NamedQueries({ @NamedQuery(name = "aquaFarmingType.findAll", query = "select a from AquaFarmingType a order by farmingTypeName") })
public class AquaFarmingType {
	public static final String ENTITY_NAME = "aqua_farming_type";

	private static final String COLUMN_AQUA_FARMING_TYPE_ID = "aqua_farming_type_id";
	private static final String COLUMN_FARMING_TYPE_NAME = "farming_type_name";

	@Id
	@Column(name = COLUMN_AQUA_FARMING_TYPE_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = COLUMN_FARMING_TYPE_NAME)
	private String farmingTypeName;

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}

	public String getFarmingTypeName() {
		return farmingTypeName;
	}

	public void setFarmingTypeName(String name) {
		this.farmingTypeName = name;
	}
}