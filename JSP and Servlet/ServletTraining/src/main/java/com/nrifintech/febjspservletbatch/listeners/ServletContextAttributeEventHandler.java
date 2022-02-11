package com.nrifintech.febjspservletbatch.listeners;

import javax.servlet.ServletContextAttributeEvent;
import javax.servlet.ServletContextAttributeListener;

public class ServletContextAttributeEventHandler implements ServletContextAttributeListener {
	@Override
	public void attributeAdded(ServletContextAttributeEvent event) {
		String attributeName = event.getName();
		Object attributeVal = event.getValue();
		
		System.out.println(String.format("%s attribute is added with value - %s", attributeName, attributeVal));
	}
	
	@Override
	public void attributeReplaced(ServletContextAttributeEvent event) {
		String attributeName = event.getName();
		Object attributeVal = event.getValue();
		
		System.out.println(String.format("%s attribute is replaced. Old value - %s", attributeName, attributeVal));
	}
	
	@Override
	public void attributeRemoved(ServletContextAttributeEvent event) {
		String attributeName = event.getName();
		Object attributeVal = event.getValue();
		
		System.out.println(String.format("%s attribute is removed having value - %s", attributeName, attributeVal));
	}
}
