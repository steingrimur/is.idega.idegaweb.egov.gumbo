package is.idega.idegaweb.egov.gumbo.licenses;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("deleteAndRejectClaim")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class DeleteAndRejectClaimHandler implements ActionHandler {
	
	private static final long serialVersionUID = -1L;
	
	@Override
	public void execute(ExecutionContext executionContext) throws Exception {
		
		System.out.println("TODO: implement DeleteAndRejectClaimHandler");
	}
}