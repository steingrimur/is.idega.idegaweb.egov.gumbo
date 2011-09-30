package is.idega.idegaweb.egov.gumbo.handler;

import is.idega.idegaweb.egov.gumbo.data.ProcessFocalCode;

import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.block.process.data.Case;
import com.idega.user.data.User;

@Scope(BeanDefinition.SCOPE_PROTOTYPE)
@Service("fishingLicenseToFocalHandler")
public class FishingLicenseToFocalHandler extends DefaultFocalHandler {

	private static final long serialVersionUID = 3632172242499310898L;

	public void execute(ExecutionContext context) throws Exception {
		if (!isNeededToSendToFocal())
			return;

		Case theCase = getCase(context);
		if (theCase == null) {
			getLogger().warning("Case can not be resolved!");
			return;
		}

		getLogger().info("Focal handler, case id " + theCase.getUniqueId());

		String processDefinitionName = context.getProcessDefinition().getName();
		String subType = (String) context.getVariable("string_typeOfFishingLicense");

		ProcessFocalCode focalCode = (subType == null) ? getGumboDAO()
				.getProcessFocalCode(processDefinitionName) : getGumboDAO()
				.getProcessFocalCode(processDefinitionName, subType);

		User owner = theCase.getOwner();
		createFocalCase(theCase, owner.getPersonalID(), owner.getDisplayName(), focalCode.getFocalProjectID(), focalCode.getFocalDocumentKey());
	}
}