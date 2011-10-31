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
@Table(name = ViolationType.ENTITY_NAME)
@NamedQueries({
	@NamedQuery(name = "violationType.findAll", query = "select v from ViolationType v order by number"),
	@NamedQuery(name = ViolationType.QUERY_FIND_BY_IDS, query = "select v from ViolationType v where v.id in (:violationTypeIds) order by v.number")
})
public class ViolationType implements Serializable {

	private static final long serialVersionUID = -5944248282131055723L;

	public static final String ENTITY_NAME = "gumbo_violation_type";
	
	private static final String COLUMN_VIOLATION_TYPE_ID = "violation_type_id";
	private static final String COLUMN_NAME = "name";
	private static final String COLUMN_NUMBER = "violation_number";
	private static final String COLUMN_DEPTH = "depth";
	
	public static final String QUERY_FIND_BY_IDS = "gumboViolationTypes.findByIds";
	
	@Id
	@Column(name = COLUMN_VIOLATION_TYPE_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = COLUMN_NAME, length = 255)
	private String name;
	
	@Column(name = COLUMN_NUMBER)
	private String number;
	
	@Column(name = COLUMN_DEPTH)
	private int depth;
	
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

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getDepth() {
		return depth;
	}

	public void setDepth(int depth) {
		this.depth = depth;
	}
}