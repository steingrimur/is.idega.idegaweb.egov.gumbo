if(ChibaWorkarounds == null) var ChibaWorkarounds = {};

jQuery(document).ready(function() {
	
	var insertsFor = ['farmStructure'];
	
	ChibaWorkarounds.publishUIUpdatedEvent = true;
	
//	substitute speciesGroup
	
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
	
	jQuery(document).bind('ChibaWorkarounds-UIUpdatedEvent', function() {
		
		if(ChibaWorkarounds.insertFor != null) {
		
			jQuery(".repeat."+ChibaWorkarounds.insertFor+" .substitute input").each(function() {
				
				var me = jQuery(this);
				if(!me.attr("substituted")) {
				
					updateSubstitutions(me);
				}
			});
			
		}
	});
	
	var updateSubstitutions = function(substitutableInput) {
		
		substitutableInput.hide();
		
		var div = jQuery(document.createElement("div"));
		var select = jQuery(document.createElement("select"));
		
		select.append(new Option("X1", "x1"));
		select.append(new Option("X2", "x2"));

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