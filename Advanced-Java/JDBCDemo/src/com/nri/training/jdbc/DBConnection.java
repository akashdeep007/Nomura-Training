package com.nri.training.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {

	private static String dbDriver = "com.mysql.cj.jdbc.Driver";
	private static String dbUrl = "jdbc:mysql://localhost:3306/";
	private static String dbName = "employeeprofile";
	private static String dbUser = "root";
	private static String dbPass = "password@123";
	
	private static DBConnection _instance;
	
	private Connection conn;	
	
	private DBConnection(){
		
	}
	
	public static DBConnection getInstance(){
		if(_instance == null){
			System.out.println("Object initialized");
			_instance = new DBConnection();
		}
		
		return _instance;
	}
	
	public Connection createConnection() throws ClassNotFoundException, SQLException{
		System.out.println("DBConnection.createConnection() >>>");
		if(conn == null || conn.isClosed()){
			System.out.println("Create a new connection");
			// load JDBC Driver
			Class.forName(dbDriver);
						
			// create DB Connection
			conn = DriverManager.getConnection(dbUrl+dbName, dbUser, dbPass);
		}
		System.out.println("DBConnection.createConnection() <<<");
		return conn;
	}
	
	public void closeConnection(){
		System.out.println("DBConnection.closeConnection() >>>");
		if(conn != null){
			try {
				conn.close();
				conn = null;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("DBConnection.closeConnection() <<<");
	}
	
	
	
	/*public static void main(String[] args){
		Connection conn = null;
		Statement stmt = null;
		try {
			// load JDBC Driver
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			// create DB Connection
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employeeprofile", "root", "password@123");

			// create Statement using connection
			stmt = conn.createStatement();
			
			// execute query using statement
			ResultSet result = stmt.executeQuery("SELECT * FROM emp");
			
			while(result.next()){
				System.out.println("First Name: "+result.getString("first_name"));
				System.out.println("Last Name: "+result.getString("last_name"));
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(stmt != null){
				try {
					stmt.close();
					stmt = null;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
			if(conn != null){
				try {
					conn.close();
					conn = null;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}*/
	
}


// java.sql
// javax.sql