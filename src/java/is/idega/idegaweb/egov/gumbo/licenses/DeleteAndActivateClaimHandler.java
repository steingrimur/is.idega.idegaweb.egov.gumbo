package is.idega.idegaweb.egov.gumbo.licenses;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("deleteAndActivateClaim")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DeleteAndActivateClaimHandler implements ActionHandler {
	
	private static final long serialVersionUID = -4358095189973482870L;

	/*@Autowired
	private FJSWSClient fjswsClient;

	@Autowired
	private CasesBPMDAO casesBPMDAO;

	private static final Logger LOGGER = Logger
			.getLogger(DeleteAndActivateClaimHandler.class.getName());*/

	public void execute(ExecutionContext executionContext) throws Exception {
		executionContext.setVariable("paymentPaid", "true");

		/*boolean send = IWMainApplication.getDefaultIWApplicationContext()
		.getApplicationSettings()
		.getBoolean("dof_send_claim", true);

		if (!send) {
			return;
		}
		
		CaseProcInstBind bind = getCasesBPMDAO()
				.getCaseProcInstBindByProcessInstanceId(
						executionContext.getProcessInstance().getId());
		if (bind == null) {
			LOGGER.warning("Case and process instance bind can not be found by process instance ID: "
					+ executionContext.getProcessInstance().getId());
			return;
		}

		Case theCase = getCaseBusiness().getCase(bind.getCaseId());
		if (theCase == null) {
			return;
		}
		
		String claimKey = theCase.getMetaData(GumboConstants.FJS_CLAIM_NUMBER_METADATA_KEY);
		if (claimKey == null || "".equals(claimKey)) {
			return; //maybe this should be flagged?
		}
		
		boolean ret = getFJSWSClient().cancelLicenseFeeClaim(claimKey);
		
		if (!ret) {
			throw new GumboProcessException("Failed to cancel claim " + claimKey);
		}*/
	}

	/*private CaseBusiness getCaseBusiness() {
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

	private FJSWSClient getFJSWSClient() {
		return fjswsClient;
	}*/

}