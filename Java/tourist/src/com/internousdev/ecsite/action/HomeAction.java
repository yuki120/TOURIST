package com.internousdev.ecsite.action;

import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.BuyProductDAO;
import com.internousdev.ecsite.dto.BuyProductDTO;
import com.opensymphony.xwork2.ActionSupport;

public class HomeAction extends ActionSupport implements SessionAware {
	public Map<String, Object> session;
	private List<BuyProductDTO> buyProductDTOList;

	public String execute() {
		String result = "login";
		BuyProductDAO buyProductDAO = new BuyProductDAO();

		//もしログイン済みの場合（キーが存在するかの確認）
		if (session.containsKey("id")) {
			buyProductDTOList = buyProductDAO.getBuyProductInfo();
			session.put("buyProductDTOList", buyProductDTOList);
			result = SUCCESS;
		}

		if(session.containsKey("masterId")){
			buyProductDTOList = buyProductDAO.getBuyProductInfo();
			session.put("buyProductDTOList", buyProductDTOList);
			result = "master";

		}

		return result;
	}

	public Map<String, Object> getSession() {
		return session;
	}

	@Override
	public void setSession (Map<String, Object> session) {
		this.session = session;
	}

	public List<BuyProductDTO> getBuyProductDTOList(){
		return buyProductDTOList;
	}

	public void setBuyProductDTOList(List<BuyProductDTO> buyProductDTOList){
		this.buyProductDTOList = buyProductDTOList;
	}

}
