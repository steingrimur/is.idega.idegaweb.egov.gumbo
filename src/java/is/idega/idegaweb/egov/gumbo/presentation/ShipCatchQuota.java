package is.idega.idegaweb.egov.gumbo.presentation;

import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.bean.GumboBean;
import is.idega.idegaweb.egov.gumbo.business.GumboSession;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.idega.facelets.ui.FaceletComponent;
import com.idega.idegaweb.IWBundle;
import com.idega.presentation.IWBaseComponent;
import com.idega.presentation.IWContext;
import com.idega.util.PresentationUtil;
import com.idega.util.expression.ELUtil;

public class ShipCatchQuota extends IWBaseComponent {

	private IWBundle iwb;
	
	@Autowired
	@Qualifier(DOFWSClient.WEB_SERVICE)
	private DOFWSClient client;
	
	@Autowired
	private GumboSession session;
	
	public String getBundleIdentifier() {
		return GumboConstants.IW_BUNDLE_IDENTIFIER;
	}

	@Override
	public void initializeComponent(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		iwb = getBundle(context, getBundleIdentifier());
		
		PresentationUtil.addStyleSheetToHeader(iwc, iwb.getVirtualPathWithFileNameString("style/gumbo.css"));

		GumboBean bean = getBeanInstance("gumboBean");
		if (getSession().getShip() != null && getSession().getSeason() != null) {
			bean.setCatchQuota(getClient().getCatchQuota(getSession().getShip().getSkipNr(), getSession().getSeason()));
		}
		
		FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
		facelet.setFaceletURI(iwb.getFaceletURI("catchQuota/viewByShipAndPeriod.xhtml"));
		add(facelet);
	}	
	
	private DOFWSClient getClient() {
		if (this.client == null) {
			ELUtil.getInstance().autowire(this);
		}
		
		return this.client;
	}
	
	private GumboSession getSession() {
		if (this.session == null) {
			ELUtil.getInstance().autowire(this);
		}
		
		return this.session;
	}
}