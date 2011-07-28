package is.idega.idegaweb.egov.gumbo.presentation;

import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;
import is.idega.idegaweb.egov.application.bean.ApplicationBean;
import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.bean.GumboBean;
import is.idega.idegaweb.egov.gumbo.business.GumboBusiness;
import is.idega.idegaweb.egov.gumbo.data.CatchDelimiter;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import java.rmi.RemoteException;

import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import com.idega.block.process.business.CaseBusiness;
import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.business.IBORuntimeException;
import com.idega.company.data.Company;
import com.idega.core.contact.data.Email;
import com.idega.core.contact.data.Phone;
import com.idega.core.file.business.ICFileSystem;
import com.idega.core.file.business.ICFileSystemFactory;
import com.idega.core.location.data.Address;
import com.idega.core.location.data.PostalCode;
import com.idega.facelets.ui.FaceletComponent;
import com.idega.idegaweb.IWApplicationContext;
import com.idega.idegaweb.IWBundle;
import com.idega.presentation.IWBaseComponent;
import com.idega.presentation.IWContext;
import com.idega.presentation.text.Text;
import com.idega.util.IWTimestamp;
import com.idega.util.PresentationUtil;
import com.idega.util.expression.ELUtil;

public class CatchQuotaDelimiterViewer extends IWBaseComponent {

	private IWBundle iwb;
	
	@Autowired
	@Qualifier(DOFWSClient.WEB_SERVICE)
	private DOFWSClient client;
	
	@Autowired
	private GumboBusiness business;
	
	public String getBundleIdentifier() {
		return GumboConstants.IW_BUNDLE_IDENTIFIER;
	}

	@Override
	public void initializeComponent(FacesContext context) {
		IWContext iwc = IWContext.getIWContext(context);
		iwb = getBundle(context, getBundleIdentifier());
		
		PresentationUtil.addStyleSheetToHeader(iwc, iwb.getVirtualPathWithFileNameString("style/gumbo.css"));

		try {
			if (iwc.isParameterSet(getCaseBusiness(iwc).getSelectedCaseParameter())) {
				CatchDelimiter delimiter = getBusiness().getCatchDelimiter(iwc.getParameter(getCaseBusiness(iwc).getSelectedCaseParameter()));
				SkipInfoTypeUser shipInfo = getClient().getShipInfo(String.valueOf(delimiter.getShipID()));

				Company company = getBusiness().getCompanyForUser(delimiter.getOwner());
				if (company != null) {
					ApplicationBean appBean = getBeanInstance("applicationBean");
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
				

				ICFileSystem fileSystem = ICFileSystemFactory.getFileSystem(iwc);
				String responseURL = fileSystem.getFileURI(delimiter.getAttachment());
				
				GumboBean bean = getBeanInstance("gumboBean");
				bean.setShipInfo(shipInfo);
				bean.setResponseURL(responseURL);
				bean.setPeriod(new IWTimestamp(delimiter.getCreated()).getLocaleDateAndTime(iwc.getCurrentLocale(), IWTimestamp.SHORT, IWTimestamp.SHORT));
	
				FaceletComponent facelet = (FaceletComponent) iwc.getApplication().createComponent(FaceletComponent.COMPONENT_TYPE);
				facelet.setFaceletURI(iwb.getFaceletURI("catchQuotaDelimiter/viewer.xhtml"));
				add(facelet);
			}
			else {
				add(new Text("No case selected..."));
			}
		}
		catch (RemoteException re) {
			throw new IBORuntimeException(re);
		}
	}	
	
	private CaseBusiness getCaseBusiness(IWApplicationContext iwac) {
		try {
			return (CaseBusiness) IBOLookup.getServiceInstance(iwac, CaseBusiness.class);
		}
		catch (IBOLookupException ile) {
			throw new IBORuntimeException(ile);
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
}