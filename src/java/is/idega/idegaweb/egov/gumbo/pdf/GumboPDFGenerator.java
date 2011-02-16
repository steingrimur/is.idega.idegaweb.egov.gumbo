package is.idega.idegaweb.egov.gumbo.pdf;

import is.fiskistofa.webservices.skip.FSWebServiceSKIP_wsdl.SkipInfoTypeUser;
import is.fiskistofa.webservices.veidileyfi.FSWebServiceVEIDILEYFI_wsdl.VeidileyfiTypeUser;

import java.io.InputStream;
import java.io.OutputStream;
import java.rmi.RemoteException;
import java.util.Locale;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.block.pdf.business.PrintingContext;
import com.idega.block.pdf.business.PrintingService;
import com.idega.business.IBOLookup;
import com.idega.business.IBORuntimeException;
import com.idega.company.data.Company;
import com.idega.idegaweb.IWApplicationContext;
import com.idega.idegaweb.IWMainApplication;
import com.idega.io.MemoryFileBuffer;
import com.idega.io.MemoryInputStream;
import com.idega.io.MemoryOutputStream;

@Service
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class GumboPDFGenerator {
	
	public InputStream generateFishingLicensePDF(String licenseType, VeidileyfiTypeUser license, Company fishery, SkipInfoTypeUser ship, Locale locale) {
		InputStream pdfStream = getDocumentStream(new FishingLicensePrintingContext(IWMainApplication.getDefaultIWApplicationContext(), licenseType, license, fishery, ship, locale));
		return pdfStream;
	}
	
	private InputStream getDocumentStream(PrintingContext pcx) {
		try {
			MemoryFileBuffer buffer = new MemoryFileBuffer();
			OutputStream mos = new MemoryOutputStream(buffer);
			InputStream mis = new MemoryInputStream(buffer);

			pcx.setDocumentStream(mos);

			getPrintingService().printDocument(pcx);
			
			return mis;
		}
		catch (RemoteException re) {
			throw new IBORuntimeException(re);
		}
	}
	
	private PrintingService getPrintingService() {
		try {
			return (PrintingService) IBOLookup.getServiceInstance(getIWApplicationContext(), PrintingService.class);
		}
		catch (RemoteException e) {
			throw new IBORuntimeException(e.getMessage());
		}
	}
	
	private IWApplicationContext getIWApplicationContext() {
		return IWMainApplication.getDefaultIWApplicationContext();
	}
}