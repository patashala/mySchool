package com.myschool.project.restcontrollers;

import org.springframework.http.ResponseEntity;

public interface RegistrationResource {
	public ResponseEntity<Boolean> registerStudent(String userid, String details);
}
