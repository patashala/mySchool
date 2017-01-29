package com.myschool.project.services.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.myschool.project.dao.CountryDao;
import com.myschool.project.dao.SchoolDao;
import com.myschool.project.dto.common.Country;
import com.myschool.project.dto.common.DistrictsOfState;
import com.myschool.project.dto.common.StatesOfCountries;
import com.myschool.project.dto.school.School;
import com.myschool.project.dto.school.SchoolBranch;
import com.myschool.project.services.SchoolService;
import com.myschool.project.services.util.ConvertSchoolObjtoTrasient;

@Service
@Transactional

public class SchoolServiceImpl implements SchoolService{

	@Autowired
	SchoolDao schooldao;
	@Autowired
	CountryDao commondao;

	ConvertSchoolObjtoTrasient convert;
	
	public SchoolServiceImpl() {
	convert = new ConvertSchoolObjtoTrasient();
	}
	
	@Override
	public boolean addSchool(School school) {
			
		Date d = new Date();
		school.setSchoolId(getSchoolId());
		school.setLastUpdatedBy(school.getCreatedBy());
		school.setCreated_dttm(d);
		school.setLastUpdated_dttm(d);
		return schooldao.addSchool(school);
	}

	private String getSchoolId() {
		
		Date d = new Date();
		long l = d.getTime();
		
		return "SCHOOL"+l;
	}

	@Override
	public List<School> getSchoolList() {
		List<School> schools = new ArrayList<>();
		List<School> list = new ArrayList<>();
		schools = schooldao.getSchoolList();
		System.out.println(schools.size()); 
		if(schools != null)
			for(int i = 0; i < schools.size();i++){
				list.add(convert.convertSchoollist2Transient(schools.get(i))); 
			}
		    return list;
	}

	@Override
	public boolean modifySchool(School school) {
		Date d = new Date();
		school.setLastUpdated_dttm(d);
		
		School olddata = new School();
		School UpdatedData = new School();
		olddata = schooldao.getSchoolbyID(school.getSchoolId());
		UpdatedData = convert.convertUpdate2Transient(school,olddata);
		System.out.println(UpdatedData.getSchoolNameShort() +",,"+ olddata.getSchoolNameShort() );
		System.out.println(UpdatedData.getSchoolFullName()  +",,"+ UpdatedData.getSchoolFullName());
		return schooldao.UpdateSchool(UpdatedData);
	}

	@Override
	public boolean addSchoolBranch(SchoolBranch branchDetails, String CountryID, String StateID, String DistrictID, String SchoolID) {
		System.out.println(CountryID +",,"+ commondao.getCountryById(CountryID)  );
		Date d = new Date();
		
		Country C = commondao.getCountryById(CountryID);
		StatesOfCountries st = commondao.GetStatebyID(CountryID, StateID);
		DistrictsOfState Dist = commondao.getDistrictbyID(DistrictID);
		School school = schooldao.getSchoolbyID(SchoolID);
		
		branchDetails.setBranchId(CreateBranchId());
		branchDetails.setSchool(school);
		branchDetails.setCountry(C);
		branchDetails.setState(st);
		branchDetails.setDistrict(Dist);
		
		branchDetails.setLastUpdatedBy(branchDetails.getCreatedBy());
		branchDetails.setCreated_dttm(d);
		branchDetails.setLastUpdated_dttm(d);

		return schooldao.addBranch(branchDetails);
	}

    private String CreateBranchId() {
		
		Date d = new Date();
		long l = d.getTime();		
		return "BRANCH"+l;
	}
	
	@Override
	public boolean modifyBranch(SchoolBranch branchDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<SchoolBranch> getSchoolBranchList(String SchoolID) {
		List<SchoolBranch> list = new ArrayList<>();
		Set <SchoolBranch> BranchesList = schooldao.getBranchList(SchoolID);
		List<SchoolBranch> Branches = new ArrayList<>(BranchesList);
		if(Branches != null)
			for(int i = 0; i < Branches.size();i++){
				list.add(convert.convertSchoolBranch2Transient(Branches.get(i))); 
			}
		    return list;
	}

}
