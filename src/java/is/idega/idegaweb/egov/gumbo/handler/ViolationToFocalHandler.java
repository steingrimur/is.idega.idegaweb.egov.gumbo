package is.idega.idegaweb.egov.gumbo.handler;

import is.idega.idegaweb.egov.bpm.cases.actionhandlers.SetProcessDescriptionHandler;
import is.idega.idegaweb.egov.gumbo.business.GumboProcessException;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.ProcessFocalCode;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.FocalWSClient;

import java.util.logging.Logger;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.block.process.business.CaseBusiness;
import com.idega.block.process.data.Case;
import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.egov.bpm.data.CaseProcInstBind;
import com.idega.idegaweb.egov.bpm.data.dao.CasesBPMDAO;

@Service("violationToFocalHandler")
@Scope("prototype")
public class ViolationToFocalHandler extends SetProcessDescriptionHandler
		implements ActionHandler {

	@Autowired
	private CasesBPMDAO casesBPMDAO;

	@Autowired
	FocalWSClient focalClient;

	@Autowired
	private GumboDao gumboDAO;

	private static final Logger LOGGER = Logger
			.getLogger(FishingLicenseToFocalHandler.class.getName());

	public void execute(ExecutionContext context) throws Exception {
		boolean send = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getBoolean("dof_send_case_to_focal", true);
		
		if (!send) {
			return;
		}

		CaseProcInstBind bind = getCasesBPMDAO()
				.getCaseProcInstBindByProcessInstanceId(
						context.getProcessInstance().getId());
		if (bind == null) {
			LOGGER.warning("Case and process instance bind can not be found by process instance ID: "
					+ context.getProcessInstance().getId());
			return;
		}

		Case theCase = getCaseBusiness().getCase(bind.getCaseId());
		if (theCase == null) {
			return;
		}

		String processDefinitionName = context.getProcessDefinition().getName();
		String types = (String) context.getVariable("string_violationTypesSummary");

		ProcessFocalCode focalCode = getGumboDAO().getProcessFocalCode(processDefinitionName);

		StringBuilder documentKey = new StringBuilder(focalCode.getFocalDocumentKey());
		documentKey.append(".");

		String t[] = types.trim().replaceAll("-", "").replaceAll("\\s", "").split("\\.");
		
		documentKey.append(t[0]);
		
		String key = getFocalWSClient().createFocalCase(
				theCase.getPrimaryKey().toString(),
				theCase.getCaseIdentifier(), theCase.getSubject(),
				theCase.getOwner().getPersonalID(),
				theCase.getOwner().getDisplayName(),
				focalCode.getFocalProjectID(), documentKey.toString());

		if (key == null || "".equals(key)) {
			throw new GumboProcessException("Error sending case to focal");
		}

		theCase.setExternalId(key);
		theCase.store();
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

	private FocalWSClient getFocalWSClient() {
		return focalClient;
	}

	private GumboDao getGumboDAO() {
		return gumboDAO;
	}
}