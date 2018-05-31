package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.ReviewSearchDAO;
import com.internousdev.ecsite.dto.ReviewDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewSearchAction extends ActionSupport implements SessionAware {

	private String searchWord;
	private String message;
	public Map<String, Object> session;

	private List<ReviewDTO> reviewDTOList = new ArrayList<ReviewDTO>();
	private ReviewSearchDAO reviewSearchDAO = new ReviewSearchDAO();

	@SuppressWarnings("unchecked")
	public String execute(){

		String result = ERROR;

		 //ワードを入力した時のみ実行
		if (searchWord.equals("")) {

			result = ERROR;
			reviewDTOList =(List<ReviewDTO>) session.get("reviewDTOList");
			session.put("reviewDTOList", reviewDTOList);
			setMessage("検索ワードを入力してください。");

		}else{
			reviewDTOList = reviewSearchDAO.getReviewInfo(searchWord);

			if (reviewDTOList.size() > 0) {
				session.put("reviewDTOList", reviewDTOList);
				int reviewCount = reviewDTOList.size();
				String count = Integer.toString(reviewCount);
				setMessage(count + "件のレビューが見つかりました。");
				result = SUCCESS;

			}else{
				result = ERROR;
				reviewDTOList =(List<ReviewDTO>) session.get("reviewDTOList");
				setMessage("該当するレビューが見つかりませんでした。");
			}
		}

		return result;
	}


	public String getSearchWord() {
		return searchWord;
	}

	public void setSearchWord(String searchWord) {
		this.searchWord = searchWord;
	}


	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


	public List<ReviewDTO> getReviewDTOList(){
		return reviewDTOList;
	}

	public void setReviewDTOList(List<ReviewDTO> reviewDTOList){
		this.reviewDTOList = reviewDTOList;
	}

	@Override
	public void setSession(Map<String, Object> session){
		this.session=session;
	}

}
