package is.idega.idegaweb.egov.gumbo.handler;

import is.idega.idegaweb.egov.gumbo.business.GumboProcessException;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.FocalWSClient;

import java.rmi.RemoteException;
import java.util.logging.Level;

import javax.ejb.FinderException;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;

import com.idega.block.process.business.CaseBusiness;
import com.idega.block.process.data.Case;
import com.idega.core.business.DefaultSpringBean;
import com.idega.idegaweb.egov.bpm.data.CaseProcInstBind;
import com.idega.idegaweb.egov.bpm.data.dao.CasesBPMDAO;
import com.idega.util.StringUtil;
import com.idega.util.expression.ELUtil;

public abstract class DefaultFocalHandler extends DefaultSpringBean implements ActionHandler {
	
	private static final long serialVersionUID = -2072142176722960783L;

	@Autowired
	private CasesBPMDAO casesBPMDAO;

	@Autowired
	private FocalWSClient focalClient;

	@Autowired
	private GumboDao gumboDAO;
	
	private Long processInstanceId;
	
	public CasesBPMDAO getCasesBPMDAO() {
		if (casesBPMDAO == null)
			ELUtil.getInstance().autowire(this);
		return casesBPMDAO;
	}

	public void setCasesBPMDAO(CasesBPMDAO casesBPMDAO) {
		this.casesBPMDAO = casesBPMDAO;
	}

	public FocalWSClient getFocalClient() {
		if (focalClient == null)
			ELUtil.getInstance().autowire(this);
		return focalClient;
	}

	public void setFocalClient(FocalWSClient focalClient) {
		this.focalClient = focalClient;
	}

	public GumboDao getGumboDAO() {
		if (gumboDAO == null)
			ELUtil.getInstance().autowire(this);
		return gumboDAO;
	}

	public void setGumboDAO(GumboDao gumboDAO) {
		this.gumboDAO = gumboDAO;
	}

	public Long getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(Long processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	protected boolean isNeededToSendToFocal() {
		return getApplication().getSettings().getBoolean("dof_send_case_to_focal", true);
	}

	protected Case getCase(ExecutionContext context) {
		return getCase(context.getProcessInstance().getId());
	}
	
	protected Case getCase(Long processInstanceId) {
		CaseProcInstBind bind = getCasesBPMDAO().getCaseProcInstBindByProcessInstanceId(processInstanceId);
		if (bind == null)
			return null;
		
		CaseBusiness caseBusiness = getServiceInstance(CaseBusiness.class);
		try {
			return caseBusiness.getCase(bind.getCaseId());
		} catch (RemoteException e) {
			getLogger().log(Level.WARNING, "Error getting case by ID: " + bind.getCaseId(), e);
		} catch (FinderException e) {
			getLogger().warning("Case by ID " + bind.getCaseId() + " was not found");
		}
		
		return null;
	}
	
	protected void createFocalCase(Case theCase, String personalId, String name, String focalProjectId, String documentKey) throws GumboProcessException {
		String key = getFocalClient().createFocalCase(
				theCase.getPrimaryKey().toString(),
				theCase.getCaseIdentifier(),
				theCase.getSubject(),
				personalId,
				name,
				focalProjectId,
				documentKey
		);
		
		if (StringUtil.isEmpty(key))
			throw new GumboProcessException("Error sending case to focal");

		theCase.setExternalId(key);
		theCase.store();
	}
}