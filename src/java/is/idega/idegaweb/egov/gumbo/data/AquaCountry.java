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
@Table(name = AquaCountry.ENTITY_NAME)
@NamedQueries({
	@NamedQuery(name = "aquaCountry.findAll", query = "select a from AquaCountry a order by countryName"),
	@NamedQuery(name = AquaCountry.QUERY_FIND_BY_ID, query = "select c from AquaCountry c where c.id = :" + AquaCountry.PARAMETER_COUNTRY_ID)
})
public class AquaCountry {
	
	public static final String ENTITY_NAME = "aqua_country",
	
								QUERY_FIND_BY_ID = "aquaContry.findById",
								
								PARAMETER_COUNTRY_ID = "country_id";

	private static final String COLUMN_AQUA_COUNTRY_ID = "aqua_country_id";
	private static final String COLUMN_COUNTRY_NAME = "country_name";

	@Id
	@Column(name = COLUMN_AQUA_COUNTRY_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = COLUMN_COUNTRY_NAME)
	private String countryName;

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String name) {
		this.countryName = name;
	}
}