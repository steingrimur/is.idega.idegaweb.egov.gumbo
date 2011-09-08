package is.idega.idegaweb.egov.gumbo.aquaculture.timer;

import is.idega.idegaweb.egov.gumbo.aquaculture.dao.AquaDAO;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatHeader;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatSale;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.persistence.Column;

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
	private static final String YEAR = "string_reportForTheYear";
	private static final String COMMENT = "string_salesComments";

	private static final String GROUP = "speciesGroupOutput";
	private static final String SPECIES = "speciesOutput";
	private static final String QUANTITY = "quantityOutput";
	private static final String QUANTITY_UNIT = "quantityUnitOutput";
	private static final String COMMENTS = "comments";
	private static final String AQUA_METHOD = "aquamethodOutput";
	private static final String AQUA_ENVIRONMENT = "aquaEnvironmentOutput";
	private static final String SIZE = "sizeOutput";
	private static final String UNIT = "unitOutput";
	private static final String COUNT = "countOutput";
	private static final String WEIGHT = "weight";
	private static final String KG = "kgOutput";
	private static final String PROCESS = "farminPurposeOutput";
	private static final String CONDITION = "statusNowOutput";
	private static final String SOLD_TO = "soldToOutput";
	private static final String PRICE = "priceOutput";
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
				if (headers == null || headers.isEmpty()) {

					String personalID = null;
					String name = null;
					String address = null;
					String farm = null;
					String year = null;
					String comment = null;
					boolean canSendInfo = false;

					List<ExpectedQuantityProduced> exceptedQuantityProduced = new ArrayList<ExpectedQuantityProduced>();
					List<FarmStructure> farmStructure = new ArrayList<FarmStructure>();
					List<FishedForOnGrowing> fishedForOnGrowing = new ArrayList<FishedForOnGrowing>();
					List<InventoryAtYearEnd> inventoryAtYearEnd = new ArrayList<InventoryAtYearEnd>();
					List<Sales> sales = new ArrayList<Sales>();

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
								if (name == null) {
									name = (String) variable.getValue();
								}

							} else if (FARM_NAME.equals(variableName)) {
								if (farm == null) {
									farm = (String) variable.getValue();
								}

							} else if (YEAR.equals(variableName)) {
								String tmp = (String) variable.getValue();
								if ("true".equals(tmp)) {
									canSendInfo = true;
								} else {
									canSendInfo = false;
								}
							} else if (COMMENT.equals(variableName)) {
								if (comment == null) {
									comment = (String) variable.getValue();
								}

							}
						} else if (VariableInstanceType.BYTE_ARRAY.toString()
								.equals(type)) {
							Object ret = variable.getValue();
							if (ret instanceof ArrayList) {
								ArrayList tmp = (ArrayList) ret;
								for (Object object : tmp) {
									Map map = (Map) object;
									if (EXPECTED_QUANTITY_PRODUCED
											.equals(variableName)) {
										String group = (String) map.get(GROUP);
										if (group != null && !"".equals(group)) {
											ExpectedQuantityProduced e = new ExpectedQuantityProduced();
											e.setGroup(group);
											e.setSpecies((String) map
													.get(SPECIES));
											e.setQuantity((Float) map
													.get(QUANTITY));
											e.setQuantityUnit((String) map
													.get(QUANTITY_UNIT));
											e.setComments((String) map
													.get(COMMENTS));

											exceptedQuantityProduced.add(e);
										}
									} else if (FARM_STRUCTURE
											.equals(variableName)) {
										String group = (String) map.get(GROUP);
										if (group != null && !"".equals(group)) {
											FarmStructure f = new FarmStructure();
											f.setGroup(group);
											f.setMethod((String) map
													.get(AQUA_METHOD));
											f.setEnvironment((String) map
													.get(AQUA_ENVIRONMENT));
											f.setSize((Float) map.get(SIZE));
											f.setUnit((String) map.get(UNIT));
											farmStructure.add(f);
										}
									} else if (FISHED_FOR_ON_GROWING
											.equals(variableName)) {
										String group = (String) map.get(GROUP);
										if (group != null && !"".equals(group)) {
											FishedForOnGrowing f = new FishedForOnGrowing();
											f.setGroup(group);
											f.setSpecies((String) map
													.get(SPECIES));
											f.setCount((Float) map.get(COUNT));
											f.setWeight((Float) map.get(WEIGHT));
											f.setKg((Float) map.get(KG));

											fishedForOnGrowing.add(f);
										}
									} else if (INVENTORY.equals(variableName)) {
										String group = (String) map.get(GROUP);
										if (group != null && !"".equals(group)) {
											InventoryAtYearEnd i = new InventoryAtYearEnd();
											i.setGroup(group);
											i.setSpecies((String) map
													.get(SPECIES));
											i.setQuantity((Float) map
													.get(QUANTITY));
											i.setQuantityUnit((String) map
													.get(QUANTITY_UNIT));
											i.setComments((String) map
													.get(COMMENTS));

											inventoryAtYearEnd.add(i);
										}
									} else if (SALES.equals(variableName)) {
										String group = (String) map.get(GROUP);
										if (group != null && !"".equals(group)) {
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
											s.setNumberOfUnits((Float) map
													.get(QUANTITY));
											s.setUnit((String) map
													.get(QUANTITY_UNIT));
											s.setPricePrUnit((Float) map
													.get(PRICE));
											s.setPriceUnit((String) map
													.get(PRICE_UNIT));
											s.setAmount((Float) map.get(AMOUNT));
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
						} else {
							LOGGER.log(Level.WARNING, "Not handling type = "
									+ type);
						}
					}

					ACStatHeader header = getAquaDAO().createHeader(personalID,
							name, address, farm, year, comment, canSendInfo,
							procCase.getUniqueId());

					if (!exceptedQuantityProduced.isEmpty()) {
						for (ExpectedQuantityProduced e : exceptedQuantityProduced) {
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

}