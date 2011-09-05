package is.idega.idegaweb.egov.gumbo.licenses;

import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.business.GumboProcessException;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.FJSWSClient;

import java.math.BigDecimal;
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
import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.egov.bpm.data.CaseProcInstBind;
import com.idega.idegaweb.egov.bpm.data.dao.CasesBPMDAO;

@Service("deleteAndRejectClaim")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DeleteAndRejectClaimHandler implements ActionHandler {
	private static final long serialVersionUID = -6502075369938767174L;

	@Autowired
	FJSWSClient fjswsClient;

	@Autowired
	private CasesBPMDAO casesBPMDAO;

	@Autowired
	@Qualifier(DOFWSClient.WEB_SERVICE)
	DOFWSClient client;

	private static final Logger LOGGER = Logger
			.getLogger(DeleteAndRejectClaimHandler.class.getName());
	
	public void execute(ExecutionContext executionContext) throws Exception {
		boolean send = IWMainApplication.getDefaultIWApplicationContext()
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
		}
		
		String licenseID = theCase.getMetaData(GumboConstants.DOF_FISHING_LICENSE_METADATA_KEY);
		getWSClient().cancelFishingLicense(new BigDecimal(licenseID));
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

	private FJSWSClient getFJSWSClient() {
		return fjswsClient;
	}
	
	private DOFWSClient getWSClient() {
		return client;
	}
}