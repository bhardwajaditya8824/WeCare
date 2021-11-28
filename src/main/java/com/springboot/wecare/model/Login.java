package com.springboot.wecare.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "login")
public class Login {

	@Id
	@Column(name = "login_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long loginId;

	@Column(name = "username")
	private String username;

	@Column(name = "password")
	private String password;

	@Column(name = "is_locked")
	private String isLocked;

	public Login() {
		super();
	}

	public Login(Long loginId, String username, String password, String isLocked) {
		super();
		this.loginId = loginId;
		this.username = username;
		this.password = password;
		this.isLocked = isLocked;
	}

	public Long getLoginId() {
		return loginId;
	}

	public void setLoginId(Long loginId) {
		this.loginId = loginId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}

	@Override
	public String toString() {
		return "Login [loginId=" + loginId + ", username=" + username + ", password=" + password + ", isLocked="
				+ isLocked + "]";
	}

	

}
	