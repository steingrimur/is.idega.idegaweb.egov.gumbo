package is.idega.idegaweb.egov.gumbo.data;

import is.idega.idegaweb.egov.gumbo.GumboConstants;

import java.util.Collection;

import com.idega.block.process.data.AbstractCaseBMPBean;
import com.idega.block.process.data.Case;
import com.idega.core.file.data.ICFile;
import com.idega.data.IDOAddRelationshipException;
import com.idega.data.IDORemoveRelationshipException;
import com.idega.user.data.User;

public class CatchDelimiterBMPBean extends AbstractCaseBMPBean implements Case, CatchDelimiter {

	private static final String ENTITY_NAME = "gumbo_catch_delimiter";
	
	private static final String COLUMN_FILE = "ic_file_id";
	private static final String COLUMN_SHIP = "ship_id";

	@Override
	public String getCaseCodeKey() {
		return GumboConstants.CATCH_DELIMITER_CASE_CODE;
	}

	@Override
	public String getCaseCodeDescription() {
		return null;
	}

	@Override
	public String getEntityName() {
		return ENTITY_NAME;
	}

	@Override
	public void initializeAttributes() {
		addGeneralCaseRelation();
		addAttribute(COLUMN_SHIP, "Ship", Integer.class);
		addManyToOneRelationship(COLUMN_FILE, ICFile.class);
	}
	
	public Integer getShipID() {
		return getIntegerColumnValue(COLUMN_SHIP);
	}
	
	public void setShipID(Integer shipID) {
		setColumn(COLUMN_SHIP, shipID);
	}

	public ICFile getAttachment() {
		return (ICFile) getColumnValue(COLUMN_FILE);
	}

	public void setAttachment(ICFile attachment) {
		setColumn(COLUMN_FILE, attachment);
	}

	public void addSubscriber(User subscriber) throws IDOAddRelationshipException {
	}

	public Collection<User> getSubscribers() {
		return null;
	}

	public void removeSubscriber(User subscriber) throws IDORemoveRelationshipException {
	}
}