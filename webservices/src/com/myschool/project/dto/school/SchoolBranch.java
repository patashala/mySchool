package com.myschool.project.dto.school;

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

import com.myschool.project.dto.common.Country;
import com.myschool.project.dto.common.DistrictsOfState;
import com.myschool.project.dto.common.StatesOfCountries;
import com.myschool.project.dto.teacher.Teacher;

@Entity
@Table(name="ps_branch_tbl")
public class SchoolBranch implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	private String branchId;

	@ManyToOne
	private School school;

	@Column(name="description")
	private String branchName;

	@Column(name="eff_date")
	private long effectiveTimeSequence;

	@Column(name="eff_status")
	private boolean branchEnabled;

	// address related columns

	@OneToOne
	private Country country;

	@Column(name="address1")
	private String addressLine1;
	@Column(name="address2")
	private String addressLine2;
	@Column(name="address3")
	private String addressLine3;
	@Column(name="address4")
	private String addressLine4;
	@Column(name="city")
	private String city;

	@OneToOne
	private DistrictsOfState district;
	@OneToOne
	private StatesOfCountries state;

	@Column(name="postal")
	private int postalCode;

	String createdBy;
	Date created_dttm;
	String lastUpdatedBy;
	Date lastUpdated_dttm;

	@Column(name="latitude_pos")
	private String branchLatitude;
	@Column(name="longitude_pos")
	private String branchLongitude;

	//Each branch will have its own calendar
	@OneToOne
	private SchoolCalendar schoolCalendar;

	// A Branch will have many classes
	@OneToMany(mappedBy="schoolbranch")
	private List<SchoolBranchClass> classes;

	//A Branch will have many sections for a class
	@OneToMany(mappedBy="branchSections")
	private List<SchoolBranchClassSections> sections;

	//A Branch will have many teachers
	@OneToMany(mappedBy="branchTeachers")
	private List<Teacher> teachers;

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public String getBranchId() {
		return branchId;
	}

	public void setBranchId(String branchId) {
		this.branchId = branchId;
	}

	public String getBranchName() {
		return branchName;
	}

	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	public long getEffectiveTimeSequence() {
		return effectiveTimeSequence;
	}

	public void setEffectiveTimeSequence(long effectiveTimeSequence) {
		this.effectiveTimeSequence = effectiveTimeSequence;
	}

	public boolean isBranchEnabled() {
		return branchEnabled;
	}

	public void setBranchEnabled(boolean branchEnabled) {
		this.branchEnabled = branchEnabled;
	}

	public String getBranchLatitude() {
		return branchLatitude;
	}

	public void setBranchLatitude(String branchLatitude) {
		this.branchLatitude = branchLatitude;
	}

	public String getBranchLongitude() {
		return branchLongitude;
	}

	public void setBranchLongitude(String branchLongitude) {
		this.branchLongitude = branchLongitude;
	}

	public String getAddressLine1() {
		return addressLine1;
	}

	public void setAddressLine1(String addressLine1) {
		this.addressLine1 = addressLine1;
	}

	public String getAddressLine2() {
		return addressLine2;
	}

	public void setAddressLine2(String addressLine2) {
		this.addressLine2 = addressLine2;
	}

	public String getAddressLine3() {
		return addressLine3;
	}

	public void setAddressLine3(String addressLine3) {
		this.addressLine3 = addressLine3;
	}

	public String getAddressLine4() {
		return addressLine4;
	}

	public void setAddressLine4(String addressLine4) {
		this.addressLine4 = addressLine4;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public DistrictsOfState getDistrict() {
		return district;
	}

	public void setDistrict(DistrictsOfState district) {
		this.district = district;
	}

	public StatesOfCountries getState() {
		return state;
	}

	public void setState(StatesOfCountries state) {
		this.state = state;
	}

	public SchoolCalendar getSchoolCalendar() {
		return schoolCalendar;
	}

	public void setSchoolCalendar(SchoolCalendar schoolCalendar) {
		this.schoolCalendar = schoolCalendar;
	}

	public List<SchoolBranchClass> getClasses() {
		return classes;
	}

	public void setClasses(List<SchoolBranchClass> classes) {
		this.classes = classes;
	}

	public List<SchoolBranchClassSections> getSections() {
		return sections;
	}

	public void setSections(List<SchoolBranchClassSections> sections) {
		this.sections = sections;
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

	public List<Teacher> getTeachers() {
		return teachers;
	}

	public void setTeachers(List<Teacher> teachers) {
		this.teachers = teachers;
	}

}
