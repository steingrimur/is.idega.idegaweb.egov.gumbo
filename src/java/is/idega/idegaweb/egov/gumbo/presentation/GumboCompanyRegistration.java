package is.idega.idegaweb.egov.gumbo.presentation;

import is.idega.idegaweb.egov.company.data.CompanyApplication;
import is.idega.idegaweb.egov.company.presentation.company.CompanyApplicationCreator;

import java.rmi.RemoteException;
import java.util.logging.Level;

import javax.ejb.FinderException;

import com.idega.company.data.Company;
import com.idega.company.data.CompanyType;
import com.idega.core.accesscontrol.business.NotLoggedOnException;
import com.idega.core.builder.data.ICPage;
import com.idega.core.contact.data.Email;
import com.idega.core.contact.data.Phone;
import com.idega.core.contact.data.PhoneTypeBMPBean;
import com.idega.presentation.IWContext;
import com.idega.presentation.Layer;
import com.idega.presentation.text.Link;
import com.idega.presentation.ui.TextInput;
import com.idega.user.business.UserBusiness;
import com.idega.user.data.User;
import com.idega.util.EmailValidator;

public class GumboCompanyRegistration extends CompanyApplicationCreator {

	@Override
	protected void addFormItems(Layer section, TextInput personalID,
			TextInput name, TextInput address, TextInput postalCode,
			TextInput city, TextInput phone, TextInput fax, TextInput webPage,
			TextInput email, TextInput bankAccount) {
		addFormItem(section, iwrb.getLocalizedString("personal_id", "Personal ID"), personalID, PARAMETER_COMPANY_PERSONAL_ID, true);
		
		addFormItem(section, iwrb.getLocalizedString("name", "Name"), name);

		addFormItem(section, iwrb.getLocalizedString("address", "Address"), address);

		addFormItem(section, iwrb.getLocalizedString("postal_code", "Postal code"), postalCode);

		addFormItem(section, iwrb.getLocalizedString("city", "City"), city);

		addFormItem(section, iwrb.getLocalizedString("phone", "Phone"), phone, PARAMETER_PHONE, true);

		addFormItem(section, iwrb.getLocalizedString("web_page", "Web page"), webPage);

		addFormItem(section, iwrb.getLocalizedString("email", "E-mail"), email, PARAMETER_EMAIL, true);
	}

	@Override
	protected void save(IWContext iwc) throws RemoteException {
		boolean success = true;
		Company company = null;
		
		if (!iwc.isParameterSet(PARAMETER_AGREEMENT)) {
			setError(PARAMETER_AGREEMENT, iwrb.getLocalizedString("application_error.must_agree_terms", "You have to agree to the terms."));
		}
		if (!iwc.isParameterSet(PARAMETER_COMPANY_PERSONAL_ID)) {
			setError(PARAMETER_COMPANY_PERSONAL_ID, iwrb.getLocalizedString("application_error.must_enter_personal_id",
					"You have to enter a personal ID."));
		}
		else {
			try {
				company = getCompanyBusiness(iwc).getCompany(iwc.getParameter(PARAMETER_COMPANY_PERSONAL_ID));
			}
			catch (FinderException e) {
				setError(PARAMETER_COMPANY_PERSONAL_ID, iwrb.getLocalizedString("application_error.company_not_found",
						"The personal ID you have entered is not in the company register."));
			}
			
			CompanyApplication application = null;
			try {
				application = getCompanyApplicationBusiness().getCompanyApplicationHome().findByCompany(company);
			} catch (Exception e) {}
			if (application != null) {
				setError(PARAMETER_COMPANY_PERSONAL_ID, iwrb.getLocalizedString("application_error.company_already_applied",
						"The company has already applied for an account."));
			}
		}
		if (!iwc.isParameterSet(PARAMETER_PHONE)) {
			setError(PARAMETER_PHONE, iwrb.getLocalizedString("application_error.must_enter_phone", "You have to enter a phone number."));
		}
		if (!iwc.isParameterSet(PARAMETER_EMAIL)) {
			setError(PARAMETER_EMAIL, iwrb.getLocalizedString("application_error.must_enter_email", "You have to enter an e-mail address."));
		}
		else if (!EmailValidator.getInstance().validateEmail(iwc.getParameter(PARAMETER_EMAIL))) {
			setError(PARAMETER_EMAIL, iwrb.getLocalizedString("application_error.invalid_email", "You have entered an invalid e-mail address."));
		}
		
		User user = null;
		if (iwc.isParameterSet(PARAMETER_ADMIN_PERSONAL_ID)) {
			try {
				user = getUserBusiness(iwc).getUser(iwc.getParameter(PARAMETER_ADMIN_PERSONAL_ID));
			} catch (Exception e) {}
			if (user == null) {
				log(Level.INFO, "User not found by provided ID: " + iwc.getParameter(PARAMETER_ADMIN_PERSONAL_ID));
				setError(PARAMETER_ADMIN_PERSONAL_ID, iwrb.getLocalizedString("application_error.invalid_user", "You have to select contact person."));
			}
		}
		else {
			setError(PARAMETER_ADMIN_PERSONAL_ID, iwrb.getLocalizedString("application_error.invalid_user", "You have to select contact person."));
		}
		if (!iwc.isParameterSet(PARAMETER_WORK_PHONE)) {
			setError(PARAMETER_WORK_PHONE, iwrb.getLocalizedString("application_error.must_enter_work_phone", "You have to enter work phone."));
		}
		if (!iwc.isParameterSet(PARAMETER_MOBILE_PHONE)) {
			setError(PARAMETER_MOBILE_PHONE, iwrb.getLocalizedString("application_error.must_enter_mobile_phone", "You have to enter mobile phone."));
		}
		if (!iwc.isParameterSet(PARAMETER_ADMIN_EMAIL)) {
			setError(PARAMETER_ADMIN_EMAIL, iwrb.getLocalizedString("application_error.must_enter_admin_email", "You have to enter an email address."));
		}
		else if (!EmailValidator.getInstance().validateEmail(iwc.getParameter(PARAMETER_ADMIN_EMAIL))) {
			setError(PARAMETER_ADMIN_EMAIL, iwrb.getLocalizedString("application_error.invalid_email", "You have entered an invalid e-mail address."));
		}
		if (hasErrors()) {
			showPhaseOne(iwc, ACTION_SAVE, iNumberOfPhases);
			return;
		}
		
		CompanyType companyType = null;
		if (iwc.isParameterSet(PARAMETER_TYPE)) {
			try {
				companyType = getCompanyBusiness(iwc).getCompanyType(iwc.getParameter(PARAMETER_TYPE));
			} catch (FinderException e) {
				e.printStackTrace();
			}
		}

		String companyPhone = iwc.isParameterSet(PARAMETER_PHONE) ? iwc.getParameter(PARAMETER_PHONE) : null;
		String companyWebPage = iwc.isParameterSet(PARAMETER_WEB_PAGE) ? iwc.getParameter(PARAMETER_WEB_PAGE) : null;
		String companyEmail = iwc.isParameterSet(PARAMETER_EMAIL) ? iwc.getParameter(PARAMETER_EMAIL) : null;
		String companyBankAccount = iwc.isParameterSet(PARAMETER_BANK_ACCOUNT) ? iwc.getParameter(PARAMETER_BANK_ACCOUNT) : null;

		String adminWorkPhone = iwc.isParameterSet(PARAMETER_WORK_PHONE) ? iwc.getParameter(PARAMETER_WORK_PHONE) : null;
		String adminMobilePhone = iwc.isParameterSet(PARAMETER_MOBILE_PHONE) ? iwc.getParameter(PARAMETER_MOBILE_PHONE) : null;
		String adminEmail = iwc.isParameterSet(PARAMETER_ADMIN_EMAIL) ? iwc.getParameter(PARAMETER_ADMIN_EMAIL) : null;

		UserBusiness userBusiness = getUserBusiness(iwc);
			try {
				userBusiness.updateUserWorkPhone(user, adminWorkPhone);
				userBusiness.updateUserMobilePhone(user, adminMobilePhone);
				userBusiness.updateUserMail(user, adminEmail);
			} catch(Exception e) {
				e.printStackTrace();
			}
			try {
				Phone phone = userBusiness.getPhoneHome().create();
				phone.setPhoneTypeId(PhoneTypeBMPBean.HOME_PHONE_ID);
				phone.setNumber(companyPhone);
				company.updatePhone(phone);
			} catch(Exception e) {
				e.printStackTrace();
			}
						
			try {
				Email email = userBusiness.getEmailHome().create();
				email.setEmailAddress(companyEmail);
				company.updateEmail(email);
			} catch(Exception e) {
				e.printStackTrace();
			}
				
			company.setWebPage(companyWebPage);
			company.setBankAccount(companyBankAccount);
			company.store();
			
			User currentUser = null;
			try {
				currentUser = iwc.getCurrentUser();
			} catch (NotLoggedOnException e) {
				log(Level.INFO, "User is not logged, some settings for application might be not set!");
			}
			CompanyApplication application = null;
			try {
				application = getCompanyApplicationBusiness().storeApplication(iwc, user, companyType, company, currentUser);
				getCompanyApplicationBusiness().approveApplication(iwc, application);
			} catch (Exception e) {
				success = false;
				e.printStackTrace();
			}
			
			if (application == null) {
				success = false;
			}
//		}
		if (success) {
			addPhasesReceipt(iwc, iwrb.getLocalizedString("application.receipt", "Application receipt"),
					iwrb.getLocalizedString("application.receipt_subject", "Application sent"),
					iwrb.getLocalizedString("application.receipt_body", "Your application has been received."), ACTION_SAVE, iNumberOfPhases);
		}
		else {
			add(getPhasesHeader(iwrb.getLocalizedString("application.submit_failed", "Application submit failed"), ACTION_SAVE, iNumberOfPhases));
			add(getStopLayer(iwrb.getLocalizedString("application.submit_failed", "Application submit failed"),
					iwrb.getLocalizedString("application.submit_failed_info", "Application submit failed")));
		}

		Layer clearLayer = new Layer(Layer.DIV);
		clearLayer.setStyleClass("Clear");
		add(clearLayer);

		Layer bottom = new Layer(Layer.DIV);
		bottom.setStyleClass("bottom");
		add(bottom);

		if (iwc.isLoggedOn()) {
			try {
				ICPage page = userBusiness.getHomePageForUser(iwc.getCurrentUser());
				Link link = getButtonLink(iwrb.getLocalizedString("my_page", "My page"));
				link.setStyleClass("homeButton");
				link.setPage(page);
				bottom.add(link);
			}
			catch (FinderException fe) {}
		}
		else {
			Link link = getButtonLink(iwrb.getLocalizedString("back", "Back"));
			link.setStyleClass("homeButton");
			link.setURL("/pages/");
			bottom.add(link);
		}
	}
}