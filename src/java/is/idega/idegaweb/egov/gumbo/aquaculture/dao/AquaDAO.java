package is.idega.idegaweb.egov.gumbo.aquaculture.dao;

import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatHeader;

import com.idega.core.persistence.GenericDao;

public interface AquaDAO extends GenericDao {
	public ACStatHeader createHeader(String personalID, String name, String address, String farm, String year, String comment, boolean canSendInfo, String caseUniqueID);
}
