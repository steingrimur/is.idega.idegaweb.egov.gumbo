package is.idega.idegaweb.egov.gumbo.bpm.violation;

import is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.FSWebserviceBROTAMAL_PortType;
import is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.FSWebserviceBROTAMAL_Service;
import is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.FSWebserviceBROTAMAL_ServiceLocator;
import is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.CodeTypeUser;
import is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetSkipWithInfoElement;
import is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetSkipWithInfoResponseElement;
import is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.GetVigtunarleyfiByKtElement;
import is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VeidileyfiTypeUser;
import is.fiskistofa.webservices.brotamal.FSWebserviceBROTAMAL_wsdl.types.VigtunarleyfiTypeUser;
import is.idega.block.nationalregister.webservice.client.business.CompanyHolder;
import is.idega.block.nationalregister.webservice.client.business.SkyrrClient;
import is.idega.block.nationalregister.webservice.client.business.UserHolder;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.Inspector;
import is.idega.idegaweb.egov.gumbo.data.Office;
import is.idega.idegaweb.egov.gumbo.data.GumboViolationType;

import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.CreateException;
import javax.ejb.FinderException;
import javax.xml.rpc.ServiceException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.business.IBORuntimeException;
import com.idega.company.business.CompanyBusiness;
import com.idega.company.companyregister.business.CompanyRegisterBusiness;
import com.idega.company.data.Company;
import com.idega.core.location.data.Address;
import com.idega.idegaweb.IWMainApplication;
import com.idega.user.business.UserBusiness;
import com.idega.user.data.User;
import com.idega.util.CoreConstants;
import com.idega.util.IWTimestamp;
import com.idega.util.StringUtil;
import com.idega.util.expression.ELUtil;
import com.idega.util.text.Item;

@Service("violationService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class ViolationService {
	private static final String VIOLATION_DEFAULT_ENDPOINT = "http://hafrok.hafro.is/FSWebServices/FSWebserviceBROTAMALSoap12HttpPort";
	private static final String VIOLATION_ENDPOINT_ATTRIBUTE_NAME = "dofws_violation_endpoint";
	
	private static final String USE_WEBSERVICE_FOR_COMPANY_LOOKUP = "COMPANY_WS_LOOKUP";

	@Autowired
	private SkyrrClient skyrrClient;
	
	@Autowired
	private GumboDao dao;
	
	public static void main(String[] arguments) {		
		try {
			FSWebserviceBROTAMAL_Service locator = new FSWebserviceBROTAMAL_ServiceLocator();
			FSWebserviceBROTAMAL_PortType port = locator.getFSWebserviceBROTAMALSoap12HttpPort(new URL("http://hafrok.hafro.is/FSWebServices/FSWebserviceBROTAMALSoap12HttpPort"));
			
			CodeTypeUser ret[] = port.getHafnalisti(null);
			for (CodeTypeUser codeTypeUser : ret) {
				System.out.print(codeTypeUser.getCode());
				System.out.print(" ");
				System.out.println(codeTypeUser.getText());
			}
		} catch (ServiceException se) {
			se.printStackTrace();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}

	private FSWebserviceBROTAMAL_PortType getViolationPort() {
		try {
			String endPoint = IWMainApplication
			        .getDefaultIWApplicationContext()
			        .getApplicationSettings()
			        .getProperty(VIOLATION_ENDPOINT_ATTRIBUTE_NAME,
			        		VIOLATION_DEFAULT_ENDPOINT);
			
			FSWebserviceBROTAMAL_Service locator = new FSWebserviceBROTAMAL_ServiceLocator();
			FSWebserviceBROTAMAL_PortType port = locator.getFSWebserviceBROTAMALSoap12HttpPort(new URL(endPoint));
			
			// ((org.apache.axis.client.Stub) port).setTimeout(timeout)
			
			return port;
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return null;
	}

	public PersonData getViolationPersonData(String socialNr) {
		return !StringUtil.isEmpty(socialNr) ? getUser(socialNr) : new PersonData(socialNr);
	}
	
	public PersonData getViolationCompanyData(String socialNr) {
		return !StringUtil.isEmpty(socialNr) ? getCompany(socialNr) : new PersonData(socialNr);
	}
	
	public List<Item> getViolationTypes() {
		final List<Item> items = new ArrayList<Item>();
		
		List<GumboViolationType> types = getDao().getViolationTypes();
		if (types != null && types.size() > 0) {
			for (GumboViolationType violationType : types) {
				String prefix = "";
				if (violationType.getDepth() > 0) {
					prefix = " ";
					for (int i = 0; i <= violationType.getDepth() - 1; i++) {
						prefix += "--";
					}
					prefix += " ";
				}
				items.add(new Item(violationType.getId().toString(), prefix + violationType.getNumber() + " " + violationType.getName()));
			}
		}
		else {
			items.add(new Item("1", "No violation types in database..."));
		}
		
		return items;
	}
	
	public List<Item> getOtherInspectorsThanCurrentlyLoggedIn() {
		final List<Item> items = new ArrayList<Item>();
		
		List<Inspector> inspectors = getDao().getInspectors();
		if (inspectors != null && inspectors.size() > 0) {
			for (Inspector inspector : inspectors) {
				items.add(new Item(inspector.getNumber().toString(), inspector.getName()));
			}
		}
		else {
			items.add(new Item("1", "No inspectors in database..."));
		}
		
		return items;
	}
	
	public List<Item> getFiskistofeOffices() {
		final List<Item> items = new ArrayList<Item>();
		
		List<Office> offices = getDao().getOffices();
		if (offices != null && offices.size() > 0) {
			for (Office office : offices) {
				items.add(new Item(office.getId().toString(), office.getName()));
			}
		}
		else {
			items.add(new Item("1", "No offices in database..."));
		}
		
		return items;
	}
	
	public List<Item> getHarbours() {
		final List<Item> items = new ArrayList<Item>();

		//GetHafnalistiElement parameters = new GetHafnalistiElement();
		try {
			CodeTypeUser whut[] = getViolationPort().getHafnalisti(null);
			for (CodeTypeUser codeTypeUser : whut) {
				items.add(new Item(codeTypeUser.getCode(), codeTypeUser.getText()));
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return items;
	}
		
	public String getTypeLabelOfPermissionForViolationCompany(String socialNr) {
		StringBuilder ret = new StringBuilder();
		GetVigtunarleyfiByKtElement parameters = new GetVigtunarleyfiByKtElement(socialNr);
		try {
			VigtunarleyfiTypeUser res[] = getViolationPort().getVigtunarleyfiByKt(parameters );
			int len = res.length;
			for (int i = 0; i < len; i++) {
				ret.append(res[i].getGerdLeyfis());
				if (i < (len -1 )) {
					ret.append(", ");
				}
			}
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return ret.toString();
	}
		
	public EquipmentData getEquipmentData(String byVesselRegistryNr) {
		EquipmentData data = new EquipmentData();
		GetSkipWithInfoElement parameters = new GetSkipWithInfoElement(new BigDecimal(byVesselRegistryNr));
		try {
			GetSkipWithInfoResponseElement res = getViolationPort().getSkipWithInfo(parameters);
			StringBuilder license = new StringBuilder();
			VeidileyfiTypeUser perm[] = res.getResult().getVeidileyfi();
			int len = perm.length;
			for (int i = 0; i < len; i++) {
				license.append(perm[i].getTegundLeyfisHeiti());
				if (i < (len -1)) {
					license.append(", ");
				}
			}
			data.setFishingLicense(license.toString());
			data.setFishingType(res.getResult().getUtgFlHeiti());
			data.setName(res.getResult().getNafn());
			data.setOwnersName(res.getResult().getEigandiNafn());
			data.setRevokeLicense(Boolean.toString(res.getResult().getErsvipting().getIsok().intValue() > 0));
			
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		
		return data;
	}
	
	public static final class EquipmentData {
		private String name;
		private String ownersName;
		private String fishingType;
		private String fishingLicense;
		private String revokeLicense = CoreConstants.EMPTY;
		
		public String getName() {
			return name;
		}
		
		public EquipmentData setName(String name) {
			this.name = name;
			return this;
		}
		
		public String getOwnersName() {
			return ownersName;
		}
		
		public EquipmentData setOwnersName(String ownersName) {
			this.ownersName = ownersName;
			return this;
		}
		
		public String getFishingType() {
			return fishingType;
		}
		
		public EquipmentData setFishingType(String fishingType) {
			this.fishingType = fishingType;
			return this;
		}
		
		public String getFishingLicense() {
			return fishingLicense;
		}
		
		public EquipmentData setFishingLicense(String fishingLicense) {
			this.fishingLicense = fishingLicense;
			return this;
		}
		
		public String getRevokeLicense() {
			return revokeLicense;
		}
		
		public EquipmentData setRevokeLicense(String revokeLicense) {
			this.revokeLicense = revokeLicense != null ? revokeLicense
			        : CoreConstants.EMPTY;
			return this;
		}
		
	}
	
	public static final class PersonData {
		
		private final String socialSecurityNr;
		private String name;
		private String address;
		
		public PersonData(String socialSecurityNr) {
			
			this.socialSecurityNr = socialSecurityNr;
		}
		
		public String getName() {
			return name;
		}
		
		public PersonData setName(String name) {
			this.name = name;
			return this;
		}
		
		public String getAddress() {
			return address;
		}
		
		public PersonData setAddress(String address) {
			this.address = address;
			return this;
		}
		
		public String getSocialSecurityNr() {
			return socialSecurityNr;
		}
	}
	
	public PersonData getUser(String personalId) {
		if (StringUtil.isEmpty(personalId)) {
			return null;
		}

		UserBusiness userBusiness = null;
		try {
			userBusiness = getUserBusiness();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		if (userBusiness == null) {
			return null;
		}

		String useWS = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getProperty(USE_WEBSERVICE_FOR_COMPANY_LOOKUP, "false");

		User user = null;

		if (!"false".equals(useWS)) {
			try {
				user = userBusiness.getUser(personalId);
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (FinderException e) {
				user = null;
			}

			if (user == null) {
				UserHolder holder = getSkyrrClient().getUser(personalId);
				if (holder != null) {
					IWTimestamp t = new IWTimestamp();

					String day = holder.getPersonalID().substring(0, 2);
					String month = holder.getPersonalID().substring(2, 4);
					String year = holder.getPersonalID().substring(4, 6);

					int iDay = Integer.parseInt(day);
					int iMonth = Integer.parseInt(month);
					int iYear = Integer.parseInt(year);
					if (holder.getPersonalID().substring(9).equals("9")) {
						iYear += 1900;
					} else if (holder.getPersonalID().substring(9).equals("0")) {
						iYear += 2000;
					} else if (holder.getPersonalID().substring(9).equals("8")) {
						iYear += 1800;
					}
					t.setHour(0);
					t.setMinute(0);
					t.setSecond(0);
					t.setMilliSecond(0);
					t.setDay(iDay);
					t.setMonth(iMonth);
					t.setYear(iYear);
					try {
						user = userBusiness
								.createUserByPersonalIDIfDoesNotExist(
										holder.getName(),
										holder.getPersonalID(), null, t);
						StringBuilder address = new StringBuilder(
								holder.getAddress());
						address.append(";");
						address.append(holder.getPostalCode());
						address.append(" ");
						address.append(";Iceland:is_IS;N/A");
						userBusiness.updateUsersMainAddressByFullAddressString(
								user, address.toString());
					} catch (RemoteException e) {
						e.printStackTrace();
					} catch (CreateException e) {
						e.printStackTrace();
					}
				}
			}
		}

		try {
			if (user == null) {
				user = userBusiness.getUser(personalId);
			}

			Address address = userBusiness.getUsersMainAddress(user);
			
			PersonData data = new PersonData(user.getPersonalID());
			data.setName(user.getName());
			if (address != null) {
				data.setAddress(address.getStreetAddress() + ", " + address.getPostalAddress());
			}

			return data;
		} catch (FinderException fe) {
			fe.printStackTrace();
			return null;
		} catch (RemoteException re) {
			re.printStackTrace();
		}

		return null;
	}

	public PersonData getCompany(String personalId) {
		if (StringUtil.isEmpty(personalId)) {
			return null;
		}

		CompanyBusiness companyBusiness = null;
		try {
			companyBusiness = getCompanyBusiness();
		} catch (RemoteException e) {
			e.printStackTrace();
		}
		if (companyBusiness == null) {
			return null;
		}

		String useWS = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getProperty(USE_WEBSERVICE_FOR_COMPANY_LOOKUP, "false");

		Company company = null;

		if (!"false".equals(useWS)) {
			try {
				company = companyBusiness.getCompany(personalId);
			} catch (RemoteException e) {
				e.printStackTrace();
			} catch (FinderException e) {
				company = null;
			}

			if (company == null) {
				CompanyHolder holder = getSkyrrClient().getCompany(
						personalId);
				if (holder != null) {
					try {
						getCompanyRegisterBusiness().updateEntry(
								holder.getPersonalID(), null,
								holder.getPostalCode(), null, null,
								holder.getName(), holder.getAddress(), null,
								"", null, holder.getVatNumber(),
								holder.getAddress(), "", null, null, null,
								null, null, "", null);
					} catch (RemoteException e) {
						e.printStackTrace();
					}
				}
			}
		}

		try {
			if (company == null) {
				company = companyBusiness.getCompany(personalId);
			}
			Address address = company.getAddress();

			PersonData data = new PersonData(company.getPersonalID());
			data.setName(company.getName());
			if (address != null) {
				data.setAddress(address.getStreetAddress() + ", " + address.getPostalAddress());
			}
			
			return data;
		} catch (FinderException fe) {
			fe.printStackTrace();
		} catch (RemoteException re) {
			re.printStackTrace();
		}

		return null;
	}

	
	private CompanyRegisterBusiness getCompanyRegisterBusiness() {
		try {
			return (CompanyRegisterBusiness) IBOLookup.getServiceInstance(IWMainApplication.getDefaultIWApplicationContext(), CompanyRegisterBusiness.class);
		} catch (IBOLookupException ile) {
			throw new IBORuntimeException(ile);
		}
	}

	
	private UserBusiness getUserBusiness() throws RemoteException {
		return (UserBusiness) IBOLookup.getServiceInstance(IWMainApplication.getDefaultIWApplicationContext(), UserBusiness.class);
	}

	private CompanyBusiness getCompanyBusiness() throws RemoteException {
		return (CompanyBusiness) IBOLookup.getServiceInstance(IWMainApplication.getDefaultIWApplicationContext(), CompanyBusiness.class);
	}

	public SkyrrClient getSkyrrClient() {
		if (skyrrClient == null) {
			ELUtil.getInstance().autowire(this);
		}
		return skyrrClient;
	}

	public GumboDao getDao() {
		if (dao == null) {
			ELUtil.getInstance().autowire(this);
		}
		
		return dao;
	}
}