package com.myschool.project.restcontrollers;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.myschool.project.dto.common.Country;
import com.myschool.project.dto.common.DistrictsOfState;
import com.myschool.project.dto.common.EducationBoard;
import com.myschool.project.dto.common.SocialNetwork;
import com.myschool.project.dto.common.StatesOfCountries;
import com.myschool.project.dto.common.UserIdentity;

public interface CountryResource {
	
	public ResponseEntity<Boolean> addNewCountry(String country);
	public List<Country> getAllCountries();
	
	public ResponseEntity<Boolean> addNewState(String countryId,String state);
	public List<StatesOfCountries> getStatesbyCountry(String countryId);
	
	public ResponseEntity<Boolean> addNewDistrict(String countryId,String state,String District);
	public List<DistrictsOfState> getDistrictbyState(String countryId,String stateCd);
	
	public ResponseEntity<Boolean> addNewBoard(String BoardDet);
	public List<EducationBoard> getBoardList();

	public ResponseEntity<Boolean> addNewSocailNetworkID(String socailNetwork);
	public List<SocialNetwork> getSocialNetworkList();
	
	public ResponseEntity<Boolean> addNewIdentityID(String IdentityDet);
	public List<UserIdentity> getIdentityList();
	
	public String greeting();
	
}
