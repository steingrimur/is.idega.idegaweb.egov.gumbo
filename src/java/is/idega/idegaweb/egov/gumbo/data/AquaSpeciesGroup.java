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
@Table(name = AquaSpeciesGroup.ENTITY_NAME)
@NamedQueries({ @NamedQuery(name = "aquaSpeciesGroup.findAll", query = "select a from AquaSpeciesGroup a") })
public class AquaSpeciesGroup {
	public static final String ENTITY_NAME = "aqua_species_group";

	private static final String COLUMN_AQUA_SPECIES_GROUP_ID = "aqua_species_group_id";
	private static final String COLUMN_SPECIES_GROUP_NAME = "species_group_name";
	private static final String COLUMN_QUANTITY_UNIT = "quantity_unit";
	private static final String COLUMN_QUANTITY_UNIT_LABEL = "quantity_unit_label";
	private static final String COLUMN_PRICE_UNIT = "price_unit";
	private static final String COLUMN_PRICE_UNIT_LABEL = "price_unit_label";

	@Id
	@Column(name = COLUMN_AQUA_SPECIES_GROUP_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = COLUMN_SPECIES_GROUP_NAME)
	private String speciesGroupName;

	@Column(name = COLUMN_QUANTITY_UNIT)
	private String quantityUnit;

	@Column(name = COLUMN_QUANTITY_UNIT_LABEL)
	private String quantityUnitLabel;
	
	@Column(name = COLUMN_PRICE_UNIT)
	private String priceUnit;

	@Column(name = COLUMN_PRICE_UNIT_LABEL)
	private String priceUnitLabel;

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	public void setId(Long id) {
		this.id = id;
	}

	public String getSpeciesGroupName() {
		return speciesGroupName;
	}

	public void setSpeciesGroupName(String name) {
		this.speciesGroupName = name;
	}

	public String getQuantityUnit() {
		return quantityUnit;
	}

	public void setQuantityUnit(String quantityUnit) {
		this.quantityUnit = quantityUnit;
	}

	public String getPriceUnit() {
		return priceUnit;
	}

	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public String getQuantityUnitLabel() {
		return quantityUnitLabel;
	}

	public void setQuantityUnitLabel(String quantityUnitLabel) {
		this.quantityUnitLabel = quantityUnitLabel;
	}

	public String getPriceUnitLabel() {
		return priceUnitLabel;
	}

	public void setPriceUnitLabel(String priceUnitLabel) {
		this.priceUnitLabel = priceUnitLabel;
	}
}