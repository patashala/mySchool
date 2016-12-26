package com.myschool.project.restcontrollers.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myschool.project.dto.common.Country;
import com.myschool.project.restcontrollers.CountryResource;
import com.myschool.project.services.CountryService;

@RestController
@RequestMapping("/countryrsrc")
public class CountryResourceImpl implements CountryResource {
	
	@Autowired
	CountryService countryService;

	@RequestMapping(path="/addnewcountry",method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	@Override
	public ResponseEntity<Boolean> addNewCountry(
			@RequestBody String country) {
		
		JSONObject object = new JSONObject(country);
		ObjectMapper mapper = new ObjectMapper();
		try {
			Country c = mapper.readValue(object.toString(), Country.class);
			countryService.addCountry(c);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
	
	@RequestMapping(path="/getallcountries", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@Override
	public List<Country> getAllCountries() {
		
		List<Country> countries = new ArrayList<>();
		countries = countryService.getAllCountries();
		
		return countries;
	}

}
