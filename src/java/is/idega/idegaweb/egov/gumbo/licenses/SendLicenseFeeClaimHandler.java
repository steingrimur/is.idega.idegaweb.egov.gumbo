package is.idega.idegaweb.egov.gumbo.licenses;

import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.ProcessPaymentLogHeader;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.FJSWSClient;

import java.util.logging.Logger;

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

@Service("sendLicenseFeeClaim")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class SendLicenseFeeClaimHandler implements ActionHandler {
	
	private static final long serialVersionUID = -4458929197838920551L;
	
	@Autowired
	FJSWSClient fjswsClient;
	
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
		
		System.out.println("processDefinition name = "
		        + executionContext.getProcessDefinition().getName());
		
		System.out.println("ship id "
		        + executionContext.getVariable("string_vesselRegistryNr"));
		System.out.println("payers personal id "
		        + executionContext.getVariable("string_ownerSocialNumber"));
		
		System.out.println("type of application "
		        + executionContext.getVariable("string_typeOfFishingLicense"));
		
		//create log header
		ProcessPaymentLogHeader header = this.getGumboDAO().createHeader();
		
		//get accounting keys for type. create log entries and claim
		
		//create license
		
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
	
	private GumboDao getGumboDAO() {
		return gumboDAO;
	}
}