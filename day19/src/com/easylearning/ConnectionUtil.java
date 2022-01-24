package com.easylearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	private static Connection connection;

	static {
		String driver ="oracle.jdbc.driver.OracleDriver";
		String username="hr";
		String password="hr";
		String url ="jdbc:oracle:thin:@localhost:1522:XE";
		try {
			
			Class.forName(driver);
			System.out.println("Driver Loaded");
			connection =DriverManager.getConnection(url, username,password);
			System.out.println("created the connection objected");
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private ConnectionUtil() {}
	
	public static Connection getConnection() {
		return connection;
	}

}
