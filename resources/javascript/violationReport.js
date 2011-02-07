if(ChibaWorkarounds == null) var ChibaWorkarounds = {};

jQuery(document).ready(function() {
	
	ChibaWorkarounds.publishUIUpdatedEvent = true;
	
	jQuery("input[type='checkbox']").removeAttr('checked');
	
	jQuery(document).bind('ChibaWorkarounds-UIUpdatedEvent', function() {
		
		if(!ChibaWorkarounds.cloneFbc_213ValueResetted && jQuery("#clone-fbc_213-value").val() != "") {
			
			jQuery("#clone-fbc_213-value").val("");
			ChibaWorkarounds.cloneFbc_213ValueResetted = true;
		}
	});
});