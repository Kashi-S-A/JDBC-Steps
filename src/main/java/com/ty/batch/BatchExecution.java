package com.ty.batch;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Arrays;

public class BatchExecution {
	public static void main(String[] args) {
		String url="jdbc:postgresql://localhost:5432/demodb?user=postgres&password=root";
		
		try {
			Class.forName("org.postgresql.Driver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		
		try (Connection connection=DriverManager.getConnection(url))
		{
			Statement stm=connection.createStatement();
			
			String sql1="INSERT INTO myperson VALUES(1234456,'Tunga',987098765)";
			
			String sql2="UPDATE myperson SET person_phone=456789 WHERE person_name='Rahul'";
			
			String sql3="DELETE FROM myperson WHERE person_adhar_id=6345";
			
			stm.addBatch(sql1);
			stm.addBatch(sql2);
			stm.addBatch(sql3);
			
			int[] result=stm.executeBatch();
			
			System.out.println("The batch is executed and Result is as follow");
			
			for (int i = 0; i < result.length; i++) {
				System.out.println(result[i]);
			}
			
			System.out.println("-------------");
			
			System.out.println(Arrays.toString(result));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
