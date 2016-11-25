package com.myschool.project.dto.student;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.myschool.project.dto.school.School;

@Entity
@Table(name="ps_student_addinfo")
public class StudentAdditionalInformation {
	
	@OneToOne
	private School school;
	
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
