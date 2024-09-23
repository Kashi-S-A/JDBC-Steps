package com.ty.step4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteQueryMethod {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/demodb?user=postgres&password=root";

		try {
			Class.forName("org.postgresql.Driver");

			Connection con = DriverManager.getConnection(url);

			Statement stm = con.createStatement();

			String sql = "SELECT * FROM myperson ";

			String sql1 = "INSERT INTO myperson VALUES(1232,'FKDJA',36289)";

			ResultSet rs = stm.executeQuery(sql);

			//stm.executeQuery(sql1);// Non-select query cannot be execute using executeQuery method

			System.out.println("data is fetched");

			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
