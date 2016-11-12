package com.myschool.project.dto.teacher;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.myschool.project.dto.common.UserIdentity;
import com.myschool.project.dto.school.School;
import com.myschool.project.dto.school.SchoolBranch;

@Entity
@Table(name="ps_teacher_tbl")
public class Teacher implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private String teacherId;

	@Column(name="eff_status")
	private boolean teacherAvailable;

	@Column(name="eff_date")
	private long effectiveDate;

	@Column(name="eff_dttm")
	private long effectiveDateTime;

	@Column(name="first_name")
	private String firstName;

	@Column(name="last_name")
	private String lastName;

	@Column(name="middle_name")
	private String middleName;

	@Column(name="device_id")
	private String deviceId;

	@Column(name="imei")
	private String imeiNumber;

	@Column(name="msisdn")
	private String msisdnNumber;

	@Column(name="device_status")
	private boolean deviceStatus;

	String createdBy;
	Date created_dttm;
	String lastUpdatedBy;
	Date lastUpdated_dttm;

	//mappings
	/* School TABLE
	 * SSN TABLE
	 * BRANCH TABLE*/
	
	@ManyToOne
	private School schoolTeachers;
	
	@ManyToOne
	private SchoolBranch branchTeachers;
	
	@OneToOne
	private UserIdentity userIdentity;
	
	@OneToMany(mappedBy="teacher")
	private List<TeacherAddress> addresses;
	
	public List<TeacherAddress> getAddresses() {
		return addresses;
	}
	public void setAddresses(List<TeacherAddress> addresses) {
		this.addresses = addresses;
	}
	public String getTeacherId() {
		return teacherId;
	}
	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}
	public boolean isTeacherAvailable() {
		return teacherAvailable;
	}
	public void setTeacherAvailable(boolean teacherAvailable) {
		this.teacherAvailable = teacherAvailable;
	}
	public long getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(long effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public long getEffectiveDateTime() {
		return effectiveDateTime;
	}
	public void setEffectiveDateTime(long effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getDeviceId() {
		return deviceId;
	}
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}
	public String getImeiNumber() {
		return imeiNumber;
	}
	public void setImeiNumber(String imeiNumber) {
		this.imeiNumber = imeiNumber;
	}
	public String getMsisdnNumber() {
		return msisdnNumber;
	}
	public void setMsisdnNumber(String msisdnNumber) {
		this.msisdnNumber = msisdnNumber;
	}
	public boolean isDeviceStatus() {
		return deviceStatus;
	}
	public void setDeviceStatus(boolean deviceStatus) {
		this.deviceStatus = deviceStatus;
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
	public School getSchoolTeachers() {
		return schoolTeachers;
	}
	public void setSchoolTeachers(School schoolTeachers) {
		this.schoolTeachers = schoolTeachers;
	}
	public SchoolBranch getBranchTeachers() {
		return branchTeachers;
	}
	public void setBranchTeachers(SchoolBranch branchTeachers) {
		this.branchTeachers = branchTeachers;
	}
	public UserIdentity getUserIdentity() {
		return userIdentity;
	}
	public void setUserIdentity(UserIdentity userIdentity) {
		this.userIdentity = userIdentity;
	}
	
}
