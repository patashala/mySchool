package com.myschool.project.dto.student;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.myschool.project.dto.common.UserIdentity;
import com.myschool.project.dto.school.School;
import com.myschool.project.dto.school.SchoolBranch;
import com.myschool.project.dto.school.SchoolBranchClass;
import com.myschool.project.dto.school.SchoolBranchClassSections;
import com.myschool.project.dto.teacher.Teacher;

@Entity
@Table(name="ps_student_tbl")
public class Student implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne
	@JoinColumn(name="schoolId")
	private School school;

	@Id
	@OneToOne
	@JoinColumn(name="branchId")
	private SchoolBranch schoolBranch;

	@Id
	private String studentId;

	@Column(name="student_rollno")
	private String rollNo;

	@Column(name="student_id_issuedby")
	private String issuingAuthority;

	@Column(name="eff_status")
	private boolean studentAvailable;

	@Column(name="eff_date")
	private long effectiveDateTime;

	@Column(name="eff_seq")
	private int effectiveSequence;

	@Id
	@OneToOne
	@JoinColumn(name="classId")
	private SchoolBranchClass studentClass;

	@Id
	@OneToOne
	@JoinColumn(name="sectionId")
	private SchoolBranchClassSections section;

	@Column(name="class_entry_dt")
	private Date entryDate;

	@Id
	@OneToOne
	@JoinColumn(name="teacherId")
	private Teacher teacher;

	@Column(name="date_of_birth")
	private Date dateOfBirth;

	//Parent table

	@Column(name="sch_joining_dt")
	private Date joiningDate;

	//action -- promoted etc..,
	// reason
	// device table

	@OneToOne
	private UserIdentity userIdentity;

	@Column(name="created_by")
	private String createdBy;

	@Column(name="created_dttm")
	private long createdDateTime;

	@Column(name="lastupdated_by")
	private String lastUpdatedBy;

	@Column(name="lastupdated_dttm")
	private long lastUpdatedDateTime;

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public SchoolBranch getSchoolBranch() {
		return schoolBranch;
	}

	public void setSchoolBranch(SchoolBranch schoolBranch) {
		this.schoolBranch = schoolBranch;
	}

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	public String getRollNo() {
		return rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public String getIssuingAuthority() {
		return issuingAuthority;
	}

	public void setIssuingAuthority(String issuingAuthority) {
		this.issuingAuthority = issuingAuthority;
	}

	public boolean isStudentAvailable() {
		return studentAvailable;
	}

	public void setStudentAvailable(boolean studentAvailable) {
		this.studentAvailable = studentAvailable;
	}

	public long getEffectiveDateTime() {
		return effectiveDateTime;
	}

	public void setEffectiveDateTime(long effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}

	public int getEffectiveSequence() {
		return effectiveSequence;
	}

	public void setEffectiveSequence(int effectiveSequence) {
		this.effectiveSequence = effectiveSequence;
	}

	public SchoolBranchClass getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(SchoolBranchClass studentClass) {
		this.studentClass = studentClass;
	}

	public SchoolBranchClassSections getSection() {
		return section;
	}

	public void setSection(SchoolBranchClassSections section) {
		this.section = section;
	}

	public Date getEntryDate() {
		return entryDate;
	}

	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}

	public UserIdentity getUserIdentity() {
		return userIdentity;
	}

	public void setUserIdentity(UserIdentity userIdentity) {
		this.userIdentity = userIdentity;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public long getCreatedDateTime() {
		return createdDateTime;
	}

	public void setCreatedDateTime(long createdDateTime) {
		this.createdDateTime = createdDateTime;
	}

	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	public long getLastUpdatedDateTime() {
		return lastUpdatedDateTime;
	}

	public void setLastUpdatedDateTime(long lastUpdatedDateTime) {
		this.lastUpdatedDateTime = lastUpdatedDateTime;
	}

}
