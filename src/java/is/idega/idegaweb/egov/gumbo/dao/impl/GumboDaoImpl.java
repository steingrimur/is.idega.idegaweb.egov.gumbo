package is.idega.idegaweb.egov.gumbo.dao.impl;

import is.idega.idegaweb.egov.gumbo.LetterType;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.FishFarm;
import is.idega.idegaweb.egov.gumbo.data.FishingGear;
import is.idega.idegaweb.egov.gumbo.data.Inspector;
import is.idega.idegaweb.egov.gumbo.data.Letter;
import is.idega.idegaweb.egov.gumbo.data.Office;
import is.idega.idegaweb.egov.gumbo.data.ProcessFocalCode;
import is.idega.idegaweb.egov.gumbo.data.ProcessPaymentCode;
import is.idega.idegaweb.egov.gumbo.data.ProcessPaymentLog;
import is.idega.idegaweb.egov.gumbo.data.ProcessPaymentLogHeader;
import is.idega.idegaweb.egov.gumbo.data.ShipClaimPeriod;
import is.idega.idegaweb.egov.gumbo.data.ShipClaimPeriodPK;
import is.idega.idegaweb.egov.gumbo.data.ViolationDecision;
import is.idega.idegaweb.egov.gumbo.data.ViolationType;

import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.idega.core.persistence.Param;
import com.idega.core.persistence.impl.GenericDaoImpl;
import com.idega.util.IWTimestamp;

@Repository("gumboDao")
@Transactional(readOnly = true)
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class GumboDaoImpl extends GenericDaoImpl implements GumboDao {

	public List<ViolationType> getViolationTypes() {
		return getResultList("violationType.findAll", ViolationType.class);
	}

	public List<Office> getOffices() {
		return getResultList("office.findAll", Office.class);
	}

	public List<Inspector> getInspectors() {
		return getResultList("inspector.findAll", Inspector.class);
	}

	public List<FishingGear> getFishingGear() {
		return getResultList("fishingGear.findAll", FishingGear.class);
	}

	public List<ViolationDecision> getViolationDecisions() {
		return getResultList("violationDecision.findAll",
				ViolationDecision.class);
	}

	public List<Letter> getLetters() {
		return getResultList("letter.findAll", Letter.class);
	}

	public List<Letter> getLetters(LetterType type) {
		Param param = new Param("type", type);
		return getResultList("letter.findAllByType", Letter.class, param);
	}
	
	public List<LetterType> getLetterTypes() {
		return getResultList("letter.findAllTypes", LetterType.class);
	}

	public List<ProcessPaymentCode> getProcessPaymentCode() {
		return getResultList("processPaymentCode.findAll",
				ProcessPaymentCode.class);
	}

	public List<ProcessPaymentCode> getProcessPaymentCode(String processName) {
		Param param = new Param("processName", processName);
		return getResultList("processPaymentCode.findAllByProcessName",
				ProcessPaymentCode.class, param);
	}

	public List<ProcessPaymentCode> getProcessPaymentCode(String processName,
			String subName) {
		Param param1 = new Param("processName", processName);
		Param param2 = new Param("subName", subName);
		return getResultList("processPaymentCode.findAllByProcessNameAndSubName",
				ProcessPaymentCode.class, param1, param2);
	}

	@Transactional(readOnly = false)
	public ProcessPaymentLogHeader createHeader() {
		ProcessPaymentLogHeader header = new ProcessPaymentLogHeader();
		header.setCreatedDate(IWTimestamp.RightNow().getDate());
		header.setStatusCode(0L);
		header.setErrorMessage(null);
		header.setExternalKey(null);

		getEntityManager().persist(header);

		return header;
	}

	@Transactional(readOnly = false)
	public ProcessPaymentLogHeader updateHeader(ProcessPaymentLogHeader header,
			long statusCode, String errorMessage, String externalKey) {
		header = find(ProcessPaymentLogHeader.class, header.getId());
		header.setStatusCode(statusCode);
		header.setErrorMessage(errorMessage);
		header.setExternalKey(externalKey);

		getEntityManager().persist(header);

		return header;
	}

	@Transactional(readOnly = false)
	public ProcessPaymentLog createLogEntry(ProcessPaymentLogHeader header,
			String payersPersonalID, String shipNumber, String period,
			String paymentCode, Integer numberOfUnits, Integer unitPrice,
			Integer amount) {
		ProcessPaymentLog log = new ProcessPaymentLog();
		log.setHeader(header);
		log.setPayersPersonalID(payersPersonalID);
		log.setShipNumber(shipNumber);
		log.setPeriod(period);
		log.setPaymentCode(paymentCode);
		log.setNumberOfUnits(numberOfUnits);
		log.setUnitPrice(unitPrice);
		log.setAmount(amount);

		getEntityManager().persist(log);

		return log;
	}

	@Transactional(readOnly = false)
	public ProcessPaymentLog createLogEntry(ProcessPaymentLogHeader header,
			String claimKeyToCancel) {
		ProcessPaymentLog log = new ProcessPaymentLog();
		log.setHeader(header);
		log.setClaimKeyToCancel(claimKeyToCancel);
		
		getEntityManager().persist(log);

		return log;
	}

	@Transactional(readOnly = false)
	public ShipClaimPeriod createShipClaimPeriod(String personalID, String shipNr, String period, int week, int year) {
		ShipClaimPeriod scp = new ShipClaimPeriod();
		scp.setId(new ShipClaimPeriodPK(shipNr, personalID));
		scp.setPeriod(period);
		scp.setWeek(week);
		scp.setYear(year);

		getEntityManager().persist(scp);

		return scp;
	}
	
	public ShipClaimPeriod getShipClaimPeriod(String personalID, String shipNr) {
		return find(ShipClaimPeriod.class, new ShipClaimPeriodPK(shipNr, personalID));		
	}

	@Transactional(readOnly = false)
	public ShipClaimPeriod updateShipClaimPeriod(ShipClaimPeriod entry, String period, int week, int year) {
		entry = find(ShipClaimPeriod.class, entry.getId());
		entry.setPeriod(period);
		entry.setWeek(week);
		entry.setYear(year);

		getEntityManager().persist(entry);

		return entry;
	}
	
	public List<ProcessFocalCode> getProcessFocalCode() {
		return getResultList("processFocalCode.findAll",
				ProcessFocalCode.class);
	}

	public ProcessFocalCode getProcessFocalCode(String processName) {
		Param param = new Param("processName", processName);
		return getSingleResult("processFocalCode.findAllByProcessName",
				ProcessFocalCode.class, param);
	}

	public ProcessFocalCode getProcessFocalCode(String processName,
			String subName) {
		Param param1 = new Param("processName", processName);
		Param param2 = new Param("subName", subName);
		return getSingleResult("processFocalCode.findAllByProcessNameAndSubName",
				ProcessFocalCode.class, param1, param2);
	}	
	
	public List<FishFarm> getFishFarms(String companyPersonalID) {
		Param param = new Param("companyID", companyPersonalID);
		return getResultList("fishFarm.findAllByCompany",
				FishFarm.class, param);		
	}

	public List<FishFarm> getAllFishFarms() {
		return getResultList("fishFarm.findAll", FishFarm.class);		
	}

	@Transactional(readOnly = false)
	public FishFarm updateFishFarm(FishFarm farm, boolean hasFiledReport) {
		farm = find(FishFarm.class, farm.getId());
		farm.setHasFiledReport(hasFiledReport);

		getEntityManager().persist(farm);

		return farm;		
	}
}