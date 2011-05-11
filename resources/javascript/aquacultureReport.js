if(ChibaWorkarounds == null) var ChibaWorkarounds = {};

jQuery(document).ready(function() {
	
	var insertsFor = ['farmStructure', 'fishedForOnGrowing', 'sales', 'inventoryAtYearEnd', 'expectedQuantityProduced'];
	
	ChibaWorkarounds.publishUIUpdatedEvent = true;
	
	jQuery(".insertRowButton input").attr("onclick", "");
	
	jQuery(".insertRowButton input").click(function() {
		
		var me = jQuery(this);
		
		ChibaWorkarounds.insertFor = getIfContainsInsertForId(me.parent());
		
		chibaActivate(this);
	});
	
	var getIfContainsInsertForId = function(element) {
		
		var classes = element.attr("class").split(" ");
		
		for ( var i = 0; i < classes.length; i++) {
			var styleClass = classes[i];
			
			if(insertsFor.indexOf(styleClass) > -1) {
				return styleClass;
			}
		}

		return null;
	};
	
	var getSubstituteId = function(element) {
		
		var classes = element.attr("class").split(" ");
		
		for ( var i = 0; i < classes.length; i++) {
			var styleClass = classes[i];
			
			if(styleClass.indexOf("substituteId-") == 0) {
				return styleClass.substring("substituteId-".length);
			}
		}

		return null;
	};
	
	var copyOptions = function(from, to) {
		
		var options = from.get(0).options;
		
		for ( var i = 0; i < options.length; i++) {
			var opt = options[i];
			
			to.append('<option value="' + opt.value + '">' + opt.text + '</option>');
		}
	};
	
	jQuery(document).bind('ChibaWorkarounds-UIUpdatedEvent', function(event, updateUIData) {
		
		if(updateUIData && ChibaWorkarounds.insertFor != null && substitutionsNeedToBeUpdated(updateUIData)) {
			
			jQuery(".repeat."+ChibaWorkarounds.insertFor+" .substitute input").each(function() {
				
				var me = jQuery(this);
				if(!me.attr("substituted")) {
				
					updateSubstitutions(me);
				}
			});
			
			ChibaWorkarounds.insertFor = null;
		}
	});
	
	var substitutionsNeedToBeUpdated = function(updateUIData) {
		
//		mostly copied from FluxInterface.js#updateUI
		var eventLog = null;
	    if (updateUIData && updateUIData.childNodes) {
			eventLog = updateUIData.childNodes;
	    }
	    
	    if (eventLog == null || eventLog.length == 0) {
	    	return false;
	    }
	    
	    for (var i = 0; i < eventLog.length; i++) {	
	        var type = eventLog[i].getAttribute("type");  
	        var targetName = eventLog[i].getAttribute("targetName");
	        
	        if(type == "chiba-item-inserted" && targetName == "repeat") {
	        	
	        	return true;
	        }
	    }
		
		return false;
	};
	
	var updateSubstitutions = function(substitutableInput) {
		
		substitutableInput.hide();
		
		var div = jQuery(document.createElement("div"));
		var select = jQuery(document.createElement("select"));
		
		var substituteId = getSubstituteId(substitutableInput.parent(0));
		
		copyOptions(jQuery(".selectorItems."+substituteId+" select.value"), select);

		div.addClass("select1");
		
		select.attr("size", "1");
		select.addClass("value");
		
		substitutableInput.parent().append(div);
		div.append(select);
		
		select.change(function() {
			
			var me = jQuery(this);
			
			substitutableInput.val(me.val());
			setXFormsValue(substitutableInput.get(0));
		});
		
		substitutableInput.attr("substituted", "true");
	};
	
	jQuery(".repeat .substitute input").each(function() {
		
		updateSubstitutions(jQuery(this));
	});
});