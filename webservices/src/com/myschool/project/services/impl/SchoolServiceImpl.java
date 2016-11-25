package com.myschool.project.services.impl;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myschool.project.dto.school.School;
import com.myschool.project.services.SchoolService;

@Service
@Transactional
public class SchoolServiceImpl implements SchoolService{

	@Override
	public boolean addSchool(School school) {
		// TODO Auto-generated method stub
		return false;
	}

}
