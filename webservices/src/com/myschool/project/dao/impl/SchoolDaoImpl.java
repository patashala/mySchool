package com.myschool.project.dao.impl;

import java.util.List;
import java.util.Set;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.myschool.project.dao.SchoolDao;
import com.myschool.project.dto.common.Country;
import com.myschool.project.dto.common.StatesOfCountries;
import com.myschool.project.dto.school.School;
import com.myschool.project.dto.school.SchoolBranch;

@Repository
public class SchoolDaoImpl implements SchoolDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean addSchool(School school) {
		
		sessionFactory.getCurrentSession().save(school);
		
		return true;
	}
	
	@Override
	public boolean UpdateSchool(School school) {
		sessionFactory.getCurrentSession().saveOrUpdate(school);
		return true;
	}
	
		
	@Override
	public School getSchoolbyID(String schoolId) {
		Session session = sessionFactory.getCurrentSession();
		School schoolData = (School)session.get(School.class, schoolId);	
		return schoolData;
	}

	@Override
	public List<School> getSchoolList() {
		CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<School> criteria =  builder.createQuery(School.class);
		Root<School> SchoolRoot = criteria.from(School.class);
		criteria.select(SchoolRoot);
		return sessionFactory.getCurrentSession().createQuery(criteria).getResultList();
	}

	@Override
	public boolean addBranch(SchoolBranch branchDetails) {
		
		sessionFactory.getCurrentSession().save(branchDetails);
		return true;
	}

	@Override
	public boolean UpdateBranch(SchoolBranch branchDetails) {
		sessionFactory.getCurrentSession().saveOrUpdate(branchDetails);
		return true;
	}

	@Override
	public SchoolBranch GetBranchData(String branchID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<SchoolBranch> getBranchList(String SchoolID) {
		Session session = sessionFactory.getCurrentSession();
		School school = (School)session.get(School.class, SchoolID);
		Set<SchoolBranch> stateBranches = school.getSchoolBranches();
		return stateBranches;
	}

	
}
