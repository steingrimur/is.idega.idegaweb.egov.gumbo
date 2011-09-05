package is.idega.idegaweb.egov.gumbo.licenses.payments;

import java.util.Date;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.IWMainApplicationSettings;
import com.idega.jbpm.time.CalendarOperations;

@Service("updateCheckForPaymentTimerDate")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class UpdateTimerDateHandler implements ActionHandler {
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private CalendarOperations calendarOperations;
	
	public void execute(ExecutionContext executionContext) throws Exception {
		
		executionContext.setVariable("date_checkForPaymentTimerDate",

		getCalendarOperations().add(new Date(), getCheckEachExpression())

		);
	}
	
	/**
	 * @return expressions valid in {@link CalendarOperations#add(java.util.Date, String)}
	 */
	private String getCheckEachExpression() {
		IWMainApplicationSettings settings = IWMainApplication
		.getDefaultIWApplicationContext().getApplicationSettings();
		// this method might resolve the expression from application property
		
		return settings.getProperty("DOF_PAYMENT_CHECK_WAIT", "1 day");
	}
	
	private CalendarOperations getCalendarOperations() {
		return calendarOperations;
	}
}