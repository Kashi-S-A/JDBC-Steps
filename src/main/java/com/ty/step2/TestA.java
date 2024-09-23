package com.ty.step2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestA {

	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/demodb?user=postgres&password=root";
		
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("driver is loaded");
			
			Connection connection= DriverManager.getConnection(url);
			System.out.println("connection is created");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
