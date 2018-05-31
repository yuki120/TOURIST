package com.internousdev.ecsite.action;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import org.apache.struts2.interceptor.SessionAware;

import com.internousdev.ecsite.dao.PurchaseHistoryDAO;
import com.internousdev.ecsite.dto.PurchaseHistoryDTO;
import com.opensymphony.xwork2.ActionSupport;

public class PurchaseHistoryAction extends ActionSupport implements SessionAware {

	public Map<String, Object> session;
	public List<PurchaseHistoryDTO> purchaseHistoryDTOList;
	public PurchaseHistoryDAO purchaseHistoryDAO = new PurchaseHistoryDAO();
	private String deleteFlg;
	private String message;

	public String execute() throws SQLException {

		//商品履歴を削除しない場合
		if (deleteFlg == null) {
			String user_master_id = session.get("login_user_id").toString();
			purchaseHistoryDTOList = purchaseHistoryDAO.getMyPageUserInfo(user_master_id);
			session.put("purchaseHistoryDTOList", purchaseHistoryDTOList);

			//商品履歴を削除する場合
		} else if(deleteFlg.equals("1")) {
			delete();
		}

		String result = SUCCESS;
		return result;
	}


	public void delete() throws SQLException {

		String user_master_id = session.get("login_user_id").toString();
		int res = purchaseHistoryDAO.buyProductHistoryDelete(user_master_id);

		if(res > 0) {
			purchaseHistoryDTOList = null;
			setMessage("商品情報を正しく削除しました。");

		} else if(res == 0) {
			setMessage("商品情報の削除に失敗しました。");
		}
	}

	public String getDeleteFlg() {
		return deleteFlg;
	}

	public void setDeleteFlg(String deleteFlg) {
		this.deleteFlg = deleteFlg;
	}

	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}


}
