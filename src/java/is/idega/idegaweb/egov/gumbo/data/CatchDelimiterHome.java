package is.idega.idegaweb.egov.gumbo.data;


import javax.ejb.CreateException;
import com.idega.data.IDOHome;
import javax.ejb.FinderException;

public interface CatchDelimiterHome extends IDOHome {
	public CatchDelimiter create() throws CreateException;

	public CatchDelimiter findByPrimaryKey(Object pk) throws FinderException;
}