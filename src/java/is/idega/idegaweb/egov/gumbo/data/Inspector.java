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
@Table(name = Inspector.ENTITY_NAME)
@NamedQueries({
	@NamedQuery(name = "inspector.findAll", query = "select i from Inspector i where active = 1 order by name")
})
public class Inspector implements Serializable {

	private static final long serialVersionUID = -4807138313643030145L;

	public static final String ENTITY_NAME = "gumbo_inspector";
	
	private static final String COLUMN_INSPECTOR_ID = "inspector_id";
	private static final String COLUMN_NUMBER = "inspector_number";
	private static final String COLUMN_NAME = "name";
	private static final String COLUMN_ACTIVE = "active";
	
	@Id
	@Column(name = COLUMN_INSPECTOR_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = COLUMN_NUMBER)
	private Integer number;
	
	@Column(name = COLUMN_NAME)
	private String name;
	
	@Column(name = COLUMN_ACTIVE) 
	private boolean active;

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public boolean getActive() {
		return active;
	}
}