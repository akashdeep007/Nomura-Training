package com.nrifintech.febjspservletbatch.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ForwardMeServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setAttribute("forwardRequestAttr", "SampleVal");
		System.out.println("Got request in ForwardMeServlet");
		req.getRequestDispatcher("/serve-forwarded-request").forward(req, resp);
	}
}
