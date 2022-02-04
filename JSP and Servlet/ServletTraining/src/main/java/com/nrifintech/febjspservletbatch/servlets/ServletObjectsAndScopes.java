package com.nrifintech.febjspservletbatch.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletObjectsAndScopes extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServletConfig servletConfig = getServletConfig();
		
		String servletName = servletConfig.getServletName();
		System.out.println(servletName);
		
		ServletContext servletContext = servletConfig.getServletContext();
		
		// Setting context attribute
		servletContext.setAttribute("sampleAttribute", "sampleValue");
		System.out.println("Attribute set successfully");
		
		// Setting context init param
//		servletContext.setInitParameter("sampleInitParam", "sampleInitVal");
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String inputName = req.getParameter("name");
		String inputTitle = req.getParameter("title");
		
		System.out.println("inputName - "+inputName);
		System.out.println("inputTitle - "+inputTitle);
		
		try(PrintWriter writer = resp.getWriter();) {
			writer.println("<h1>Personal Information</h1><br/>");
			writer.println("<p><b>Name</b> - "+inputName+"</p>");
			writer.println("<p><b>Title</b> - "+inputTitle+"</p>");
		}
	}
	
}
