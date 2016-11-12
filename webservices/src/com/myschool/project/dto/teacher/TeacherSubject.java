package com.myschool.project.dto.teacher;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="ps_teacher_subj")
public class TeacherSubject implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(generator="generator")
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "teacher"))
	private String teacherId;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Teacher teacher;
	

}
