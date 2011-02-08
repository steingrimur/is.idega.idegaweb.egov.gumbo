package is.idega.idegaweb.egov.gumbo.presentation;

import is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.UthlutanirTypeUser;
import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.business.GumboSession;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.presentation.Applet;
import com.idega.presentation.IWBaseComponent;
import com.idega.presentation.IWContext;
import com.idega.util.PresentationUtil;
import com.idega.util.expression.ELUtil;

public class QuotaCalculator extends IWBaseComponent {

	private IWBundle iwb;
	
	private String appletClass = "Kvotareiknir2.class";
	private String appletURL = "/content/files/public/jars/Kvotareiknir2.jar";
	private String helpURL = "";
	
	private int width = 550;
	private int height = 600;
	
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
		IWResourceBundle iwrb = iwb.getResourceBundle(iwc.getCurrentLocale());

		if (getSession().getShip() != null) {
			Applet applet = new Applet(getAppletClass(), getAppletURL(), getWidth(), getHeight());
			applet.setParam("kvreiknaflamark", iwrb.getLocalizedString("quota_calculator.catch_quota", "Catch quota"));
			applet.setParam("kvreiknafnaestaari", iwrb.getLocalizedString("quota_calculator.from_next_year", "From next year"));
			applet.setParam("kvreiknanaesta", iwrb.getLocalizedString("quota_calculator.to_next_year", "To next year"));
			applet.setParam("kvreiknfluttmilliara", iwrb.getLocalizedString("quota_calculator.transfer_permit_between_years", "Transfer permit between years"));
			applet.setParam("kvreiknfrumstilla", iwrb.getLocalizedString("quota_calculator.setup", "Setup"));
			applet.setParam("kvreiknheildaraflamark", iwrb.getLocalizedString("quota_calculator.total_catch_quota", "Total catch quota"));
			applet.setParam("kvreiknheildarthorsk", iwrb.getLocalizedString("quota_calculator.total_cod_substitute", "Total cod substitute"));
			applet.setParam("kvreiknhlutdeild", iwrb.getLocalizedString("quota_calculator.quota", "Quota (%)"));
			applet.setParam("kvreiknleidbeiningar", iwrb.getLocalizedString("quota_calculator.instructions", "Instructions"));
			applet.setParam("kvreikntegund", iwrb.getLocalizedString("quota_calculator.quota_type", "Quota type"));
			applet.setParam("kvreiknupphaflegheildarthorsk", iwrb.getLocalizedString("quota_calculator.original_total_cod_substitute", "Original total cod substitute"));
			applet.setParam("bgr_r", "255");
			applet.setParam("bgr_g", "255");
			applet.setParam("bgr_b", "255");
			applet.setParam("kvreiknhelprelativeurl", getHelpURL());

			applet.setParam("skipsnafn", getSession().getShip().getNafn() + " (" + getSession().getShip().getSkipNr().toString() + ")");
			
			UthlutanirTypeUser[] portions = getClient().getShipPortions(getSession().getShip().getSkipNr(), getSession().getSeason());
			if (portions != null) {
				
				int index = 1;
				for (UthlutanirTypeUser type : portions) {
					applet.setParam("nafn_teg" + index, type.getKvotategundHeiti());
					applet.setParam("heildar_teg" + index, type.getUthlutun().toString());
					applet.setParam("hlutdeild_teg" + index, type.getHlutdeild() != null ? type.getHlutdeild().getHlutdeildUpphaf().toString().replace(".", ",") : ",0000000");
					applet.setParam("studull_teg" + index, type.getThIgildi().toString().replace(".", ","));
					applet.setParam("FHtil_teg" + index, type.getProsentaAflamarkTil().toString());
					applet.setParam("FHfra_teg" + index, type.getProsentaAflamarkFra().toString());
					
					index++;
				}
				
				add(applet);
			}
		}
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

	private String getAppletClass() {
		return appletClass;
	}

	public void setAppletClass(String appletClass) {
		this.appletClass = appletClass;
	}

	private String getAppletURL() {
		return appletURL;
	}

	public void setAppletURL(String appletURL) {
		this.appletURL = appletURL;
	}

	public String getHelpURL() {
		return helpURL;
	}

	public void setHelpURL(String helpURL) {
		this.helpURL = helpURL;
	}

	private int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	private int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
}