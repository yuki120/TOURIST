package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterReviewDeleteConfirmAction extends ActionSupport implements SessionAware {

	private List<String> review;
	private ArrayList<ReviewDTO> reviewDeleteList = new ArrayList<>();
	public Map<String,Object> session;

	public String execute(){

		session.put("review", review);
		session.put("reviewDeleteListSize", review.size());


		for (int i=0; i<review.size(); i++) {

			String comment = review.get(i);

			ReviewDTO dto = new ReviewDTO();

			dto.setComment(comment);

			reviewDeleteList.add(dto);
			session.put("reviewDeleteList", reviewDeleteList);
		}
		String result=SUCCESS;
		return result;
	}

	public List<String> getReview() {
		return review;
	}

	public void setReview(List<String> review) {
		this.review = review;
	}

	public ArrayList<ReviewDTO> getReviewDeleteList() {
		return reviewDeleteList;
	}
	public void setReviewDeleteList(ArrayList<ReviewDTO> reviewDeleteList) {
		this.reviewDeleteList = reviewDeleteList;
	}

	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}

}
