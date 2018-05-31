package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;

public class MasterProductDeleteDAO {

	private DBConnector db=new DBConnector();
	private Connection con=db.getConnection();

	private String sql="DELETE FROM product_info_transaction WHERE product_name = ?";

	public void productDeleteInfo(String name) throws SQLException{

		try{
			PreparedStatement ps = con.prepareStatement(sql);

			ps.setString(1, name);
			ps.executeUpdate();

		}catch(SQLException e){
			e.printStackTrace();
		}finally{
			con.close();
		}
	}
}
