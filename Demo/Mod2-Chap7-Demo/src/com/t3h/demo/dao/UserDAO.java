package com.t3h.demo.dao;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.xml.bind.DatatypeConverter;

import com.t3h.demo.bean.User;
import com.t3h.demo.utils.DatabaseUtil;

public class UserDAO {
	public static boolean insertUser(User user) {
		try {
			Connection connection = DatabaseUtil.getConnection();
			String sql = "insert into account values(null, ?, ?, ?)";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);

			preparedStatement.setString(1, user.getUsername());
			preparedStatement.setString(2,
					getMD5(user.getPass(), user.getSalt()));
			preparedStatement.setString(3, user.getSalt());

			int row = preparedStatement.executeUpdate();

			return row > 0;

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	public static User getUserByUsername(String username) {

		try {
			Connection connection = DatabaseUtil.getConnection();
			String query = "select * from account where username = ?";

			PreparedStatement preparedStatement = connection
					.prepareStatement(query);

			preparedStatement.setString(1, username);

			User user = null;

			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
				user = new User();
				user.setUsername(resultSet.getString("username"));
				user.setPass(resultSet.getString("pass"));
				user.setSalt(resultSet.getString("salt"));
			}

			return user;

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return null;
	}

	public static String getMD5(String pass, String salt) {
		String password = pass + salt;
		try {
			MessageDigest messageDigest = MessageDigest.getInstance("MD5");

			messageDigest.reset();
			messageDigest.update(password.getBytes());

			byte[] by = messageDigest.digest();

			String newPass = DatatypeConverter.printHexBinary(by).toLowerCase();

			return newPass;
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
		return "";
	}
}
