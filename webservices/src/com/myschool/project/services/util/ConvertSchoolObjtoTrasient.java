package com.myschool.project.services.util;

import com.myschool.project.dto.school.School;
import com.myschool.project.dto.school.SchoolBranch;

public class ConvertSchoolObjtoTrasient {
	
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
	
	public 	SchoolBranch convertSchoolBranch2Transient(SchoolBranch Branch){

		SchoolBranch Branchtransient = new SchoolBranch();
		Branchtransient.setBranchId(Branch.getBranchId());
		Branchtransient.setSchool(convertSchoollist2Transient(Branch.getSchool()));
		Branchtransient.setBranchName(Branch.getBranchName());
		Branchtransient.setEffectiveTimeSequence(Branch.getEffectiveTimeSequence());
		Branchtransient.setBranchEnabled(Branch.isBranchEnabled());
		Branchtransient.setBranchLatitude(Branch.getBranchLatitude());
		Branchtransient.setBranchLongitude(Branch.getBranchLongitude());
		Branchtransient.setAddressLine1(Branch.getAddressLine1());
		Branchtransient.setAddressLine2(Branch.getAddressLine2());
		Branchtransient.setAddressLine3(Branch.getAddressLine3());
		Branchtransient.setAddressLine4(Branch.getAddressLine4());
		Branchtransient.setCity(Branch.getCity());
		Branchtransient.setPostalCode(Branch.getPostalCode());
		Branchtransient.setCountry(null);
		Branchtransient.setDistrict(null);
		Branchtransient.setState(null);
		Branchtransient.setCreatedBy(Branch.getCreatedBy());
		Branchtransient.setCreated_dttm(Branch.getCreated_dttm());
		Branchtransient.setLastUpdatedBy(Branch.getLastUpdatedBy());
		Branchtransient.setLastUpdated_dttm(Branch.getLastUpdated_dttm());
			return Branchtransient;
		}

}
