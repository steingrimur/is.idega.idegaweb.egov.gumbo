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
@Table(name = AquaSpecies.ENTITY_NAME)
@NamedQueries({ @NamedQuery(name = "aquaSpecies.findAll", query = "select a from AquaSpecies a order by speciesName") })
public class AquaSpecies {
	public static final String ENTITY_NAME = "aqua_species";

	private static final String COLUMN_AQUA_SPECIES_ID = "aqua_species_id";
	private static final String COLUMN_SPECIES_NAME = "species_name";

	@Id
	@Column(name = COLUMN_AQUA_SPECIES_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = COLUMN_SPECIES_NAME)
	private String speciesName;

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}

	public String getSpeciesName() {
		return speciesName;
	}

	public void setSpeciesName(String name) {
		this.speciesName = name;
	}
}