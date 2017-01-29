package com.myschool.project.services.util;

import com.myschool.project.dto.common.Country;
import com.myschool.project.dto.common.DistrictsOfState;
import com.myschool.project.dto.common.EducationBoard;
import com.myschool.project.dto.common.SocialNetwork;
import com.myschool.project.dto.common.StatesOfCountries;
import com.myschool.project.dto.common.UserIdentity;
import com.myschool.project.dto.school.School;

public class ConvertToTransient {
	
	public Country convert2Transient(Country country){
		
		Country countrytransient = new Country();
		countrytransient.setAddress1Enabled(country.isAddress1Enabled());
		countrytransient.setAddress2Enabled(country.isAddress2Enabled());
		countrytransient.setAddress3Enabled(country.isAddress3Enabled());
		countrytransient.setAddress4Enabled(country.isAddress4Enabled());
		countrytransient.setCityEnabled(country.isCityEnabled());
		countrytransient.setCountryCode(country.getCountryCode());
		countrytransient.setCountryName(country.getCountryName());
		countrytransient.setDistricts(null);
		countrytransient.setPostalCodeEnabled(country.isPostalCodeEnabled());
		countrytransient.setStateEnabled(country.isStateEnabled());
		countrytransient.setStates(null);
		return countrytransient;
	}
	
public 	StatesOfCountries convertState2Transient(StatesOfCountries state){
		
	StatesOfCountries statetransient = new StatesOfCountries();
	statetransient.setStateCode(state.getStateCode());
	statetransient.setStateName(state.getStateName());
	statetransient.setEffectiveDateTime(state.getEffectiveDateTime());
	statetransient.setStateEnabled(state.isStateEnabled());
	// statetransient.setCountry(state.getCountry());
		
		return statetransient;
	}

public 	DistrictsOfState convertDistricts2Transient(DistrictsOfState District){
	
	DistrictsOfState Districttransient = new DistrictsOfState();
	Districttransient.setDistrictCode(District.getDistrictCode());
	Districttransient.setDistrictName(District.getDistrictName());
	Districttransient.setEffectiveDateTime(District.getEffectiveDateTime());
	Districttransient.setDistrictEnabled(District.isDistrictEnabled());
	//Districttransient.setCountry(District.getCountry());
	//Districttransient.setState(District.getState());
		
		return Districttransient;
	}

public 	EducationBoard convertBoard2Transient(EducationBoard Board){
	
	EducationBoard Boardtransient = new EducationBoard();
	Boardtransient.setBoardId(Board.getBoardId());
	Boardtransient.setBoardName(Board.getBoardName());
	Boardtransient.setBoardSName(Board.getBoardSName());
	Boardtransient.setEffectiveDateTime(Board.getEffectiveDateTime());
	Boardtransient.setDistrictEnabled(Board.isDistrictEnabled());
		
		return Boardtransient;
	}

public 	SocialNetwork convertSocialNetwork2Transient(SocialNetwork NetworkID){
	
	SocialNetwork SocialNetworktransient = new SocialNetwork();
	SocialNetworktransient.setSocialNetworkId(NetworkID.getSocialNetworkId());
	SocialNetworktransient.setSocialNetworkName(NetworkID.getSocialNetworkName());
	SocialNetworktransient.setEffectiveDateTime(NetworkID.getEffectiveDateTime());
	SocialNetworktransient.setSocialNetworkEnabled(NetworkID.isSocialNetworkEnabled());
		
		return SocialNetworktransient;
	}


public 	UserIdentity convertIdentity2Transient(UserIdentity Identity){
	
	UserIdentity Identitytransient = new UserIdentity();
	Identitytransient.setIdentityId(Identity.getIdentityId());
	Identitytransient.setIdenityIdName(Identity.getIdenityIdName());
	Identitytransient.setIdentityType(Identity.getIdentityType());
		
		return Identitytransient;
	}

public 	School convertSchoollist2Transient(School SchoolDet){

	School Schooltransient = new School();
	Schooltransient.setSchoolId(SchoolDet.getSchoolId());
	Schooltransient.setEffectiveDateTime(SchoolDet.getEffectiveDateTime());
	Schooltransient.setSchoolEnabled(SchoolDet.isSchoolEnabled());
	Schooltransient.setSchoolNameShort(SchoolDet.getSchoolNameShort());
	Schooltransient.setSchoolFullName(SchoolDet.getSchoolFullName());
	Schooltransient.setCategory(SchoolDet.getCategory());
	Schooltransient.setSchoolEstablishedDate(SchoolDet.getSchoolEstablishedDate());
	Schooltransient.setCreatedBy(SchoolDet.getCreatedBy());
	Schooltransient.setCreated_dttm(SchoolDet.getCreated_dttm());
	Schooltransient.setLastUpdatedBy(SchoolDet.getLastUpdatedBy());
	Schooltransient.setLastUpdated_dttm(SchoolDet.getLastUpdated_dttm());
	Schooltransient.setNotes(SchoolDet.getNotes());
	Schooltransient.setCurrencyCode(SchoolDet.getCurrencyCode());
	/*Schooltransient.setSchoolBranches(null);
	Schooltransient.setSchoolEducationBoards(null);
	Schooltransient.setSchoolEducationBoard(null);
	Schooltransient.setTeachers(null);
	Schooltransient.setSchoolsections(null);*/
		return Schooltransient;
	}

public 	School convertUpdate2Transient(School NewSchoolDet, School OldSchoolData){

	OldSchoolData.setSchoolId(NewSchoolDet.getSchoolId());
	OldSchoolData.setEffectiveDateTime(NewSchoolDet.getEffectiveDateTime());
	OldSchoolData.setSchoolEnabled(NewSchoolDet.isSchoolEnabled());
	OldSchoolData.setSchoolNameShort(NewSchoolDet.getSchoolNameShort());
	OldSchoolData.setSchoolFullName(NewSchoolDet.getSchoolFullName());
	OldSchoolData.setCategory(NewSchoolDet.getCategory());
	OldSchoolData.setSchoolEstablishedDate(NewSchoolDet.getSchoolEstablishedDate());
	OldSchoolData.setCreatedBy(NewSchoolDet.getCreatedBy());
	OldSchoolData.setCreated_dttm(NewSchoolDet.getCreated_dttm());
	OldSchoolData.setLastUpdatedBy(NewSchoolDet.getLastUpdatedBy());
	OldSchoolData.setLastUpdated_dttm(NewSchoolDet.getLastUpdated_dttm());
	OldSchoolData.setNotes(NewSchoolDet.getNotes());
	OldSchoolData.setCurrencyCode(NewSchoolDet.getCurrencyCode());
	/*Schooltransient.setSchoolBranches(null);
	Schooltransient.setSchoolEducationBoards(null);
	Schooltransient.setSchoolEducationBoard(null);
	Schooltransient.setTeachers(null);
	Schooltransient.setSchoolsections(null);*/
		return OldSchoolData;
	}

}
