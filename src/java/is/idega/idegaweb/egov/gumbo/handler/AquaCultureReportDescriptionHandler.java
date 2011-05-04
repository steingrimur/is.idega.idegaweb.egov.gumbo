package is.idega.idegaweb.egov.gumbo.handler;

import is.idega.idegaweb.egov.bpm.cases.actionhandlers.SetProcessDescriptionHandler;
import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.FishFarm;

import java.util.Locale;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.jbpm.graph.exe.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.core.accesscontrol.business.LoginSession;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.jbpm.exe.ProcessInstanceW;
import com.idega.presentation.IWContext;
import com.idega.util.CoreUtil;
import com.idega.util.expression.ELUtil;

@Service("aquaCultureReportDescriptionHandler")
@Scope("prototype")
public class AquaCultureReportDescriptionHandler extends SetProcessDescriptionHandler implements ActionHandler {
	
	@Autowired
	private GumboDao dao;
	
	public void execute(ExecutionContext context) throws Exception {
		final ProcessInstance pi = context.getProcessInstance();

		ProcessInstanceW piw = getBpmFactory()
				.getProcessManagerByProcessInstanceId(pi.getId())
				.getProcessInstance(pi.getId());

		Object value = context.getVariable("string_reportForTheFarm");
		if (!(value instanceof String)) {
			return;
		}
		
		FishFarm farm = getDao().getFishFarm(Long.parseLong(value.toString()));
		
		Locale locale = getCurrentLocale();
		IWResourceBundle iwrb = IWMainApplication.getDefaultIWMainApplication().getBundle(GumboConstants.IW_BUNDLE_IDENTIFIER).getResourceBundle(locale);

		String year = IWMainApplication.getDefaultIWApplicationContext().getApplicationSettings().getProperty(GumboConstants.PROPERTY_FISH_FARM_YEAR, "2010");
		String processDefinitionName = context.getProcessDefinition().getName();
		String processDescription = iwrb.getLocalizedString("process_description.aqua_culture", processDefinitionName) + " " + year + "-" + value + ": " + farm.getCompanyID();
		
		setCaseSubject(pi.getId(), processDescription, piw.getProcessDefinitionW().getProcessDefinition().getName());
	}
	
	protected Locale getCurrentLocale() {
		Locale locale = null;
		try {
			LoginSession loginSession = ELUtil.getInstance().getBean(LoginSession.class);
			locale = loginSession.getCurrentLocale();
		} catch (Exception e) {
		}
		
		if (locale == null) {
			IWContext iwc = CoreUtil.getIWContext();
			locale = iwc == null ? null : iwc.getCurrentLocale();
		}
		
		if (locale == null) {
			locale = IWMainApplication.getDefaultIWMainApplication().getDefaultLocale();
		}
		
		return locale == null ? Locale.ENGLISH : locale;
	}

	private GumboDao getDao() {
		return dao;
	}
}