package is.idega.idegaweb.egov.gumbo.dao;

import is.idega.idegaweb.egov.gumbo.LetterType;
import is.idega.idegaweb.egov.gumbo.data.AquaCountry;
import is.idega.idegaweb.egov.gumbo.data.AquaEnvironment;
import is.idega.idegaweb.egov.gumbo.data.AquaFarmingType;
import is.idega.idegaweb.egov.gumbo.data.AquaMethod;
import is.idega.idegaweb.egov.gumbo.data.AquaProcessingMethod;
import is.idega.idegaweb.egov.gumbo.data.AquaSpecies;
import is.idega.idegaweb.egov.gumbo.data.AquaSpeciesGroup;
import is.idega.idegaweb.egov.gumbo.data.FishFarm;
import is.idega.idegaweb.egov.gumbo.data.FishingGear;
import is.idega.idegaweb.egov.gumbo.data.FocalCase;
import is.idega.idegaweb.egov.gumbo.data.Inspector;
import is.idega.idegaweb.egov.gumbo.data.Letter;
import is.idega.idegaweb.egov.gumbo.data.Office;
import is.idega.idegaweb.egov.gumbo.data.ProcessFocalCode;
import is.idega.idegaweb.egov.gumbo.data.ProcessPaymentCode;
import is.idega.idegaweb.egov.gumbo.data.ProcessPaymentLog;
import is.idega.idegaweb.egov.gumbo.data.ProcessPaymentLogHeader;
import is.idega.idegaweb.egov.gumbo.data.ShipClaimPeriod;
import is.idega.idegaweb.egov.gumbo.data.ViolationDecision;
import is.idega.idegaweb.egov.gumbo.data.ViolationType;

import java.util.List;

import com.idega.core.persistence.GenericDao;

public interface GumboDao extends GenericDao {

	public List<Inspector> getInspectors();

	public List<Office> getOffices();

	public List<ViolationType> getViolationTypes();

	public List<FishingGear> getFishingGear();

	public List<ViolationDecision> getViolationDecisions();

	public List<Letter> getLetters();

	public List<Letter> getLetters(LetterType type);

	public List<LetterType> getLetterTypes();
	
	public List<ProcessPaymentCode> getProcessPaymentCode();

	public List<ProcessPaymentCode> getProcessPaymentCode(String processName);

	public List<ProcessPaymentCode> getProcessPaymentCode(String processName,
			String subName);

	public ProcessPaymentLogHeader createHeader();

	public ProcessPaymentLogHeader updateHeader(ProcessPaymentLogHeader header,
			long returnCode, String errorMessage, String externalKey);

	public ProcessPaymentLog createLogEntry(ProcessPaymentLogHeader header,
			String payersPersonalID, String shipNumber, String period,
			String paymentCode, Integer numberOfUnits, Integer unitPrice,
			Integer amount);

	public ProcessPaymentLog createLogEntry(ProcessPaymentLogHeader header,
			String claimKeyToCancel);

	public ShipClaimPeriod createShipClaimPeriod(String personalID, String shipNr, String period, int week, int year);
	
	public ShipClaimPeriod getShipClaimPeriod(String personalID, String shipNr);

	public ShipClaimPeriod updateShipClaimPeriod(ShipClaimPeriod entry, String period, int week, int year);
	
	public List<ProcessFocalCode> getProcessFocalCode();

	public ProcessFocalCode getProcessFocalCode(String processName);

	public ProcessFocalCode getProcessFocalCode(String processName,
			String subName);

	public FishFarm getFishFarm(Long id);
	public List<FishFarm> getFishFarms(String companyPersonalID);
	public List<FishFarm> getAllFishFarms();

	public FishFarm updateFishFarm(FishFarm farm, boolean hasFiledReport);
	
	public List<AquaCountry> getAquaCountries();
	
	public List<AquaProcessingMethod> getAquaProcessingMethods();

	public List<AquaSpecies> getAquaSpecies();
	
	public List<AquaEnvironment> getAquaEnvironments();

	public List<AquaFarmingType> getAquaFarmingTypes();

	public List<AquaSpeciesGroup> getAquaSpeciesGroups();

	public List<AquaMethod> getAquaMethods();
	
	public AquaSpeciesGroup getAquaSpeciesGroup(Long id);

	public AquaMethod getAquaMethod(Long id);
	
	public FocalCase getFocalCaseByCaseUniqueID(String caseUniqueID);
	public FocalCase getFocalCaseByFocalCaseID(String focalCaseID);
	public FocalCase createFocalCase(String focalCaseID, String caseUniqueID, long numberOfAttachments, boolean error, String errorMessage);
}