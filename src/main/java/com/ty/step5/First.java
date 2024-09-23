package com.ty.step5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class First {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/demodb?user=postgres&password=root";

		Connection con=null;
		try {
			Class.forName("org.postgresql.Driver");
			System.out.println("driver loaded");

			con = DriverManager.getConnection(url);
			System.out.println("connection created");

			Statement stm = con.createStatement();

			String up="UPDATE myperson SET person_phone=123 WHERE person_name='R'";

			int update=stm.executeUpdate(up);
			
			System.out.println("query is executed");
			
			System.out.println(update);

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			
			try {
				if (con!=null) {
					con.close();
					System.out.println("connection is closed");
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}
}
