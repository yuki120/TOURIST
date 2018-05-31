package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.MasterProductUpdateDAO;
import com.internousdev.ecsite.dto.BuyProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterProductUpdateConfirmAction extends ActionSupport implements SessionAware {

	private int id;
	private List<BuyProductDTO> productUpdateList = new ArrayList<BuyProductDTO>();
	private MasterProductUpdateDAO dao = new MasterProductUpdateDAO();
	public Map<String,Object> session;

	public String execute(){


		productUpdateList =dao.ProductUpdateInfo(id);

		String selectName = productUpdateList.get(0).getProductName();
		String selectPrice = productUpdateList.get(0).getProductPrice();
		int selectStock = productUpdateList.get(0).getProductStock();
		String selectDescription = productUpdateList.get(0).getProductDescription();
		String selectImageFilePath = productUpdateList.get(0).getImageFilePath();

		session.put("productName", selectName);
		session.put("productPrice", selectPrice);
		session.put("productStock", selectStock);
		session.put("productDescription", selectDescription);
		session.put("imageFilePath", selectImageFilePath);
		session.put("updateId", id);


		String result=SUCCESS;
		return result;
	}


	public int getId(){
		return id;
	}

	public void setId(int id){
		this.id = id;
	}

	public List<BuyProductDTO> getProductUpdateList(){
		return productUpdateList;
	}
	public void setProductUpdateList(ArrayList<BuyProductDTO> productUpdateList){
		this.productUpdateList = productUpdateList;
	}

	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}

}
