package is.idega.idegaweb.egov.gumbo.business;

import is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.AflaHeimildSkerdingAlltTypUser;
import is.idega.idegaweb.egov.application.bean.ApplicationBean;
import is.idega.idegaweb.egov.company.business.CompanyPortalBusiness;
import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.CatchDelimiter;
import is.idega.idegaweb.egov.gumbo.data.CatchDelimiterHome;
import is.idega.idegaweb.egov.gumbo.data.ProcessFocalCode;
import is.idega.idegaweb.egov.gumbo.pdf.CatchDelimiterPrintingContext;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.FocalWSClient;

import java.io.InputStream;
import java.io.OutputStream;
import java.rmi.RemoteException;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.FinderException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.block.pdf.business.PrintingService;
import com.idega.block.process.business.CaseBusiness;
import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.business.IBORuntimeException;
import com.idega.company.business.CompanyBusiness;
import com.idega.company.data.Company;
import com.idega.core.business.DefaultSpringBean;
import com.idega.core.file.data.ICFile;
import com.idega.core.file.data.ICFileHome;
import com.idega.core.file.util.MimeTypeUtil;
import com.idega.data.IDOLookup;
import com.idega.data.IDOLookupException;
import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.io.MemoryFileBuffer;
import com.idega.io.MemoryInputStream;
import com.idega.io.MemoryOutputStream;
import com.idega.user.data.Group;
import com.idega.user.data.User;
import com.idega.util.IWTimestamp;
import com.idega.util.expression.ELUtil;

@Service("gumboBusiness")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class GumboBusiness extends DefaultSpringBean {

	@Autowired
	private CompanyPortalBusiness companyBusiness;

	@Autowired
	FocalWSClient focalClient;

	@Autowired
	private GumboDao gumboDAO;

	public Company getCompanyForUser(User user) {
		if (user == null) {
			getLogger().warning("User is not provided, unable to resolve companies");
			return null;
		}

		List<Group> companies = getCompanyPortalBusiness().getAllUserCompanies(user);
		if (companies != null && companies.size() > 0) {
			Group group = companies.iterator().next();

			String personalID = group.getMetaData("COMPANY_PERSONAL_ID");
			if (personalID != null) {
				try {
					return getCompanyBusiness().getCompany(personalID);
				} catch (FinderException fe) {
					fe.printStackTrace();
				} catch (RemoteException re) {
					throw new IBORuntimeException(re);
				}
			}
		}

		return null;
	}

	private CompanyPortalBusiness getCompanyPortalBusiness() {
		if (this.companyBusiness == null) {
			ELUtil.getInstance().autowire(this);
		}

		return this.companyBusiness;
	}

	private FocalWSClient getFocalWSClient() {
		if (this.focalClient == null) {
			ELUtil.getInstance().autowire(this);
		}

		return focalClient;
	}

	private GumboDao getGumboDAO() {
		if (this.gumboDAO == null) {
			ELUtil.getInstance().autowire(this);
		}

		return gumboDAO;
	}

	private CompanyBusiness getCompanyBusiness() {
		try {
			return IBOLookup.getServiceInstance(IWMainApplication.getDefaultIWApplicationContext(), CompanyBusiness.class);
		}
		catch (IBOLookupException ile) {
			throw new IBORuntimeException(ile);
		}
	}

	private CaseBusiness getCaseBusiness() {
		try {
			return IBOLookup.getServiceInstance(IWMainApplication.getDefaultIWApplicationContext(), CaseBusiness.class);
		}
		catch (IBOLookupException ile) {
			throw new IBORuntimeException(ile);
		}
	}

	private CatchDelimiterHome getDelimiterHome() {
		try {
			return (CatchDelimiterHome) IDOLookup.getHome(CatchDelimiter.class);
		}
		catch (IDOLookupException ile) {
			throw new IBORuntimeException(ile);
		}
	}

	private ICFileHome getICFileHome() {
		try {
			return (ICFileHome) IDOLookup.getHome(ICFile.class);
		}
		catch (IDOLookupException ile) {
			throw new IBORuntimeException(ile);
		}
	}

	public CatchDelimiter getCatchDelimiter(Object pk) {
		try {
			return getDelimiterHome().findByPrimaryKey(new Integer(pk.toString()));
		}
		catch (FinderException fe) {
			fe.printStackTrace();
			return null;
		}
	}

	public void storeCatchDelimiterInfo(AflaHeimildSkerdingAlltTypUser shipInfo, ApplicationBean appBean, User performer) {
		try {
			IWBundle iwb = IWMainApplication.getDefaultIWMainApplication().getBundle(GumboConstants.IW_BUNDLE_IDENTIFIER);
			IWResourceBundle iwrb = iwb.getResourceBundle(IWMainApplication.getDefaultIWApplicationContext().getApplicationSettings().getDefaultLocale());

			String subject = iwrb.getLocalizedString("catch_delimiter.case_name", "Catch delimiter: ") + shipInfo.getSkipNr().toString();

			CatchDelimiter delimiter = getDelimiterHome().create();
			delimiter.setSubject(subject);
			delimiter.setOwner(performer);
			delimiter.setShipID(shipInfo.getSkipNr().intValue());
			delimiter.setCaseIdentifier(new IWTimestamp(delimiter.getCreated()).getDateString("yyyyMMddHHmmss") + "-" + delimiter.getShipID().toString());

			ICFile file = generatePDF(iwrb, shipInfo, appBean);
			delimiter.setAttachment(file);

			getCaseBusiness().changeCaseStatus(delimiter, getCaseBusiness().getCaseStatus("SHUT"), performer);

			ProcessFocalCode focalCode = getGumboDAO().getProcessFocalCode(GumboConstants.CATCH_DELIMITER_CASE_CODE);

			if (focalCode != null) {
				String key = getFocalWSClient().createFocalCase(
						delimiter.getPrimaryKey().toString(),
						delimiter.getCaseIdentifier(), delimiter.getSubject(),
						performer.getPersonalID(),
						performer.getDisplayName(),
						focalCode.getFocalProjectID(), focalCode.getFocalDocumentKey());

				if (key != null) {
					delimiter.setExternalId(key);
					delimiter.store();
				}
			}
		}

		catch (CreateException ce) {
			ce.printStackTrace();
		}
		catch (RemoteException re) {
			throw new IBORuntimeException(re);
		}
	}

	public ICFile generatePDF(IWResourceBundle iwrb, AflaHeimildSkerdingAlltTypUser shipInfo, ApplicationBean appBean) throws CreateException {
		CatchDelimiterPrintingContext context = new CatchDelimiterPrintingContext(IWMainApplication.getDefaultIWApplicationContext(), shipInfo, appBean, IWMainApplication.getDefaultIWApplicationContext().getApplicationSettings().getDefaultLocale());

		try {
			MemoryFileBuffer buffer = new MemoryFileBuffer();
			OutputStream mos = new MemoryOutputStream(buffer);
			InputStream mis = new MemoryInputStream(buffer);

			context.setDocumentStream(mos);

			getPrintingService().printDocument(context);

			ICFile file = createFile(null, iwrb.getLocalizedString("gumbo_delimiter.filename", "DelimiterValues-") + shipInfo.getSkipNr().toString(), mis, buffer.length());
			return file;
		}
		catch (RemoteException re) {
			throw new IBORuntimeException(re);
		}
	}

	private ICFile createFile(ICFile file, String fileName, InputStream is, int length) throws CreateException {
		if (file == null) {
			file = getICFileHome().create();
		}

		if (!fileName.endsWith(".pdf") && !fileName.endsWith(".PDF")) {
			fileName += ".pdf";
		}

		file.setFileValue(is);
		file.setMimeType(MimeTypeUtil.MIME_TYPE_PDF_2);

		file.setName(fileName);
		file.setFileSize(length);
		file.store();
		return file;
	}

	private PrintingService getPrintingService() {
		try {
			return (PrintingService) IBOLookup.getServiceInstance(IWMainApplication.getDefaultIWApplicationContext(), PrintingService.class);
		}
		catch (RemoteException e) {
			throw new IBORuntimeException(e.getMessage());
		}
	}

}