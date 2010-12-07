package is.idega.idegaweb.egov.gumbo.webservice.client.business;

public class LicenseCheckContainer {
	private String message;
	private boolean hasLicense;
	
	public LicenseCheckContainer(boolean hasLicense, String message) {
		this.message = message;
		this.hasLicense = hasLicense;
	}
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isHasLicense() {
		return hasLicense;
	}
	public void setHasLicense(boolean hasLicense) {
		this.hasLicense = hasLicense;
	}	
}