package is.idega.idegaweb.egov.gumbo.handler;

import is.idega.idegaweb.egov.bpm.cases.actionhandlers.SetProcessDescriptionHandler;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.FishFarm;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service("fishFarmReportFiledHandler")
@Scope("prototype")
public class FishFarmReportFiledHandler extends SetProcessDescriptionHandler implements ActionHandler {
	
	@Autowired
	private GumboDao dao;
	
	public void execute(ExecutionContext context) throws Exception {

		Object value = context.getVariable("string_reportForTheFarm");
		if (!(value instanceof String)) {
			return;
		}
		
		FishFarm farm = new FishFarm();
		farm.setId(new Long((String)value));
		
		getDao().updateFishFarm(farm, true);
	}
	
	private GumboDao getDao() {
		return dao;
	}
}
