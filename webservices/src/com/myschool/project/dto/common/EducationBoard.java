package com.myschool.project.dto.common;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.myschool.project.dto.school.School;

@Entity
@Table(name="ps_board_tbl")
public class EducationBoard implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private String boardId;
	@Column(name="description")
	private String boardName;
	@Column(name="desc_short")
	private String boardSName;
	@Column(name="eff_date")
	private long effectiveDateTime;
	@Column(name="eff_status")
	private boolean districtEnabled;
	
	// Defines Boards in Countries
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="ps_board_country",joinColumns={@JoinColumn(name="boardId")},
				inverseJoinColumns={@JoinColumn(name="countryCode")})
	private List<Country> countries = new ArrayList<Country>();
	
	@ManyToOne
	private School school = new School();

	public String getBoardId() {
		return boardId;
	}

	public void setBoardId(String boardId) {
		this.boardId = boardId;
	}

	public String getBoardName() {
		return boardName;
	}

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public String getBoardSName() {
		return boardSName;
	}

	public void setBoardSName(String boardSName) {
		this.boardSName = boardSName;
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

	public List<Country> getCountries() {
		return countries;
	}

	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}

	public School getSchool() {
		return school;
	}

	public void setSchool(School school) {
		this.school = school;
	}
	
	
}
