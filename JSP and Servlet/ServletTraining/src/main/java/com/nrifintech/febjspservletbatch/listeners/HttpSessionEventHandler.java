package com.nrifintech.febjspservletbatch.listeners;

import java.util.Enumeration;

import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

public class HttpSessionEventHandler implements HttpSessionListener {
	@Override
	public void sessionCreated(HttpSessionEvent event) {
		System.out.println("Creating a session object");
	}
	
	@Override
	public void sessionDestroyed(HttpSessionEvent event) {
		HttpSession session = event.getSession();
		System.out.println("Destroying session...");
		System.out.println("Printing all information from session");
		Enumeration<String> attributeNames = session.getAttributeNames();
		while(attributeNames.hasMoreElements()) {
			String attributeName = attributeNames.nextElement();
			System.out.println(String.format("%s -> %s", attributeName, session.getAttribute(attributeName)));
		}
	}
}
