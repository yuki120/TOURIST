package com.internousdev.ecsite.dto;

public class BuyProductDTO {
	private int id;
	private int categoryId;
	private String productName;
	private String productPrice;
	private int productStock;
	private String productDescription;
	private String imageFilePath;

	public int count;
	public int totalPrice;

	public int getId() {
		return id;
	}

	public void setId (int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId (int categoryId) {
		this.categoryId = categoryId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName (String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice (String productPrice) {
		this.productPrice = productPrice;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock (int productStock) {
		this.productStock = productStock;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription (String productDescription) {
		this.productDescription = productDescription;
	}

	public String getImageFilePath() {
		return imageFilePath;
	}

	public void setImageFilePath (String imageFilePath) {
		this.imageFilePath = imageFilePath;
	}

	public int getCount(){
		return count;
	}

	public void setCount(int count){
		this.count=count;
	}

	public int getTotalPrice(){
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice){
		this.totalPrice=totalPrice;
	}

}