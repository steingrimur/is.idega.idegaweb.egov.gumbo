package is.idega.idegaweb.egov.gumbo.data;

import com.idega.block.process.data.Case;
import com.idega.core.file.data.ICFile;
import com.idega.data.IDOEntity;

public interface CatchDelimiter extends IDOEntity, Case {

	/**
	 * @see is.idega.idegaweb.egov.gumbo.data.CatchDelimiterBMPBean#getShipID
	 */
	public Integer getShipID();
	
	/**
	 * @see is.idega.idegaweb.egov.gumbo.data.CatchDelimiterBMPBean#setShipID
	 */
	public void setShipID(Integer shipID);

	/**
	 * @see is.idega.idegaweb.egov.gumbo.data.CatchDelimiterBMPBean#getAttachment
	 */
	public ICFile getAttachment();

	/**
	 * @see is.idega.idegaweb.egov.gumbo.data.CatchDelimiterBMPBean#setAttachment
	 */
	public void setAttachment(ICFile attachment);

}