package com.nrifintech.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyFirstServlet extends HttpServlet {

	@Override
	public void init() throws ServletException {
		System.out.println("Intialising Servlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Servlet Served");
	}
	
	@Override
	public void destroy() {
		System.out.println("Servlet Destroyed");
	}
}
