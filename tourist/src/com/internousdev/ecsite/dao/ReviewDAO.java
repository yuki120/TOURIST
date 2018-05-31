package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.ReviewDTO;
import com.internousdev.ecsite.util.DBConnector;

public class ReviewDAO {

	private List<ReviewDTO> reviewDTOList = new ArrayList<ReviewDTO>();

	public List<ReviewDTO> getReviewInfo() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql ="SELECT * FROM user_review_transaction";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				ReviewDTO dto = new ReviewDTO();
				dto.setProductName(rs.getString("product_name"));
				dto.setUserName(rs.getString("user_master_id"));
				dto.setHandleName(rs.getString("handle_name"));
				dto.setTitle(rs.getString("title"));
				dto.setComment(rs.getString("comment"));
				reviewDTOList.add(dto);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return reviewDTOList;
	}

	public List<ReviewDTO> getReviewDTO() {
		return reviewDTOList;
	}

}
