package com.myschool.project.dto.common;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ps_socialnet_tbl")
public class SocialNetwork implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	String socialNetworkId;
	@Column(name="description")
	String socialNetworkName;
	@Column(name="eff_date")
	long effectiveDateTime;
	@Column(name="eff_status")
	boolean socialNetworkEnabled;
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
