package is.idega.idegaweb.egov.gumbo.presentation;

import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.bean.GumboBean;
import is.idega.idegaweb.egov.gumbo.business.GumboBusiness;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.idega.company.data.Company;
import com.idega.facelets.ui.FaceletComponent;
import com.idega.idegaweb.IWBundle;
import com.idega.presentation.IWBaseComponent;
import com.idega.presentation.IWContext;
import com.idega.util.PresentationUtil;
import com.idega.util.expression.ELUtil;

public class CatchQuota extends IWBaseComponent {

	private static final String PARAMETER_PERIOD = "prm_period";
	
	private IWBundle iwb;
	
	@Autowired
	@Qualifier(DOFWSClient.WEB_SERVICE)
	private DOFWSClient client;
	
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

		String period = null;
		if (iwc.isParameterSet(PARAMETER_PERIOD)) {
			period = iwc.getParameter(PARAMETER_PERIOD);
		}
		else {
			period = "1011";
		}
		
		Company company = getBusiness().getCompanyForUser(iwc.getCurrentUser());
		
		GumboBean bean = getBeanInstance("gumboBean");
		bean.setShips(getClient().getShipInfoByCompanySSN(company.getPersonalID()));
		bean.setPeriod(period);
		bean.setCatchQuota(getClient().getCatchQuota(company.getPersonalID(), period));
	
		FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
		facelet.setFaceletURI(iwb.getFaceletURI("catchQuota/viewByPeriod.xhtml"));
		add(facelet);
	}	
	
	private DOFWSClient getClient() {
		if (this.client == null) {
			ELUtil.getInstance().autowire(this);
		}
		
		return this.client;
	}
	
	private GumboBusiness getBusiness() {
		if (this.business == null) {
			ELUtil.getInstance().autowire(this);
		}
		return this.business;
	}
}