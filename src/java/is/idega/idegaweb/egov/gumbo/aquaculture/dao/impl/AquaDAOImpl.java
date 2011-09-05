package is.idega.idegaweb.egov.gumbo.aquaculture.dao.impl;

import is.idega.idegaweb.egov.gumbo.aquaculture.dao.AquaDAO;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatCaughtForFarming;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatEstimates;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatFarmingSpace;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatHeader;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatInventory;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatSale;

import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.idega.core.persistence.Param;
import com.idega.core.persistence.impl.GenericDaoImpl;

@Repository("aquaDao")
@Transactional(readOnly = true)
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class AquaDAOImpl extends GenericDaoImpl implements AquaDAO {

	@Transactional(readOnly = false)
	public ACStatHeader createHeader(String personalID, String name,
			String address, String farm, String year, String comment,
			boolean canSendInfo, String caseUniqueID) {
		ACStatHeader header = new ACStatHeader();
		header.setPersonalID(personalID);
		header.setName(name);
		header.setAddress(address);
		header.setFarm(farm);
		header.setYear(year);
		header.setComment(comment);
		header.setSendInfo(canSendInfo);
		header.setCaseUniqueID(caseUniqueID);
		
		getEntityManager().persist(header);
		
		return header;
	}
	
	public List<ACStatHeader> getACStatHeaderByCaseUniqueID(String caseUniqueID) {
		Param param = new Param("caseUniqueID", caseUniqueID);
		return getResultList("acStatHeader.findAllByCaseUniqueID",
				ACStatHeader.class, param);
	}

	@Transactional(readOnly = false)
	public ACStatCaughtForFarming createACStatsCaughForFarmingEntry(
			ACStatHeader header, String category, String type,
			String unitsCaught, String weight, String price) {
		ACStatCaughtForFarming caught = new ACStatCaughtForFarming();
		caught.setHeader(header);
		caught.setCategory(category);
		caught.setType(type);
		caught.setUnitsCaught(unitsCaught);
		caught.setWeight(weight);
		caught.setPrice(price);

		getEntityManager().persist(caught);

		return caught;
	}

	@Transactional(readOnly = false)
	public ACStatFarmingSpace createACStatFarmingSpace(ACStatHeader header,
			String category, String method, String environment, String size,
			String unit) {
		ACStatFarmingSpace space = new ACStatFarmingSpace();
		space.setHeader(header);
		space.setCategory(category);
		space.setMethod(method);
		space.setEnvironment(environment);
		space.setSize(size);
		space.setUnit(unit);
		
		getEntityManager().persist(space);

		return space;		
	}

	@Transactional(readOnly = false)
	public ACStatSale createACStatSale(ACStatHeader header, String category,
			String method, String environment, String type, String process,
			String condition, String numberOfUnits, String unit,
			String pricePrUnit, String priceUnit, String amount, String soldTo,
			String buyersPersonalID, String buyersName, String farm) {
		ACStatSale sale = new ACStatSale();
		sale.setHeader(header);
		sale.setCategory(category);
		sale.setMethod(method);
		sale.setEnvironment(environment);
		sale.setType(type);
		sale.setProcess(process);
		sale.setCondition(condition);
		sale.setNumberOfUnits(numberOfUnits);
		sale.setUnit(unit);
		sale.setPricePrUnit(pricePrUnit);
		sale.setPriceUnit(priceUnit);
		sale.setAmount(amount);
		sale.setSoldTo(soldTo);
		sale.setBuyersPersonalID(buyersPersonalID);
		sale.setBuyersName(buyersName);
		sale.setFarm(farm);

		getEntityManager().persist(sale);

		return sale;		
	}

	@Transactional(readOnly = false)
	public ACStatInventory createACStatInventory(ACStatHeader header,
			String category, String type, String numberOfUnits, String unit,
			String comment) {
		ACStatInventory inventory = new ACStatInventory();
		inventory.setHeader(header);
		inventory.setCategory(category);
		inventory.setType(type);
		inventory.setNumberOfUnits(numberOfUnits);
		inventory.setUnit(unit);
		inventory.setComment(comment);
		
		getEntityManager().persist(inventory);

		return inventory;		
	}

	@Transactional(readOnly = false)
	public ACStatEstimates createACStatEstimates(ACStatHeader header,
			String category, String type, String numberOfUnits, String unit,
			String comment) {
		ACStatEstimates estimates = new ACStatEstimates();
		estimates.setHeader(header);
		estimates.setCategory(category);
		estimates.setType(type);
		estimates.setNumberOfUnits(numberOfUnits);
		estimates.setUnit(unit);
		estimates.setComment(comment);
		
		getEntityManager().persist(estimates);

		return estimates;				
	}
}