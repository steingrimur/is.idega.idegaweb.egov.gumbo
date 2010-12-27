package is.idega.idegaweb.egov.gumbo.dao.impl;

import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.Inspector;
import is.idega.idegaweb.egov.gumbo.data.Office;
import is.idega.idegaweb.egov.gumbo.data.GumboViolationType;

import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.idega.core.persistence.impl.GenericDaoImpl;

@Repository("gumboDao")
@Transactional(readOnly = true)
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class GumboDaoImpl extends GenericDaoImpl implements GumboDao {

	public List<GumboViolationType> getViolationTypes() {
		return getEntityManager().createNamedQuery("violationType.findAll").getResultList();
	}
	
	public List<Office> getOffices() {
		return getEntityManager().createNamedQuery("office.findAll").getResultList();
	}
	
	public List<Inspector> getInspectors() {
		return getEntityManager().createNamedQuery("inspector.findAll").getResultList();
	}
}