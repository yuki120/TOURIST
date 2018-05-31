package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.UserCreateCompleteDAO;
import com.opensymphony.xwork2.ActionSupport;

public class UserCreateCompleteAction extends ActionSupport implements SessionAware {
	private String userId;
	private String userPassword;
	private String name;
	private String nameKana;
	private String sex;
	private String email;
	private String telNum;
	private String postalCode;
	private String address1;
	private String address2;
	public Map<String, Object> session;

	/* throwsは例外処理をスルーしてくれる。呼び出し元で、例外処理を行っているため、
	 * こちらでは処理しなくてOKということ。
	 * 以下の場合は、UserCreateCompleteDAOで例外処理を行っている。 */
	public String execute() throws SQLException {
		UserCreateCompleteDAO userCreateCompleteDAO = new UserCreateCompleteDAO();
		userCreateCompleteDAO.createUser(
				session.get("userId").toString(),
				session.get("userPassword").toString(),
				session.get("name").toString(),
				session.get("nameKana").toString(),
				session.get("sex").toString(),
				session.get("email").toString(),
				session.get("telNum").toString(),
				session.get("postalCode").toString(),
				session.get("address1").toString(),
				session.get("address2").toString());
		String result = SUCCESS;
		return result;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
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

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
