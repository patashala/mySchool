package com.myschool.project.dto.common;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ps_ssn_tbl")
public class UserIdentity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String identityId;
	@Column(name="description")
	private String idenityIdName;
	@Column(name="ssn_type")
	private String identityType;
	
	public String getIdentityId() {
		return identityId;
	}
	public void setIdentityId(String identityId) {
		this.identityId = identityId;
	}
	public String getIdenityIdName() {
		return idenityIdName;
	}
	public void setIdenityIdName(String idenityIdName) {
		this.idenityIdName = idenityIdName;
	}
	public String getIdentityType() {
		return identityType;
	}
	public void setIdentityType(String identityType) {
		this.identityType = identityType;
	}
	
	
	
}
