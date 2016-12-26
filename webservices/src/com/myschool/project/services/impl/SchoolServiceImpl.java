package com.myschool.project.services.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myschool.project.dao.SchoolDao;
import com.myschool.project.dto.school.School;
import com.myschool.project.services.SchoolService;

@Service
@Transactional
public class SchoolServiceImpl implements SchoolService{

	@Autowired
	SchoolDao dao;
	
	@Override
	public boolean addSchool(School school) {
		
		school.setSchoolId(getSchoolId());
		
		return dao.addSchool(school);
	}

	private String getSchoolId() {
		
		Date d = new Date();
		long l = d.getTime();
		
		return "SCHOOL"+l;
	}

}
