package is.idega.idegaweb.egov.gumbo.presentation;

import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.business.GumboSession;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;

import com.idega.block.web2.business.JQuery;
import com.idega.idegaweb.IWBundle;
import com.idega.presentation.IWBaseComponent;
import com.idega.presentation.IWContext;
import com.idega.presentation.ui.IFrame;
import com.idega.util.PresentationUtil;
import com.idega.util.expression.ELUtil;

public class CatchQuotaCalculator extends IWBaseComponent {

	private IWBundle iwb;

	private int width = 573;
	private int height = 1000;
	private String type = "";

	@Autowired
	private GumboSession session;
	
	@Autowired
	private JQuery jQuery;

	public String getBundleIdentifier() {
		return GumboConstants.IW_BUNDLE_IDENTIFIER;
	}

	@Override
	public void initializeComponent(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		iwb = getBundle(context, getBundleIdentifier());

		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, getJQuery().getBundleURIToJQueryLib());
		PresentationUtil.addJavaScriptSourceLineToHeader(iwc, iwb.getVirtualPathWithFileNameString("javascript/catchQuotaCalculator.js"));
		PresentationUtil.addStyleSheetToHeader(iwc, iwb.getVirtualPathWithFileNameString("style/gumbo.css"));

		String url = iwc.getApplicationSettings().getProperty("gumbo.catch.quota.calculator.url");
		
		if (getSession().getShip() != null && url != null) {
			url += "?fyrirsp=" + type;
			url += "&skipnr=" + getSession().getShip().getSkipNr().toString();
			url += "&kvtime=" + getSession().getSeason();
			
			IFrame frame = new IFrame("catchQuotaCalculator", url, getWidth(), getHeight());
			frame.setId("catchQuotaCalculator");
			frame.setStyleClass("autoHeight");
			frame.setScrolling(IFrame.SCROLLING_AUTO);
			frame.setBorder(0);
			add(frame);
		}
	}

	private GumboSession getSession() {
		if (this.session == null) {
			ELUtil.getInstance().autowire(this);
		}
		
		return this.session;
	}

	private JQuery getJQuery() {
		if (jQuery == null) {
			ELUtil.getInstance().autowire(this);
		}
		
		return jQuery;
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
}