package is.idega.idegaweb.egov.gumbo.presentation;

import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.bean.GumboBean;
import is.idega.idegaweb.egov.gumbo.business.GumboSession;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import java.rmi.RemoteException;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.idega.business.IBORuntimeException;
import com.idega.core.builder.business.BuilderService;
import com.idega.core.builder.business.BuilderServiceFactory;
import com.idega.core.builder.data.ICPage;
import com.idega.facelets.ui.FaceletComponent;
import com.idega.idegaweb.IWBundle;
import com.idega.presentation.IWBaseComponent;
import com.idega.presentation.IWContext;
import com.idega.presentation.ui.handlers.IWDatePickerHandler;
import com.idega.util.IWTimestamp;
import com.idega.util.PresentationUtil;
import com.idega.util.expression.ELUtil;

public class CatchesViewer extends IWBaseComponent {

	private static final String PARAMETER_FROM_DATE = "prm_from_date";
	private static final String PARAMETER_TO_DATE = "prm_to_date";

	private IWBundle iwb;
	
	private ICPage page;
	
	private int numberOfDisplayed = 12;
	
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

		IWTimestamp fromDate = new IWTimestamp();
		if (iwc.isParameterSet(PARAMETER_FROM_DATE)) {
			fromDate = new IWTimestamp(IWDatePickerHandler.getParsedDate(iwc.getParameter(PARAMETER_FROM_DATE)));
		}
		else {
			fromDate.addMonths(-3);
		}

		IWTimestamp toDate = new IWTimestamp();
		if (iwc.isParameterSet(PARAMETER_TO_DATE)) {
			toDate = new IWTimestamp(IWDatePickerHandler.getParsedDate(iwc.getParameter(PARAMETER_TO_DATE)));
		}
		
		try {
			BuilderService service = BuilderServiceFactory.getBuilderService(iwc);
			
			GumboBean bean = getBeanInstance("gumboBean");
			bean.setFromDate(fromDate.getDate());
			bean.setToDate(toDate.getDate());
			if (getSession().getShip() != null) {
				bean.setCatches(getClient().getCatchInfoByShipNumber(getSession().getShip().getSkipNr(), fromDate.getCalendar(), toDate.getCalendar()));
			}
			if (getPage() != null) {
				bean.setResponseURL(service.getPageURI(getPage()));
			}
		}
		catch (RemoteException re) {
			throw new IBORuntimeException(re);
		}
		
		FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
		facelet.setFaceletURI(iwb.getFaceletURI("catches/viewAll.xhtml"));
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

	public ICPage getPage() {
		return page;
	}

	public void setPage(ICPage page) {
		this.page = page;
	}

	public int getNumberOfDisplayed() {
		return numberOfDisplayed;
	}

	public void setNumberOfDisplayed(int numberOfDisplayed) {
		this.numberOfDisplayed = numberOfDisplayed;
	}
}