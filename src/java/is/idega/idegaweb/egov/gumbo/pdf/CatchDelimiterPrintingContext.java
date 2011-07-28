package is.idega.idegaweb.egov.gumbo.pdf;

import is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.AflaHeimildSkerdingAlltTypUser;
import is.idega.idegaweb.egov.application.bean.ApplicationBean;
import is.idega.idegaweb.egov.gumbo.GumboConstants;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.rmi.RemoteException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import com.idega.block.pdf.business.PrintingContext;
import com.idega.block.pdf.business.PrintingContextImpl;
import com.idega.business.IBORuntimeException;
import com.idega.idegaweb.IWApplicationContext;
import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.util.FileUtil;
import com.idega.util.IWTimestamp;

public class CatchDelimiterPrintingContext extends PrintingContextImpl {

	protected IWBundle iwb;
	protected IWResourceBundle iwrb;
	
	public CatchDelimiterPrintingContext(IWApplicationContext iwac, AflaHeimildSkerdingAlltTypUser shipInfo, ApplicationBean bean, Locale locale) {
		try {
			init(iwac, shipInfo, bean, locale);
		}
		catch (RemoteException re) {
			throw new IBORuntimeException(re);
		}
	}

	private void init(IWApplicationContext iwac, AflaHeimildSkerdingAlltTypUser shipInfo, ApplicationBean bean, Locale locale) throws RemoteException {
		Map<String, Object> props = new HashMap<String, Object>();
		
		props.put(PrintingContext.IW_BUNDLE_ROPERTY_NAME, getBundle(iwac));
		props.put("iwrb", getResourceBundle(iwac, locale));
		props.put("shipInfo", shipInfo);
		props.put("appBean", bean);
		props.put("date", new IWTimestamp().getLocaleDateAndTime(locale, IWTimestamp.SHORT, IWTimestamp.SHORT));
		
		addDocumentProperties(props);
		
		String resourceURL = iwac.getApplicationSettings().getProperty(GumboConstants.ATTRIBUTE_RESOURCE_URL, iwac.getDomain().getURL() + "content/files/public/pdf/");
		setResourceURL(resourceURL);

		String baseDirectory = getResourceRealPath(getBundle(iwac), locale);
		try {
			setResourceDirectory(FileUtil.getFileAndCreateRecursiveIfNotExists(baseDirectory));
			File file = FileUtil.getFileFromWorkspace(baseDirectory + "catch_delimiter_template.xml");
			setTemplateStream(new FileInputStream(file));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected String getResourceRealPath(IWBundle iwb, Locale locale) {
		String printFolder = iwb.getApplication().getSettings().getProperty("egov.print_template_folder", "/print/");

		if (locale != null) {
			return iwb.getResourcesRealPath(locale) + printFolder;
		}
		else {
			return iwb.getResourcesRealPath() + printFolder;
		}
	}

	protected FileInputStream getTemplateUrlAsStream(IWBundle iwb, Locale locale, String name, boolean createIfNotExists) throws IOException {
		File template = new File(getTemplateUrl(iwb, locale, name));
		return new FileInputStream(template);
	}

	protected String getTemplateUrl(IWBundle iwb, Locale locale, String name) {
		return getResourceRealPath(iwb, locale) + name;
	}

	private String getBundleIdentifier() {
		return GumboConstants.IW_BUNDLE_IDENTIFIER;
	}

	private IWBundle getBundle(IWApplicationContext iwac) {
		if (this.iwb == null) {
			this.iwb = iwac.getIWMainApplication().getBundle(getBundleIdentifier());
		}
		return this.iwb;
	}

	private IWResourceBundle getResourceBundle(IWApplicationContext iwac, Locale locale) {
		if (this.iwrb == null) {
			this.iwrb = getBundle(iwac).getResourceBundle(locale);
		}
		return this.iwrb;
	}
}