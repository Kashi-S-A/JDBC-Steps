package com.ty.step5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Second {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/demodb?user=postgres&password=root";

		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try (Connection con=DriverManager.getConnection(url))
		{
			Statement stm=con.createStatement();
			
			String sql="INSERT INTO myperson VALUES(12345678,'Aman',2345678)";
			
			stm.execute(sql);
			
			System.out.println("executed and connection is closed");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
