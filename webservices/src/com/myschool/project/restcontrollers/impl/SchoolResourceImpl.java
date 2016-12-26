package com.myschool.project.restcontrollers.impl;

import java.io.IOException;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myschool.project.dto.school.School;
import com.myschool.project.restcontrollers.SchoolResource;
import com.myschool.project.services.SchoolService;

@RequestMapping("/schoolrsrc")
@RestController
public class SchoolResourceImpl implements SchoolResource{

	@Autowired
	SchoolService schoolServices;
	
	@RequestMapping(path="/addnewschool/{userid}", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	@Override
	public boolean addSchool(
			@PathVariable String userid,
			@RequestBody String schoolDetails
			) {
		
		JSONObject object = new JSONObject(schoolDetails);
		
		ObjectMapper mapper = new ObjectMapper();
		try {
			School sc = mapper.readValue(object.toString(), School.class);
			return schoolServices.addSchool(sc);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@RequestMapping(path="/hello", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@Override
	public String greeting() {
		return "hello";
	}

}
