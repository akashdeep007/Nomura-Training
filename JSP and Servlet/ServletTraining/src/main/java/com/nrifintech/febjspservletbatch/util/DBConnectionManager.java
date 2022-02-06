package com.nrifintech.febjspservletbatch.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnectionManager {
	
	public DBConnectionManager() {
		try {
			loadDriver();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	private void loadDriver() throws SQLException {
		org.postgresql.Driver postgreSqlDBDriver = new org.postgresql.Driver();
		DriverManager.registerDriver(postgreSqlDBDriver);
	}
	
	public Connection getConnection(String username, String password, String jdbcUrl) throws SQLException {
		return DriverManager.getConnection(jdbcUrl, username, password);
		
	}
}
