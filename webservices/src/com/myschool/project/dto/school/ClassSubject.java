package com.myschool.project.dto.school;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="ps_classsub_tbl")
public class ClassSubject implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@ManyToMany(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinTable(name="ps_school_subjects", joinColumns={@JoinColumn(name="schoolId")})
	private List<School> schools;
}
