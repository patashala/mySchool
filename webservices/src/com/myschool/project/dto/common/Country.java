package com.myschool.project.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ps_country_tbl")
public class Country implements Serializable{

	/*why implement serializable
	http://stackoverflow.com/a/4548861
	 */
	
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="countryCode",unique=true,nullable=false)
	private String countryCode;
	@Column(name="description")
	private String countryName;
	@Column(name="addr1_avail")
	private boolean address1Enabled;
	@Column(name="addr2_avail")
	private boolean address2Enabled;
	@Column(name="addr3_avail")
	private boolean address3Enabled;
	@Column(name="addr4_avail")
	private boolean address4Enabled;
	@Column(name="city_avail")
	private boolean cityEnabled;
	@Column(name="state_avail")
	private boolean stateEnabled;
	@Column(name="postal_code")
	private boolean postalCodeEnabled;
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="country", cascade=CascadeType.ALL)
	private Set<StatesOfCountries> states = new HashSet<StatesOfCountries>();
	
	@OneToMany(fetch=FetchType.LAZY,mappedBy="country",cascade=CascadeType.ALL)
	private List<DistrictsOfState> districts = new ArrayList<DistrictsOfState>();
	
	public boolean isAddress1Enabled() {
		return address1Enabled;
	}
	public void setAddress1Enabled(boolean address1Enabled) {
		this.address1Enabled = address1Enabled;
	}
	public boolean isAddress2Enabled() {
		return address2Enabled;
	}
	public void setAddress2Enabled(boolean address2Enabled) {
		this.address2Enabled = address2Enabled;
	}
	public boolean isAddress3Enabled() {
		return address3Enabled;
	}
	public void setAddress3Enabled(boolean address3Enabled) {
		this.address3Enabled = address3Enabled;
	}
	public boolean isAddress4Enabled() {
		return address4Enabled;
	}
	public void setAddress4Enabled(boolean address4Enabled) {
		this.address4Enabled = address4Enabled;
	}
	public boolean isCityEnabled() {
		return cityEnabled;
	}
	public void setCityEnabled(boolean cityEnabled) {
		this.cityEnabled = cityEnabled;
	}
	public boolean isStateEnabled() {
		return stateEnabled;
	}
	public void setStateEnabled(boolean stateEnabled) {
		this.stateEnabled = stateEnabled;
	}
	public boolean isPostalCodeEnabled() {
		return postalCodeEnabled;
	}
	public void setPostalCodeEnabled(boolean postalCodeEnabled) {
		this.postalCodeEnabled = postalCodeEnabled;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Set<StatesOfCountries> getStates() {
		return states;
	}
	public void setStates(Set<StatesOfCountries> states) {
		this.states = states;
	}
	public List<DistrictsOfState> getDistricts() {
		return districts;
	}
	public void setDistricts(List<DistrictsOfState> districts) {
		this.districts = districts;
	}


}
