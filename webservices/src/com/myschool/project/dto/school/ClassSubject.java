package com.myschool.project.dto.school;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="ps_classsub_tbl")
public class ClassSubject implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@OneToOne
	private School school;
	
	

}
