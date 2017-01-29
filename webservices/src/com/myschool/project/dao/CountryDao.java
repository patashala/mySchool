package com.myschool.project.dao;

import java.util.List;
import java.util.Set;

import com.myschool.project.dto.common.Country;
import com.myschool.project.dto.common.DistrictsOfState;
import com.myschool.project.dto.common.EducationBoard;
import com.myschool.project.dto.common.SocialNetwork;
import com.myschool.project.dto.common.StatesOfCountries;
import com.myschool.project.dto.common.UserIdentity;

public interface CountryDao {
	public boolean addNewSchool(Country country);
	public List<Country> getAllCOuntries();
	public Country getCountryById(String Country);
	
	public boolean addNewState(StatesOfCountries State);
	public Set<StatesOfCountries> getStatebyCountries(String Country);
	public StatesOfCountries GetStatebyID(String Countryid,String stateid);
	
	public boolean addNewDistrict(DistrictsOfState district);
	public Set<DistrictsOfState> getDistrictsbyState(String Countryid,String stateid);
	public DistrictsOfState getDistrictbyID(String DistrictCode);
	
	public boolean addNewBoard(EducationBoard BoardID);
	public List<EducationBoard> getBoardList();
	
	public boolean addNewSocailNetworkID(SocialNetwork NetworkID);
	public List<SocialNetwork> getSocialNetworkList();
	
	public boolean addNewIDentity(UserIdentity Identity);
	public List<UserIdentity> getIdentityList();
}
