if(ChibaWorkarounds == null) var ChibaWorkarounds = {};

jQuery(document).ready(function() {
	
	ChibaWorkarounds.publishUIUpdatedEvent = true;
	ChibaWorkarounds.violationReportUnderEdit = false;
	
	if(jQuery("#fbc_999-value").val() != "") {
	
		ChibaWorkarounds.violationReportUnderEdit = true;
	}

	if(!ChibaWorkarounds.violationReportUnderEdit) {
		
		jQuery("input[type='checkbox']").removeAttr('checked');
		
		jQuery(document).bind('ChibaWorkarounds-UIUpdatedEvent', function() {
			
			if(!ChibaWorkarounds.cloneFbc_213ValueResetted && jQuery("#clone-fbc_213-value").val() != "") {
				
				jQuery("#clone-fbc_213-value").val("");
				ChibaWorkarounds.cloneFbc_213ValueResetted = true;
			}
		});
	} else {
		
		// report under edit
		
		var firstNextButtonSelector = "#fbc_66-value";
		var secondNextButtonSelector = "#fbc_175-value";
		
		jQuery(firstNextButtonSelector).attr('onclick', '');
		jQuery(secondNextButtonSelector).attr('onclick', '');
		
		jQuery(firstNextButtonSelector).click(function() {
			
			chibaActivate(this);
			ChibaWorkarounds.secondPageToggled = true;
		});
		
		jQuery(secondNextButtonSelector).click(function() {
			
			chibaActivate(this);
			ChibaWorkarounds.thirdPageToggled = true;
		});
	
		jQuery(document).bind('ChibaWorkarounds-UIUpdatedEvent', function() {
			
			if(ChibaWorkarounds.secondPageToggled && !ChibaWorkarounds.cloneFbc_192ValueResetted) {
				
				jQuery("#fbc_192 input[type='checkbox']").removeAttr('checked');
				
				Flux.getNodesetValue("instance('data-instance')/Fishing_gear_fbc_192", jQuery("#chibaSessionKey").val(), {
					callback: function(val) {
					
					if(val != "") {
						
						var vals = val.split(" ");
						
						for ( var i = 0; i < vals.length; i++) {
							
							var item = vals[i];
							
							jQuery("#fbc_192 input[value='"+item+"']").attr("checked", "checked");
						}
					}
						
					},
					errorHandler: handleExceptions
				});
				
				ChibaWorkarounds.cloneFbc_192ValueResetted = true;
			}
			
			if(ChibaWorkarounds.thirdPageToggled && !ChibaWorkarounds.cloneFbc_221ValueResetted) {
				
				jQuery("#fbc_221 input[type='checkbox']").removeAttr('checked');
				
				Flux.getNodesetValue("instance('data-instance')/Other_inspectors_fbc_221", jQuery("#chibaSessionKey").val(), {
					callback: function(val) {
					
					if(val != "") {
						
						var vals = val.split(" ");
						
						for ( var i = 0; i < vals.length; i++) {
							
							var item = vals[i];
							
							jQuery("#fbc_221 input[value='"+item+"']").attr("checked", "checked");
						}
					}
						
					},
					errorHandler: handleExceptions
				});
				
				ChibaWorkarounds.cloneFbc_221ValueResetted = true;
			}
			
			if(ChibaWorkarounds.thirdPageToggled && !ChibaWorkarounds.cloneFbc_213ValueResetted) {
				
				Flux.getNodesetValue("instance('data-instance')/Fiskistofa_office_fbc_213", jQuery("#chibaSessionKey").val(), {
					callback: function(val) {
					
						jQuery("#clone-fbc_213-value").val(val);
					
					},
					errorHandler: handleExceptions
				});
				
				ChibaWorkarounds.cloneFbc_213ValueResetted = true;
			}
		});
	}
	
	
	jQuery("#fbc_161-value").removeAttr('onkeydown');
	jQuery("#fbc_161-value").removeAttr('onkeyup');
	
	jQuery("#fbc_161-value").keyup(function() {
		
		if(jQuery(this).val().length == 3) {
			setXFormsValue(this);
		}
	});
	
	jQuery('#fbc_204-value').click(function() {
		showLoadingMessage(Localization.LOADING_MSG);
		LazyLoader.loadMultiple(['/dwr/engine.js', '/dwr/interface/ChibaUtils.js'], function() {
			ChibaUtils.getElementValue(FluxInterfaceHelper.getXFormSessionKey(), 'fbc_207', {
				callback: function(value) {
					if (value == null)
						value = '';
					jQuery('#fbc_218-value').html(value);
					closeAllLoadingMessages();
				}
			});
		}, null);
	});
});