package com.ty.step1;

import java.sql.DriverManager;
import java.sql.SQLException;

import org.postgresql.Driver;

public class TestA {

	public static void main(String[] args) {

		try {
			Driver driver = new Driver();
			DriverManager.registerDriver(driver);

			System.out.println("registered");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
