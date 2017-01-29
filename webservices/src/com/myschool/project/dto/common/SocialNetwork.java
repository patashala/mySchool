package com.myschool.project.dto.common;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.myschool.project.dto.teacher.TeacherSocialNetwork;

@Entity
@Table(name="ps_socialnet_tbl")
public class SocialNetwork implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private String socialNetworkId;
	
	@Column(name="description")
	private String socialNetworkName;
	
	@Column(name="eff_date")
	private long effectiveDateTime;
	
	@Column(name="eff_status")
	private boolean socialNetworkEnabled;
	
//	@ManyToOne
//	private TeacherSocialNetwork teachersSocialNet;
//	
//	public TeacherSocialNetwork getTeachersSocialNet() {
//		return teachersSocialNet;
//	}
//	public void setTeachersSocialNet(TeacherSocialNetwork teachersSocialNet) {
//		this.teachersSocialNet = teachersSocialNet;
//	}
	public String getSocialNetworkId() {
		return socialNetworkId;
	}
	public void setSocialNetworkId(String socialNetworkId) {
		this.socialNetworkId = socialNetworkId;
	}
	public String getSocialNetworkName() {
		return socialNetworkName;
	}
	public void setSocialNetworkName(String socialNetworkName) {
		this.socialNetworkName = socialNetworkName;
	}
	public long getEffectiveDateTime() {
		return effectiveDateTime;
	}
	public void setEffectiveDateTime(long effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}
	public boolean isSocialNetworkEnabled() {
		return socialNetworkEnabled;
	}
	public void setSocialNetworkEnabled(boolean socialNetworkEnabled) {
		this.socialNetworkEnabled = socialNetworkEnabled;
	}
	
}
