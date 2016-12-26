package com.myschool.project.services;

import java.util.List;

import com.myschool.project.dto.common.Country;

public interface CountryService {
	
	public boolean addCountry(Country country);
	public List<Country> getAllCountries();
}
