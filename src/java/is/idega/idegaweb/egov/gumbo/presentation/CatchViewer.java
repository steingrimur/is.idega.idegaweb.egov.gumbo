package is.idega.idegaweb.egov.gumbo.presentation;

import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.bean.GumboBean;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import java.math.BigDecimal;
import java.rmi.RemoteException;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.idega.business.IBORuntimeException;
import com.idega.core.builder.business.BuilderService;
import com.idega.core.builder.business.BuilderServiceFactory;
import com.idega.core.builder.data.ICPage;
import com.idega.facelets.ui.FaceletComponent;
import com.idega.idegaweb.IWBundle;
import com.idega.presentation.IWBaseComponent;
import com.idega.presentation.IWContext;
import com.idega.util.PresentationUtil;
import com.idega.util.expression.ELUtil;

public class CatchViewer extends IWBaseComponent {

	private static final String PARAMETER_CATCH_ID = "prm_catch_id";
	private static final String PARAMETER_PORT = "prm_port";

	private IWBundle iwb;
	
	private ICPage page;
	
	@Autowired
	private DOFWSClient client;
	
	public String getBundleIdentifier() {
		return GumboConstants.IW_BUNDLE_IDENTIFIER;
	}

	@Override
	public void initializeComponent(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		iwb = getBundle(context, getBundleIdentifier());
		
		PresentationUtil.addStyleSheetToHeader(iwc, iwb.getVirtualPathWithFileNameString("style/gumbo.css"));

		BigDecimal catchNumber = null;
		if (iwc.isParameterSet(PARAMETER_CATCH_ID)) {
			catchNumber = new BigDecimal(iwc.getParameter(PARAMETER_CATCH_ID));
		}

		BigDecimal port = null;
		if (iwc.isParameterSet(PARAMETER_PORT)) {
			port = new BigDecimal(iwc.getParameter(PARAMETER_PORT));
		}

		try {
			BuilderService service = BuilderServiceFactory.getBuilderService(iwc);
			
			GumboBean bean = getBeanInstance("gumboBean");
			if (catchNumber != null && port != null) {
				bean.setCatchInfo(getClient().getCatchInfoByNumberAndPort(catchNumber, port));
			}
			if (getPage() != null) {
				bean.setResponseURL(service.getPageURI(getPage()));
			}
		}
		catch (RemoteException re) {
			throw new IBORuntimeException(re);
		}
		
		FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
		facelet.setFaceletURI(iwb.getFaceletURI("catches/viewByNumberAndPort.xhtml"));
		add(facelet);
	}	
	
	private DOFWSClient getClient() {
		if (this.client == null) {
			ELUtil.getInstance().autowire(this);
		}
		
		return this.client;
	}

	public ICPage getPage() {
		return page;
	}

	public void setPage(ICPage page) {
		this.page = page;
	}
}