package com.springboot.wecare.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity  //annotation for table class this class is a table
@Table(name = "caregiver")
public class Caregiver {	

	@Id
	@Column(name = "caregiver_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long caregiverid;

	@Column(name = "caregiver_name")
	private String caregiverName;

	@Column(name = "caregiver_experience")
	private String caregiverExperience;

	@Column(name = "caregiver_specialization")
	private String caregiverSpecialization;
	
	@Column(name = "caregiver_about")
	private String caregiverAbout;
	
	@Column(name = "caregiver_email")
	private String caregiverEmail;
	
	@Column(name = "caregiver_review")
	private String caregiverReview;
	
	@Column(name = "caregiver_dob")
	private String caregiverDob;
	
	@Column(name = "caregiver_contact_no")
	private String caregiverContactNo;
	
	@Column(name = "address_id")
	private int addressId;
	
	@Column(name = "login_id")
	private int loginId;
	
	public Caregiver() {
		super();
	}

	public Caregiver(int caregiverid, String caregiverName, String caregiverExperience, String caregiverSpecialization,
			String caregiverAbout, String caregiverEmail, String caregiverReview, String caregiverDob,
			String caregiverContactNo, int addressId, int loginId) {
		super();
		this.caregiverid = caregiverid;
		this.caregiverName = caregiverName;
		this.caregiverExperience = caregiverExperience;
		this.caregiverSpecialization = caregiverSpecialization;
		this.caregiverAbout = caregiverAbout;
		this.caregiverEmail = caregiverEmail;
		this.caregiverReview = caregiverReview;
		this.caregiverDob = caregiverDob;
		this.caregiverContactNo = caregiverContactNo;
		this.addressId = addressId;
		this.loginId = loginId;
	}

	public long getCaregiverid() {
		return caregiverid;
	}

	public void setCaregiverid(int caregiverid) {
		this.caregiverid = caregiverid;
	}

	public String getCaregiverName() {
		return caregiverName;
	}

	public void setCaregiverName(String caregiverName) {
		this.caregiverName = caregiverName;
	}

	public String getCaregiverExperience() {
		return caregiverExperience;
	}

	public void setCaregiverExperience(String caregiverExperience) {
		this.caregiverExperience = caregiverExperience;
	}

	public String getCaregiverSpecialization() {
		return caregiverSpecialization;
	}

	public void setCaregiverSpecialization(String caregiverSpecialization) {
		this.caregiverSpecialization = caregiverSpecialization;
	}

	public String getCaregiverAbout() {
		return caregiverAbout;
	}

	public void setCaregiverAbout(String caregiverAbout) {
		this.caregiverAbout = caregiverAbout;
	}

	public String getCaregiverEmail() {
		return caregiverEmail;
	}

	public void setCaregiverEmail(String caregiverEmail) {
		this.caregiverEmail = caregiverEmail;
	}

	public String getCaregiverReview() {
		return caregiverReview;
	}

	public void setCaregiverReview(String caregiverReview) {
		this.caregiverReview = caregiverReview;
	}

	public String getCaregiverDob() {
		return caregiverDob;
	}

	public void setCaregiverDob(String caregiverDob) {
		this.caregiverDob = caregiverDob;
	}

	public String getCaregiverContactNo() {
		return caregiverContactNo;
	}

	public void setCaregiverContactNo(String caregiverContactNo) {
		this.caregiverContactNo = caregiverContactNo;
	}

	public int getAddressId() {
		return addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public int getLoginId() {
		return loginId;
	}

	public void setLoginId(int loginId) {
		this.loginId = loginId;
	}

	@Override
	public String toString() {
		return "Caregiver [caregiverid=" + caregiverid + ", caregiverName=" + caregiverName + ", caregiverExperience="
				+ caregiverExperience + ", caregiverSpecialization=" + caregiverSpecialization + ", caregiverAbout="
				+ caregiverAbout + ", caregiverEmail=" + caregiverEmail + ", caregiverReview=" + caregiverReview
				+ ", caregiverDob=" + caregiverDob + ", caregiverContactNo=" + caregiverContactNo + ", address_id="
				+ addressId + ", login_id=" + loginId + "]";
	}
	
	

}
