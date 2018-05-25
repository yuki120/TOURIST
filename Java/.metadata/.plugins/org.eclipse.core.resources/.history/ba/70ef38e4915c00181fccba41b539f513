package com.internousdev.ecsite.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionSupport;

public class MasterProductUpdateInputAction<BuyProductDTO> extends ActionSupport implements SessionAware {

	private List<String> productName;
	private ArrayList<BuyProductDTO> productUpdateList = new ArrayList<BuyProductDTO>();
	public Map<String,Object> session;

	public String execute(){

		System.out.println(productName);
		System.out.println(productName.size());

		session.put("productName", productName);
		session.put("productUpdateListSize", productName.size());


		for (int i=0; i < productName.size(); i++) {

			String name = productName.get(i);

			System.out.println(name);

			BuyProductDTO dto = new BuyProductDTO();

			dto.setName(name);

			productUpdateList.add(dto);
			session.put("productUpdateList", productUpdateList);
		}


		String result=SUCCESS;
		return result;
	}

	public List<String> getProductName(){
		return productName;
	}

	public void setProductName(List<String> productName){
		this.productName = productName;
	}

	public ArrayList<BuyProductDTO> getProductUpdateList(){
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
