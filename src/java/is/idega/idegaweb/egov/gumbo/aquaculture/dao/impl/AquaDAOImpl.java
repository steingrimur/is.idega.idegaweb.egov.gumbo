package is.idega.idegaweb.egov.gumbo.aquaculture.dao.impl;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import is.idega.idegaweb.egov.gumbo.aquaculture.dao.AquaDAO;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatHeader;

import com.idega.core.persistence.impl.GenericDaoImpl;

@Repository("aquaDao")
@Transactional(readOnly = true)
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AquaDAOImpl extends GenericDaoImpl implements AquaDAO {

	@Transactional(readOnly = false)
	public ACStatHeader createHeader(String personalID, String name,
			String address, String farm, String year, String comment,
			boolean canSendInfo, String caseUniqueID) {
		ACStatHeader header = new ACStatHeader();
		header.setPersonalID(personalID);
		header.setName(name);
		header.setAddress(address);
		header.setFarm(farm);
		header.setYear(year);
		header.setComment(comment);
		header.setSendInfo(canSendInfo);
		header.setCaseUniqueID(caseUniqueID);
		
		getEntityManager().persist(header);
		
		return header;
	}
}