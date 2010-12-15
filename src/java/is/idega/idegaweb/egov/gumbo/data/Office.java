package is.idega.idegaweb.egov.gumbo.data;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = Office.ENTITY_NAME)
@NamedQueries({
	@NamedQuery(name = "office.findAll", query = "select o from Office o order by name")
})
public class Office implements Serializable {

	private static final long serialVersionUID = 4326163550517142362L;

	public static final String ENTITY_NAME = "gumbo_office";
	
	private static final String COLUMN_OFFICE_ID = "office_id";
	private static final String COLUMN_NAME = "name";
	
	@Id
	@Column(name = COLUMN_OFFICE_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = COLUMN_NAME)
	private String name;
	
	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}