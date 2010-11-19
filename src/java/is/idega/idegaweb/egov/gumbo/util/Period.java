package is.idega.idegaweb.egov.gumbo.util;

public class Period {

	private String period;
	private String name;

	public Period(String period, String name) {
		setPeriod(period);
		setName(name);
	}
	
	public String getPeriod() {
		return period;
	}

	public void setPeriod(String period) {
		this.period = period;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}