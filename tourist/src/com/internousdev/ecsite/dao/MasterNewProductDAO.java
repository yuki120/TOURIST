package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.internousdev.ecsite.dto.MasterNewProductDTO;
import com.internousdev.ecsite.util.DBConnector;
import com.internousdev.ecsite.util.DateUtil;

public class MasterNewProductDAO {

	private DateUtil dateUtil = new DateUtil();
	private MasterNewProductDTO masterNewProductDTO = new MasterNewProductDTO();

	private String sql = "INSERT INTO product_info_transaction(product_category, product_name, product_price, product_stock, product_description, image_file_path, insert_date) VALUES (?, ?, ?, ?, ?, ?, ?)";

	public MasterNewProductDTO createProduct(String productCategory, String productName, String productPrice, String productStock, String productDescription, String imageFilePath) throws SQLException {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, productCategory);
			ps.setString(2, productName);
			ps.setString(3, productPrice);
			ps.setString(4, productStock);
			ps.setString(5, productDescription);
			ps.setString(6, imageFilePath);
			ps.setString(7, dateUtil.getDate());

			ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			con.close();
		}
		return masterNewProductDTO;
	}

}
