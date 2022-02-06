package com.nrifintech.febjspservletbatch.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nrifintech.febjspservletbatch.util.DBConnectionManager;

public class JDBCConnectionTest extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// GET DB Connection
		// Forming jdbc URL
		String jdbcUrl = "jdbc:postgresql://localhost/postgres";
		String username = "postgres";
		String password = "postgres";
		
		// Creating DBConnectionManager object to get the connection
		DBConnectionManager dbConnectionManager = new DBConnectionManager();
		
		try(Connection connection = dbConnectionManager.getConnection(username, password, jdbcUrl);) {
			
			String selectSQL = "SELECT username FROM public.user";
			
			try(PreparedStatement ps = connection.prepareStatement(selectSQL);) {
				
				try(ResultSet resultSet = ps.executeQuery();) {
					ResultSetMetaData metaData = resultSet.getMetaData();
					int totalNoOfColumn = metaData.getColumnCount();
					
//					while(resultSet.next()) {
//						String uname = resultSet.getString(1);
//					}
					
					while(resultSet.next()) {
						for(int i=1; i<=totalNoOfColumn; i++) {
							System.out.println(i+"->"+resultSet.getString(i));
						}
					}
				}
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
