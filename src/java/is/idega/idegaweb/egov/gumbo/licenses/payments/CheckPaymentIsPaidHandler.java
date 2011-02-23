package is.idega.idegaweb.egov.gumbo.licenses.payments;

import java.util.logging.Logger;

import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.licenses.SendLicenseFeeClaimHandler;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.FJSWSClient;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.block.process.business.CaseBusiness;
import com.idega.block.process.data.Case;
import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.egov.bpm.data.CaseProcInstBind;
import com.idega.idegaweb.egov.bpm.data.dao.CasesBPMDAO;
import com.idega.util.expression.ELUtil;

@Service("checkPaymentIsPaid")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CheckPaymentIsPaidHandler implements ActionHandler {

	private static final long serialVersionUID = -8258569213061637735L;

	@Autowired
	FJSWSClient client;

	@Autowired
	private CasesBPMDAO casesBPMDAO;

	private static final Logger LOGGER = Logger
			.getLogger(SendLicenseFeeClaimHandler.class.getName());

	@Override
	public void execute(ExecutionContext executionContext) throws Exception {
		String shipID = (String) executionContext
				.getVariable("string_vesselRegistryNr");
		String ssn = (String) executionContext
				.getVariable("string_ownerSocialNumber");

		executionContext
				.setVariable("paymentPaid", isClaimPaid(executionContext
						.getProcessInstance().getId(), ssn, shipID) ? "true" : "false");
	}

	private boolean isClaimPaid(long processInstanceId, String ssn, String shipID) throws Exception {
		System.out.println("Checking payment for ssn = " + ssn + ", ship = " + shipID);
		CaseProcInstBind bind = getCasesBPMDAO()
				.getCaseProcInstBindByProcessInstanceId(processInstanceId);
		if (bind == null) {
			LOGGER.warning("Case and process instance bind can not be found by process instance ID: "
					+ processInstanceId);
			return false;
		}

		Case theCase = getCaseBusiness().getCase(bind.getCaseId());
		if (theCase == null) {
			return false;
		}
		
		String claimNumber = theCase.getMetaData(GumboConstants.FJS_CLAIM_NUMBER_METADATA_KEY);
		if (claimNumber == null || "".equals(claimNumber)) {
			return false;
		}

		System.out.println("claim = " + claimNumber);
		
		return getFJSWSClient().getIsLicenseFeeClaimPaid(ssn, shipID, claimNumber);
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

	CasesBPMDAO getCasesBPMDAO() {
		if (casesBPMDAO == null) {
			ELUtil.getInstance().autowire(this);
		}
		return casesBPMDAO;
	}
	
	private FJSWSClient getFJSWSClient() {
		return client;
	}
}