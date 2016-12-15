package mypkg.model;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAO {
	public static List<String> getAllAuthor() {
		try {

			Connection conn = DatabaseUtil.getConnetion();
			Statement stmt = conn.createStatement();
			String sqlStr = "SELECT DISTINCT author FROM books WHERE qty > 0";
			ResultSet rset = stmt.executeQuery(sqlStr);

			List<String> authors = new ArrayList<String>();
			while (rset.next()) {
				String author = rset.getString("author");
				authors.add(author);
			}
			return authors;
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
