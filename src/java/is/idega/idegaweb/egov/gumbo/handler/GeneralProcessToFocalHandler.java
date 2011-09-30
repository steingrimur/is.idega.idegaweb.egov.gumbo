package is.idega.idegaweb.egov.gumbo.handler;

import is.idega.idegaweb.egov.gumbo.data.ProcessFocalCode;

import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.block.process.data.Case;
import com.idega.user.data.User;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Service("generalProcessToFocalHandler")
public class GeneralProcessToFocalHandler extends DefaultFocalHandler {

	private static final long serialVersionUID = 123543256773631726L;

	@Override
	public void execute(ExecutionContext executionContext) throws Exception {
		if (!isNeededToSendToFocal())
			return;

		Case theCase = getCase(executionContext);
		if (theCase == null) {
			getLogger().warning("Case can not be resolved!");
			return;
		}
		
		User owner = theCase.getOwner();
		if (owner == null) {
			getLogger().warning("There is no owner for the case with identifier: " + theCase.getCaseIdentifier());
			return;
		}
		
		String processDefinitionName = executionContext.getProcessDefinition().getName();
		ProcessFocalCode focalCode = getGumboDAO().getProcessFocalCode(processDefinitionName);
		
		String personalId = owner.getPersonalID();
		String name = owner.getDisplayName();
		createFocalCase(theCase, personalId, name, focalCode.getFocalProjectID(), focalCode.getFocalDocumentKey());
	}

}