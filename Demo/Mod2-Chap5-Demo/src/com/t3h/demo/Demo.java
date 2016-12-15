package com.t3h.demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/mydatabase";
			
			Connection connection = DriverManager.getConnection(url, "root", "");
			
			String query = "SELECT * FROM account where username = ? and pass = ?";
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			
			String user = "abc";
			String pass = "1234";
			
			preparedStatement.setString(1, user);
			preparedStatement.setString(2, pass);
			
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if(resultSet.next()){
				System.out.println("Dang nhap thanh cong");
			} else {
				System.out.println("Dang nhap that bai");
			}
			
			
			// insert
			String sql = "INSERT INTO account VALUES (NULL, ?, ?)";
			
			Scanner scanner = new Scanner(System.in);
			
			connection.setAutoCommit(false);
			
			PreparedStatement preparedStatement2 = connection.prepareStatement(sql);

			System.out.println("Nhap username:");
			preparedStatement2.setString(1, scanner.nextLine());
			
			System.out.println("Nhap password:");
			preparedStatement2.setString(2, scanner.nextLine());
			
			preparedStatement2.executeUpdate();
			
			connection.commit();
			
			System.out.println("Insert thanh cong");
			
			
			connection.close();
			
			//System.out.println("ok");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
