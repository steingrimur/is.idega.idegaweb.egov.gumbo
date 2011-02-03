package is.idega.idegaweb.egov.gumbo.licenses;

import java.util.Date;

public class Interval {
	
	private final Date from;
	private final Date to;
	
	public Interval(Date from, Date to) {
		this.from = from;
		this.to = to;
	}
	
	public Date getFrom() {
		return from;
	}
	
	public Date getTo() {
		return to;
	}
	
	public static final class XFormsInterval {
		
		private final String from;
		private final String to;
		
		public XFormsInterval(String from, String to) {
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