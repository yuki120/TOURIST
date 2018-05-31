package com.internousdev.ecsite.dto;

public class ReviewDTO {

	private int id;
	private String productName;
	private String userName;
	private String handleName;
	private String title;
	private String comment;


	public int getId() {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setUserName (String userName) {
		this.userName = userName;
	}

	public String getUserName() {
		return userName;
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

}
