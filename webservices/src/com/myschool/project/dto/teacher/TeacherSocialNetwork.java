package com.myschool.project.dto.teacher;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import com.myschool.project.dto.common.SocialNetwork;

public class TeacherSocialNetwork {

	@Id
	@GeneratedValue(generator="generator")
	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "teacher"))
	private String teacherId;
	
	@OneToOne
	private Teacher teacher;
	
	@Column(name="eff_status")
	private boolean availableOnSocialNetwork;
	
//	@OneToMany(mappedBy="teachersSocialNet")
//	private List<SocialNetwork> socialNetworks;

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public Teacher getTeacher() {
		return teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

//	public List<SocialNetwork> getSocialNetworks() {
//		return socialNetworks;
//	}
//
//	public void setSocialNetworks(List<SocialNetwork> socialNetworks) {
//		this.socialNetworks = socialNetworks;
//	}
	
}
