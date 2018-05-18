package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserInfoUpdateCompleteDAO;
import com.internousdev.ecsite.dto.LoginDTO;
import com.opensymphony.xwork2.ActionSupport;

public class UserInfoUpdateCompleteAction extends ActionSupport implements SessionAware {

	private String loginId;
	private String loginPassword;
	private String name;
	private String nameKana;
	private String sex;
	private String email;
	private String telNum;
	private String postalCode;
	private String address1;
	private String address2;
	private String userNumber;
	public Map<String, Object> session;
	private UserInfoUpdateCompleteDAO userInfoUpdateCompleteDAO = new UserInfoUpdateCompleteDAO();

	public String execute() throws SQLException{

		String result = ERROR;

		boolean checkUpdate =userInfoUpdateCompleteDAO.userUpdateInfo (
				session.get("loginId").toString(),
				session.get("loginPassword").toString(),
				session.get("name").toString(),
				session.get("nameKana").toString(),
				session.get("sex").toString(),
				session.get("email").toString(),
				session.get("telNum").toString(),
				session.get("postalCode").toString(),
				session.get("address1").toString(),
				session.get("address2").toString(),
				((LoginDTO) session.get("loginUser")).getUserNumber().toString());
		if (checkUpdate) {
			result = SUCCESS;
		}

		return result;
	}

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

	public String getNameKana() {
		return nameKana;
	}

	public void setNameKana(String nameKana) {
		this.nameKana = nameKana;
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
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

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
}