package com.myschool.project.restcontrollers.impl;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myschool.project.restcontrollers.SchoolResource;

@RequestMapping("/schoolrsrc")
@RestController
public class SchoolResourceImpl implements SchoolResource{

	@RequestMapping(path="/addnewschool/{userid}", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	@Override
	public boolean addSchool(
			@PathVariable String userId,
			@RequestBody String schoolDetails
			) {
		
		
		return false;
	}

}
