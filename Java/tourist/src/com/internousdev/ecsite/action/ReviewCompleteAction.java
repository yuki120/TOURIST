package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ReviewInsertDAO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewCompleteAction extends ActionSupport implements SessionAware {

	private String productName;
	private String handleName;
	private String title;
	private String comment;
	public Map<String, Object> session;

	public String execute() throws SQLException {
		ReviewInsertDAO dao = new ReviewInsertDAO();
		dao.insertReview(
				session.get("productName").toString(),
				session.get("login_user_id").toString(),
				session.get("handleName").toString(),
				session.get("title").toString(),
				session.get("comment").toString());
		String result = SUCCESS;
		return result;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName (String productName) {
		this.productName = productName;
	}

	public String getHandleName() {
		return handleName;
	}

	public void setHandleName (String handleName) {
		this.handleName = handleName;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle (String title) {
		this.title = title;
	}
	public String getComment() {
		return comment;
	}

	public void setComment (String comment) {
		this.comment = comment;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

}
