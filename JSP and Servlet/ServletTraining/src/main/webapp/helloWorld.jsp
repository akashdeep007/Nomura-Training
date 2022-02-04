<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%!
	public void jspInit() {
		System.out.println("JSP Initialized Successfully");
	}

	public void jspDestroy() {
		System.out.println("Destroying JSP Page");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My First JSP</title>
</head>
<body>
<h1>Welcome to JSP&Servlet Course</h1>
<p>This is my first JSP</p>
</body>
</html>