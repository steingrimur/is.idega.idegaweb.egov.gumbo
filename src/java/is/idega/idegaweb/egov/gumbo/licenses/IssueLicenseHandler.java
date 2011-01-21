package is.idega.idegaweb.egov.gumbo.licenses;

import is.idega.idegaweb.egov.gumbo.webservice.client.business.FJSWSClient;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("issueLicense")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class IssueLicenseHandler implements ActionHandler {
	
	private static final long serialVersionUID = -5597355896728844176L;

	@Autowired
	FJSWSClient client;
	
	@Override
	public void execute(ExecutionContext executionContext) throws Exception {
		//executionContext.get
		System.out.println("would issue license");
	}
}