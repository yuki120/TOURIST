package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class MasterReviewDeleteDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();

	private String sql="DELETE FROM user_review_transaction WHERE comment = ?";

	public void reviewDeleteInfo(String review) throws SQLException{

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, review);
			ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}

}
