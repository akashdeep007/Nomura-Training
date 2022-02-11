package com.nrifintech.febjspservletbatch.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// read request parameter
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		// Creating a new session
		HttpSession httpSession = req.getSession(true);
		
		// Storing information of user in the created session
		httpSession.setAttribute("username", username);
		
		// forwarding user to welcome page by considering credentials are correct
		System.out.println("Session ID - "+httpSession.getId());
		req.getRequestDispatcher("welcome.jsp").forward(req, resp);
	}
}
