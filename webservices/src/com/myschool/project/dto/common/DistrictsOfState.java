package com.myschool.project.dto.common;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ps_district_tbl")
public class DistrictsOfState implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	String districtCode; //should be a combination of (COUNTRYCODE+STATECODE+DISTRICTCODE) eg: INDAPHYD
	// state to district mapping each state will have many districts 
	
	@Column(name="description")
	String districtName;
	@Column(name="eff_date")
	long effectiveDateTime;
	@Column(name="eff_status")
	boolean districtEnabled;
	
	@ManyToOne
	@JoinColumn(name="countryCode",nullable=false)
	private Country country;
	
	@ManyToOne
	@JoinColumn(name="stateCode",nullable=false)
	private StatesOfCountries state;
	
	public StatesOfCountries getState() {
		return state;
	}
	public void setState(StatesOfCountries state) {
		this.state = state;
	}
	public String getDistrictCode() {
		return districtCode;
	}
	public void setDistrictCode(String districtCode) {
		this.districtCode = districtCode;
	}
	public String getDistrictName() {
		return districtName;
	}
	public void setDistrictName(String districtName) {
		this.districtName = districtName;
	}
	public long getDateTime() {
		return effectiveDateTime;
	}
	public void setDateTime(long effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}
	public boolean isDistrictEnabled() {
		return districtEnabled;
	}
	public void setDistrictEnabled(boolean districtEnabled) {
		this.districtEnabled = districtEnabled;
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
	
}
