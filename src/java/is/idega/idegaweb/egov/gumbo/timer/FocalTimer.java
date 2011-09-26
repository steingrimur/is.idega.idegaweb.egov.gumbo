package is.idega.idegaweb.egov.gumbo.timer;

import is.idega.idegaweb.egov.gumbo.business.GumboBusiness;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.CatchDelimiter;
import is.idega.idegaweb.egov.gumbo.data.FocalCase;
import is.idega.idegaweb.egov.gumbo.webservice.client.business.FocalWSClient;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.springframework.beans.factory.annotation.Autowired;

import com.idega.block.process.data.Case;
import com.idega.block.process.data.CaseHome;
import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.business.IBORuntimeException;
import com.idega.core.file.data.ICFile;
import com.idega.data.IDOLookup;
import com.idega.data.IDOLookupException;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.egov.bpm.data.CaseProcInstBind;
import com.idega.idegaweb.egov.bpm.data.dao.CasesBPMDAO;
import com.idega.jbpm.bean.VariableInstanceInfo;
import com.idega.jbpm.data.VariableInstanceQuerier;
import com.idega.slide.business.IWSlideService;
import com.idega.util.StringHandler;
import com.idega.util.expression.ELUtil;
import com.idega.util.timer.TimerEntry;
import com.idega.util.timer.TimerListener;
import com.idega.xml.XMLDocument;
import com.idega.xml.XMLElement;

public class FocalTimer implements TimerListener {
	@Autowired
	private CasesBPMDAO casesBPMDAO;

	@Autowired
	FocalWSClient focalClient;

	@Autowired
	private GumboDao gumboDAO;

	@Autowired
	private VariableInstanceQuerier variablesQuerier;

	@Autowired
	private GumboBusiness gumboBusiness;

	private static final Logger LOGGER = Logger.getLogger(FocalTimer.class
			.getName());

	private static final String VAR1 = "files_additionalAttachments";
	private static final String VAR2 = "files_attachments";
	private static final String VAR3 = "files_inviteParticipantAttachments";
	private static final String VAR4 = "files_processRullingAttachments";
	private static final String VAR5 = "files_pdfTaskView";
	private static final String VAR6 = "files_processRullingAttachments";

	private static final String TOP_FOLDER = "focal_top_folder";

	private static void rmChildDir(final File folder, boolean isTop) {
		// check if folder file is a real folder
		if (folder.isDirectory()) {
			File list[] = folder.listFiles();
			if (list != null) {
				for (int i = 0; i < list.length; i++) {
					File tmpF = list[i];
					if (tmpF.isDirectory()) {
						rmChildDir(tmpF, false);
					}
					tmpF.delete();
				}
			}
			if (!isTop) {
				if (!folder.delete()) {
					System.out.println("can't delete folder : " + folder);
				}
			}
		}
	}

	public void handleTimer(TimerEntry arg0) {
		System.out.println("STARTING FOCAL TIMER!!!!");

		boolean send = IWMainApplication.getDefaultIWApplicationContext()
				.getApplicationSettings()
				.getBoolean("dof_send_case_to_focal", true);

		/*if (!send) {
			System.out.println("NOT RUNNING FOCAL TIMER!!!!");
			return;
		}*/

		String topFolderName = IWMainApplication
				.getDefaultIWApplicationContext().getApplicationSettings()
				.getProperty(TOP_FOLDER, "/opt/tomcat/focal/");

		File folder = new File(topFolderName);
		if (folder.exists()) {
			rmChildDir(folder, true);
		}

		String statuses[] = { "SHUT" };
		try {
			// Finding all cases with status == finished
			Collection<Case> cases = getCaseHome().findByCriteria(null, null,
					null, statuses, null, null, null, null, false);
			for (Case procCase : cases) {
				// Checking if the case is a Focal case, note see special
				// handling for older aqua report cases
				if (procCase.getExternalId() != null
						&& !"".equals(procCase.getExternalId())) {
					FocalCase fc = getGumboDAO().getFocalCaseByCaseUniqueID(procCase.getUniqueId());
					if (fc != null) {
						//Already sent this case over to focal, go on to next case
						continue;
					}
					
					folder = new File(TOP_FOLDER, procCase.getPrimaryKey()
							.toString());
					System.out.println("folder = " + folder);
					folder.mkdirs();
					boolean sendToFocal = true;
					String error = null;

					if (procCase.getCaseCode().getCode().equals("CATCHDE")) {
						CatchDelimiter delim = getGumboBusiness()
								.getCatchDelimiter(procCase.getPrimaryKey());
						ICFile file = delim.getAttachment();
						if (file != null) {
							System.out.println("File = " + file.getName()
									+ " for " + procCase.getExternalId());
							String normalizedName = StringHandler
									.stripNonRomanCharacters(file.getName(),
											new char[] { '0', '1', '2', '3',
													'4', '5', '6', '7', '8',
													'9', '-', '.' });
							File output = new File(folder, normalizedName);
							FileOutputStream outputStream = new FileOutputStream(
									output);
							InputStream in = file.getFileValue();

							byte[] buffer = new byte[4096];
							int bytes_read;
							try {
								while ((bytes_read = in.read(buffer)) != -1) {
									outputStream.write(buffer, 0, bytes_read);
								}
							} catch (Exception e) {
								e.printStackTrace();
								sendToFocal = false;
								error = e.getMessage();
							} finally {
								outputStream.close();
								in.close();
							}
						} else {
							System.out.println("File is null for "
									+ procCase.getExternalId());
						}
					} else {
						System.out
								.println("case = " + procCase.getExternalId());

						FocalCase focalCase = getGumboDAO()
								.getFocalCaseByFocalCaseID(
										procCase.getExternalId());
						// focalCase == null -> not handled before so handle it
						if (focalCase == null) {
							CaseProcInstBind bind = getCasesBPMDAO()
									.getCaseProcInstBindByCaseId(
											(Integer) procCase.getPrimaryKey());
							if (bind == null) {
								LOGGER.warning("Case and process instance bind can not be found by case ID: "
										+ procCase.getPrimaryKey());
								continue;
							}

							Long procInstId = bind.getProcInstId();
							Collection<VariableInstanceInfo> variables = null;
							try {
								variables = variablesQuerier
										.getFullVariablesByProcessInstanceId(
												procInstId, false);
							} catch (Exception e) {
								LOGGER.log(Level.WARNING,
										"Error getting variables from process instance: "
												+ procInstId, e);
							}

							for (VariableInstanceInfo variable : variables) {
								String variableName = variable.getName();

								if (variableName != null) {
									if (VAR1.equals(variableName)
											|| VAR2.equals(variableName)
											|| VAR3.equals(variableName)
											|| VAR4.equals(variableName)
											|| VAR5.equals(variableName)
											|| VAR6.equals(variableName)) {
										// get filename from stringvalues (json)
										Object ret = variable.getValue();
										JSONParser parser = new JSONParser();
										JSONObject obj = (JSONObject) parser
												.parse(ret.toString());
										Iterator it = obj.keySet().iterator();
										while (it.hasNext()) {
											Object key = it.next();
											JSONObject obj2 = (JSONObject) parser
													.parse(obj.get(key)
															.toString());
											Iterator it2 = obj2.keySet()
													.iterator();
											while (it2.hasNext()) {
												Object key2 = it2.next();
												JSONObject obj3 = (JSONObject) parser
														.parse((String) obj2
																.get(key2));
												Iterator it3 = obj3.keySet()
														.iterator();
												while (it3.hasNext()) {
													Object key3 = it3.next();
													JSONObject file = (JSONObject) obj3
															.get(key3);
													String filePath = (String) file
															.get("identifier");
													String fileName = (String) file
															.get("fileName");
													System.out
															.println("filename = "
																	+ filePath);
													System.out
															.println("filename = "
																	+ fileName);

													String normalizedName = StringHandler
															.stripNonRomanCharacters(
																	fileName,
																	new char[] {
																			'0',
																			'1',
																			'2',
																			'3',
																			'4',
																			'5',
																			'6',
																			'7',
																			'8',
																			'9',
																			'-',
																			'.' });

													File output = new File(
															folder,
															normalizedName);
													FileOutputStream outputStream = new FileOutputStream(
															output);
													InputStream in = getSlideService()
															.getInputStream(
																	filePath);

													byte[] buffer = new byte[4096];
													int bytes_read;
													try {
														while ((bytes_read = in
																.read(buffer)) != -1) {
															outputStream.write(
																	buffer, 0,
																	bytes_read);
														}
													} catch (Exception e) {
														e.printStackTrace();
														sendToFocal = false;
														error = e.getMessage();
													} finally {
														outputStream.close();
														in.close();
													}
												}
											}
										}
									}
								}
							}
						}
					}

					getGumboDAO().createFocalCase(procCase.getExternalId(),
							procCase.getUniqueId(), 1, false, "");

					/*
					 * if (sendToFocal) { // send to focal and create FocalCase
					 * entry XMLDocument ret =
					 * getFocalWSClient().closeFocalCase(
					 * procCase.getExternalId(),
					 * procCase.getPrimaryKey().toString()); if
					 * (hasAnswerErrors(ret)) { getGumboDAO().createFocalCase(
					 * procCase.getExternalId(), procCase.getUniqueId(), -1,
					 * true, getAnswerErrors(ret));
					 * 
					 * } else { int noa = getNumberOfAttachements(ret);
					 * getGumboDAO().createFocalCase( procCase.getExternalId(),
					 * procCase.getUniqueId(), noa, false, ""); } } else {
					 * getGumboDAO().createFocalCase(procCase.getExternalId(),
					 * procCase.getUniqueId(), -1, true, error); }
					 */
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("FOCAL TIMER DONE!!!!");
	}

	private boolean hasAnswerErrors(XMLDocument answer) {
		XMLElement root = answer.getRootElement();
		XMLElement error = root.getChild("error");

		if (error.getText() == null || error.getText().equals("")) {
			return false;
		}

		return true;
	}

	private String getAnswerErrors(XMLDocument answer) {
		XMLElement root = answer.getRootElement();
		XMLElement error = root.getChild("error");

		return error.getText();
	}

	private int getNumberOfAttachements(XMLDocument answer) {
		XMLElement root = answer.getRootElement();
		XMLElement attachments = root.getChild("attachments");

		if (attachments.getText() == null || attachments.getText().equals("")) {
			return 0;
		}

		return Integer.parseInt(attachments.getText());
	}

	private CasesBPMDAO getCasesBPMDAO() {
		if (this.casesBPMDAO == null) {
			ELUtil.getInstance().autowire(this);
		}
		return this.casesBPMDAO;
	}

	private CaseHome getCaseHome() {
		try {
			return (CaseHome) IDOLookup.getHome(Case.class);
		} catch (IDOLookupException ile) {
			throw new IBORuntimeException(ile);
		}
	}

	private FocalWSClient getFocalWSClient() {
		if (this.focalClient == null) {
			ELUtil.getInstance().autowire(this);
		}

		return focalClient;
	}

	private GumboDao getGumboDAO() {
		if (this.gumboDAO == null) {
			ELUtil.getInstance().autowire(this);
		}

		return gumboDAO;
	}

	private GumboBusiness getGumboBusiness() {
		if (this.gumboBusiness == null) {
			ELUtil.getInstance().autowire(this);
		}

		return gumboBusiness;
	}

	IWSlideService getSlideService() {
		try {
			return IBOLookup.getServiceInstance(
					IWMainApplication.getDefaultIWApplicationContext(),
					IWSlideService.class);
		} catch (IBOLookupException e) {
			e.printStackTrace();
		}
		return null;
	}
}