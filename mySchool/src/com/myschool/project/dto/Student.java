package com.myschool.project.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ps_student_tbl")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	String studentId;
	
	
	
}
