jQuery(document).ready(function() {
	
	LazyLoader.loadMultiple(['/dwr/interface/ViolationService.js', '/dwr/engine.js']);
	
	var letterTypesSelectorById = "#clone-fbc_7-value";
	var letterSelectorById = "#clone-fbc_6-value";

	jQuery(letterTypesSelectorById).attr('onchange', '');
	jQuery(letterSelectorById).attr('onchange', '');

	jQuery(letterTypesSelectorById).change(function() {

		updateSelectionOfOriginal('fbc_7-value', 'clone-fbc_7-value');
		
		ViolationService.getLetters(jQuery(this).val(), {
			callback: function(items) {
			
				jQuery("#fbc_6-value option").remove();
				jQuery("#clone-fbc_6-value option").remove();
				
				var letterSelector = jQuery(letterSelectorById);
				var letterSelectorOriginal = jQuery("#fbc_6-value");
				
				letterSelector.append(new Option("", ""));
				letterSelectorOriginal.append(new Option("", ""));
				
				for ( var i = 0; i < items.length; i++) {
					
					var item = items[i];
					letterSelector.append(new Option(item.itemLabel, item.itemValue));
					letterSelectorOriginal.append(new Option(item.itemLabel, item.itemValue));
				}
			},
			errorHandler: handleExceptions
		});
	
		return false;
			
	});
	
	jQuery(letterSelectorById).change(function() {

		updateSelectionOfOriginal('fbc_6-value', 'clone-fbc_6-value');
		
		ViolationService.getLetterText(jQuery(this).val(), {
			callback: function(letterText) {
			
				jQuery("#fbc_5-value").val(letterText);
				setXFormsValue(document.getElementById("fbc_5-value"));
			},
			errorHandler: handleExceptions
		});
	
		return false;
			
	});
});