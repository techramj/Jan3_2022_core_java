package com.easylearning;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
	
	public static void main(String[] args) {
		//Step 1: load the driver
		String str ="oracle.jdbc.driver.OracleDriver";
		try {
			Class.forName(str);
			System.out.println("driver loaded successfully");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//get the connection object(url, usernmae,pwd)
		String username="hr";
		String password="hr";
		String url ="jdbc:oracle:thin:@localhost:1522:XE";
		Connection con=null;
		
		try {
			con=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("Ready to use the connection object");
		System.out.println(con.getClass().getName());
		
		try {
			Statement st = con.createStatement();
			System.out.println(st.getClass().getName());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
