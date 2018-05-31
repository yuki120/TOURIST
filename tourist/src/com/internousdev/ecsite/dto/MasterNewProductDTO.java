package com.internousdev.ecsite.dto;

public class MasterNewProductDTO {

	private String productCategory;
	private String productName;
	private String productPrice;
	private String productStock;
	private String productDescription;
	private String imageFilePath;
	private String insert_date;

	public String getProductCategory() {
		return productCategory;
	}

	public void setProductCategory (String productCategory) {
		this.productCategory = productCategory;
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

	public String getProductStock() {
		return productStock;
	}

	public void setProductStock (String productStock) {
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

	public String getInsert_date() {
		return insert_date;
	}

	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}

}
