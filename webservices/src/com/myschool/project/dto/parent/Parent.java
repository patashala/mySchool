package com.myschool.project.dto.parent;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.myschool.project.dto.common.UserIdentity;
import com.myschool.project.dto.school.School;
import com.myschool.project.dto.student.Student;

@Entity
@Table(name="ps_parent_tbl")
public class Parent implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	@Id
	private String parentId;
	
	/*@OneToMany
	@JoinColumn(name="schoolId") 
	private List<School> schools;*/
	
	@OneToMany
	@JoinColumn(name="studentId")
	private List<Student> students;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="email_id")
	private String emailId;
	
	// check this
	@OneToOne
	private UserIdentity userIdentity;
	
	@Column(name="phone_1")
	private String phone1;
	
	@Column(name="phone_2")
	private String phone2;

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public UserIdentity getUserIdentity() {
		return userIdentity;
	}

	public void setUserIdentity(UserIdentity userIdentity) {
		this.userIdentity = userIdentity;
	}

	public String getPhone1() {
		return phone1;
	}

	public void setPhone1(String phone1) {
		this.phone1 = phone1;
	}

	public String getPhone2() {
		return phone2;
	}

	public void setPhone2(String phone2) {
		this.phone2 = phone2;
	}

	/*public List<School> getSchools() {
		return schools;
	}

	public void setSchools(List<School> schools) {
		this.schools = schools;
	}*/

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}
	
	
}
