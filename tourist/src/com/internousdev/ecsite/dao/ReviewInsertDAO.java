package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class ReviewInsertDAO {
	private DateUtil dateUtil = new DateUtil();

	private String sql = "INSERT INTO user_review_transaction(product_name, user_master_id, handle_name, title, comment, insert_date) VALUES (?, ?, ?, ?, ?, ?)";

	public void insertReview(String productName, String userName, String handleName, String title, String comment) throws SQLException {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, productName);
			ps.setString(2, userName);
			ps.setString(3, handleName);
			ps.setString(4, title);
			ps.setString(5, comment);
			ps.setString(6, dateUtil.getDate());

			ps.execute();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
	}

}
