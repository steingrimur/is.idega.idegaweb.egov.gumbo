package is.idega.idegaweb.egov.gumbo.handler;

import is.idega.idegaweb.egov.gumbo.data.ProcessFocalCode;

import java.util.ArrayList;
import java.util.Map;

import org.jbpm.graph.exe.ExecutionContext;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.block.process.data.Case;
import com.idega.jbpm.utils.JSONUtil;

@Service("violationToFocalHandler")
@Scope(BeanDefinition.SCOPE_PROTOTYPE)
public class ViolationToFocalHandler extends DefaultFocalHandler {

	private static final long serialVersionUID = -274242404613438684L;

	public void execute(ExecutionContext context) throws Exception {
		if (!isNeededToSendToFocal())
			return;

		Case theCase = getCase(context);
		if (theCase == null) {
			getLogger().warning("Case can not be resolved!");
			return;
		}

		String processDefinitionName = context.getProcessDefinition().getName();
		String types = (String) context.getVariable("string_violationTypesSummary");

		ProcessFocalCode focalCode = getGumboDAO().getProcessFocalCode(processDefinitionName);

		StringBuilder documentKey = new StringBuilder(focalCode.getFocalDocumentKey());
		documentKey.append(".");

		String t[] = types.trim().replaceAll("-", "").replaceAll("\\s", "").split("\\.");
		
		documentKey.append(t[0]);
		
		String personalID = null;
		String name = null;
		
		Object violationContact = context.getVariable("objlist_violationCompanies");
		
		Object violationPerson = context.getVariable("objlist_violationPersons");
		
		JSONUtil jsonUtil = new JSONUtil();
		JSONParser parser = new JSONParser();
		Map<?, ?> companyMap = null;
		Map<?, ?> personMap = null;
		
		if (violationContact != null) {
			Object parsed = parser.parse((String) ((ArrayList<?>)violationContact).get(0));
			if (parsed instanceof JSONArray) {
				JSONArray array = (JSONArray) parsed;
				companyMap = (Map<?, ?>) jsonUtil.convertToObject(array.get(0).toString());
			} else {
				companyMap = (Map<?, ?>) jsonUtil.convertToObject(parsed.toString());
			}			
		} 
		
		if (violationPerson != null) {
			Object parsed = parser.parse((String) ((ArrayList<?>)violationPerson).get(0));
			if (parsed instanceof JSONArray) {
				JSONArray array = (JSONArray) parsed;
				personMap = (Map<?, ?>) jsonUtil.convertToObject(array.get(0).toString());
			} else {
				personMap = (Map<?, ?>) jsonUtil.convertToObject(parsed.toString());
			}
		}

		if (companyMap != null && !companyMap.isEmpty()) {
			personalID = (String) companyMap.get("socialSecurityNr");
			name = (String) companyMap.get("violationPersonName"); 			
		}
		
		if (personalID == null || "".equals(personalID.trim()) || name == null || "".equals(name.trim())) {
			personalID = (String) personMap.get("socialSecurityNr");
			name = (String) personMap.get("violationPersonName"); 			
		}		
		
		if (personalID == null || "".equals(personalID.trim()) || name == null || "".equals(name.trim())) {
			personalID = theCase.getOwner().getPersonalID();
			name = theCase.getOwner().getName();
		}

		if (personalID.length() == 9) {
			personalID = "0" + personalID;
		}
		
		createFocalCase(theCase, personalID, name, focalCode.getFocalProjectID(), documentKey.toString());
	}

}