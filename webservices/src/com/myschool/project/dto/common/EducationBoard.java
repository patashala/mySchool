package com.myschool.project.dto.common;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.myschool.project.dto.school.School;

@Entity
@Table(name="ps_board_table")
public class EducationBoard implements Serializable{

	private static final long serialVersionUID = 1L;
	
	@Id
	String boardId;
	@Column(name="description")
	String boardName;
	@Column(name="eff_date")
	long effectiveDateTime;
	@Column(name="eff_status")
	boolean districtEnabled;
	
	@ManyToMany(mappedBy="schoolboards")
	private Set<Country> countries;
	
	@ManyToMany(mappedBy="schoolboards")
	private Set<School> schools;
	
	
	public String getBoardName() {
		return boardName;
	}
	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}
	public long getEffectiveDateTime() {
		return effectiveDateTime;
	}
	public void setEffectiveDateTime(long effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}
	public boolean isDistrictEnabled() {
		return districtEnabled;
	}
	public void setDistrictEnabled(boolean districtEnabled) {
		this.districtEnabled = districtEnabled;
	}
	public String getBoardId() {
		return boardId;
	}
	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}
	

}
