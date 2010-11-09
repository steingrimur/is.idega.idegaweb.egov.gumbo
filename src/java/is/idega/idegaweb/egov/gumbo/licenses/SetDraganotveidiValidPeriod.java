package is.idega.idegaweb.egov.gumbo.licenses;

import java.util.Calendar;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("setDraganotveidiValidPeriod")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class SetDraganotveidiValidPeriod implements ActionHandler {
	
	private static final long serialVersionUID = 1L;
	
	@Override
	public void execute(ExecutionContext executionContext) throws Exception {
		
		final Inteval period;
		
		final Calendar now = Calendar.getInstance();
		now.set(Calendar.HOUR, 0);
		now.set(Calendar.MINUTE, 0);
		now.set(Calendar.SECOND, 0);
		now.set(Calendar.MILLISECOND, 0);
		
		final Calendar mayStart = Calendar.getInstance();
		mayStart.set(now.get(Calendar.YEAR), Calendar.MAY, 1, 0, 0, 0);
		
		final Calendar augEnd = Calendar.getInstance();
		augEnd.set(now.get(Calendar.YEAR), Calendar.AUGUST, 31, 0, 0, 0);
		
		if (now.after(mayStart) && now.before(augEnd)) {
			
			period = new Inteval(now.getTime(), augEnd.getTime());
			
		} else {
			
			period = findNearestPeriod(now);
		}
		
		executionContext.setVariable("date_validityFrom", period.getFrom());
		executionContext.setVariable("date_validityTo", period.getTo());
	}
	
	private Inteval findNearestPeriod(Calendar now) {
		
		final int year;
		
		if (now.get(Calendar.MONTH) > Calendar.AUGUST) {
			
			year = now.get(Calendar.YEAR) + 1;
			
		} else {
			year = now.get(Calendar.YEAR);
		}
		
		final Calendar mayStart = Calendar.getInstance();
		mayStart.set(year, Calendar.MAY, 1, 0, 0, 0);
		
		final Calendar augEnd = Calendar.getInstance();
		augEnd.set(year, Calendar.AUGUST, 31, 0, 0, 0);
		
		return new Inteval(mayStart.getTime(), augEnd.getTime());
	}
}