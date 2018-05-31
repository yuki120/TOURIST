package com.internousdev.ecsite.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.internousdev.ecsite.dto.BuyProductDTO;
import com.internousdev.ecsite.util.DBConnector;

public class BuyProductDAO {

	private List<BuyProductDTO> buyProductDTOList = new ArrayList<BuyProductDTO>();

	public List<BuyProductDTO> getBuyProductInfo() {
		DBConnector db = new DBConnector();
		Connection con = db.getConnection();

		String sql ="SELECT * FROM product_info_transaction";

		try {
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();

			while (rs.next()) {
				BuyProductDTO buyProductDTO = new BuyProductDTO();
				buyProductDTO.setId(rs.getInt("id"));
				buyProductDTO.setProductCategory(rs.getString("product_category"));
				buyProductDTO.setProductName(rs.getString("product_name"));
				buyProductDTO.setProductPrice(rs.getString("product_price"));
				buyProductDTO.setProductStock(rs.getInt("product_stock"));
				buyProductDTO.setProductDescription(rs.getString("product_description"));
				buyProductDTO.setImageFilePath(rs.getString("image_file_path"));
				buyProductDTOList.add(buyProductDTO);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return buyProductDTOList;
	}

	public List<BuyProductDTO> getBuyProductDTO() {
		return buyProductDTOList;
	}

}
