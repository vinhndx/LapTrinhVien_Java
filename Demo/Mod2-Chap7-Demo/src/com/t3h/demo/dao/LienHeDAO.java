package com.t3h.demo.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.t3h.demo.bean.LienHe;
import com.t3h.demo.utils.DatabaseUtil;

public class LienHeDAO {
	public static boolean themLienHe(LienHe lienHe) {
		try {
			Connection connection = DatabaseUtil.getConnection();
			String sql = "insert into lienhe values(null, ?, ?, ?)";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);

			preparedStatement.setString(1, lienHe.getTen());
			preparedStatement.setString(2, lienHe.getSdt());
			preparedStatement.setString(3, lienHe.getHinhAnh());

			int row = preparedStatement.executeUpdate();

			return row > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
