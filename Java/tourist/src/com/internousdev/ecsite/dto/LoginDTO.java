package com.internousdev.ecsite.dto;

public class LoginDTO {

	private String loginId;
	private String loginPassword;
	private String name;
	private String address1;
	private String address2;
	private String sex;
	private String email;
	private String telNum;
	private boolean loginFlg = false;
	private boolean loginMaster = false;


	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelNum() {
		return telNum;
	}

	public void setTelNum(String telNum) {
		this.telNum = telNum;
	}

	public boolean getLoginFlg () {
		return loginFlg;
	}

	public void setLoginFlg (boolean loginFlg) {
		this.loginFlg = loginFlg;
	}

	public boolean getLoginMaster () {
		return loginMaster;
	}

	public void setLoginMaster (boolean loginMaster) {
		this.loginMaster = loginMaster;
	}

}