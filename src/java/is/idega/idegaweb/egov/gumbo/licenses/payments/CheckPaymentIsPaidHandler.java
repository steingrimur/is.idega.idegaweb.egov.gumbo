package is.idega.idegaweb.egov.gumbo.licenses.payments;

import java.util.Date;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.jbpm.time.CalendarOperations;

@Service("checkPaymentIsPaid")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class CheckPaymentIsPaidHandler implements ActionHandler {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void execute(ExecutionContext executionContext) throws Exception {
		
		executionContext.setVariable("paymentPaid",

		isPaymentPaid(executionContext.getProcessInstance().getId()) ? "true"
		        : "false"

		);
	}
	
	private boolean isPaymentPaid(long processInstanceId) {
		
		// TODO: implement
		
		return true;
	}
}