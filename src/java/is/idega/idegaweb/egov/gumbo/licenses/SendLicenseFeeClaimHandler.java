package is.idega.idegaweb.egov.gumbo.licenses;

import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfagerdTypeUser;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.FJSWSClient;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Map;
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
		
		String processDefinitionName = executionContext.getProcessDefinition().getName();
		String shipID = (String)executionContext.getVariable("string_vesselRegistryNr");
		
		System.out.println("processDefinition name = " + processDefinitionName);
		System.out.println("ship id = " + shipID);
		System.out.println("payers personal id "
		        + executionContext.getVariable("string_ownerSocialNumber"));
		
		System.out.println("type of application "
		        + executionContext.getVariable("string_typeOfFishingLicense"));
		
		//create log header
		//ProcessPaymentLogHeader header = this.getGumboDAO().createHeader();
		
		//get accounting keys for type. create log entries and claim
		
		//create license
		if ("Grasleppa".equals(processDefinitionName)) {
			Timestamp fromStamp = (Timestamp) executionContext.getVariable("date_startOfFishing");
			String areaID = (String) executionContext.getVariable("string_fishingAreaId");
			System.out.println("from = " + fromStamp);
			System.out.println("areaID = " + areaID);
			IWTimestamp from = new IWTimestamp(fromStamp);
			Map<BigDecimal, VeidileyfagerdTypeUser> map = getWSClient().getGrasleppaAreas();
			int daysToAdd = 0;
			if (map != null && !map.isEmpty()) {
				VeidileyfagerdTypeUser item = map.get(new BigDecimal(areaID));
				if (item != null) {
					daysToAdd = item.getDagafjoldi().intValue() - 1;
				}
			}
			
			IWTimestamp to = new IWTimestamp(from);
			to.addDays(daysToAdd);
			
			System.out.println("to " + to.getDateString("dd.MM.yyyy"));
			
			BigDecimal ret = getWSClient().createFishingLicense(shipID, areaID, from, to, theCase.getUniqueId());
			System.out.println("license id = " + ret.intValue());
			getWSClient().activateFishingLicense(ret);
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