package com.myschool.project.dto.school;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="ps_sections_tbl")
public class SchoolBranchClassSections implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	@Id
	private String sectionId;
	
	@Column(name="descr")
	private String description;
	
	@Column(name="effdt")
	private long effectiveDate;
	
	@Column(name="eff_status")
	private boolean effectiveStatus;
	
	@ManyToOne
	private SchoolBranchClass schoolbranchclass;
	
	
	@ManyToOne
	private SchoolBranch branchSections;
	
	@ManyToOne
	private School schoolSections;

	public String getSectionId() {
		return sectionId;
	}

	public void setSectionId(String sectionId) {
		this.sectionId = sectionId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(long effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public boolean isEffectiveStatus() {
		return effectiveStatus;
	}

	public void setEffectiveStatus(boolean effectiveStatus) {
		this.effectiveStatus = effectiveStatus;
	}

	public SchoolBranchClass getSchoolbranchclass() {
		return schoolbranchclass;
	}

	public void setSchoolbranchclass(SchoolBranchClass schoolbranchclass) {
		this.schoolbranchclass = schoolbranchclass;
	}

	public SchoolBranch getBranchSections() {
		return branchSections;
	}

	public void setBranchSections(SchoolBranch branchSections) {
		this.branchSections = branchSections;
	}

	public School getSchoolBranches() {
		return schoolSections;
	}

	public void setSchoolBranches(School schoolSections) {
		this.schoolSections = schoolSections;
	}
	
}
