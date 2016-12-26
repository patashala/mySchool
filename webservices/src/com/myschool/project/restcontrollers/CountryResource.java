package com.myschool.project.restcontrollers;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.myschool.project.dto.common.Country;

public interface CountryResource {
	
	public ResponseEntity<Boolean> addNewCountry(String country);
	public List<Country> getAllCountries();
	
}
