package com.nrifintech.febjspservletbatch.servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.nrifintech.febjspservletbatch.util.DBConnectionManager;

public class JDBCConnectionTest extends HttpServlet {
	private static final String DB_PASSWORD = "DB_PASSWORD";
	private static final String DB_USERNAME = "DB_USERNAME";
	private static final String JDBC_URL = "JDBC_URL";
	DBConnectionManager dbConnectionManager;
	
	@Override
	public void init() throws ServletException {
		// Creating DBConnectionManager object to get the connection
		dbConnectionManager = new DBConnectionManager();
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		ServletContext servletContext = req.getServletContext();
		
		// GET DB Connection
		// Forming jdbc URL
		String jdbcUrl = servletContext.getInitParameter(JDBC_URL);
		String username = servletContext.getInitParameter(DB_USERNAME);
		String password = servletContext.getInitParameter(DB_PASSWORD);
		
		try(Connection connection = dbConnectionManager.getConnection(username, password, jdbcUrl);) {
			
			String selectSQL = "SELECT * FROM public.user";
			
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
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// Reading input parameters
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		ServletContext servletContext = req.getServletContext();
		
		// Forming jdbc URL
		String jdbcUrl = servletContext.getInitParameter(JDBC_URL);
		String dbUsername = servletContext.getInitParameter(DB_USERNAME);
		String dbPassword = servletContext.getInitParameter(DB_PASSWORD);
		
		try(Connection connection = dbConnectionManager.getConnection(dbUsername, dbPassword, jdbcUrl);) {
		
			String INSERT_SQL = "INSERT INTO public.user(username, password) VALUES(?,?)";
			
			try(PreparedStatement ps = connection.prepareStatement(INSERT_SQL);) {
				ps.setString(1, username);
				ps.setString(2, password);
				
				ps.executeUpdate();
				
				req.setAttribute("isInserted", true);
			}
			
		} catch (SQLException e) {
			req.setAttribute("isInserted", false);
			e.printStackTrace();
		} finally {
			req.getRequestDispatcher("insert-record.jsp").forward(req, resp);
		}
		
	}
}
