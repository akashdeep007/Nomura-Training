package com.nri.training.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest {
	
	public static String createSQL(String fName, String lName, String email, String phoneNo){
		StringBuilder sb = new StringBuilder();
		sb.append("insert into emp values(");
		sb.append("\"");
		sb.append(fName);
		sb.append("\"");
		sb.append(",");
		sb.append("\"");
		sb.append(lName);
		sb.append("\"");
		sb.append(",");
		sb.append("\"");
		sb.append(email);
		sb.append("\"");
		sb.append(",");
		sb.append("\"");
		sb.append(phoneNo);
		sb.append("\"");
		sb.append(")");
		
		return sb.toString();
	}

	public static void main(String[] args){
		DBConnection dbConn = DBConnection.getInstance();
		Statement stmt = null;
		try {
			stmt = dbConn.createConnection().createStatement();			
			stmt.execute(JDBCTest.createSQL("Ankan", "Bose", "ankan@gmail.com", "1234645"));			
			stmt.close();
			
			
			
			stmt = dbConn.createConnection().createStatement();			
			stmt.executeUpdate("update emp set phoneNo = \"9864695334\" where fName = \"ankan\"");			
			stmt.close();
			
			stmt = dbConn.createConnection().createStatement();			
			ResultSet result = stmt.executeQuery("SELECT * FROM emp");			
			while(result.next()){
				System.out.println("First Name: "+result.getString("fName"));
				System.out.println("Last Name: "+result.getString("lName"));
				System.out.println("Mobile: "+result.getString("phoneNo"));
				System.out.println("____________________________________________________");
			}
			stmt.close();
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			if(stmt != null){
				try {
					stmt.close();
					stmt = null;
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			dbConn.closeConnection();
		}
		
	}
	
}
