package is.idega.idegaweb.egov.gumbo.presentation;

import is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.AflaHeimildSkerdingAlltTypUser;
import is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.AflaHeimildSkerdingTypUser;
import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.bean.GumboBean;
import is.idega.idegaweb.egov.gumbo.business.GumboSession;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import java.math.BigDecimal;

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

public class CatchQuotaDelimiter extends IWBaseComponent {

	private static final String PARAMETER_ACTION = "prm_action";
	private static final String PARAMETER_SHIP = "prm_ship_id";
	
	private static final String ACTION_CALCULATE = "calculate";
	
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

		Company company = getSession().getCompany();
		String companySSN = company != null ? company.getPersonalID() : null;
		
		BigDecimal shipNumber = iwc.isParameterSet(PARAMETER_SHIP) ? new BigDecimal(iwc.getParameter(PARAMETER_SHIP)) : null;
		AflaHeimildSkerdingAlltTypUser shipInfo = null;
		if (shipNumber != null) {
			shipInfo = getClient().getCatchDelimiterShipInfo(shipNumber);
		}
		
		String action = iwc.isParameterSet(PARAMETER_ACTION) ? iwc.getParameter(PARAMETER_ACTION) : null;
		if (action != null && action.equals(ACTION_CALCULATE)) {
			AflaHeimildSkerdingTypUser[] aValues = shipInfo.getAhSkerdingA();
			for (AflaHeimildSkerdingTypUser aValue : aValues) {
				try {
					int value = Integer.parseInt(iwc.getParameter("aValue_" + aValue.getFisktegund().toString()));
					aValue.setSkipti(new BigDecimal(value));
				}
				catch (NumberFormatException nfe) {
					break;
				}
			}
			shipInfo.setAhSkerdingA(aValues);
			
			AflaHeimildSkerdingTypUser[] bValues = shipInfo.getAhSkerdingB();
			for (AflaHeimildSkerdingTypUser bValue : bValues) {
				try {
					int value = Integer.parseInt(iwc.getParameter("bValue_" + bValue.getFisktegund().toString()));
					bValue.setLokaSkerding(new BigDecimal(value));
				}
				catch (NumberFormatException nfe) {
					break;
				}
			}
			shipInfo.setAhSkerdingB(bValues);
			
			shipInfo = getClient().calculateCatchDelimiter(shipInfo);
		}
		
		if (companySSN != null) {
			GumboBean bean = getBeanInstance("gumboBean");
			bean.setCatchDelimiterShips(getClient().getCatchDelimiterShips(companySSN));
			if (shipInfo != null) {
				bean.setCatchDelimiterInfo(shipInfo);
			}
		}
		
		FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
		facelet.setFaceletURI(iwb.getFaceletURI("catchQuotaDelimiter/view.xhtml"));
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