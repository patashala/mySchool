package com.myschool.project.dto.school;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.myschool.project.dto.common.EducationBoard;

@Entity
@Table(name="ps_classsub_tbl")
public class ClassSubject implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String id;
	
	/*@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="ps_school_subjects", joinColumns={@JoinColumn(name="schoolId")},inverseJoinColumns={@JoinColumn(name="subjectId")})
	private List<School> schools;*/

//	@ManyToOne
//	private EducationBoard boardId;
//
//	private SchoolBranch branch;
//
//	private SchoolBranchClass branchClass;
//
//	private SchoolSubject subjectId;
//
//	@Column(name="desc")
//	private String description;
//
//	private SchoolBranchClassSections sectionId;
//
//	public EducationBoard getBoardId() {
//		return boardId;
//	}
//
//	public void setBoardId(EducationBoard boardId) {
//		this.boardId = boardId;
//	}
//
//	public SchoolBranch getBranch() {
//		return branch;
//	}
//
//	public void setBranch(SchoolBranch branch) {
//		this.branch = branch;
//	}
//
//	public SchoolBranchClass getBranchClass() {
//		return branchClass;
//	}
//
//	public void setBranchClass(SchoolBranchClass branchClass) {
//		this.branchClass = branchClass;
//	}
//
//	public SchoolSubject getSubjectId() {
//		return subjectId;
//	}
//
//	public void setSubjectId(SchoolSubject subjectId) {
//		this.subjectId = subjectId;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public SchoolBranchClassSections getSectionId() {
//		return sectionId;
//	}
//
//	public void setSectionId(SchoolBranchClassSections sectionId) {
//		this.sectionId = sectionId;
//	}
	
}
