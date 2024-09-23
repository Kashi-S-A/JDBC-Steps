package com.ty.batch;

public class Demo {

	public static void main(String[] args) {
		System.out.println("main start");
		m1();
		System.out.println("main end");
	}
	
	public static void m1() {
		System.out.println("m1 start");
		m2();
		System.out.println("m1 end");
	}
	
	public static void m2() {
		System.out.println("m2 start");
		m3();
		System.out.println("m2 end");
	}
	
	public static void m3() {
		System.out.println("m3 start");
		m4();
		System.out.println("m3 end");
	}
	
	public static void m4() {
		System.out.println("m4 start");
		try {
			int a=10/0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("m4 end");
	}
	
}
