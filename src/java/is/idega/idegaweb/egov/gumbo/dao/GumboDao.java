package is.idega.idegaweb.egov.gumbo.dao;

import is.idega.idegaweb.egov.gumbo.data.Inspector;
import is.idega.idegaweb.egov.gumbo.data.Office;
import is.idega.idegaweb.egov.gumbo.data.ViolationType;

import java.util.List;

import com.idega.core.persistence.GenericDao;

public interface GumboDao extends GenericDao {

	public List<Inspector> getInspectors();
	public List<Office> getOffices();
	public List<ViolationType> getViolationTypes();

}