package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.MasterNewProductDAO;
import com.internousdev.ecsite.dto.MasterNewProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterNewProductCompleteAction extends ActionSupport implements SessionAware {

	private String productCategory;
	private String productName;
	private String productPrice;
	private String productStock;
	private String productDescription;
	private String imageFilePath;
	public Map<String, Object> session;

	public String execute() throws SQLException {
		MasterNewProductDAO dao = new MasterNewProductDAO();
		MasterNewProductDTO dto = new MasterNewProductDTO();

		dto=dao.createProduct(productCategory, productName, productPrice, productStock, productDescription, imageFilePath);
		session.put("productInsert", dto);

		String result = SUCCESS;
		return result;
	}

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


	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

}
