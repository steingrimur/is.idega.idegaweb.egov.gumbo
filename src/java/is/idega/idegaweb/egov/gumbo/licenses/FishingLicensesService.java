package is.idega.idegaweb.egov.gumbo.licenses;

import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfagerdTypeUser;
import is.idega.idegaweb.egov.gumbo.licenses.Interval.XFormsInterval;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.DOFWSClient;

import java.math.BigDecimal;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.bpm.xformsview.converters.DateConverter;

@Service("fishingLicensesService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class FishingLicensesService {
	
	@Autowired
	private DateConverter dateConverter;
	
	@Autowired
	@Qualifier(DOFWSClient.WEB_SERVICE)
	private DOFWSClient client;
	
	public XFormsInterval getLicenseIntervalForGrasleppa(String fishingAreaId) {
		
		Map<BigDecimal, VeidileyfagerdTypeUser> ret = getClient().getGrasleppaAreas();
		VeidileyfagerdTypeUser type = ret.get(new BigDecimal(fishingAreaId));
		
		final Interval iv = new Interval(type.getUpphafVeiditimabils().getTime(), type.getUrGildi().getTime());
		
		return fromIntervalToXFormsInterval(iv);
	}
	
	private XFormsInterval fromIntervalToXFormsInterval(Interval iv) {	
		return new XFormsInterval(getDateConverter()
		        .convertDateToComplyWithXForms(iv.getFrom()),
		        getDateConverter().convertDateToComplyWithXForms(iv.getTo()));
	}
		
	private DateConverter getDateConverter() {
		return dateConverter;
	}
	
	private DOFWSClient getClient() {
		return client;
	}
}