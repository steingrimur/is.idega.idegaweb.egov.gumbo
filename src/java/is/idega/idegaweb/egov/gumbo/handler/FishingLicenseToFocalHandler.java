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

@Service("fishingLicenseToFocalHandler")
@Scope("prototype")
public class FishingLicenseToFocalHandler extends SetProcessDescriptionHandler
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
		String send = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getProperty("dof_send_case_to_focal", "true");
		
		if (!"true".equals(send)) {
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

		System.out.println("Focal handler, case id " + theCase.getUniqueId());

		String processDefinitionName = context.getProcessDefinition().getName();
		String subType = (String) context
				.getVariable("string_typeOfFishingLicense");
		System.out.println("processDefinition name = " + processDefinitionName);
		System.out.println("subType = " + subType);

		ProcessFocalCode focalCode = (subType == null) ? getGumboDAO()
				.getProcessFocalCode(processDefinitionName) : getGumboDAO()
				.getProcessFocalCode(processDefinitionName, subType);

		String key = getFocalWSClient().createFocalCase(
				theCase.getPrimaryKey().toString(),
				theCase.getCaseIdentifier(), theCase.getSubject(),
				theCase.getOwner().getPersonalID(),
				theCase.getOwner().getDisplayName(),
				focalCode.getFocalProjectID(), focalCode.getFocalDocumentKey());

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