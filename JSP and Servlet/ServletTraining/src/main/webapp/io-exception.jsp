<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>IO-Exception Error Handler</title>
</head>
<body>
	IO-Exception occurred. Exception - <% exception.printStackTrace(new java.io.PrintWriter(out)); %> 
</body>
</html>