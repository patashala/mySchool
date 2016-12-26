package com.myschool.project.dao.impl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myschool.project.dao.SchoolDao;
import com.myschool.project.dto.school.School;

@Repository
public class SchoolDaoImpl implements SchoolDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addSchool(School school) {
		
		sessionFactory.getCurrentSession().save(school);
		
		return true;
	}

}
