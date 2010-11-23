package is.idega.idegaweb.egov.gumbo.presentation;

import java.math.BigDecimal;

import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.bean.GumboBean;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.idega.facelets.ui.FaceletComponent;
import com.idega.idegaweb.IWBundle;
import com.idega.presentation.IWBaseComponent;
import com.idega.presentation.IWContext;
import com.idega.util.PresentationUtil;
import com.idega.util.expression.ELUtil;

public class CatchQuota extends IWBaseComponent {

	public static final String PERSONAL_ID = "5411850389";
	
	private static final String PARAMETER_SHIP = "prm_ship_number";
	private static final String PARAMETER_PERIOD = "prm_period";
	
	private IWBundle iwb;
	
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

		BigDecimal shipNumber = null;
		if (iwc.isParameterSet(PARAMETER_SHIP)) {
			shipNumber = new BigDecimal(iwc.getParameter(PARAMETER_SHIP));
		}

		String period = null;
		if (iwc.isParameterSet(PARAMETER_PERIOD)) {
			period = iwc.getParameter(PARAMETER_PERIOD);
		}
		else {
			period = "0910";
		}
		
		GumboBean bean = getBeanInstance("gumboBean");
		bean.setShips(getClient().getShipInfoByCompanySSN(PERSONAL_ID));
		if (shipNumber == null && bean.getShips() != null && bean.getShips().length > 0) {
			shipNumber = bean.getShips()[0].getSkipNr();
		}
		bean.setShipNumber(shipNumber);
		bean.setPeriod(period);
		bean.setCatchQuota(getClient().getCatchQuota(shipNumber, period));
		
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
}