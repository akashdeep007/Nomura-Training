package com.nrifintech.febjspservletbatch.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TakeForwardedRequestServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("Got request in TakeForwardedRequestServlet");
		Object reqAttribute = req.getAttribute("forwardRequestAttr");
		System.out.println("forwardRequestAttr "+reqAttribute);
	}
}
