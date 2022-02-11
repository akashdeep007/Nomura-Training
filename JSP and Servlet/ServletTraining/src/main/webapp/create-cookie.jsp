<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create a Cookie here</title>
</head>
<body>
	<%
		Cookie cookie = new Cookie("username", "anjali");
		response.addCookie(cookie);
		
		out.print("cookie created successfully");
	%>
</body>
</html>