package is.idega.idegaweb.egov.gumbo.licenses;

import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.business.GumboProcessException;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.FJSWSClient;

import java.math.BigDecimal;
import java.sql.Timestamp;
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
import com.idega.util.IWTimestamp;

@Service("sendLicenseFeeClaim")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class SendLicenseFeeClaimHandler implements ActionHandler {

	private static final long serialVersionUID = -4458929197838920551L;

	@Autowired
	FJSWSClient fjswsClient;

	@Autowired
	@Qualifier(DOFWSClient.WEB_SERVICE)
	DOFWSClient client;

	@Autowired
	private CasesBPMDAO casesBPMDAO;

	@Autowired
	private GumboDao gumboDAO;

	private static final Logger LOGGER = Logger
			.getLogger(SendLicenseFeeClaimHandler.class.getName());

	@Override
	public void execute(ExecutionContext executionContext) throws Exception {
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

		String processDefinitionName = executionContext.getProcessDefinition()
				.getName();
		String shipID = (String) executionContext
				.getVariable("string_vesselRegistryNr");
		String ssn = (String) executionContext
				.getVariable("string_ownerSocialNumber");
		String subType = (String) executionContext
				.getVariable("string_typeOfFishingLicense");

		// create license
		if ("Grasleppa".equals(processDefinitionName)) {
			Timestamp fromStamp = (Timestamp) executionContext
					.getVariable("date_startOfFishing");
			Timestamp toStamp = (Timestamp) executionContext
			.getVariable("date_endOfFishing");
			String areaID = (String) executionContext
					.getVariable("string_fishingAreaId");

			IWTimestamp from = new IWTimestamp(fromStamp);
			IWTimestamp to = new IWTimestamp(toStamp);

			BigDecimal ret = getWSClient().createFishingLicense(shipID, areaID,
					from, to, theCase.getPrimaryKey().toString());
			theCase.setMetaData(GumboConstants.DOF_FISHING_LICENSE_METADATA_KEY, ret.toString());

			if (ret.intValue() == -1) {
				throw new GumboProcessException("Error creating fishing license");				
			}
		}
		
		boolean send = IWMainApplication.getDefaultIWApplicationContext()
		.getApplicationSettings()
		.getBoolean("dof_send_claim", true);

		if (!send) {
			return;
		}
		
		// Create claim
		String claimKey = (subType == null) ? getFJSWSClient().createLicenseFeeClaim(ssn, shipID, getGumboDAO().getProcessPaymentCode(processDefinitionName)) : getFJSWSClient().createLicenseFeeClaim(ssn, shipID, getGumboDAO().getProcessPaymentCode(processDefinitionName, subType));
		
		//System.out.println("claimKey = " + claimKey);
		if (claimKey != null) {
			theCase.setMetaData(GumboConstants.FJS_CLAIM_NUMBER_METADATA_KEY, claimKey);
		} else {
			//throw some exception!!!!
			throw new GumboProcessException("Error registering the claim");
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

	private FJSWSClient getFJSWSClient() {
		return fjswsClient;
	}

	private DOFWSClient getWSClient() {
		return client;
	}

	private GumboDao getGumboDAO() {
		return gumboDAO;
	}
}