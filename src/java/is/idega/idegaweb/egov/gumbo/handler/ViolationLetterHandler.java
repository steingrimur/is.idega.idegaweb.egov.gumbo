package is.idega.idegaweb.egov.gumbo.handler;

import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.Letter;

import java.util.Collection;

import javax.ejb.FinderException;

import org.jbpm.graph.def.ActionHandler;
import org.jbpm.graph.exe.ExecutionContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.bpm.BPMConstants;
import com.idega.core.business.DefaultSpringBean;
import com.idega.data.IDOLookup;
import com.idega.data.MetaData;
import com.idega.data.MetaDataHome;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.util.ListUtil;

@Scope(BeanDefinition.SCOPE_SINGLETON)
@Service("gumboViolationLetterHandler")
public class ViolationLetterHandler extends DefaultSpringBean implements ActionHandler {

	private static final long serialVersionUID = 4909679706965993003L;

	private Long processInstanceId, taskInstanceId;
	
	@Autowired
	private GumboDao gumboDAO;
	
	@Override
	public void execute(ExecutionContext context) throws Exception {
		if (getTaskInstanceId() == null) {
			getLogger().warning("Task instance ID is not provided!");
			return;
		}
		
		Object value = context.getVariable("string_letterType");
		if (!(value instanceof String)) {
			getLogger().warning("Unable to resolve letter type for task instance: " + getTaskInstanceId());
			return;
		}
		
		Letter letter = gumboDAO.find(Letter.class, Long.valueOf((String) value));
		if (letter == null) {
			getLogger().warning("Letter can not be found by ID: " + value);
			return;
		}
		
		IWResourceBundle iwrb = getResourceBundle(getBundle(GumboConstants.IW_BUNDLE_IDENTIFIER));
		setMetaData(iwrb.getLocalizedString("letter", "Letter").concat(": ").concat(letter.getName()));
	}
	
	private void setMetaData(String value) throws Exception {
		MetaDataHome metaDataHome = (MetaDataHome) IDOLookup.getHome(MetaData.class);
		String name = BPMConstants.TASK_CUSTOM_NAME_META_DATA.concat(BPMConstants.TASK_CUSTOM_NAME_SEPARATOR).concat(String.valueOf(getTaskInstanceId()));
		String type = String.class.getName();
		
		MetaData metaData = null;
		try {
			Collection<MetaData> data = metaDataHome.findAllByMetaDataNameAndType(name, type);
			metaData = ListUtil.isEmpty(data) ? null : data.iterator().next();
		} catch (FinderException e) {}
		
		metaData = metaData == null ? metaDataHome.create() : metaData;
		metaData.setMetaDataNameAndValue(name, value);
		metaData.setType(type);
		metaData.store();
	}

	public Long getProcessInstanceId() {
		return processInstanceId;
	}

	public void setProcessInstanceId(Long processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public Long getTaskInstanceId() {
		return taskInstanceId;
	}

	public void setTaskInstanceId(Long taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

}