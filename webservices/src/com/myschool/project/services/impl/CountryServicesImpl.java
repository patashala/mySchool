package com.myschool.project.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myschool.project.dao.CountryDao;
import com.myschool.project.dto.common.Country;
import com.myschool.project.services.CountryService;
import com.myschool.project.services.util.ConvertToTransient;

@Service
@Transactional
public class CountryServicesImpl implements CountryService{
	
	@Autowired
	CountryDao dao;
	
	ConvertToTransient convert;
	
	public CountryServicesImpl() {
		convert = new ConvertToTransient();
	}
	
	@Override
	public boolean addCountry(Country country) {
		
		dao.addNewSchool(country);
		
		return false;
	}

	@Override
	public List<Country> getAllCountries() {
		
		List<Country> countries = new ArrayList<>();
		List<Country> list = new ArrayList<>();
		countries = dao.getAllCOuntries();
		System.out.println(countries.size());
		if(countries != null)
			for(int i = 0; i < countries.size();i++){
				list.add(convert.convert2Transient(countries.get(i)));
			}
		return list;
	}

}
