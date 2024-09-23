package com.ty.step3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PStatement {

	public static void main(String[] args) {
		
		String url="jdbc:postgresql://localhost:5432/demodb?user=postgres&password=root";
		
		try {
			Class.forName("org.postgresql.Driver");
			
			Connection con=DriverManager.getConnection(url);
			
			String sql="INSERT INTO myperson VALUES(?,?,?)";
			
            PreparedStatement ps= con.prepareStatement(sql);	
            
            ps.setLong(1, 63278146);
            ps.setString(2, "Penga");
            ps.setLong(3, 87654567);
            
            ps.execute();
            
            con.close();
            
            System.out.println("data is inserted and connection is closed");
            
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
