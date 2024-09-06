package com.company.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.company.model.User;

public class DatabaseConnection {
	private static final String url = "jdbc:mysql://localhost:3306/database_name";
	private static final String username1 = "Username";
	private static final String password1 = "Password";
	static {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage());
		}
	}

	public static Connection getConnection() throws SQLException {
		return DriverManager.getConnection(url, username1, password1);
	}

}
