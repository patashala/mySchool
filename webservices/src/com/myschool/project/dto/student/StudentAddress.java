package com.myschool.project.dto.student;

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
import com.myschool.project.dto.common.UserIdentity;

@Entity
@Table(name="ps_student_addr")
public class StudentAddress implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@ManyToOne
	private Student student;
	
	@OneToOne
	private UserIdentity userIdentity;
	
	@Column(name="eff_status")
	private boolean studentAddressAvailable;

	@Column(name="eff_date")
	private long effectiveDateTime;
	
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
	private String addressLatitude;
	@Column(name="longitude_pos")
	private String addressLongitude;
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
	public UserIdentity getUserIdentity() {
		return userIdentity;
	}
	public void setUserIdentity(UserIdentity userIdentity) {
		this.userIdentity = userIdentity;
	}
	public boolean isStudentAddressAvailable() {
		return studentAddressAvailable;
	}
	public void setStudentAddressAvailable(boolean studentAddressAvailable) {
		this.studentAddressAvailable = studentAddressAvailable;
	}
	public long getEffectiveDateTime() {
		return effectiveDateTime;
	}
	public void setEffectiveDateTime(long effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
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
	public String getAddressLatitude() {
		return addressLatitude;
	}
	public void setAddressLatitude(String addressLatitude) {
		this.addressLatitude = addressLatitude;
	}
	public String getAddressLongitude() {
		return addressLongitude;
	}
	public void setAddressLongitude(String addressLongitude) {
		this.addressLongitude = addressLongitude;
	}
	
	
}
