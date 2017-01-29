package com.myschool.project.restcontrollers.impl;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.myschool.project.restcontrollers.RegistrationResource;

@RequestMapping("/regrsrc")
@RestController
public class RegistrationResourceImpl implements RegistrationResource{

	@RequestMapping(path="/addstudent",method=RequestMethod.POST ,consumes=MediaType.APPLICATION_JSON_VALUE)
	@Override
	public ResponseEntity<Boolean> registerStudent(String userid, String details) {
		// TODO Auto-generated method stub
		return null;
	}

}
