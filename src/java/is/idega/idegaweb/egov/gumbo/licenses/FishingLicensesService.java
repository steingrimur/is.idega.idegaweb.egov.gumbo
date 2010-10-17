package is.idega.idegaweb.egov.gumbo.licenses;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.idega.util.text.Item;

@Service("fishingLicensesService")
@Scope(BeanDefinition.SCOPE_SINGLETON)
public class FishingLicensesService {
	
	public List<Item> getTypesOfFishingLicenses() {
		
		final List<Item> items = new ArrayList<Item>(3);
		
		items.add(new Item("id1", "type 1"));
		items.add(new Item("id2", "type 2"));
		items.add(new Item("id3", "type 3"));
		
		return items;
	}
}