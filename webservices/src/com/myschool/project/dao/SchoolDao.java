package com.myschool.project.dao;

import java.util.List;
import java.util.Set;

import com.myschool.project.dto.school.School;
import com.myschool.project.dto.school.SchoolBranch;

public interface SchoolDao {

	public boolean addSchool(School school);
	public boolean UpdateSchool(School school);
	public School getSchoolbyID(String schoolID);
	public List<School> getSchoolList();
	
	public boolean addBranch(SchoolBranch branchDetails);
	public boolean UpdateBranch(SchoolBranch branchDetails);
	public SchoolBranch GetBranchData(String branchID);
	public Set<SchoolBranch> getBranchList(String SchoolID);
}
