package is.idega.idegaweb.egov.gumbo.licenses;

import java.util.Date;

public class Inteval {
	
	private final Date from;
	private final Date to;
	
	public Inteval(Date from, Date to) {
		this.from = from;
		this.to = to;
	}
	
	public Date getFrom() {
		return from;
	}
	
	public Date getTo() {
		return to;
	}
	
	public static final class XFormsInteval {
		
		private final String from;
		private final String to;
		
		public XFormsInteval(String from, String to) {
			this.from = from;
			this.to = to;
		}
		
		public String getFrom() {
			return from;
		}
		
		public String getTo() {
			return to;
		}
	}
}