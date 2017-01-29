package com.myschool.project.services;

import java.util.List;

import com.myschool.project.dto.common.Country;
import com.myschool.project.dto.common.DistrictsOfState;
import com.myschool.project.dto.common.EducationBoard;
import com.myschool.project.dto.common.SocialNetwork;
import com.myschool.project.dto.common.StatesOfCountries;
import com.myschool.project.dto.common.UserIdentity;

public interface CountryService {
	
	public boolean addCountry(Country country);
	public List<Country> getAllCountries();
	
	public boolean addState(StatesOfCountries state, String countryId);
	public List<StatesOfCountries> getStatesbyCountry(String countryId);
	
	public boolean addDistrictbyState(DistrictsOfState district, String countryId, String State);
	public List<DistrictsOfState> getDistrictbyState(String countryId,String State );
	
	public boolean addBoard(EducationBoard BoardID);
	public List<EducationBoard> getBoardList();
	
	public boolean addNewSocailNetworkID(SocialNetwork NetworkID);
	public List<SocialNetwork> getSocialNetworkList();
	
	public boolean addNewIDentity(UserIdentity Identity);
	public List<UserIdentity> getIdentityList();
	
}
