<%@page import="java.io.IOException"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="/error-500.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>This will throw exception</title>
</head>
<body>

</body>
</html>

<%
	throw new RuntimeException("Sample exception thrown from throwError.jsp");
%>