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
@Table(name = ViolationDecision.ENTITY_NAME)
@NamedQueries({
	@NamedQuery(name = "violationDecision.findAll", query = "select v from ViolationDecision v order by ordering")
})
public class ViolationDecision implements Serializable {

	private static final long serialVersionUID = -5839261542328071009L;

	public static final String ENTITY_NAME = "gumbo_violation_decision";
	
	private static final String COLUMN_DECISION_ID = "decision_id";
	private static final String COLUMN_NAME = "name";
	private static final String COLUMN_ORDER = "ordering";
	
	@Id
	@Column(name = COLUMN_DECISION_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = COLUMN_NAME)
	private String name;
	
	@Column(name = COLUMN_ORDER)
	private Integer ordering;
	
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

	public Integer getOrdering() {
		return ordering;
	}

	public void setOrdering(Integer ordering) {
		this.ordering = ordering;
	}
}