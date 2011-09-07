package is.idega.idegaweb.egov.gumbo.aquaculture.dao;

import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatCaughtForFarming;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatEstimates;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatFarmingSpace;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatHeader;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatInventory;
import is.idega.idegaweb.egov.gumbo.aquaculture.data.ACStatSale;

import java.util.List;

import com.idega.core.persistence.GenericDao;

public interface AquaDAO extends GenericDao {
	public ACStatHeader createHeader(String personalID, String name,
			String address, String farm, String year, String comment,
			boolean canSendInfo, String caseUniqueID);

	public List<ACStatHeader> getACStatHeaderByCaseUniqueID(String caseUniqueID);

	public ACStatCaughtForFarming createACStatsCaughForFarmingEntry(
			ACStatHeader header, String category, String type,
			String unitsCaught, Float weight, Float price);

	public ACStatFarmingSpace createACStatFarmingSpace(ACStatHeader header,
			String category, String method, String environment, Float size,
			String unit);

	public ACStatSale createACStatSale(ACStatHeader header, String category,
			String method, String environment, String type, String process,
			String condition, Float numberOfUnits, String unit,
			Float pricePrUnit, String priceUnit, Float amount, String soldTo,
			String buyersPersonalID, String buyersName, String farm);

	public ACStatInventory createACStatInventory(ACStatHeader header,
			String category, String type, Float numberOfUnits, String unit,
			String comment);

	public ACStatEstimates createACStatEstimates(ACStatHeader header,
			String category, String type, Float numberOfUnits, String unit,
			String comment);
}
