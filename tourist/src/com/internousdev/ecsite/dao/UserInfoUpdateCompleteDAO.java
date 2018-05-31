package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class UserInfoUpdateCompleteDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private DateUtil dateUtil = new DateUtil();


	public boolean userUpdateInfo(String loginId, String loginPassword, String name, String nameKana,
			String sex, String email,String telNum, String postalCode, String address1, String address2, String defaultLoginId) throws SQLException{

		String sql ="UPDATE login_user_transaction "
				+ "SET login_id = ?, login_pass = ?, name = ?, name_kana = ?, "
				+ "sex = ?, email = ?, tel_num = ?, postal_code = ?, "
				+ "address1 = ?, address2 = ?, updated_date = ? "
				+ "WHERE id = ?";

		boolean result = false;

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, loginId);
			ps.setString(2, loginPassword);
			ps.setString(3, name);
			ps.setString(4, nameKana);
			ps.setString(5, sex);
			ps.setString(6, email);
			ps.setString(7, telNum);
			ps.setString(8, postalCode);
			ps.setString(9, address1);
			ps.setString(10, address2);
			ps.setString(11, dateUtil.getDate());
			ps.setString(12, defaultLoginId);

			int checkUpdate = ps.executeUpdate();

			if(checkUpdate > 0){
				result = true;
			}
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			con.close();
		}
		return result;
	}
}
