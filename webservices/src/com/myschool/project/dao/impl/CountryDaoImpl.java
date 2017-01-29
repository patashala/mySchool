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

import com.myschool.project.dao.CountryDao;
import com.myschool.project.dto.common.Country;
import com.myschool.project.dto.common.DistrictsOfState;
import com.myschool.project.dto.common.EducationBoard;
import com.myschool.project.dto.common.SocialNetwork;
import com.myschool.project.dto.common.StatesOfCountries;
import com.myschool.project.dto.common.UserIdentity;

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
	
	@Override
	public Country getCountryById(String countryCode) {
		Session session = sessionFactory.getCurrentSession();
		Country c = (Country)session.get(Country.class, countryCode);	
		return c;
	}


	@Override
	public boolean addNewState(StatesOfCountries State) {
		System.out.println("staste called _dao");
		sessionFactory.getCurrentSession().save(State);
		return true;
	}

	@Override
	public Set<StatesOfCountries> getStatebyCountries(String Country) {
		
		Session session = sessionFactory.getCurrentSession();
		Country c = (Country)session.get(Country.class, Country);
		Set<StatesOfCountries> state =  c.getStates();
		return state;
	}

	@Override
	public StatesOfCountries GetStatebyID(String Countryid, String stateid) {
		Session session = sessionFactory.getCurrentSession();
		StatesOfCountries state_id =  (StatesOfCountries)session.get(StatesOfCountries.class, stateid);
		return state_id;
	}

	@Override
	public boolean addNewDistrict(DistrictsOfState district) {
		sessionFactory.getCurrentSession().save(district);
		return true;
	}

	@Override
	public Set<DistrictsOfState> getDistrictsbyState(String Countryid, String stateid) {
		Session session = sessionFactory.getCurrentSession();
		Country c = (Country)session.get(Country.class, Countryid);
		StatesOfCountries state = (StatesOfCountries)session.get(StatesOfCountries.class, stateid);
		state.setCountry(c);
		Set<DistrictsOfState> Districts = state.getDistricts();
		
		return Districts;
	}
	
	@Override
	public DistrictsOfState getDistrictbyID(String DistrictCode) {
		Session session = sessionFactory.getCurrentSession();
		DistrictsOfState District =  (DistrictsOfState)session.get(DistrictsOfState.class, DistrictCode);
		return District;
	}

	@Override
	public boolean addNewBoard(EducationBoard BoardID) {
		sessionFactory.getCurrentSession().save(BoardID);
		return true;
	}

	@Override
	public List<EducationBoard> getBoardList() {
		CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<EducationBoard> criteria =  builder.createQuery(EducationBoard.class);
		Root<EducationBoard> BoardRoot = criteria.from(EducationBoard.class);
		criteria.select(BoardRoot);
		return sessionFactory.getCurrentSession().createQuery(criteria).getResultList();
	}

	@Override
	public boolean addNewSocailNetworkID(SocialNetwork NetworkID) {
		sessionFactory.getCurrentSession().save(NetworkID);
		return true;
	}

	@Override
	public List<SocialNetwork> getSocialNetworkList() {
		CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<SocialNetwork> criteria =  builder.createQuery(SocialNetwork.class);
		Root<SocialNetwork> SocialNetworkRoot = criteria.from(SocialNetwork.class);
		criteria.select(SocialNetworkRoot);
		return sessionFactory.getCurrentSession().createQuery(criteria).getResultList();
	}

	@Override
	public boolean addNewIDentity(UserIdentity Identity) {
		sessionFactory.getCurrentSession().save(Identity);
		return true;
	}

	@Override
	public List<UserIdentity> getIdentityList() {
		CriteriaBuilder builder = sessionFactory.getCurrentSession().getCriteriaBuilder();
		CriteriaQuery<UserIdentity> criteria =  builder.createQuery(UserIdentity.class);
		Root<UserIdentity> UserIdentityRoot = criteria.from(UserIdentity.class);
		criteria.select(UserIdentityRoot);
		return sessionFactory.getCurrentSession().createQuery(criteria).getResultList();
	}

	
}
