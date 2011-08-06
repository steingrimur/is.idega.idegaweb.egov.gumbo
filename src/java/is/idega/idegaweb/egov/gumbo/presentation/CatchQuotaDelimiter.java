package is.idega.idegaweb.egov.gumbo.presentation;

import is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.AflaHeimildSkerdingAlltTypUser;
import is.fiskistofa.webservices.aflaheimildskerding.FSWebserviceAFLAHEIMILDSKERDING_wsdl.AflaHeimildSkerdingTypUser;
import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;
import is.idega.idegaweb.egov.application.bean.ApplicationBean;
import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.bean.GumboBean;
import is.idega.idegaweb.egov.gumbo.business.GumboBusiness;
import is.idega.idegaweb.egov.gumbo.business.GumboSession;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import java.math.BigDecimal;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.idega.company.data.Company;
import com.idega.core.contact.data.Email;
import com.idega.core.contact.data.Phone;
import com.idega.core.location.data.Address;
import com.idega.core.location.data.PostalCode;
import com.idega.facelets.ui.FaceletComponent;
import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.presentation.IWBaseComponent;
import com.idega.presentation.IWContext;
import com.idega.util.IWTimestamp;
import com.idega.util.PresentationUtil;
import com.idega.util.expression.ELUtil;

public class CatchQuotaDelimiter extends IWBaseComponent {

	private static final String PARAMETER_ACTION = "prm_action";
	private static final String PARAMETER_SHIP = "prm_ship_id";
	
	private static final String ACTION_VIEW = "view";
	private static final String ACTION_RESET = "reset";
	private static final String ACTION_CALCULATE = "calculate";
	private static final String ACTION_NEXT = "next";
	private static final String ACTION_SEND = "send";
	
	private IWBundle iwb;
	private IWResourceBundle iwrb;
	
	@Autowired
	@Qualifier(DOFWSClient.WEB_SERVICE)
	private DOFWSClient client;
	
	@Autowired
	private GumboBusiness business;
	
	@Autowired
	private GumboSession session;
	
	public String getBundleIdentifier() {
		return GumboConstants.IW_BUNDLE_IDENTIFIER;
	}

	@Override
	public void initializeComponent(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		iwb = getBundle(context, getBundleIdentifier());
		iwrb = iwb.getResourceBundle(iwc.getCurrentLocale());
		
		PresentationUtil.addStyleSheetToHeader(iwc, iwb.getVirtualPathWithFileNameString("style/gumbo.css"));

		Company company = getSession().getCompany();
		String companySSN = company != null ? company.getPersonalID() : null;
		ApplicationBean appBean = null;
		if (company != null) {
			appBean = getBeanInstance("applicationBean");
			appBean.setName(company.getName());
			appBean.setPersonalID(company.getPersonalID());
			
			Address address = company.getAddress();
			if (address != null) {
				appBean.setAddress(address.getStreetAddress());
				
				PostalCode postal = address.getPostalCode();
				if (postal != null) {
					appBean.setPostal(postal.getPostalAddress());
				}
			}
			
			Email email = company.getEmail();
			if (email != null){
				appBean.setEmail(email.getEmailAddress());
			}
			
			Phone phone = company.getPhone();
			if (phone != null){
				appBean.setPhone(phone.getNumber());
			}
			Phone fax = company.getFax();
			if (fax != null){
				appBean.setBody(phone.getNumber());
			}
		}
		
		BigDecimal shipNumber = iwc.isParameterSet(PARAMETER_SHIP) ? new BigDecimal(iwc.getParameter(PARAMETER_SHIP)) : null;
		AflaHeimildSkerdingAlltTypUser shipInfo = null;
		SkipInfoTypeUser ship = null;
		if (shipNumber != null) {
			ship = getClient().getShipInfo(shipNumber.toString());
			shipInfo = getClient().getCatchDelimiterShipInfo(shipNumber);
		}
		
		String action = iwc.isParameterSet(PARAMETER_ACTION) ? iwc.getParameter(PARAMETER_ACTION) : ACTION_VIEW;
		if (action.equals(ACTION_CALCULATE) || action.equals(ACTION_NEXT) || action.equals(ACTION_SEND)) {
			boolean error = false;
			AflaHeimildSkerdingTypUser[] aValues = shipInfo.getAhSkerdingA();
			for (AflaHeimildSkerdingTypUser aValue : aValues) {
				try {
					int value = Integer.parseInt(iwc.getParameter("aValue_" + aValue.getFisktegund().toString()));
					aValue.setSkipti(new BigDecimal(value));
				}
				catch (NumberFormatException nfe) {
					shipInfo.setStatus(new BigDecimal(-1));
					shipInfo.setSkilabod(iwrb.getLocalizedString("catch_quota_delimiter.invalid_number_error", "Only whole numbers are allowed"));
					error = true;
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
					shipInfo.setStatus(new BigDecimal(-1));
					shipInfo.setSkilabod(iwrb.getLocalizedString("catch_quota_delimiter.invalid_number_error", "Only whole numbers are allowed"));
					error = true;
				}
			}
			shipInfo.setAhSkerdingB(bValues);
			
			if (!error) {
				shipInfo = getClient().calculateCatchDelimiter(shipInfo);
				if (action.equals(ACTION_SEND)) {
					shipInfo = getClient().sendCatchDelimiter(shipInfo);
				}
			}
		}
		
		if (companySSN != null) {
			GumboBean bean = getBeanInstance("gumboBean");
			bean.setCatchDelimiterShips(getClient().getCatchDelimiterShips(companySSN));
			if (shipInfo != null) {
				bean.setCatchDelimiterInfo(shipInfo);
			}
			if (ship != null) {
				bean.setShipInfo(ship);
			}
			bean.setPeriod(new IWTimestamp().getLocaleDateAndTime(iwc.getCurrentLocale(), IWTimestamp.SHORT, IWTimestamp.SHORT));
		}
		
		if ((shipInfo != null && (shipInfo.getStatus().intValue() == -1 || shipInfo.getMism().intValue() != 0)) || action.equals(ACTION_VIEW) || action.equals(ACTION_CALCULATE) || action.equals(ACTION_RESET)) {
			FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
			facelet.setFaceletURI(iwb.getFaceletURI("catchQuotaDelimiter/view.xhtml"));
			add(facelet);
		}
		else if (action.equals(ACTION_NEXT)) {
			FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
			facelet.setFaceletURI(iwb.getFaceletURI("catchQuotaDelimiter/overview.xhtml"));
			add(facelet);
		}
		else if (action.equals(ACTION_SEND)) {
			getBusiness().storeCatchDelimiterInfo(shipInfo, appBean, iwc.getCurrentUser());
			
			FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
			facelet.setFaceletURI(iwb.getFaceletURI("catchQuotaDelimiter/send.xhtml"));
			add(facelet);
		}
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
	
	private GumboSession getSession() {
		if (this.session == null) {
			ELUtil.getInstance().autowire(this);
		}
		
		return this.session;
	}
}