package is.idega.idegaweb.egov.gumbo.licenses;

import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfiTypeUser;
import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.pdf.GumboPDFGenerator;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import java.io.InputStream;
import java.math.BigDecimal;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.block.process.business.CaseBusiness;
import com.idega.block.process.data.Case;
import com.idega.block.process.variables.Variable;
import com.idega.bpm.pdf.presentation.BPMTaskPDFViewer;
import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.business.IBORuntimeException;
import com.idega.company.business.CompanyBusiness;
import com.idega.company.data.Company;
import com.idega.core.business.DefaultSpringBean;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.idegaweb.egov.bpm.data.CaseProcInstBind;
import com.idega.idegaweb.egov.bpm.data.dao.CasesBPMDAO;
import com.idega.jbpm.exe.BPMFactory;
import com.idega.jbpm.exe.TaskInstanceW;
import com.idega.util.CoreUtil;
import com.idega.util.IOUtil;
import com.idega.util.IWTimestamp;
import com.idega.util.expression.ELUtil;

@Service("issueLicense")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class IssueLicenseHandler extends DefaultSpringBean implements ActionHandler {
	
	private static final long serialVersionUID = -5597355896728844176L;

	private static final Logger LOGGER = Logger.getLogger(IssueLicenseHandler.class.getName());

	private Long taskInstance;
	
	private boolean updateDOF = true;

	@Autowired
	private GumboPDFGenerator pdfGenerator;

	@Autowired
	private BPMFactory bpmFactory;

	@Autowired
	private CasesBPMDAO casesBPMDAO;
	
	@Autowired
	@Qualifier(DOFWSClient.WEB_SERVICE)
	DOFWSClient client;

	public void execute(ExecutionContext ectx) throws Exception {
		TaskInstanceW tiw = getBpmFactory().getTaskInstanceW(getTaskInstance());
		
		createFishingLicense(ectx, tiw);
	}
	
	protected boolean createFishingLicense(ExecutionContext ectx, TaskInstanceW tiw) {
		InputStream parkingCard = null;
		try {
			Locale locale = getCurrentLocale();

			CaseProcInstBind bind = getCasesBPMDAO()
	        .getCaseProcInstBindByProcessInstanceId(
	        		ectx.getProcessInstance().getId());
			if (bind == null) {
				LOGGER.warning("Case and process instance bind can not be found by process instance ID: "
				        + ectx.getProcessInstance().getId());
				return false;
			}
			
			Case theCase = getCaseBusiness().getCase(bind.getCaseId());
			if (theCase == null) {
				return false;
			}
			
			String licenseID = theCase.getMetaData(GumboConstants.DOF_FISHING_LICENSE_METADATA_KEY);

			if (getUpdateDOF()) {
				getWSClient().activateFishingLicense(new BigDecimal(licenseID));
			}
			
			IWResourceBundle iwrb = IWMainApplication.getDefaultIWMainApplication().getBundle(GumboConstants.IW_BUNDLE_IDENTIFIER).getResourceBundle(locale);

			String licenseType = ectx.getProcessDefinition().getName();
			String vesselNumber = (String) ectx.getVariable("string_vesselRegistryNr");
			String subType = (String) ectx.getVariable("string_typeOfFishingLicense");
			
			VeidileyfiTypeUser license = licenseID != null ? getWSClient().getFishingLicenseInfo(new BigDecimal(licenseID)) : null;
			SkipInfoTypeUser ship = getWSClient().getShipInfo(vesselNumber);
			Company fishery = getCompanyBusiness().getCompany(ship.getUtgerdKt());

			Variable variable = Variable.parseDefaultStringRepresentation(BPMTaskPDFViewer.DOCUMENT_VARIABLE_NAME);
			StringBuffer fileNameBuffer = new StringBuffer(iwrb.getLocalizedString("fishing_license_filename." + licenseType, licenseType));
			if (subType != null) {
				fileNameBuffer.append("-").append(iwrb.getLocalizedString("fishing_license_subtype." + subType, subType));
			}
			fileNameBuffer.append("-").append(vesselNumber)
				.append("-").append(IWTimestamp.RightNow().getDateString("dd.MM.yyyy HH:mm")).append(".pdf");
	
			String fileName = fileNameBuffer.toString();
			String description = fileName;
			parkingCard = getPDFGenerator().generateFishingLicensePDF(licenseType, subType, license, fishery, ship, locale);
			tiw.addAttachment(variable, fileName, description, parkingCard);
			
			return true;
		} catch (Exception e) {
			String message = "Error creating fishing license (PDF file) for task: " + tiw;
			getLogger().log(Level.SEVERE, message, e);
			CoreUtil.sendExceptionNotification(message, e);
			
			throw new RuntimeException(message, e);
		} finally {
			IOUtil.close(parkingCard);
		}
	}
	
	CaseBusiness getCaseBusiness() {
		try {
			return IBOLookup.getServiceInstance(
			    IWMainApplication.getDefaultIWApplicationContext(),
			    CaseBusiness.class);
		} catch (IBOLookupException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	private CasesBPMDAO getCasesBPMDAO() {
		return casesBPMDAO;
	}
	
	public BPMFactory getBpmFactory() {
		if (bpmFactory == null) {
			ELUtil.getInstance().autowire(this);
		}
		return bpmFactory;
	}
	
	private DOFWSClient getWSClient() {
		return client;
	}

	private CompanyBusiness getCompanyBusiness() {
		try {
			return IBOLookup.getServiceInstance(IWMainApplication.getDefaultIWApplicationContext(), CompanyBusiness.class);
		}
		catch (IBOLookupException ile) {
			throw new IBORuntimeException(ile);
		}
	}
	
	public void setBpmFactory(BPMFactory bpmFactory) {
		this.bpmFactory = bpmFactory;
	}
	
	private GumboPDFGenerator getPDFGenerator() {
		return pdfGenerator;
	}

	public Long getTaskInstance() {
		return taskInstance;
	}

	public void setTaskInstance(Long taskInstance) {
		this.taskInstance = taskInstance;
	}
	
	public boolean getUpdateDOF() {
		return updateDOF;
	}

	public void setUpdateDOF(boolean updateDOF) {
		this.updateDOF = updateDOF;
	}
}