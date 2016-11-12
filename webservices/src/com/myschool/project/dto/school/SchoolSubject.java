package com.myschool.project.dto.school;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ps_subjects_tbl")
public class SchoolSubject implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	private String subjectId;
	
	@Column(name="description")
	private String description;
	
	@Column(name="eff_date")
	private long effectiveDateTime;
	
	@Column(name="eff_status")
	private boolean subjectEnabled;

	public String getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(String subjectId) {
		this.subjectId = subjectId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public long getEffectiveDateTime() {
		return effectiveDateTime;
	}

	public void setEffectiveDateTime(long effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}

	public boolean isSubjectEnabled() {
		return subjectEnabled;
	}

	public void setSubjectEnabled(boolean subjectEnabled) {
		this.subjectEnabled = subjectEnabled;
	}
	
	
}
