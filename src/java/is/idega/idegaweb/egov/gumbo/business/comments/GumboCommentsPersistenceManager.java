package is.idega.idegaweb.egov.gumbo.business.comments;

import is.idega.idegaweb.egov.bpm.business.BPMCommentsPersistenceManager;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.user.data.User;

@Scope(BeanDefinition.SCOPE_SINGLETON)
@Service("gumboCommentsPersistenceManager")
public class GumboCommentsPersistenceManager extends BPMCommentsPersistenceManager {

	@Override
	protected boolean canReadAndWriteAllComments(Long identifier, User user) {
		return super.hasRightToViewComments(identifier, user) && super.hasRightToWriteComments(identifier, user);
	}
	
}