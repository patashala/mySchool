package com.myschool.project.dto.student;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.myschool.project.dto.school.School;

@Entity
@Table(name="ps_student_addinfo")
public class StudentAdditionalInformation implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@OneToOne
	private School school;
	
	@Id
	@ManyToOne
	private Student student;

	@Column(name="stud_ssn")
	private String SSNiD;
	
	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	public String getSSNiD() {
		return SSNiD;
	}

	public void setSSNiD(String sSNiD) {
		SSNiD = sSNiD;
	}
}
