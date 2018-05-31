package com.internousdev.ecsite.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dto.BuyProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class MasterProductUpdateAction extends ActionSupport implements SessionAware {

	public Map<String,Object> session;

	private List<BuyProductDTO> buyProductDTOList;

	@SuppressWarnings("unchecked")
	public String execute(){

		buyProductDTOList=(List<BuyProductDTO>) session.get("buyProductDTOList");

		String result=SUCCESS;
		return result;
	}

	public List<BuyProductDTO> getBuyProductDTOList() {
		return buyProductDTOList;
	}

	public void setBuyProductDTOList(List<BuyProductDTO> buyProductDTOList) {
		this.buyProductDTOList = buyProductDTOList;
	}

	@Override
	public void setSession(Map<String,Object> session) {
		this.session = session;
	}
}
