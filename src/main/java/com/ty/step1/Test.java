package com.ty.step1;

public class Test {

	public static void main(String[] args) {
		
		try {
			Class.forName("org.postgresql.Driver");
			
			System.out.println("loaded");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
