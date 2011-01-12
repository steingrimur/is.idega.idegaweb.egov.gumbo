package is.idega.idegaweb.egov.gumbo.data;

import is.idega.idegaweb.egov.gumbo.LetterType;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = Letter.ENTITY_NAME)
@NamedQueries({
	@NamedQuery(name = "letter.findAll", query = "select l from Letter l order by ordering"),
	@NamedQuery(name = "letter.findAllByType", query = "select l from Letter l where l.type = :type order by ordering")
})
public class Letter implements Serializable {

	public static final String ENTITY_NAME = "gumbo_letter";

	private static final String COLUMN_LETTER_ID = "letter_id";
	private static final String COLUMN_TYPE = "type";
	private static final String COLUMN_NAME = "name";
	private static final String COLUMN_LETTER_TEXT = "letter_text";
	private static final String COLUMN_ORDER = "ordering";

	@Id
	@Column(name = COLUMN_LETTER_ID)
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = COLUMN_TYPE)
	@Enumerated(EnumType.STRING)
	private LetterType type;
	
	@Column(name = COLUMN_NAME)
	private String name;
	
	@Column(name = COLUMN_LETTER_TEXT, length = 4000)
	private String text;
	
	@Column(name = COLUMN_ORDER)
	private Integer order;

	public Long getId() {
		return id;
	}

	@SuppressWarnings("unused")
	private void setId(Long id) {
		this.id = id;
	}

	public LetterType getType() {
		return type;
	}

	public void setType(LetterType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Integer getOrder() {
		return order;
	}

	public void setOrder(Integer order) {
		this.order = order;
	}
}