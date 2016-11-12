package com.myschool.project.dto.school;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ps_class_tbl")
public class SchoolBranchClass implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String classId;
	
	@Column(name="class_desc")
	private String description;
	
	@Column(name="sections_sw")
	private boolean sectionAvailable;
	
	@OneToOne
	private SchoolBranch schoolBranch;
	
	@ManyToOne
	private SchoolBranch schoolbranch;
	
	@OneToMany(mappedBy="schoolbranchclass")
	private List<SchoolBranchClassSections> schoolSections;

	public String getClassId() {
		return classId;
	}

	public void setClassId(String classId) {
		this.classId = classId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isSectionAvailable() {
		return sectionAvailable;
	}

	public void setSectionAvailable(boolean sectionAvailable) {
		this.sectionAvailable = sectionAvailable;
	}

	public SchoolBranch getSchoolBranch() {
		return schoolBranch;
	}

	public void setSchoolBranch(SchoolBranch schoolBranch) {
		this.schoolBranch = schoolBranch;
	}

	public SchoolBranch getSchoolbranch() {
		return schoolbranch;
	}

	public void setSchoolbranch(SchoolBranch schoolbranch) {
		this.schoolbranch = schoolbranch;
	} 
	
	
}
