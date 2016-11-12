package com.myschool.project.dto.common;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ps_state_tbl")
public class StatesOfCountries implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String stateCode; // prefix with country code
	
	@Column(name="description")
	private String stateName;
	
	@Column(name="eff_date")
	private long effectiveDateTime;
	@Column(name="eff_status")
	private boolean stateEnabled;
	
	@ManyToOne
	@JoinColumn(name="countryCode",nullable=false)
	private Country country;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="state",cascade=CascadeType.ALL)
	private Set<DistrictsOfState> districts = new HashSet<DistrictsOfState>();
	
	public String getStateCode() {
		return stateCode;
	}
	public void setStateCode(String stateCode) {
		this.stateCode = stateCode;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public long getDateTime() {
		return effectiveDateTime;
	}
	public void setDateTime(long effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}
	public boolean isStateEnabled() {
		return stateEnabled;
	}
	public void setStateEnabled(boolean stateEnabled) {
		this.stateEnabled = stateEnabled;
	}
	public Country getCountry() {
		return country;
	}
	public void setCountry(Country country) {
		this.country = country;
	}
	public long getEffectiveDateTime() {
		return effectiveDateTime;
	}
	public void setEffectiveDateTime(long effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}
	
	public Set<DistrictsOfState> getDistricts() {
		return districts;
	}
	public void setDistricts(Set<DistrictsOfState> districts) {
		this.districts = districts;
	}
	
	
}
