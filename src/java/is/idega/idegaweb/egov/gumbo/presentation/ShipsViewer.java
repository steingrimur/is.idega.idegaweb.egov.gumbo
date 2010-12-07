package is.idega.idegaweb.egov.gumbo.presentation;

import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;
import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.bean.GumboBean;
import is.idega.idegaweb.egov.gumbo.business.GumboSession;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import java.rmi.RemoteException;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.idega.business.IBORuntimeException;
import com.idega.company.business.CompanyProvider;
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
	
	@Autowired
	@Qualifier(DOFWSClient.WEB_SERVICE)
	private DOFWSClient client;
	
	@Autowired
	private GumboSession session;
	
	@Autowired
	private CompanyProvider provider;
	
	@Override
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
			
			GumboBean bean = getBeanInstance("gumboBean");
			bean.setEventHandler(this.getClass());
			bean.setShips(getClient().getShipInfoByCompanySSN(getCompanyProvider().getCompanyPersonalIdForCurrentUser()));
			if (getPage() != null) {
				bean.setResponseURL(service.getPageURI(getPage()));
			}
		}
		catch (RemoteException re) {
			throw new IBORuntimeException(re);
		}
		
		FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
		facelet.setFaceletURI(iwb.getFaceletURI("ships/viewAll.xhtml"));
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
	
	private CompanyProvider getCompanyProvider() {
		if (this.provider == null) {
			ELUtil.getInstance().autowire(this);
		}
		return this.provider;
	}

	public ICPage getPage() {
		return page;
	}

	public void setPage(ICPage page) {
		this.page = page;
	}
}