package com.myschool.project.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myschool.project.dao.CountryDao;
import com.myschool.project.dto.common.Country;
import com.myschool.project.dto.common.DistrictsOfState;
import com.myschool.project.dto.common.EducationBoard;
import com.myschool.project.dto.common.SocialNetwork;
import com.myschool.project.dto.common.StatesOfCountries;
import com.myschool.project.dto.common.UserIdentity;
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

	@Override
	public boolean addState(StatesOfCountries state, String countryId) {
		System.out.println("state called_ services");
		Country country = dao.getCountryById(countryId);
		if(country != null){
			state.setCountry(country);
			dao.addNewState(state);
			return true;
		}
		else
			return false;
	}

	@Override
	public List<StatesOfCountries> getStatesbyCountry(String countryId) {
		
		List<StatesOfCountries> list = new ArrayList<>();
		Set<StatesOfCountries> St = dao.getStatebyCountries(countryId);
		List<StatesOfCountries> states = new ArrayList<>(St);

		if(states != null)
			for(int i = 0; i < states.size();i++){
				list.add(convert.convertState2Transient(states.get(i)));
			}
		return list;
	}

	@Override
	public boolean addDistrictbyState(DistrictsOfState district, String countryId, String State) {
		
		System.out.println("state called_ services");
		Country country = dao.getCountryById(countryId);
		StatesOfCountries state = dao.GetStatebyID(countryId,State);
		if(country != null){
			district.setCountry(country);
			district.setState(state);
			dao.addNewDistrict(district); 
			return true;
		}
		else
			return false;
		
	}

	@Override
	public List<DistrictsOfState> getDistrictbyState(String countryId, String State) {
		List<DistrictsOfState> list = new ArrayList<>();
		Set<DistrictsOfState> District = dao.getDistrictsbyState(countryId, State);
		List<DistrictsOfState> Districts = new ArrayList<>(District);
		System.out.println(Districts);
		
		if(Districts != null)
			for(int i = 0; i < Districts.size();i++){
				list.add(convert.convertDistricts2Transient(Districts.get(i)));
			}
		return list;
	}

	@Override
	public boolean addBoard(EducationBoard BoardID) {
		BoardID.setBoardId(getBoardId());
		
		dao.addNewBoard(BoardID);

		return false;
	}
	

	private String getBoardId() {
		Date d = new Date();
		long l = d.getTime();
		
		return "BRD"+l;
	}

	@Override
	public List<EducationBoard> getBoardList() {
		List<EducationBoard> Boards = new ArrayList<>();
		List<EducationBoard> list = new ArrayList<>();
		Boards = dao.getBoardList();

		if(Boards != null)
			for(int i = 0; i < Boards.size();i++){
				list.add(convert.convertBoard2Transient(Boards.get(i)));
			}
		return list;
	}

	@Override
	public boolean addNewSocailNetworkID(SocialNetwork NetworkID) {
		NetworkID.setSocialNetworkId(getSocialNetworkId());
		
		dao.addNewSocailNetworkID(NetworkID);
		return false;
	}
	
	private String getSocialNetworkId() {
		Date d = new Date();
		long l = d.getTime();
		
		return "NTW"+l;
	}

	@Override
	public List<SocialNetwork> getSocialNetworkList() {
		List<SocialNetwork> SocialNetworkLt = new ArrayList<>();
		List<SocialNetwork> list = new ArrayList<>();
		SocialNetworkLt = dao.getSocialNetworkList();

		if(SocialNetworkLt != null)
			for(int i = 0; i < SocialNetworkLt.size();i++){
				list.add(convert.convertSocialNetwork2Transient(SocialNetworkLt.get(i)));
			}
		return list;
	}

	@Override
	public boolean addNewIDentity(UserIdentity Identity) {
		Identity.setIdentityId(getIdentityId());
		
		dao.addNewIDentity(Identity);
		return false;
	}
	
	private String getIdentityId() {
		Date d = new Date();
		long l = d.getTime();
		
		return "SSN"+l;
	}

	@Override
	public List<UserIdentity> getIdentityList() {
		List<UserIdentity> UserIdentityLt = new ArrayList<>();
		List<UserIdentity> list = new ArrayList<>();
		UserIdentityLt = dao.getIdentityList();

		if(UserIdentityLt != null)
			for(int i = 0; i < UserIdentityLt.size();i++){
				list.add(convert.convertIdentity2Transient(UserIdentityLt.get(i)));
			}
		return list;
	}

}
