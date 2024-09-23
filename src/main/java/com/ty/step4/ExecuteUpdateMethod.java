package com.ty.step4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ExecuteUpdateMethod {

	public static void main(String[] args) {

		String url = "jdbc:postgresql://localhost:5432/demodb?user=postgres&password=root";

		try {
			Class.forName("org.postgresql.Driver");

			Connection con = DriverManager.getConnection(url);

			Statement stm = con.createStatement();

			String sql = "SELECT * FROM myperson ";//if we pass this query it thorws exception
			
			String sql1="INSERT INTO myperson VALUES(45678,'FDSAF',45678)";//return 1
			
			String up="UPDATE myperson SET person_phone=123 WHERE person_name='R'";// returns 0

			int update=stm.executeUpdate(up);
			
			System.out.println(update);

			con.close();

		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
