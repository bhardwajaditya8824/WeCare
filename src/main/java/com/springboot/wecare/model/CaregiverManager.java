package com.springboot.wecare.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "manager")
public class CaregiverManager {

	@Id
	@Column(name = "manager_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long caregiverManagerId;

	@Column(name = "manager_name")
	private String caregiverManagerName;

	@Column(name = "manager_email")
	private String caregiverManagerEmail;

	@Column(name = "manager_dob")
	private String caregiverManagerDob;

	@Column(name = "manager_contact_no")
	private String caregiverManagerContactNo;

	@Column(name = "address_id")
	private int addressId;

	@Column(name = "login_id")
	private int loginId;

	public CaregiverManager() {
		super();
	}

	public CaregiverManager(Long caregiverManagerId, String caregiverManagerName, String caregiverManagerEmail,
			String caregiverManagerDob, String caregiverManagerContactNo, int addressId, int loginId) {
		super();
		this.caregiverManagerId = caregiverManagerId;
		this.caregiverManagerName = caregiverManagerName;
		this.caregiverManagerEmail = caregiverManagerEmail;
		this.caregiverManagerDob = caregiverManagerDob;
		this.caregiverManagerContactNo = caregiverManagerContactNo;
		this.addressId = addressId;
		this.loginId = loginId;
	}

	public Long getCaregiverManagerId() {
		return caregiverManagerId;
	}

	public void setCaregiverManagerId(Long caregiverManagerId) {
		this.caregiverManagerId = caregiverManagerId;
	}

	public String getCaregiverManagerName() {
		return caregiverManagerName;
	}

	public void setCaregiverManagerName(String caregiverManagerName) {
		this.caregiverManagerName = caregiverManagerName;
	}

	public String getCaregiverManagerEmail() {
		return caregiverManagerEmail;
	}

	public void setCaregiverManagerEmail(String caregiverManagerEmail) {
		this.caregiverManagerEmail = caregiverManagerEmail;
	}

	public String getCaregiverManagerDob() {
		return caregiverManagerDob;
	}

	public void setCaregiverManagerDob(String caregiverManagerDob) {
		this.caregiverManagerDob = caregiverManagerDob;
	}

	public String getCaregiverManagerContactNo() {
		return caregiverManagerContactNo;
	}

	public void setCaregiverManagerContactNo(String caregiverManagerContactNo) {
		this.caregiverManagerContactNo = caregiverManagerContactNo;
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
		return "CaregiverManager [caregiverManagerId=" + caregiverManagerId + ", caregiverManagerName="
				+ caregiverManagerName + ", caregiverManagerEmail=" + caregiverManagerEmail + ", caregiverManagerDob="
				+ caregiverManagerDob + ", caregiverManagerContactNo=" + caregiverManagerContactNo + ", addressId="
				+ addressId + ", loginId=" + loginId + "]";
	}

}
