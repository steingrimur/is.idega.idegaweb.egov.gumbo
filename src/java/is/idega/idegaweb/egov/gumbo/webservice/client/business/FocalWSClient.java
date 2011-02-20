package is.idega.idegaweb.egov.gumbo.webservice.client.business;

import is.focal.webservice.FocalIdegaDoc;
import is.focal.webservice.FocalIdegaDocServiceLocator;

import java.io.IOException;
import java.io.StringReader;
import java.net.URL;
import java.rmi.RemoteException;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.idegaweb.IWMainApplication;
import com.idega.xml.XMLDocument;
import com.idega.xml.XMLElement;
import com.idega.xml.XMLException;
import com.idega.xml.XMLOutput;
import com.idega.xml.XMLParser;

@Service
@Scope("singleton")
public class FocalWSClient {
	private static final String DEFAULT_ENDPOINT = "http://fiskur.fiskistofa.is:80/focal/WSIdegaDOC.nsf/WSIdegaDOC?OpenWebService";
	private static final String ENDPOINT_ATTRIBUTE_NAME = "focal_endpoint";

	private static final String FOCAL_ACCESS_ATTRIBUTE_NAME = "focal_access_key";

	private FocalIdegaDoc getPort() {
		try {
			String endPoint = IWMainApplication
					.getDefaultIWApplicationContext().getApplicationSettings()
					.getProperty(ENDPOINT_ATTRIBUTE_NAME, DEFAULT_ENDPOINT);

			FocalIdegaDocServiceLocator locator = new FocalIdegaDocServiceLocator();
			FocalIdegaDoc port = locator.getDomino(new URL(endPoint));

			// ((org.apache.axis.client.Stub) port).setTimeout(timeout)

			return port;
		} catch (Exception e) {
			e.printStackTrace();
		}

		return null;
	}

	public String createFocalCase(String id, String caseID, String caseName,
			String custID, String custName, String projectID, String documentKey) {
		String access = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getProperty(FOCAL_ACCESS_ATTRIBUTE_NAME, "");
		String xml = createCaseXML(id, caseID, caseName, custID, custName,
				projectID, documentKey);
		try {
			String ret = getPort().CREATEIDEGACASE(xml, access);
			XMLDocument retDoc = parseFocalAnswer(ret);
			if (hasAnswerErrors(retDoc)) {
				// Do something with the error?
				System.out.println("error = " + getFocalKeyFromAnswer(retDoc, "error"));
				return null;
			}

			return getFocalKeyFromAnswer(retDoc, "id");
		} catch (RemoteException e) {
		}

		return null;
	}

	public void closeFocalCase(String focalID) {
		//getPort().
	}
	
	private String createCaseXML(String id, String caseID, String caseName,
			String custID, String custName, String projectID, String documentKey) {
		XMLElement root = new XMLElement("IdegaDOC");
		XMLElement subRoot = new XMLElement("IdegaDOCCase");
		root.addContent(subRoot);

		XMLElement idEl = new XMLElement("ID");
		idEl.setText(id);

		XMLElement caseIDEl = new XMLElement("CaseID");
		caseIDEl.setText(caseID);

		XMLElement caseNameEl = new XMLElement("CaseName");
		caseNameEl.setText(caseName);

		XMLElement custIDEl = new XMLElement("CustID");
		custIDEl.setText(custID);

		XMLElement custNameEl = new XMLElement("CustName");
		custNameEl.setText(custName);

		XMLElement procjectIDEl = new XMLElement("ProjectID");
		procjectIDEl.setText(projectID == null ? "" : projectID);

		XMLElement documentKeyEl = new XMLElement("DocumentKey");
		documentKeyEl.setText(documentKey == null ? "" : documentKey);

		subRoot.addContent(idEl);
		subRoot.addContent(caseIDEl);
		subRoot.addContent(caseNameEl);
		subRoot.addContent(custIDEl);
		subRoot.addContent(custNameEl);
		subRoot.addContent(procjectIDEl);
		subRoot.addContent(documentKeyEl);

		XMLDocument doc = new XMLDocument(root);

		XMLOutput output = new XMLOutput("    ", true);
		output.setEncoding("ISO-8859-1");
		try {
			return output.outputString(doc);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "";
	}

	private XMLDocument parseFocalAnswer(String answer) {
		XMLParser parser = new XMLParser();
		try {
			return parser.parse(new StringReader(answer));
		} catch (XMLException e) {
			e.printStackTrace();
		}

		return null;
	}

	private boolean hasAnswerErrors(XMLDocument answer) {
		XMLElement root = answer.getRootElement();
		XMLElement error = root.getChild("error");

		if (error.getText() == null || error.getText().equals("")) {
			return false;
		}

		return true;
	}

	private String getFocalKeyFromAnswer(XMLDocument answer, String key) {
		XMLElement root = answer.getRootElement();
		XMLElement child = root.getChild(key);

		return child.getText();
	}

	public static void main(String args[]) {
		FocalWSClient client = new FocalWSClient();
		System.out.println("xml = "
				+ client.createCaseXML("28618", "P-2011-01-14-0003",
						"Málið mitt góða", "3107713339", "Jóhann Þ Þórðarson",
						"0074/2011", " "));

		String dummy = client.createDummyXML();
		System.out.println("xml = " + dummy);

		XMLDocument doc = client.parseFocalAnswer(dummy);
		System.out.println("is error? = " + client.hasAnswerErrors(doc));
		System.out.println("key = " + client.getFocalKeyFromAnswer(doc, "id"));
		System.out.println("error = "
				+ client.getFocalKeyFromAnswer(doc, "error"));
	}

	private String createDummyXML() {
		XMLElement root = new XMLElement("Document");

		XMLElement id = new XMLElement("id");
		id.setText("12345678901234567890123456789012");

		XMLElement error = new XMLElement("error");
		error.setText("Þetta virkar ekkert. Allt í drasli!!!");

		root.addContent(id);
		root.addContent(error);

		XMLDocument doc = new XMLDocument(root);

		XMLOutput output = new XMLOutput("    ", true);
		output.setEncoding("ISO-8859-1");
		try {
			return output.outputString(doc);
		} catch (IOException e) {
			e.printStackTrace();
		}

		return "";
	}
}