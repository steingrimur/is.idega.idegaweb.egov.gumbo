package is.idega.idegaweb.egov.gumbo.presentation;

import is.fiskistofa.webservices.hlutdeild.FSWebserviceHLUTDEILD_wsdl.types.UthlutanirTypeUser;
import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.business.GumboSession;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.idega.idegaweb.IWBundle;
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

		if (getSession().getShip() != null) {
			Applet applet = new Applet(getAppletClass(), getAppletURL(), getWidth(), getHeight());
			applet.setParam("kvreiknaflamark", "Aflamark");
			applet.setParam("kvreiknafnaestaari", "Af næsta ári");
			applet.setParam("kvreiknanaesta", "Á næsta ár");
			applet.setParam("kvreiknanaesta", "Á næsta ár");
			applet.setParam("kvreiknfluttmilliara", "Flutningsheimild á milli ára");
			applet.setParam("kvreiknfrumstilla", "Frumstilla");
			applet.setParam("kvreiknheildaraflamark", "Heildaraflamark");
			applet.setParam("kvreiknheildarthorsk", "Heildarþorskígildi");
			applet.setParam("kvreiknhlutdeild", "Hlutdeild(%)");
			applet.setParam("kvreiknleidbeiningar", "Leiðbeiningar");
			applet.setParam("kvreikntegund", "Kvótategund");
			applet.setParam("kvreiknupphaflegheildarthorsk", "Upphafleg heildarþorskígildi");
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
					applet.setParam("hlutdeild_teg" + index, type.getHlutdeild().toString());
					applet.setParam("studull_teg" + index, type.getThIgildi().toString());
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