package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.MasterReviewDeleteDAO;
import com.internousdev.ecsite.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterReviewDeleteCompleteAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	public String execute() throws SQLException{

		@SuppressWarnings("unchecked")
		List<String> review = (List<String>) session.get("review");

		for (int i=0; i<review.size(); i++) {
			@SuppressWarnings("unchecked")
			List<ReviewDTO> list = (List<ReviewDTO>) session.get("reviewDeleteList");
			String comment = list.get(i).getComment();

			MasterReviewDeleteDAO dao = new MasterReviewDeleteDAO();
			dao.reviewDeleteInfo(comment);
		}
		String result=SUCCESS;
		return result;
	}

	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

}
