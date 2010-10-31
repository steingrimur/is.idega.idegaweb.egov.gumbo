package is.idega.idegaweb.egov.gumbo.licenses;

import org.jbpm.JbpmContext;
import org.jbpm.JbpmException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.jbpm.BPMContext;
import com.idega.jbpm.JbpmCallback;
import com.idega.jbpm.presentation.beans.BpmSandbox.SandboxExecutable;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class LicenseFeeClaimReceived implements SandboxExecutable {
	
	@Autowired
	private BPMContext bpmContext;
	
	public void execute(final long tokenId) {
		
		getBpmContext().execute(new JbpmCallback() {
			public Object doInJbpm(JbpmContext context) throws JbpmException {
				
				context.getToken(tokenId).signal();
				return null;
			}
			
		});
	}
	
	private BPMContext getBpmContext() {
		return bpmContext;
	}
}