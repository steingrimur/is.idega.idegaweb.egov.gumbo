package is.idega.idegaweb.egov.gumbo.pdf;

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

public class FishingLicensePrintingContext extends PrintingContextImpl {

	protected IWBundle iwb;
	protected IWResourceBundle iwrb;
	
	private String licenseType;

	public FishingLicensePrintingContext(IWApplicationContext iwac, String licenseType, String vesselNumber, Locale locale) {
		try {
			this.licenseType = licenseType;
			init(iwac, vesselNumber, locale);
		}
		catch (RemoteException re) {
			throw new IBORuntimeException(re);
		}
	}

	private void init(IWApplicationContext iwac, String vesselNumber, Locale locale) throws RemoteException {
		Map<String, Object> props = new HashMap<String, Object>();
		
		props.put(PrintingContext.IW_BUNDLE_ROPERTY_NAME, getBundle(iwac));
		props.put("iwrb", getResourceBundle(iwac, locale));
		props.put("vesselNumber", vesselNumber);

		setFileName(licenseType + "-" + vesselNumber + ".pdf");
		addDocumentProperties(props);

		String baseDirectory = getResourceRealPath(getBundle(iwac), locale);
		try {
			setResourceDirectory(FileUtil.getFileAndCreateRecursiveIfNotExists(baseDirectory));
			File file = FileUtil.getFileFromWorkspace(baseDirectory + "parking_card_template.xml");
			setTemplateStream(new FileInputStream(file));
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	protected String getResourceRealPath(IWBundle iwb, Locale locale) {
		String printFolder = iwb.getApplication().getSettings().getProperty("gumbo.fishing_license_folder", "/print/fishing_license/") + licenseType + "/";

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