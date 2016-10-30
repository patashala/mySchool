package com.myschool.project.dto.school;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ps_branch_tbl")
public class SchoolBranch implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@Id
	String branchId;

	@Column(name="description")
	String branchName;
	
	@Column(name="eff_date")
	long effectiveTimeSequence;
	
	@Column(name="eff_status")
	boolean branchEnabled;
	
	// address related columns
	
	@Column(name="latitude_pos")
	String branchLatitude;
	@Column(name="longitude_pos")
	String branchLongitude;
	
	
	//school Map school -> Branch --> one to many
	
	//country
	
		@Column(name="address1")
		String addressLine1;
		@Column(name="address2")
		String addressLine2;
		@Column(name="address3")
		String addressLine3;
		@Column(name="address4")
		String addressLine4;
		
		String city;
		
		//state
		
		@Column(name="postal")
		int postalCode;

		public String getBranchId() {
			return branchId;
		}

		public void setBranchId(String branchId) {
			this.branchId = branchId;
		}

		public String getBranchName() {
			return branchName;
		}

		public void setBranchName(String branchName) {
			this.branchName = branchName;
		}

		public long getEffectiveTimeSequence() {
			return effectiveTimeSequence;
		}

		public void setEffectiveTimeSequence(long effectiveTimeSequence) {
			this.effectiveTimeSequence = effectiveTimeSequence;
		}

		public boolean isBranchEnabled() {
			return branchEnabled;
		}

		public void setBranchEnabled(boolean branchEnabled) {
			this.branchEnabled = branchEnabled;
		}

		public String getBranchLatitude() {
			return branchLatitude;
		}

		public void setBranchLatitude(String branchLatitude) {
			this.branchLatitude = branchLatitude;
		}

		public String getBranchLongitude() {
			return branchLongitude;
		}

		public void setBranchLongitude(String branchLongitude) {
			this.branchLongitude = branchLongitude;
		}

		public String getAddressLine1() {
			return addressLine1;
		}

		public void setAddressLine1(String addressLine1) {
			this.addressLine1 = addressLine1;
		}

		public String getAddressLine2() {
			return addressLine2;
		}

		public void setAddressLine2(String addressLine2) {
			this.addressLine2 = addressLine2;
		}

		public String getAddressLine3() {
			return addressLine3;
		}

		public void setAddressLine3(String addressLine3) {
			this.addressLine3 = addressLine3;
		}

		public String getAddressLine4() {
			return addressLine4;
		}

		public void setAddressLine4(String addressLine4) {
			this.addressLine4 = addressLine4;
		}

		public String getCity() {
			return city;
		}

		public void setCity(String city) {
			this.city = city;
		}

		public int getPostalCode() {
			return postalCode;
		}

		public void setPostalCode(int postalCode) {
			this.postalCode = postalCode;
		}
		
		
	
}
