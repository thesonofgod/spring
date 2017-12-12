package com.codewithshan.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;

public class TestJdbc {
	
	public static void main(String[] args){
		
		
			
			String jdbcUrl ="jdbc:mysql://prashanth.cij7b4gpzzdo.us-east-1.rds.amazonaws.com:3306/hb-01-one-to-one-uni?useSSL=false";
			String user="prashanth";
			String pass="prashanth9";
		try{
			
			System.out.println("Connecting to database " + jdbcUrl);
			
			Connection myConn = 
					DriverManager.getConnection(jdbcUrl,user,pass);
			
			System.out.println("Connection Successfull");
			
			
			
		}
		
		catch(Exception exc){
			exc.printStackTrace();
		}
	}

}
