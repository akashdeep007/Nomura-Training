package com.nrifintech.febjspservletbatch.servlets;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("Initializing this servlet");
	}
	
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet Served");
		
		ServletConfig servletConfig = getServletConfig();
		
		String configInitParameter = servletConfig.getInitParameter("firstServletInitParam");
		System.out.println("configInitParameter - "+configInitParameter);
		
		ServletContext servletContext = servletConfig.getServletContext();
		Object attributeVal = servletContext.getAttribute("sampleAttribute");
		System.out.println(attributeVal);
		
		// Reading init parameters from ServletContext
		String initParameterFromWebXml = servletContext.getInitParameter("sampleInitParamFromWebXML");
		System.out.println("initParameterFromWebXml - "+initParameterFromWebXml);
		
		// set in request attribute
		req.setAttribute("sampleReqAttr", "sampleRequestVal");
		System.out.println("sampleReqAttr - "+req.getAttribute("sampleReqAttr"));
	}
	
	@Override
	public void destroy() {
		System.out.println("Destroying this servlet");
	}
	
}
