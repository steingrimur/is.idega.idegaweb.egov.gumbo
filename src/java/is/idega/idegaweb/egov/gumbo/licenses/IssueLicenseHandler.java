package is.idega.idegaweb.egov.gumbo.licenses;

import is.idega.idegaweb.egov.gumbo.pdf.GumboPDFGenerator;

import java.io.InputStream;
import java.util.Locale;
import java.util.logging.Level;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.jbpm.graph.exe.Token;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.block.process.variables.Variable;
import com.idega.bpm.pdf.presentation.BPMTaskPDFViewer;
import com.idega.core.business.DefaultSpringBean;
import com.idega.jbpm.exe.BPMFactory;
import com.idega.jbpm.exe.ProcessInstanceW;
import com.idega.jbpm.exe.TaskInstanceW;
import com.idega.jbpm.variables.BinaryVariable;
import com.idega.jbpm.view.ViewSubmission;
import com.idega.util.CoreUtil;
import com.idega.util.IOUtil;
import com.idega.util.IWCalendar;
import com.idega.util.expression.ELUtil;

@Service("issueLicense")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class IssueLicenseHandler extends DefaultSpringBean implements ActionHandler {
	
	private static final long serialVersionUID = -5597355896728844176L;

	private String taskName;
	
	private boolean submitted;

	@Autowired
	private GumboPDFGenerator pdfGenerator;

	@Autowired
	private BPMFactory bpmFactory;

	public void execute(ExecutionContext ectx) throws Exception {
		Token tkn = ectx.getToken();
		Long tokenId = tkn.getId();
		Long processInstanceId = tkn.getProcessInstance().getId();
		
		ProcessInstanceW piw = getBpmFactory().getProcessManagerByProcessInstanceId(processInstanceId).getProcessInstance(processInstanceId);
		TaskInstanceW tiw = piw.getTaskMgmtInstance().createTask(getTaskName(), tokenId);
		
		createFishingLicense(ectx, tiw);
	}
	
	protected boolean createFishingLicense(ExecutionContext ectx, TaskInstanceW tiw) {
		InputStream parkingCard = null;
		try {
			Locale locale = getCurrentLocale();

			String licenseType = ectx.getProcessDefinition().getName();
			String vesselNumber = (String) ectx.getVariable("string_vesselRegistryNr");
			
			Variable variable = Variable.parseDefaultStringRepresentation(BPMTaskPDFViewer.DOCUMENT_VARIABLE_NAME);
			IWCalendar calendar = new IWCalendar();
			StringBuffer fileNameBuffer = new StringBuffer(licenseType).append("-").append(vesselNumber)
				.append(calendar.getLocaleDate(IWCalendar.SHORT)).append(".pdf");
	
			String fileName = fileNameBuffer.toString();
			String description = fileName;
			parkingCard = getPDFGenerator().generateFishingLicensePDF(licenseType, vesselNumber, locale);
			BinaryVariable binaryVariable = tiw.addAttachment(variable, fileName, description, parkingCard);
	
			if (!isSubmitted()) {
				binaryVariable.setHidden(true);
				binaryVariable.update();
				
				ViewSubmission viewSubmission = getBpmFactory().getViewSubmission();
				viewSubmission.setTaskInstanceId(tiw.getTaskInstanceId());
				tiw.submit(viewSubmission);
			}
			
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
	
	public BPMFactory getBpmFactory() {
		if (bpmFactory == null) {
			ELUtil.getInstance().autowire(this);
		}
		return bpmFactory;
	}
	
	public void setBpmFactory(BPMFactory bpmFactory) {
		this.bpmFactory = bpmFactory;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	private GumboPDFGenerator getPDFGenerator() {
		return pdfGenerator;
	}
	
	protected boolean isSubmitted() {
		return submitted;
	}

	protected void setSubmitted(boolean submitted) {
		this.submitted = submitted;
	}
}