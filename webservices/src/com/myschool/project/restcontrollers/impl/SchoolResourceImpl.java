package com.myschool.project.restcontrollers.impl;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.myschool.project.dto.school.School;
import com.myschool.project.dto.school.SchoolBranch;
import com.myschool.project.restcontrollers.SchoolResource;
import com.myschool.project.services.SchoolService;

@RequestMapping("/schoolrsrc")
@RestController
public class SchoolResourceImpl implements SchoolResource{

	@Autowired
	SchoolService schoolServices;

	
	@RequestMapping(path="/addnewschool/{userid}", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	@Override
	public boolean addSchool(
			@PathVariable String userid,
			@RequestBody String schoolDetails
			) {
		
		JSONObject object = new JSONObject(schoolDetails);
		ObjectMapper mapper = new ObjectMapper();
		try {
			School sc = mapper.readValue(object.toString(), School.class);
			sc.setCreatedBy(userid);
			return schoolServices.addSchool(sc);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}
	
	@RequestMapping(path="/hello", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	@Override
	public String greeting() {
		return "hello";
	}

	@Override
	@RequestMapping(path="/getallschools", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	public List<School> getSchoolList() {
		List<School> schools = new ArrayList<>();
		schools = schoolServices.getSchoolList();
		
		return schools;
	}

	@Override
	@RequestMapping(path="/modifyschool/{userid}", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean modifySchool(
			@PathVariable String userid, 
			@RequestBody String schoolDetails) {
		JSONObject object = new JSONObject(schoolDetails);
		ObjectMapper mapper = new ObjectMapper();
		try {
			School sc = mapper.readValue(object.toString(), School.class);
			sc.setLastUpdatedBy(userid);
			return schoolServices.modifySchool(sc);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	@RequestMapping(path="/addnewschoolbranch/{userid}", method=RequestMethod.POST, consumes=MediaType.APPLICATION_JSON_VALUE)
	public boolean addSchoolBranch(@PathVariable String userid, @RequestBody String branchDetails) {
		String CountryID, StateID, DistrictId, Schoolid;
		JSONObject object = new JSONObject(branchDetails);
		ObjectMapper mapper = new ObjectMapper();
		try {
			System.out.println(object.toString() + " country : "+object.getString("country"));
			CountryID = object.getString("country");
			StateID =object.getString("state");
			DistrictId = object.getString("district");
			Schoolid  = object.getString("schoolId");	
		
			object.remove("country");
			object.remove("state");
			object.remove("district");
			object.remove("schoolId");
			
			SchoolBranch branch = mapper.readValue(object.toString(), SchoolBranch.class);
			branch.setCreatedBy(userid);
			
			return schoolServices.addSchoolBranch(branch,CountryID, StateID, DistrictId, Schoolid);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean modifyBranch(String userid, String branchDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@RequestMapping(path="/getallschoolbranch/{schoolid}", produces=MediaType.APPLICATION_JSON_VALUE, method=RequestMethod.GET)
	public List<SchoolBranch> getSchoolBranchList(@PathVariable String schoolid ) {
		List<SchoolBranch> schoolBranches = new ArrayList<>();
		schoolBranches = schoolServices.getSchoolBranchList(schoolid);		
		return schoolBranches;
	}

}
