package com.t3h.demo.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseUtil {
	
	private static Connection connection;
	
	public static Connection getConnection(){
		
		if(connection != null){
			return connection;
		}
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			String url = "jdbc:mysql://localhost/mydatabase";
			
			Connection connection = 
					DriverManager.getConnection(url, "root", "");
			
			return connection;
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}
}
