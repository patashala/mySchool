package com.myschool.project.dao;

import java.util.List;

import com.myschool.project.dto.common.Country;

public interface CountryDao {
	public boolean addNewSchool(Country country);
	public List<Country> getAllCOuntries();
}
