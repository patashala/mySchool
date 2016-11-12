package com.myschool.project.dto.teacher;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.myschool.project.dto.common.Country;
import com.myschool.project.dto.common.DistrictsOfState;
import com.myschool.project.dto.common.StatesOfCountries;

@Entity
@Table(name="ps_teacher_addr")
public class TeacherAddress implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String addressId;
	
	@ManyToOne
	private Teacher teacher;
	
	@Column(name="eff_status")
	private boolean teacherAddressAvailable;

	@Column(name="eff_date")
	private long effectiveDate;
	
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
	
	@Column(name="latitude_pos")
	private String branchLatitude;
	@Column(name="longitude_pos")
	private String branchLongitude;
	
	public String getAddressId() {
		return addressId;
	}
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	public boolean isTeacherAddressAvailable() {
		return teacherAddressAvailable;
	}
	public void setTeacherAddressAvailable(boolean teacherAddressAvailable) {
		this.teacherAddressAvailable = teacherAddressAvailable;
	}
	public long getEffectiveDate() {
		return effectiveDate;
	}
	public void setEffectiveDate(long effectiveDate) {
		this.effectiveDate = effectiveDate;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
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
	public int getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
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
	
}
