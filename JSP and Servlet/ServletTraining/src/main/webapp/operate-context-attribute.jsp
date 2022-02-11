<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ContextAttribute Event Example</title>
</head>
<body>
<% application.setAttribute("name", "mayank"); %>
Attribute set successfully <br/>
<% application.setAttribute("name", "disha"); %>
Attribute replaced successfully <br/>
<% application.removeAttribute("name"); %>
Attribute removed successfully
</body>
</html>