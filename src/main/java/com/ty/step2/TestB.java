package com.ty.step2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class TestB {

	public static void main(String[] args) {
		
		try {
			FileInputStream fin=new FileInputStream("db.properties");
			
			Properties properties=new Properties();
			
			properties.load(fin);
			
			String driver= properties.getProperty("driver");
			
			Class.forName(driver);
			
			String url=properties.getProperty("url");
			
			Connection connection= DriverManager.getConnection(url, properties);
			
			System.out.println("connection created");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
