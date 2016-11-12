package com.myschool.project.dto.teacher;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="ps_teacher_phone")
public class TeacherPhone implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(generator="generator")
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "teacher"))
	private String teacherId;
	
	@OneToOne
	@PrimaryKeyJoinColumn
	private Teacher teacher;
	
	@Column(name="eff_status")
	private boolean phoneAvailable;

	@Column(name="eff_date")
	private long effectiveDate;
	
	// we can use enums here
	@Column(name="phone_type")
	private String phoneType;
	
	@Column(name="phone_no")
	private String phoneNo;

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public boolean isPhoneAvailable() {
		return phoneAvailable;
	}

	public void setPhoneAvailable(boolean phoneAvailable) {
		this.phoneAvailable = phoneAvailable;
	}

	public long getEffectiveDate() {
		return effectiveDate;
	}

	public void setEffectiveDate(long effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	
	
}
