package com.myschool.project.services.util;

import com.myschool.project.dto.common.Country;

public class ConvertToTransient {
	
	public Country convert2Transient(Country country){
		
		Country countrytransient = new Country();
		countrytransient.setAddress1Enabled(country.isAddress1Enabled());
		countrytransient.setAddress2Enabled(country.isAddress2Enabled());
		countrytransient.setAddress3Enabled(country.isAddress3Enabled());
		countrytransient.setAddress4Enabled(country.isAddress4Enabled());
		countrytransient.setCityEnabled(country.isCityEnabled());
		countrytransient.setCountryCode(country.getCountryCode());
		countrytransient.setCountryName(country.getCountryName());
		countrytransient.setDistricts(null);
		countrytransient.setPostalCodeEnabled(country.isPostalCodeEnabled());
		countrytransient.setStateEnabled(country.isStateEnabled());
		countrytransient.setStates(null);
		return countrytransient;
	}

}
