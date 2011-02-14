package is.idega.idegaweb.egov.gumbo.handler;

import is.idega.idegaweb.egov.bpm.cases.actionhandlers.SetProcessDescriptionHandler;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.jbpm.graph.exe.ProcessInstance;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.jbpm.exe.ProcessInstanceW;

@Service("fishingLicenseDescriptionHandler")
@Scope("prototype")
public class FishingLicenseDescriptionHandler extends SetProcessDescriptionHandler implements ActionHandler {
	
	public void execute(ExecutionContext context) throws Exception {
		final ProcessInstance pi = context.getProcessInstance();

		ProcessInstanceW piw = getBpmFactory()
				.getProcessManagerByProcessInstanceId(pi.getId())
				.getProcessInstance(pi.getId());

		Object value = context.getVariable("string_vesselRegistryNr");
		if (!(value instanceof String)) {
			return;
		}
		
		String processDefinitionName = context.getProcessDefinition().getName();
		String processDescription = processDefinitionName + ": " + value.toString();
		
		setCaseSubject(pi.getId(), processDescription, piw.getProcessDefinitionW().getProcessDefinition().getName());
	}
}