package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.ReviewDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ReviewSearchDAO {

	private DBConnector db = new DBConnector();
	private Connection con = db.getConnection();
	private List<ReviewDTO> searchList = new ArrayList<ReviewDTO>();

	public List<ReviewDTO> getReviewInfo (String searchWord) {

		String sql = "SELECT * FROM user_review_transaction";

		try{
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				String productName = rs.getString("product_name");
				String handleName = rs.getString("handle_name");

				if (productName.matches(".*" + searchWord + ".*") || handleName.matches(".*" + searchWord + ".*")) {
					ReviewDTO dto = new ReviewDTO();
					dto.setId(rs.getInt("id"));
					dto.setProductName(productName);
					dto.setUserName(rs.getString("user_master_id"));
					dto.setHandleName(handleName);
					dto.setTitle(rs.getString("title"));
					dto.setComment(rs.getString("comment"));
					searchList.add(dto);
				}
			}

		}catch(Exception e){
			e.printStackTrace();
		}

		return searchList;
	}

	public List<ReviewDTO> getReviewDTO(){
		return searchList;
	}

}
