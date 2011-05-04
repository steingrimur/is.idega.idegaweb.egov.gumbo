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
@Table(name = AquaEnvironment.ENTITY_NAME)
@NamedQueries({ @NamedQuery(name = "aquaEnvironment.findAll", query = "select a from AquaEnvironment a") })
public class AquaEnvironment {
	public static final String ENTITY_NAME = "aqua_environment";

	private static final String COLUMN_AQUA_ENVIRONMENT_ID = "aqua_environment_id";
	private static final String COLUMN_ENVIRONMENT_NAME = "environment_name";

	@Id
	@Column(name = COLUMN_AQUA_ENVIRONMENT_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@Column(name = COLUMN_ENVIRONMENT_NAME)
	private String environmentName;

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	public void setId(Long id) {
		this.id = id;
	}

	public String getEnvironmentName() {
		return environmentName;
	}

	public void setEnvironmentName(String name) {
		this.environmentName = name;
	}
}