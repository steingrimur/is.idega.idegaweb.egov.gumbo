package is.idega.idegaweb.egov.gumbo.presentation;

import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.bean.GumboBean;
import is.idega.idegaweb.egov.gumbo.business.GumboBusiness;
import is.idega.idegaweb.egov.gumbo.business.GumboSession;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import java.math.BigDecimal;

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

	private static final String PARAMETER_SHIP = "prm_ship_number";
	private static final String PARAMETER_PERIOD = "prm_period";
	
	private IWBundle iwb;
	
	@Autowired
	@Qualifier(DOFWSClient.WEB_SERVICE)
	private DOFWSClient client;
	
	@Autowired
	private GumboSession session;
	
	@Autowired
	private GumboBusiness business;
	
	public String getBundleIdentifier() {
		return GumboConstants.IW_BUNDLE_IDENTIFIER;
	}

	@Override
	public void initializeComponent(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		iwb = getBundle(context, getBundleIdentifier());
		
		PresentationUtil.addStyleSheetToHeader(iwc, iwb.getVirtualPathWithFileNameString("style/gumbo.css"));

		BigDecimal shipNumber = null;
		if (iwc.isParameterSet(PARAMETER_SHIP)) {
			shipNumber = new BigDecimal(iwc.getParameter(PARAMETER_SHIP));
		}
		else if (getSession().getShip() != null) {
			shipNumber = getSession().getShip().getSkipNr();
		}

		String period = null;
		if (iwc.isParameterSet(PARAMETER_PERIOD)) {
			period = iwc.getParameter(PARAMETER_PERIOD);
		}
		else {
			period = "0910";
		}
		
		GumboBean bean = getBeanInstance("gumboBean");
		bean.setShips(getClient().getShipInfoByCompanySSN(getBusiness().getCompanyForUser(iwc.getCurrentUser()).getPersonalID()));
		bean.setShipNumber(shipNumber);
		bean.setPeriod(period);
		if (bean.getShipNumber() != null) {
			bean.setCatchQuota(getClient().getCatchQuota(shipNumber, period));
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

	private GumboBusiness getBusiness() {
		if (this.business == null) {
			ELUtil.getInstance().autowire(this);
		}
		return this.business;
	}
}