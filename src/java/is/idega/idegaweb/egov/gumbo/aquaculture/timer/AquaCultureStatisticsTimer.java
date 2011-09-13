package is.idega.idegaweb.egov.gumbo.aquaculture.timer;

import is.idega.idegaweb.egov.gumbo.aquaculture.dao.AquaDAO;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatHeader;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;

import com.idega.block.process.business.CaseBusiness;
import com.idega.block.process.data.Case;
import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.idegaweb.IWMainApplication;
import com.idega.idegaweb.egov.bpm.data.CaseProcInstBind;
import com.idega.idegaweb.egov.bpm.data.dao.CasesBPMDAO;
import com.idega.jbpm.bean.VariableInstanceInfo;
import com.idega.jbpm.bean.VariableInstanceType;
import com.idega.jbpm.data.VariableInstanceQuerier;
import com.idega.jbpm.utils.JSONUtil;
import com.idega.util.expression.ELUtil;
import com.idega.util.timer.TimerEntry;
import com.idega.util.timer.TimerListener;

public class AquaCultureStatisticsTimer implements TimerListener {

	private static final String EXPECTED_QUANTITY_PRODUCED = "objlist_expectedQuantityProduced";
	private static final String FARM_STRUCTURE = "objlist_farmStructure";
	private static final String FISHED_FOR_ON_GROWING = "objlist_fishedForOnGrowing";
	private static final String INVENTORY = "objlist_inventoryAtYearEnd";
	private static final String SALES = "objlist_sales";

	private static final String COMPANY_ADDRESS = "string_companyAddress";
	private static final String COMPANY_NAME = "string_companyName";
	private static final String COMPANY_SSN = "string_companySocialNumber";
	private static final String GATHER_INFO = "string_gatherInformation";
	private static final String FARM_NAME = "string_reportForTheFarmOutput";
	private static final String FARM_NAME_ID = "string_reportForTheFarm";
	private static final String YEAR = "string_reportForTheYear";
	private static final String COMMENT = "string_salesComments";

	private static final String GROUP = "speciesGroupOutput";
	private static final String SPECIES = "speciesOutput";
	private static final String QUANTITY = "quantity";
	private static final String QUANTITY_UNIT = "quantityUnitOutput";
	private static final String COMMENTS = "comments";
	private static final String AQUA_METHOD = "aquamethodOutput";
	private static final String AQUA_ENVIRONMENT = "aquaEnvironmentOutput";
	private static final String SIZE = "size";
	private static final String UNIT = "unitOutput";
	private static final String COUNT = "count";
	private static final String WEIGHT = "weight";
	private static final String KG = "kg";
	private static final String PROCESS = "farminPurposeOutput";
	private static final String CONDITION = "statusNowOutput";
	private static final String SOLD_TO = "soldToOutput";
	private static final String PRICE = "price";
	private static final String PRICE_UNIT = "priceUnitOutput";
	private static final String AMOUNT = "value";
	private static final String BUYERS_SSN = "buyerSocialSecurityNrOutput";
	private static final String BUYERS_NAME = "buyerNameOutput";
	private static final String SOLD_TO_FARM = "fishFarmOutput";

	@Autowired
	private AquaDAO aquaDAO;

	@Autowired
	private CasesBPMDAO casesBPMDAO;

	@Autowired
	private VariableInstanceQuerier variablesQuerier;

	private static final Logger LOGGER = Logger
			.getLogger(AquaCultureStatisticsTimer.class.getName());

	public void handleTimer(TimerEntry entry) {
		System.out.println("STARTING AQUA STATISTICS TIMER!!!!");

		try {
			List<Long> cases = getCasesBPMDAO().getCaseIdsByProcessDefinition(
					"Aquaculture");
			for (Long caseId : cases) {
				Case procCase = getCaseBusiness().getCase(caseId.intValue());
				List<ACStatHeader> headers = getAquaDAO()
						.getACStatHeaderByCaseUniqueID(procCase.getUniqueId());
				if ((headers == null || headers.isEmpty()) && !getCaseBusiness().getCaseStatusDeleted().getStatus().equals(procCase.getCaseStatus().getStatus())) {
					String personalID = null;
					String name = null;
					String address = null;
					String farm = null;
					Long farmID = null;
					String year = null;
					String comment = null;
					boolean canSendInfo = false;

					List<ExpectedQuantityProduced> expectedQuantityProduced = new ArrayList<ExpectedQuantityProduced>();
					List<FarmStructure> farmStructure = new ArrayList<FarmStructure>();
					List<FishedForOnGrowing> fishedForOnGrowing = new ArrayList<FishedForOnGrowing>();
					List<InventoryAtYearEnd> inventoryAtYearEnd = new ArrayList<InventoryAtYearEnd>();
					List<Sales> sales = new ArrayList<Sales>();
					boolean expectedProducedDone = false;
					boolean farmStructureDone = false;
					boolean fishedDone = false;
					boolean inventoryDone = false;
					boolean salesDone = false;

					CaseProcInstBind bind = getCasesBPMDAO()
							.getCaseProcInstBindByCaseId(
									(Integer) procCase.getPrimaryKey());
					if (bind == null) {
						LOGGER.warning("Case and process instance bind can not be found by case ID: "
								+ procCase.getPrimaryKey());
						return;
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
						String type = variable.getType().toString();
						String variableName = variable.getName();
						if (VariableInstanceType.STRING.toString().equals(type)) {
							System.out.println("name = " + variableName);
							System.out.println("value = "
									+ (String) variable.getValue());
							if (COMPANY_ADDRESS.equals(variableName)) {
								if (address == null) {
									address = (String) variable.getValue();
								}
							} else if (COMPANY_NAME.equals(variableName)) {
								if (name == null) {
									name = (String) variable.getValue();
								}
							} else if (COMPANY_SSN.equals(variableName)) {
								if (personalID == null) {
									personalID = (String) variable.getValue();
								}
							} else if (GATHER_INFO.equals(variableName)) {
								String tmp = (String) variable.getValue();
								if ("true".equals(tmp)) {
									canSendInfo = true;
								} else {
									canSendInfo = false;
								}
							} else if (FARM_NAME.equals(variableName)) {
								if (farm == null) {
									farm = (String) variable.getValue();
								} 
							} else if (FARM_NAME_ID.equals(variableName)) {
								if (farmID == null) {
									String tmp = (String) variable.getValue();
									if (tmp != null && !"".equals(tmp)) {
										try {
											farmID = new Long(tmp);
										} catch (Exception e) {
											farmID = null;
										}
									}
								}
							} else if (YEAR.equals(variableName)) {
								if (year == null) {
									year = (String) variable.getValue();
								}
							} else if (COMMENT.equals(variableName)) {
								if (comment == null) {
									comment = (String) variable.getValue();
									if (comment != null && comment.length() > 1000) {
										comment = comment.substring(0, 1000);
									}
								}
							}
						} else if (VariableInstanceType.BYTE_ARRAY.toString()
								.equals(type)) {
							Object ret = variable.getValue();
							JSONUtil jsonUtil = new JSONUtil();
							JSONParser parser = new JSONParser();
							if (ret instanceof ArrayList) {
								ArrayList tmp = (ArrayList) ret;
								for (Object object : tmp) {
									System.out.println("object = "
											+ object.toString());
									Object parsed = parser
											.parse((String) object);
									System.out.println("parsed = "
											+ parsed.toString());
									ArrayList<LinkedHashMap> maps = new ArrayList<LinkedHashMap>();
									if (parsed instanceof JSONArray) {
										JSONArray array = (JSONArray) parsed;
										for (int count = 0; count < array
												.size(); count++) {
											LinkedHashMap map = (LinkedHashMap) jsonUtil
													.convertToObject(array.get(
															count).toString());
											maps.add(map);
										}
									} else {
										LinkedHashMap map = (LinkedHashMap) jsonUtil
												.convertToObject(parsed
														.toString());
										maps.add(map);
									}

									for (int count = 0; count < maps.size(); count++) {
										LinkedHashMap map = maps.get(count);
										if (EXPECTED_QUANTITY_PRODUCED
												.equals(variableName)
												&& !expectedProducedDone) {
											String group = (String) map
													.get(GROUP);
											if (group != null
													&& !"".equals(group)) {
												ExpectedQuantityProduced e = new ExpectedQuantityProduced();
												e.setGroup(group);
												e.setSpecies((String) map
														.get(SPECIES));
												try {
													e.setQuantity(new Float(
															(String) map
																	.get(QUANTITY)));
												} catch (Exception ex) {
													e.setQuantity(0.0f);
												}
												e.setQuantityUnit((String) map
														.get(QUANTITY_UNIT));
												String c = (String) map.get(COMMENTS);
												if (c != null && c.length() > 1000) {
													c = c.substring(0, 1000);
												}
												e.setComments(c);

												expectedQuantityProduced.add(e);
											}
										} else if (FARM_STRUCTURE
												.equals(variableName)
												&& !farmStructureDone) {
											String group = (String) map
													.get(GROUP);
											if (group != null
													&& !"".equals(group)) {
												FarmStructure f = new FarmStructure();
												f.setGroup(group);
												f.setMethod((String) map
														.get(AQUA_METHOD));
												f.setEnvironment((String) map
														.get(AQUA_ENVIRONMENT));
												try {
													f.setSize(new Float(
															(String) map
																	.get(SIZE)));
												} catch (Exception ex) {
													f.setSize(0.0f);
												}
												f.setUnit((String) map
														.get(UNIT));
												farmStructure.add(f);
											}
										} else if (FISHED_FOR_ON_GROWING
												.equals(variableName)
												&& !fishedDone) {
											String group = (String) map
													.get(GROUP);
											if (group != null
													&& !"".equals(group)) {
												FishedForOnGrowing f = new FishedForOnGrowing();
												f.setGroup(group);
												f.setSpecies((String) map
														.get(SPECIES));
												try {
													f.setCount(new Float(
															(String) map
																	.get(QUANTITY)));
												} catch (Exception ex) {
													f.setCount(0.0f);
												}
												try {
													f.setWeight(new Float(
															(String) map
																	.get(WEIGHT)));
												} catch (Exception ex) {
													f.setWeight(0.0f);
												}
												try {
													f.setKg(new Float(
															(String) map
																	.get(KG)));
												} catch (Exception ex) {
													f.setKg(0.0f);
												}

												fishedForOnGrowing.add(f);
											}
										} else if (INVENTORY
												.equals(variableName)
												&& !inventoryDone) {
											String group = (String) map
													.get(GROUP);
											if (group != null
													&& !"".equals(group)) {
												InventoryAtYearEnd i = new InventoryAtYearEnd();
												i.setGroup(group);
												i.setSpecies((String) map
														.get(SPECIES));
												try {
													i.setQuantity(new Float(
															(String) map
																	.get(QUANTITY)));
												} catch (Exception ex) {
													i.setQuantity(0.0f);
												}
												i.setQuantityUnit((String) map
														.get(QUANTITY_UNIT));
												String c = (String) map.get(COMMENTS);
												if (c != null && c.length() > 1000) {
													c = c.substring(0, 1000);
												}
												i.setComments(c);

												inventoryAtYearEnd.add(i);
											}
										} else if (SALES.equals(variableName)
												&& !salesDone) {
											String group = (String) map
													.get(GROUP);
											if (group != null
													&& !"".equals(group)) {
												Sales s = new Sales();
												s.setGroup(group);
												s.setSpecies((String) map
														.get(SPECIES));
												s.setMethod((String) map
														.get(AQUA_METHOD));
												s.setEnvironment((String) map
														.get(AQUA_ENVIRONMENT));
												s.setProcess((String) map
														.get(PROCESS));
												s.setCondition((String) map
														.get(CONDITION));
												s.setSoldTo((String) map
														.get(SOLD_TO));
												try {
													s.setNumberOfUnits(new Float(
															(String) map
																	.get(QUANTITY)));
												} catch (Exception ex) {
													s.setNumberOfUnits(0.0f);
												}
												s.setUnit((String) map
														.get(QUANTITY_UNIT));
												try {
													s.setPricePrUnit(new Float(
															(String) map
																	.get(PRICE)));
												} catch (Exception ex) {
													s.setPricePrUnit(0.0f);
												}
												s.setPriceUnit((String) map
														.get(PRICE_UNIT));
												try {
													s.setAmount(new Float(
															(String) map
																	.get(AMOUNT)));
												} catch (Exception ex) {
													s.setAmount(0.0f);
												}
												s.setBuyersPersonalID((String) map
														.get(BUYERS_SSN));
												s.setBuyersName((String) map
														.get(BUYERS_NAME));
												s.setFarm((String) map
														.get(SOLD_TO_FARM));
												sales.add(s);
											}
										}

									}
								}
							}

							if (!expectedQuantityProduced.isEmpty()) {
								expectedProducedDone = true;
							}

							if (!farmStructure.isEmpty()) {
								farmStructureDone = true;
							}

							if (!fishedForOnGrowing.isEmpty()) {
								fishedDone = true;
							}

							if (!inventoryAtYearEnd.isEmpty()) {
								inventoryDone = true;
							}

							if (!sales.isEmpty()) {
								salesDone = true;
							}
						} else {
							LOGGER.log(Level.WARNING, "Not handling type = "
									+ type);
						}
					}

					ACStatHeader header = getAquaDAO().createHeader(personalID,
							name, address, farm, farmID, year, comment, canSendInfo,
							procCase.getUniqueId());

					if (!expectedQuantityProduced.isEmpty()) {
						for (ExpectedQuantityProduced e : expectedQuantityProduced) {
							getAquaDAO().createACStatEstimates(header,
									e.getGroup(), e.getSpecies(),
									e.getQuantity(), e.getQuantityUnit(),
									e.getComments());
						}
					}

					if (!farmStructure.isEmpty()) {
						for (FarmStructure f : farmStructure) {
							getAquaDAO().createACStatFarmingSpace(header,
									f.getGroup(), f.getMethod(),
									f.getEnvironment(), f.getSize(),
									f.getUnit());
						}
					}

					if (!fishedForOnGrowing.isEmpty()) {
						for (FishedForOnGrowing f : fishedForOnGrowing) {
							getAquaDAO().createACStatsCaughForFarmingEntry(
									header, f.getGroup(), f.getSpecies(),
									f.getCount(), f.getWeight(), f.getKg());
						}
					}

					if (!inventoryAtYearEnd.isEmpty()) {
						for (InventoryAtYearEnd i : inventoryAtYearEnd) {
							getAquaDAO().createACStatInventory(header,
									i.getGroup(), i.getSpecies(),
									i.getQuantity(), i.getQuantityUnit(),
									i.getComments());
						}
					}

					if (!sales.isEmpty()) {
						for (Sales s : sales) {
							getAquaDAO().createACStatSale(header, s.getGroup(),
									s.getMethod(), s.getEnvironment(),
									s.getSpecies(), s.getProcess(),
									s.getCondition(), s.getNumberOfUnits(),
									s.getUnit(), s.getPricePrUnit(),
									s.getPriceUnit(), s.getAmount(),
									s.getSoldTo(), s.getBuyersPersonalID(),
									s.getBuyersName(), s.getFarm());
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("AQUA STATISTICS TIMER DONE!!!!");

	}

	private class ExpectedQuantityProduced {
		private String group = "";
		private String species = "";
		private float quantity = 0.0f;
		private String quantityUnit = "";
		private String comments = "";

		public String getGroup() {
			return group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getSpecies() {
			return species;
		}

		public void setSpecies(String species) {
			this.species = species;
		}

		public float getQuantity() {
			return quantity;
		}

		public void setQuantity(float quantity) {
			this.quantity = quantity;
		}

		public String getQuantityUnit() {
			return quantityUnit;
		}

		public void setQuantityUnit(String quantityUnit) {
			this.quantityUnit = quantityUnit;
		}

		public String getComments() {
			return comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}
	}

	private class FarmStructure {
		private String group = "";
		private String method = "";
		private String environment = "";
		private float size = 0.0f;
		private String unit = "";

		public String getGroup() {
			return group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getMethod() {
			return method;
		}

		public void setMethod(String method) {
			this.method = method;
		}

		public String getEnvironment() {
			return environment;
		}

		public void setEnvironment(String environment) {
			this.environment = environment;
		}

		public float getSize() {
			return size;
		}

		public void setSize(float size) {
			this.size = size;
		}

		public String getUnit() {
			return unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

	}

	private class FishedForOnGrowing {
		private String group = "";
		private String species = "";
		private float count = 0.0f;
		private float weight = 0.0f;
		private float kg = 0.0f;

		public String getGroup() {
			return group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getSpecies() {
			return species;
		}

		public void setSpecies(String species) {
			this.species = species;
		}

		public float getCount() {
			return count;
		}

		public void setCount(float count) {
			this.count = count;
		}

		public float getWeight() {
			return weight;
		}

		public void setWeight(float weight) {
			this.weight = weight;
		}

		public float getKg() {
			return kg;
		}

		public void setKg(float kg) {
			this.kg = kg;
		}
	}

	private class InventoryAtYearEnd {
		private String group = "";
		private String species = "";
		private float quantity = 0.0f;
		private String quantityUnit = "";
		private String comments = "";

		public String getGroup() {
			return group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getSpecies() {
			return species;
		}

		public void setSpecies(String species) {
			this.species = species;
		}

		public float getQuantity() {
			return quantity;
		}

		public void setQuantity(float quantity) {
			this.quantity = quantity;
		}

		public String getQuantityUnit() {
			return quantityUnit;
		}

		public void setQuantityUnit(String quantityUnit) {
			this.quantityUnit = quantityUnit;
		}

		public String getComments() {
			return comments;
		}

		public void setComments(String comments) {
			this.comments = comments;
		}
	}

	private class Sales {
		private String group = "";
		private String species = "";
		private String method = "";
		private String environment = "";
		private String process = "";
		private String condition = "";
		private float numberOfUnits = 0.0f;
		private String unit = "";
		private float pricePrUnit = 0.0f;
		private String priceUnit = "";
		private float amount = 0.0f;
		private String soldTo = "";
		private String buyersPersonalID = "";
		private String buyersName = "";
		private String farm = "";

		public String getGroup() {
			return group;
		}

		public void setGroup(String group) {
			this.group = group;
		}

		public String getSpecies() {
			return species;
		}

		public void setSpecies(String species) {
			this.species = species;
		}

		public String getMethod() {
			return method;
		}

		public void setMethod(String method) {
			this.method = method;
		}

		public String getEnvironment() {
			return environment;
		}

		public void setEnvironment(String environment) {
			this.environment = environment;
		}

		public String getProcess() {
			return process;
		}

		public void setProcess(String process) {
			this.process = process;
		}

		public String getCondition() {
			return condition;
		}

		public void setCondition(String condition) {
			this.condition = condition;
		}

		public float getNumberOfUnits() {
			return numberOfUnits;
		}

		public void setNumberOfUnits(float numberOfUnits) {
			this.numberOfUnits = numberOfUnits;
		}

		public String getUnit() {
			return unit;
		}

		public void setUnit(String unit) {
			this.unit = unit;
		}

		public float getPricePrUnit() {
			return pricePrUnit;
		}

		public void setPricePrUnit(float pricePrUnit) {
			this.pricePrUnit = pricePrUnit;
		}

		public String getPriceUnit() {
			return priceUnit;
		}

		public void setPriceUnit(String priceUnit) {
			this.priceUnit = priceUnit;
		}

		public float getAmount() {
			return amount;
		}

		public void setAmount(float amount) {
			this.amount = amount;
		}

		public String getSoldTo() {
			return soldTo;
		}

		public void setSoldTo(String soldTo) {
			this.soldTo = soldTo;
		}

		public String getBuyersPersonalID() {
			return buyersPersonalID;
		}

		public void setBuyersPersonalID(String buyersPersonalID) {
			this.buyersPersonalID = buyersPersonalID;
		}

		public String getBuyersName() {
			return buyersName;
		}

		public void setBuyersName(String buyersName) {
			this.buyersName = buyersName;
		}

		public String getFarm() {
			return farm;
		}

		public void setFarm(String farm) {
			this.farm = farm;
		}

	}

	private AquaDAO getAquaDAO() {
		if (this.aquaDAO == null) {
			ELUtil.getInstance().autowire(this);
		}

		return this.aquaDAO;
	}

	private CasesBPMDAO getCasesBPMDAO() {
		if (this.casesBPMDAO == null) {
			ELUtil.getInstance().autowire(this);
		}
		return this.casesBPMDAO;
	}

	CaseBusiness getCaseBusiness() {
		try {
			return IBOLookup.getServiceInstance(
					IWMainApplication.getDefaultIWApplicationContext(),
					CaseBusiness.class);
		} catch (IBOLookupException e) {
			e.printStackTrace();
		}
		return null;
	}

	public static void main(String args[]) {
		JSONParser parser = new JSONParser();
		JSONUtil jsonUtil = new JSONUtil();
		try {
			File f = new File("/Users/palli/Desktop/jsontest.txt");
			byte[] buffer = new byte[(int) f.length()];
			BufferedInputStream s = new BufferedInputStream(
					new FileInputStream(f));
			s.read(buffer);

			JSONArray array = (JSONArray) parser.parse(new String(buffer));
			for (int i = 0; i < array.size(); i++) {
				LinkedHashMap map = (LinkedHashMap) jsonUtil
						.convertToObject(array.get(i).toString());
				System.out.println("keyset = " + map.keySet().size());
				System.out.println("key = "
						+ map.keySet().iterator().next().toString());
				System.out.println("map = " + map.toString());
				System.out.println("map.get(speciesGroupOutput) = "
						+ map.get("speciesGroupOutput"));
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
}