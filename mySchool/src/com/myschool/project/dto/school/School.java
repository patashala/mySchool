package com.myschool.project.dto.school;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.myschool.project.dto.common.EducationBoard;

@Entity
@Table(name="ps_school_tbl")
public class School implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	String schoolId;

	@Column(name="eff_status")
	boolean schoolEnabled;
	
	@Column(name="eff_date")
	long effectiveDateTime;
	
	@Column(name="desc_short")
	String schoolNameShort;
	
	@Column(name="desc_long")
	String schoolFullName;
	
	//country
	
	@Column(name="address1")
	String addressLine1;
	@Column(name="address2")
	String addressLine2;
	@Column(name="address3")
	String addressLine3;
	@Column(name="address4")
	String addressLine4;
	
	String city;
	
	//state
	
	@Column(name="postal")
	int postalCode;
	
	String category;
	
	//District
	String district;
	
	@Column(name="establish_date")
	Date schoolEstablishedDate;
	
	//notes
	//currency from Currency table
	//Board Id from board table
	
	String createdBy;
	Date created_dttm;
	String lastUpdatedBy;
	Date lastUpdated_dttm;
	
	String sc_latitude;
	String sc_longitude;
	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="ps_tbl_school_board")
	Set<EducationBoard> schoolEducationBoard;
	
	
	public String getSchoolId() {
		return schoolId;
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
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
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
	public String getSc_latitude() {
		return sc_latitude;
	}
	public void setSc_latitude(String sc_latitude) {
		this.sc_latitude = sc_latitude;
	}
	public String getSc_longitude() {
		return sc_longitude;
	}
	public void setSc_longitude(String sc_longitude) {
		this.sc_longitude = sc_longitude;
	}
	
}
