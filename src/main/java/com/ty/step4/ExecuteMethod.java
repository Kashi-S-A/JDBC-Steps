package com.ty.step4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteMethod {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/demodb?user=postgres&password=root";

		try {
			Class.forName("org.postgresql.Driver");

			Connection con = DriverManager.getConnection(url);

			Statement stm = con.createStatement();

			String sql = "SELECT * FROM myperson ";

			System.out.println(stm.execute(sql));// true

			ResultSet rs = stm.getResultSet();//to get object of ResultSet

			rs.next();

			System.out.println(rs.getLong(1));

			String sql1 = "INSERT INTO myperson VALUES(45678,'FDSAF',45678)";

			System.out.println(stm.execute(sql1));// false

			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
