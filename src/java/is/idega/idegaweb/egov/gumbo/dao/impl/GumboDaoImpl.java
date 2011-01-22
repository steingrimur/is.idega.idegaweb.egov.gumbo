package is.idega.idegaweb.egov.gumbo.dao.impl;

import is.idega.idegaweb.egov.gumbo.LetterType;
import is.idega.idegaweb.egov.gumbo.dao.GumboDao;
import is.idega.idegaweb.egov.gumbo.data.FishingGear;
import is.idega.idegaweb.egov.gumbo.data.Inspector;
import is.idega.idegaweb.egov.gumbo.data.Letter;
import is.idega.idegaweb.egov.gumbo.data.Office;
import is.idega.idegaweb.egov.gumbo.data.ProcessPaymentCode;
import is.idega.idegaweb.egov.gumbo.data.ProcessPaymentLog;
import is.idega.idegaweb.egov.gumbo.data.ProcessPaymentLogHeader;
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
		// return
		// getEntityManager().createNamedQuery("violationType.findAll").getResultList();
	}

	public List<Office> getOffices() {
		return getResultList("office.findAll", Office.class);
		// return
		// getEntityManager().createNamedQuery("office.findAll").getResultList();
	}

	public List<Inspector> getInspectors() {
		return getResultList("inspector.findAll", Inspector.class);
		// return
		// getEntityManager().createNamedQuery("inspector.findAll").getResultList();
	}

	public List<FishingGear> getFishingGear() {
		return getResultList("fishingGear.findAll", FishingGear.class);
		// return
		// getEntityManager().createNamedQuery("fishingGear.findAll").getResultList();
	}

	public List<ViolationDecision> getViolationDecisions() {
		return getResultList("violationDecision.findAll",
				ViolationDecision.class);
		// return
		// getEntityManager().createNamedQuery("violationDecision.findAll").getResultList();
	}

	public List<Letter> getLetters() {
		return getResultList("letter.findAll", Letter.class);
		// return
		// getEntityManager().createNamedQuery("letter.findAll").getResultList();
	}

	public List<Letter> getLetters(LetterType type) {
		Param param = new Param("type", type);
		return getResultList("letter.findAllByType", Letter.class, param);
		// return
		// getEntityManager().createNamedQuery("letter.findAllByType").setParameter("type",
		// type).getResultList();
	}

	public List<ProcessPaymentCode> getProcessPaymentCode() {
		return getResultList("processPaymentCode.findAll",
				ProcessPaymentCode.class);
	}

	public List<ProcessPaymentCode> getProcessPaymentCode(String processName) {
		Param param = new Param("processName", processName);
		return getResultList("processPaymentCode.findAll",
				ProcessPaymentCode.class, param);
	}

	public List<ProcessPaymentCode> getProcessPaymentCode(String processName,
			String subName) {
		Param param1 = new Param("processName", processName);
		Param param2 = new Param("subName", subName);
		return getResultList("processPaymentCode.findAll",
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

	public ProcessPaymentLog createLogEntry(ProcessPaymentLogHeader header,
			String payersPersonalID, String shipNumber, String period,
			String paymentCode, Integer numberOfUnits, Integer unitPrice,
			Integer amount, String reference) {
		ProcessPaymentLog log = new ProcessPaymentLog();
		log.setHeader(header);
		log.setPayersPersonalID(payersPersonalID);
		log.setShipNumber(shipNumber);
		log.setPeriod(period);
		log.setPaymentCode(paymentCode);
		log.setNumberOfUnits(numberOfUnits);
		log.setUnitPrice(unitPrice);
		log.setAmount(amount);
		log.setReference(reference);

		getEntityManager().persist(log);

		return log;
	}
}