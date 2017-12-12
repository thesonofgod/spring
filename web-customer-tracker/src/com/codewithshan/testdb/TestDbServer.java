package com.codewithshan.testdb;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TestDbServer1
 */
@WebServlet("/TestDbServer")
public class TestDbServer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public TestDbServer() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//setup connection variables

		String user="prashanth";
		String pass="prashanth9";
		String jdbcUrl ="jdbc:mysql://prashanth.cij7b4gpzzdo.us-east-1.rds.amazonaws.com:3306/web_customer_tracker?useSSL=false";
		String driver = "com.mysql.jdbc.Driver";
		
		//get connection to database
try {
	
	PrintWriter out = response.getWriter();
	
	out.println("connecting to database " + jdbcUrl);
	
	Class.forName(driver);
	
	Connection myConn = DriverManager.getConnection(jdbcUrl,user,pass);
	
	out.println("Success!!!");
	
	myConn.close();
	
}

		catch(Exception exc){
			exc.printStackTrace();
			throw new ServletException(exc);
		
		//get conn
	}
	}
}