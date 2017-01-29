package com.myschool.project.restcontrollers;

import java.util.List;
import com.myschool.project.dto.school.School;
import com.myschool.project.dto.school.SchoolBranch;

public interface SchoolResource {
	
	public String greeting();
	public boolean addSchool(String userid, String schoolDetails);
	public boolean modifySchool(String userid, String schoolDetails);
	public List<School> getSchoolList();

	public boolean addSchoolBranch(String userid, String branchDetails);
	public boolean modifyBranch(String userid, String branchDetails);
	public List<SchoolBranch> getSchoolBranchList(String schoolid);
	
}
