package com.myschool.project.services;

import java.util.List;

import com.myschool.project.dto.school.School;
import com.myschool.project.dto.school.SchoolBranch;

public interface SchoolService {
	
	public boolean addSchool(School school);
	public boolean modifySchool(School school);
	public List<School> getSchoolList();
	
	public boolean addSchoolBranch(SchoolBranch branchDetails, String CountryID, String StateID, String DistrictID, String SchoolID);
	public boolean modifyBranch(SchoolBranch branchDetails);
	public List<SchoolBranch> getSchoolBranchList(String SchoolID);

}
