package com.nrifintech.febjspservletbatch.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		HttpSession session = req.getSession();
		
		System.out.println("Destryoing session object - "+session.getId());
		
		session.invalidate();
		
		resp.sendRedirect(req.getContextPath()+"/login.jsp");
	}
}
