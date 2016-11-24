package com.myschool.project.dto.school;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.myschool.project.dto.common.EducationBoard;
import com.myschool.project.dto.teacher.Teacher;

@Entity
@Table(name="ps_school_tbl")
public class School implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private String schoolId;
	
	@Column(name="eff_date")
	private long effectiveDateTime;
	
	@Column(name="eff_status")
	private boolean schoolEnabled;

	@Column(name="desc_long")
	private String schoolFullName;
	
	@Column(name="desc_short")
	private String schoolNameShort;

	private String category;

	@Column(name="establish_date")
	private Date schoolEstablishedDate;

	private long notes;
	private String currencyCode;
	
	String createdBy;
	Date created_dttm;
	String lastUpdatedBy;
	Date lastUpdated_dttm;

	@OneToMany(mappedBy="school")
	private Set<EducationBoard> schoolEducationBoards;

	@OneToMany(fetch=FetchType.LAZY, mappedBy="school")
	private Set<SchoolBranch> schoolBranches;
	
	@OneToMany(mappedBy="schoolSections")
	private List<SchoolBranchClassSections> schoolsections;

	@OneToMany(mappedBy="schoolTeachers")
	private List<Teacher> teachers;
	
	@OneToMany(mappedBy="schoolclass")
	private List<SchoolBranchClass> classes;
	
	public String getSchoolId() {
		return schoolId;
	}
	public Set<EducationBoard> getSchoolEducationBoard() {
		return schoolEducationBoards;
	}
	public void setSchoolEducationBoard(Set<EducationBoard> schoolEducationBoards) {
		this.schoolEducationBoards = schoolEducationBoards;
	}
	
	public Set<SchoolBranch> getSchoolBranches() {
		return schoolBranches;
	}
	public void setSchoolBranches(Set<SchoolBranch> schoolBranches) {
		this.schoolBranches = schoolBranches;
	}
	public void setSchoolId(String schoolId) {
		this.schoolId = schoolId;
	}
	public boolean isSchoolEnabled() {
		return schoolEnabled;
	}
	public void setSchoolEnabled(boolean schoolEnabled) {
		this.schoolEnabled = schoolEnabled;
	}
	public long getEffectiveDateTime() {
		return effectiveDateTime;
	}
	public void setEffectiveDateTime(long effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}
	public String getSchoolNameShort() {
		return schoolNameShort;
	}
	public void setSchoolNameShort(String schoolNameShort) {
		this.schoolNameShort = schoolNameShort;
	}
	public String getSchoolFullName() {
		return schoolFullName;
	}
	public void setSchoolFullName(String schoolFullName) {
		this.schoolFullName = schoolFullName;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Date getSchoolEstablishedDate() {
		return schoolEstablishedDate;
	}
	public void setSchoolEstablishedDate(Date schoolEstablishedDate) {
		this.schoolEstablishedDate = schoolEstablishedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public Date getCreated_dttm() {
		return created_dttm;
	}
	public void setCreated_dttm(Date created_dttm) {
		this.created_dttm = created_dttm;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public Date getLastUpdated_dttm() {
		return lastUpdated_dttm;
	}
	public void setLastUpdated_dttm(Date lastUpdated_dttm) {
		this.lastUpdated_dttm = lastUpdated_dttm;
	}
	public long getNotes() {
		return notes;
	}
	public void setNotes(long notes) {
		this.notes = notes;
	}
	public String getCurrencyCode() {
		return currencyCode;
	}
	public void setCurrencyCode(String currencyCode) {
		this.currencyCode = currencyCode;
	}
	public Set<EducationBoard> getSchoolEducationBoards() {
		return schoolEducationBoards;
	}
	public void setSchoolEducationBoards(Set<EducationBoard> schoolEducationBoards) {
		this.schoolEducationBoards = schoolEducationBoards;
	}
	public List<SchoolBranchClassSections> getSchoolsections() {
		return schoolsections;
	}
	public void setSchoolsections(List<SchoolBranchClassSections> schoolsections) {
		this.schoolsections = schoolsections;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

}
