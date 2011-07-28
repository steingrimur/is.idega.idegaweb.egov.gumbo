package is.idega.idegaweb.egov.gumbo.data;

import com.idega.data.IDOFactory;
import javax.ejb.CreateException;
import javax.ejb.FinderException;

public class CatchDelimiterHomeImpl extends IDOFactory implements CatchDelimiterHome {

	public Class getEntityInterfaceClass() {
		return CatchDelimiter.class;
	}

	public CatchDelimiter create() throws CreateException {
		return (CatchDelimiter) super.createIDO();
	}

	public CatchDelimiter findByPrimaryKey(Object pk) throws FinderException {
		return (CatchDelimiter) super.findByPrimaryKeyIDO(pk);
	}
}