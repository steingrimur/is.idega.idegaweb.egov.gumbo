package is.idega.idegaweb.egov.gumbo.presentation;

import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.business.GumboSession;
import is.idega.idegaweb.egov.gumbo.util.GumboUtil;
import is.idega.idegaweb.egov.gumbo.util.Period;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;

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

		String url = iwc.getApplicationSettings().getProperty("gumbo.catch.quota.calculator.url");
		
		if (getSession().getShip() != null && url != null) {
			url += "?fyrirsp=&skipnr=" + getSession().getShip().getSkipNr().toString();
			
			Period period = GumboUtil.getCurrentPeriod();
			url += "&kvtime=" + period.getPeriod();
			
			IFrame frame = new IFrame("catchQuotaCalculator", url, getWidth(), getHeight());
			add(frame);
		}
	}

	private GumboSession getSession() {
		if (this.session == null) {
			ELUtil.getInstance().autowire(this);
		}
		
		return this.session;
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