package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewConfirmAction extends ActionSupport implements SessionAware {

	private String productName;
	private String handleName;
	private String title;
	private String comment;
	private String errorMessage;

	public Map<String, Object> session;
	private ArrayList<BuyProductDTO> buyProductDTOList = new ArrayList<>();

	@SuppressWarnings("unchecked")
	public String execute() {
		String result = SUCCESS;

		buyProductDTOList = (ArrayList<BuyProductDTO>) session.get("buyProductDTOList");

		/* sessionには、get、set、put が必要。
		 * DAO → set、本Action → get、前Action → put
		 * putがなければ、値がnullのままになっている。
		 */

		if (!(productName.equals(""))
				&& !(handleName.equals(""))
				&& !(title.equals(""))
				&& !(comment.equals(""))) {
					session.put("productName", productName);
					session.put("handleName", handleName);
					session.put("title", title);
					session.put("comment", comment);

		}else {
			errorMessage = "【入力漏れがございましたので、再度ご登録ください。】";
			result = ERROR;
		}
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

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage (String errorMessage) {
		this.errorMessage = errorMessage;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public ArrayList<BuyProductDTO> getBuyProductDTOList(){
		return buyProductDTOList;
	}

	public void setBuyProductDTOList(ArrayList<BuyProductDTO> buyProductDTOList){
		this.buyProductDTOList=buyProductDTOList;
	}

}
