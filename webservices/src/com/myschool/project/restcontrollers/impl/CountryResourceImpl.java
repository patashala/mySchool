package com.myschool.project.restcontrollers.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myschool.project.dto.common.Country;
import com.myschool.project.dto.common.DistrictsOfState;
import com.myschool.project.dto.common.EducationBoard;
import com.myschool.project.dto.common.SocialNetwork;
import com.myschool.project.dto.common.StatesOfCountries;
import com.myschool.project.dto.common.UserIdentity;
import com.myschool.project.restcontrollers.CountryResource;
import com.myschool.project.services.CountryService;

@RestController
@RequestMapping("/countryrsrc")
public class CountryResourceImpl implements CountryResource {
	
	@Autowired
	CountryService countryService;

	@RequestMapping(path="/addnewcountry", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	@Override
	public ResponseEntity<Boolean> addNewCountry(
			@RequestBody String country) {
		
		JSONObject object = new JSONObject(country);
		ObjectMapper mapper = new ObjectMapper();
		try {
			Country c = mapper.readValue(object.toString(), Country.class);
			countryService.addCountry(c);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return ResponseEntity.ok().body(true);
	}
	
	@RequestMapping(path="/getallcountries", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@Override
	public List<Country> getAllCountries() {
		
		List<Country> countries = new ArrayList<>();
		countries = countryService.getAllCountries();
		
		return countries;
	}

	@RequestMapping(path="/addnewstate/{countryId}",consumes=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	@Override
	public ResponseEntity<Boolean> addNewState(
			@PathVariable String countryId,
			@RequestBody String state) {
			
		
		System.out.println(state);
		JSONObject object = new JSONObject(state);
		System.out.println(object.toString());
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println("staste called 1");
			StatesOfCountries S = mapper.readValue(object.toString(), StatesOfCountries.class);
			System.out.println("staste called 2");
			countryService.addState(S,countryId);
			System.out.println("staste called 3");
		} catch (JsonParseException e) {
			System.out.println("in the excception block");
			e.printStackTrace();
		} catch (JsonMappingException e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}

	@RequestMapping(path="/hello", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@Override
	public String greeting() {
		// TODO Auto-generated method stub
		return  "hello";
	}

	@Override
	@RequestMapping(path="/getallstates/{countryId}",produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	public List<StatesOfCountries> getStatesbyCountry(@PathVariable String countryId) {
		List<StatesOfCountries> states = new ArrayList<>();
		states = countryService.getStatesbyCountry(countryId);
		
		return states;
	}

	@Override
	@RequestMapping(path="/addnewstate/{countryId}/{state}",consumes=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.POST)
	public ResponseEntity<Boolean> addNewDistrict
									   (@PathVariable String countryId, 
										@PathVariable String state, 
										@RequestBody String District) {
		System.out.println(District);
		JSONObject object = new JSONObject(District);
		System.out.println(object.toString());
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println("District called 1");
			DistrictsOfState D = mapper.readValue(object.toString(), DistrictsOfState.class);
			System.out.println("District called 2");
			countryService.addDistrictbyState(D,countryId,state);
			System.out.println("staste called 3");
		} catch (JsonParseException e) {
			System.out.println("in the excception block");
			e.printStackTrace();
		} catch (JsonMappingException e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}// TODO Auto-generated method stub
		return null;
	}

	@Override
	@RequestMapping(path="/getalldistricts/{countryId}/{state}",produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	public List<DistrictsOfState> getDistrictbyState(@PathVariable String countryId, @PathVariable String state) {
		List<DistrictsOfState> districts = new ArrayList<>();
		districts = countryService.getDistrictbyState(countryId, state);
		
		return districts;
	}

	@Override
	@RequestMapping(path="/addnewboard", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> addNewBoard(@RequestBody String BoardDet) {
		JSONObject object = new JSONObject(BoardDet);
		ObjectMapper mapper = new ObjectMapper();
		try {
			EducationBoard E= mapper.readValue(object.toString(), EducationBoard.class);
			countryService.addBoard(E);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@RequestMapping(path="/getboardlist",produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
		public List<EducationBoard> getBoardList() {
		
		List<EducationBoard> Boards = new ArrayList<>();
		Boards = countryService.getBoardList();
		
		return Boards;
	}

	@Override
	@RequestMapping(path="/addnewsocialnetwork", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
		public  ResponseEntity<Boolean> addNewSocailNetworkID(@RequestBody String socailNetwork) {
		JSONObject object = new JSONObject(socailNetwork);
		ObjectMapper mapper = new ObjectMapper();
		try {
			SocialNetwork E= mapper.readValue(object.toString(), SocialNetwork.class);
			countryService.addNewSocailNetworkID(E);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@RequestMapping(path="/getsocialnetwork",produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	public List<SocialNetwork> getSocialNetworkList() {
		List<SocialNetwork> sNetwork = new ArrayList<>();
		sNetwork = countryService.getSocialNetworkList();
		return sNetwork;
	}

	@Override
	@RequestMapping(path="/addnewidentitytype", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Boolean> addNewIdentityID(@RequestBody String IdentityDet) {
		JSONObject object = new JSONObject(IdentityDet);
		ObjectMapper mapper = new ObjectMapper();
		try {
			UserIdentity ID= mapper.readValue(object.toString(), UserIdentity.class);
			countryService.addNewIDentity(ID);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	@RequestMapping(path="/getidentitytypelist",produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	public List<UserIdentity> getIdentityList() {
		List<UserIdentity> IDList = new ArrayList<>();
		IDList = countryService.getIdentityList();
		return IDList;
	}

}
