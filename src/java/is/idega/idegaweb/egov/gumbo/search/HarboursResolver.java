package is.idega.idegaweb.egov.gumbo.search;

import is.idega.idegaweb.egov.gumbo.GumboConstants;
import is.idega.idegaweb.egov.gumbo.bpm.violation.ViolationService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.builder.bean.AdvancedProperty;
import com.idega.builder.business.AdvancedPropertyComparator;
import com.idega.idegaweb.IWResourceBundle;
import com.idega.jbpm.bean.BPMProcessVariable;
import com.idega.jbpm.bean.VariableInstanceInfo;
import com.idega.jbpm.variables.MultipleSelectionVariablesResolver;
import com.idega.util.ArrayUtil;
import com.idega.util.CoreConstants;
import com.idega.util.ListUtil;
import com.idega.util.StringUtil;
import com.idega.util.expression.ELUtil;
import com.idega.util.text.Item;

@Scope("request")
@Service(MultipleSelectionVariablesResolver.BEAN_NAME_PREFIX + "string_harbourNr")
public class HarboursResolver extends MultipleSelectionVariablesResolver {

	@Autowired
	private ViolationService violationService;
	
	private ViolationService getViolationService() {
		if (violationService == null)
			ELUtil.getInstance().autowire(this);
		return violationService;
	}
	
	@Override
	public Collection<AdvancedProperty> getValues(String procDefId, String variableName) {
		if (values != null)
			return values;
		
		values = new ArrayList<AdvancedProperty>();
		
		List<Item> harbours = getViolationService().getHarbours();
		if (ListUtil.isEmpty(harbours)) {
			addEmptyLabel(GumboConstants.IW_BUNDLE_IDENTIFIER);
			return values;
		}
		
		List<AdvancedProperty> harboursToSearch = new ArrayList<AdvancedProperty>();
		for (Item harbour: harbours) {
			harboursToSearch.add(new AdvancedProperty(harbour.getItemValue(), harbour.getItemLabel()));
		}
		
		Collections.sort(harboursToSearch, new AdvancedPropertyComparator(getCurrentLocale()));
		
		IWResourceBundle iwrb = getResourceBundle(getBundle(GumboConstants.IW_BUNDLE_IDENTIFIER));
		String zone = iwrb.getLocalizedString("harbour_territory", "Zone");
		String foreignZone = iwrb.getLocalizedString("zone_foreign_countries", "foreign countries");
		Map<Integer, List<AdvancedProperty>> harboursByZones = new TreeMap<Integer, List<AdvancedProperty>>();
		for (AdvancedProperty harbour: harboursToSearch) {
			String zoneNumber = getHarbourZone(harbour.getId());
			if (StringUtil.isEmpty(zoneNumber))
				continue;
			
			Integer zoneId = Integer.valueOf(zoneNumber);
			if (zoneId.intValue() == -1)
				zoneId = Integer.MAX_VALUE;
			List<AdvancedProperty> harboursInZone = harboursByZones.get(zoneId);
			if (harboursInZone == null) {
				harboursInZone = new ArrayList<AdvancedProperty>();
				harboursByZones.put(zoneId, harboursInZone);
			}
			harboursInZone.add(harbour);
		}
		List<AdvancedProperty> harboursToRepresent = new ArrayList<AdvancedProperty>();
		for (Integer harbourZone: harboursByZones.keySet()) {
			String zoneLabel = null;
			if (Integer.MAX_VALUE == harbourZone.intValue())
				zoneLabel = foreignZone;
			else
				zoneLabel = String.valueOf(harbourZone);
			
			AdvancedProperty harbourTerritory = new AdvancedProperty(CoreConstants.EMPTY, zone.concat(CoreConstants.COLON).concat(CoreConstants.SPACE).concat(zoneLabel));
			harbourTerritory.setSelected(Boolean.TRUE);
			harboursToRepresent.add(harbourTerritory);
			
			harboursToRepresent.addAll(harboursByZones.get(harbourZone));
		}
		
		values = harboursToRepresent;
		return values;
	}
	
	private String getHarbourZone(String harbourId) {
		return getViolationService().getZoneNumber(harbourId);
	}

	@Override
	public String getIdKey() {
		return "harbourNr";
	}

	@Override
	public String getValueKey() {
		return getIdKey();
	}

	@Override
	protected String getNoValuesLocalizationKey() {
		return "no_harbours_found";
	}

	@Override
	protected String getNoValuesDefaultString() {
		return "No harbours found";
	}

	@Override
	public String getPresentation(BPMProcessVariable variable) {
		if (variable == null)
			return null;
		return getPresentation(variable.getValue());
	}

	@Override
	public String getPresentation(String value) {
		if (StringUtil.isEmpty(value))
			return null;
		
		String[] ids = value.split(CoreConstants.SEMICOLON);
		if (ArrayUtil.isEmpty(ids))
			return null;
		List<String> harboursNr = new ArrayList<String>();
		for (String id: ids) {
			if (StringUtil.isEmpty(id))
				continue;
			
			if (!harboursNr.contains(id))
				harboursNr.add(id);
		}
		
		List<Item> harbours = getViolationService().getHarbours();
		if (ListUtil.isEmpty(harbours))
			return null;
		Map<String, String> allHarbours = new HashMap<String, String>();
		for (Item harbour: harbours) {
			allHarbours.put(harbour.getItemValue(), harbour.getItemLabel());
		}

		StringBuilder presentation = new StringBuilder();
		for (Iterator<String> idsIter = harboursNr.iterator(); idsIter.hasNext();) {
			String label = allHarbours.get(idsIter.next());
			if (StringUtil.isEmpty(label))
				continue;
			
			presentation.append(label);
			if (idsIter.hasNext())
				presentation.append(CoreConstants.COMMA).append(CoreConstants.SPACE);
		}
		return presentation.toString();
	}

	@Override
	public String getPresentation(VariableInstanceInfo variable) {
		if (variable == null)
			return null;
		return getPresentation((String) variable.getValue());
	}

}