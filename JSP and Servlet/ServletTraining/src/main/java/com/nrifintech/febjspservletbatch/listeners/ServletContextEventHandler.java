package com.nrifintech.febjspservletbatch.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import com.nrifintech.febjspservletbatch.util.ApplicationUtil;
import com.nrifintech.febjspservletbatch.util.DBConnectionManager;

public class ServletContextEventHandler implements javax.servlet.ServletContextListener {
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		DBConnectionManager dbConnectionManager = new DBConnectionManager();
		ApplicationUtil.setConnectionManager(dbConnectionManager);
		
		System.out.println("Application context initialized successfully");
	}
	
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		ApplicationUtil.setConnectionManager(null);
		
		System.out.println("Destroying application...");
	}
}
