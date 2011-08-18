package is.idega.idegaweb.egov.gumbo.licenses;

import java.io.File;
import java.util.Locale;
import java.util.logging.Level;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.block.form.action.ExecuteAction;
import com.idega.block.form.business.FormConverterToPDF;
import com.idega.block.form.data.dao.XFormsDAO;
import com.idega.core.business.DefaultSpringBean;
import com.idega.idegaweb.IWMainApplication;
import com.idega.presentation.IWContext;
import com.idega.slide.business.IWSlideService;
import com.idega.util.CoreConstants;
import com.idega.util.CoreUtil;
import com.idega.util.FileUtil;
import com.idega.util.SendMail;
import com.idega.util.StringUtil;
import com.idega.xformsmanager.business.DocumentManagerFactory;
import com.idega.xformsmanager.business.Form;
import com.idega.xformsmanager.business.Submission;
import com.idega.xformsmanager.component.beans.LocalizedStringBean;

@Service("fiskistofaLicensesUtil")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class LicensesUtil extends DefaultSpringBean {

	@Autowired
	private FormConverterToPDF xFormConverter;
	
	@Autowired
	private XFormsDAO xformsDAO;
	
	@Autowired
	private DocumentManagerFactory documentManager;
	
	//	TODO: finish up!
	public Boolean sendPDFByEmail(String to, String subject, String basedOnWarningValues) {
//		if (StringUtil.isEmpty(to) || StringUtil.isEmpty(subject))
//			return Boolean.FALSE;
		
		File xformInPDF = null;
		try {
			IWContext iwc = CoreUtil.getIWContext();
			if (iwc == null)
				return Boolean.FALSE;
			
			Object submissionId = iwc.getSessionAttribute(ExecuteAction.XFORM_SUBMISSION_UUID_PARAM);
			if (!(submissionId instanceof String))
				return Boolean.FALSE;
			String formSubmissionId = (String) submissionId;
			
			String pdfName = getLocalizedFormName(getFormSubmission(formSubmissionId), getCurrentLocale());
			
			boolean basedOnWarning = StringUtil.isEmpty(basedOnWarningValues) ? false : Boolean.valueOf(basedOnWarningValues);
			//	TODO
			
			String path = CoreConstants.CONTENT_PATH + "/xforms/pdf/" + formSubmissionId;
			String linkToPDF = xFormConverter.getGeneratedPDFFromXForm(null, null, formSubmissionId, path, pdfName, false);
			if (StringUtil.isEmpty(linkToPDF))
				return Boolean.FALSE;
			
			xformInPDF = new File(pdfName.concat(".pdf"));
			if (!xformInPDF.exists())
				xformInPDF.createNewFile();
			IWSlideService slide = getServiceInstance(IWSlideService.class);
			FileUtil.streamToFile(slide.getInputStream(linkToPDF), xformInPDF);
			SendMail.send("test@idega.com", "laddi@idega.com", null, null, null, subject, "XForm is attached", xformInPDF);
			
			return Boolean.TRUE;
		} catch (Exception e) {
			getLogger().log(Level.WARNING, "Error sending saved XForm in PDF by email", e);
		} finally {
			if (xformInPDF != null)
				xformInPDF.delete();
		}
		
		return Boolean.FALSE;
	}
	
	private String getLocalizedFormName(Submission submission, Locale locale) {
		Form form = null;
		try {
			form = submission.getXform();
		} catch(Exception e) {
			getLogger().log(Level.SEVERE, "Error getting XForm!", e);
		}
		if (form == null) {
			return "Unknown";
		}

		LocalizedStringBean title = null;
		try {
			title = documentManager.newDocumentManager(IWMainApplication.getDefaultIWMainApplication()).openFormLazy(form.getFormId()).getFormTitle();
		} catch(Exception e) {
			getLogger().log(Level.WARNING, "Error getting localized title for form: " + form.getFormId(), e);
		}

		return title == null ? form.getDisplayName() : title.getString(locale);
	}

	private Submission getFormSubmission(String formSubmissionUniqueId) throws Exception {
		return xformsDAO.getSubmissionBySubmissionUUID(formSubmissionUniqueId);
	}
	
}