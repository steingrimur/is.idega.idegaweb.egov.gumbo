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
import com.idega.company.data.Company;
import com.idega.core.builder.business.BuilderService;
import com.idega.core.builder.business.BuilderServiceFactory;
import com.idega.core.builder.data.ICPage;
import com.idega.facelets.ui.FaceletComponent;
import com.idega.idegaweb.IWBundle;
import com.idega.presentation.IWBaseComponent;
import com.idega.presentation.IWContext;
import com.idega.util.PresentationUtil;
import com.idega.util.expression.ELUtil;

public class LatestCatches extends IWBaseComponent {

	private IWBundle iwb;
	
	private ICPage page;
	private ICPage catchesPage;
	
	private int numberOfResults = 5;
	
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

		try {
			BuilderService service = BuilderServiceFactory.getBuilderService(iwc);
			
			Company company = getSession().getCompany();
			String companySSN = company != null ? company.getPersonalID() : null;
			
			if (companySSN != null) {
				GumboBean bean = getBeanInstance("gumboBean");
				bean.setEventHandler(ShipsViewer.class);
				bean.setCatches(getClient().getLatestCatchInfo(companySSN, getNumberOfResults()));
				if (getPage() != null) {
					bean.setResponseURL(service.getPageURI(getPage()));
				}
				if (getCatchesPage() != null) {
					bean.setCatchesURL(service.getPageURI(getCatchesPage()));
				}
			}
		}
		catch (RemoteException re) {
			throw new IBORuntimeException(re);
		}
		
		FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
		facelet.setFaceletURI(iwb.getFaceletURI("catches/viewLatest.xhtml"));
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
		
		return session;
	}
	
	public ICPage getPage() {
		return page;
	}

	public void setPage(ICPage page) {
		this.page = page;
	}

	public ICPage getCatchesPage() {
		return catchesPage;
	}

	public void setCatchesPage(ICPage page) {
		this.catchesPage = page;
	}

	public int getNumberOfResults() {
		return numberOfResults;
	}

	public void setNumberOfResults(int numberOfResults) {
		this.numberOfResults = numberOfResults;
	}
}