package is.idega.idegaweb.egov.gumbo.handler;

import is.idega.idegaweb.egov.gumbo.GumboConstants;

import java.util.Arrays;
import java.util.List;

import org.chiba.xml.xforms.exception.XFormsException;
import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.business.DefaultSpringBean;
import com.idega.core.contact.data.Email;
import com.idega.core.messaging.MessagingSettings;
import com.idega.core.persistence.Param;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.jbpm.data.Actor;
import com.idega.jbpm.data.NativeIdentityBind;
import com.idega.jbpm.data.dao.BPMDAO;
import com.idega.user.business.UserBusiness;
import com.idega.user.data.User;
import com.idega.util.CoreConstants;
import com.idega.util.ListUtil;
import com.idega.util.SendMail;
import com.idega.util.expression.ELUtil;

@Service("generalFiskistofaProcessClosedHandler")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class GeneralProcessClosedHandler extends DefaultSpringBean implements ActionHandler {

	private static final long serialVersionUID = 1570161998160891995L;

	private Long processInstanceId;
	
	@Autowired
	private BPMDAO bpmDAO;
	
	public void execute(ExecutionContext executionContext) throws Exception {
		Object closeMessage = executionContext.getVariable("string_closeMessage");
		if (closeMessage == null)
			throw new XFormsException("Closing message can not be resolved for process instance: " + getProcessInstanceId());
		
		Object caseIdentifier = executionContext.getVariable("string_caseIdentifier");
		
		List<Actor> creators = getBpmDAO().getResultList(Actor.getSetByRoleNamesAndPIId, Actor.class,
				new Param(Actor.processRoleNameProperty, Arrays.asList("bpm_general_gumbo_owner")),
				new Param(Actor.processInstanceIdProperty, getProcessInstanceId())
		);
		if (ListUtil.isEmpty(creators)) {
			getLogger().warning("No creators found for process instance " + getProcessInstanceId());
			return;
		}
		
		List<NativeIdentityBind> identities = creators.iterator().next().getNativeIdentities();
		if (ListUtil.isEmpty(identities))
			return;
		
		UserBusiness userBusiness = getServiceInstance(UserBusiness.class);
		User creator = userBusiness.getUser(Integer.valueOf(identities.iterator().next().getIdentityId()));
		if (creator == null)
			return;
		
		Email email = userBusiness.getEmailHome().findMainEmailForUser(creator);
		if (email == null)
			return;
		
		String from = getApplication().getSettings().getProperty(MessagingSettings.PROP_MESSAGEBOX_FROM_ADDRESS, "info@idega.com");
		IWResourceBundle iwrb = getResourceBundle(getBundle(GumboConstants.IW_BUNDLE_IDENTIFIER));
		String subject = (caseIdentifier == null ? CoreConstants.EMPTY : caseIdentifier.toString().concat(": "))
			.concat(iwrb.getLocalizedString("case_was_closed", "Case was closed"));
		SendMail.send(from, email.getEmailAddress(), null, null, null, subject, closeMessage.toString());
	}

	public Long getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(Long processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	BPMDAO getBpmDAO() {
		if (bpmDAO == null)
			ELUtil.getInstance().autowire(this);
		return bpmDAO;
	}
}