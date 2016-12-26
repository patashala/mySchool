package com.myschool.project.dao.impl;

import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myschool.project.dao.CountryDao;
import com.myschool.project.dto.common.Country;

@Repository
public class CountryDaoImpl implements CountryDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addNewSchool(Country country) {
		
		sessionFactory.getCurrentSession().save(country);
		
		
		return false;
	}

	@Override
	public List<Country> getAllCOuntries() {
		
		CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<Country> criteria =  builder.createQuery(Country.class);
		Root<Country> countryRoot = criteria.from(Country.class);
		criteria.select(countryRoot);
		return sessionFactory.getCurrentSession().createQuery(criteria).getResultList();
	}

}
