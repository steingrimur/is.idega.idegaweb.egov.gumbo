package is.idega.idegaweb.egov.gumbo.presentation;

import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;
import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.bean.GumboBean;
import is.idega.idegaweb.egov.gumbo.business.GumboBusiness;
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
import com.idega.event.IWPageEventListener;
import com.idega.facelets.ui.FaceletComponent;
import com.idega.idegaweb.IWBundle;
import com.idega.idegaweb.IWException;
import com.idega.presentation.IWBaseComponent;
import com.idega.presentation.IWContext;
import com.idega.util.PresentationUtil;
import com.idega.util.expression.ELUtil;

public class ShipsViewer extends IWBaseComponent implements IWPageEventListener {

	private static final String PARAMETER_SHIP = "prm_ship_id";
	
	private IWBundle iwb;
	
	private ICPage page;
	
	private boolean isCompact = true;
	
	@Autowired
	@Qualifier(DOFWSClient.WEB_SERVICE)
	private DOFWSClient client;
	
	@Autowired
	private GumboSession session;
	
	@Autowired
	private GumboBusiness business;
	
	public boolean actionPerformed(IWContext iwc) throws IWException {
		if (iwc.isParameterSet(PARAMETER_SHIP)) {
			SkipInfoTypeUser ship = getClient().getShipInfo(iwc.getParameter(PARAMETER_SHIP));
			getSession().setShip(ship);
		}
		
		return true;
	}

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
			
			Company company = getBusiness().getCompanyForUser(iwc.getCurrentUser());
			String companySSN = company != null ? company.getPersonalID() : null;
			
			if (companySSN != null) {
				GumboBean bean = getBeanInstance("gumboBean");
				bean.setEventHandler(this.getClass());
				bean.setShips(getClient().getShipInfoByCompanySSN(companySSN));
				if (getPage() != null) {
					bean.setResponseURL(service.getPageURI(getPage()));
				}
			}
		}
		catch (RemoteException re) {
			throw new IBORuntimeException(re);
		}
		
		FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
		if (isCompact()) {
			facelet.setFaceletURI(iwb.getFaceletURI("ships/viewAllCompact.xhtml"));
		}
		else {
			facelet.setFaceletURI(iwb.getFaceletURI("ships/viewAll.xhtml"));
		}
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
	
	private GumboBusiness getBusiness() {
		if (this.business == null) {
			ELUtil.getInstance().autowire(this);
		}
		return this.business;
	}

	private ICPage getPage() {
		return page;
	}

	public void setPage(ICPage page) {
		this.page = page;
	}

	private boolean isCompact() {
		return isCompact;
	}

	public void setCompact(boolean isCompact) {
		this.isCompact = isCompact;
	}
}