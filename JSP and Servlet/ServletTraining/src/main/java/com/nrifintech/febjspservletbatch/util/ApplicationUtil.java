package com.nrifintech.febjspservletbatch.util;

public class ApplicationUtil {
	private static DBConnectionManager connectionManager;

	public static DBConnectionManager getConnectionManager() {
		return connectionManager;
	}

	public static void setConnectionManager(DBConnectionManager connectionManager) {
		ApplicationUtil.connectionManager = connectionManager;
	}
	
	
}
