package com.myschool.project.dto.school;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ps_class_tbl")
public class SchoolBranchClass implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String classId;
	
	@ManyToOne
	private School schoolclass;
	
	@ManyToOne
	private SchoolBranch schoolbranch;
	
	@Column(name="class_desc")
	private String description;
	
	@Column(name="sections_sw")
	private boolean sectionAvailable;
	
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

	public SchoolBranch getSchoolbranch() {
		return schoolbranch;
	}

	public void setSchoolbranch(SchoolBranch schoolbranch) {
		this.schoolbranch = schoolbranch;
	}

	public School getSchool() {
		return schoolclass;
	}

	public void setSchool(School schoolclass) {
		this.schoolclass = schoolclass;
	}

	public List<SchoolBranchClassSections> getSchoolSections() {
		return schoolSections;
	}

	public void setSchoolSections(List<SchoolBranchClassSections> schoolSections) {
		this.schoolSections = schoolSections;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public int hashCode() {
		return super.hashCode();
	}
	
}
