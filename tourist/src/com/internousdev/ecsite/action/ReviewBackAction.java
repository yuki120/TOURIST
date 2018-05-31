package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class ReviewBackAction extends ActionSupport implements SessionAware {

	private String productName;
	private String handleName;
	private String title;
	private String comment;

	public Map<String, Object> session;
	private ArrayList<BuyProductDTO> buyProductDTOList = new ArrayList<>();

	@SuppressWarnings("unchecked")
	public String execute() {
		buyProductDTOList = (ArrayList<BuyProductDTO>) session.get("buyProductDTOList");

		String result=SUCCESS;
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

	public ArrayList<BuyProductDTO> getBuyProductDTOList(){
		return buyProductDTOList;
	}

	public void setBuyProductDTOList(ArrayList<BuyProductDTO> buyProductDTOList){
		this.buyProductDTOList = buyProductDTOList;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session = session;
	}

}
