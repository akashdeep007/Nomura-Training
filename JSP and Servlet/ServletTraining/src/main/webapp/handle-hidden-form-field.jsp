<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Handle hidden form field</title>
</head>
<body>
	Username - <%= request.getParameter("username")%>
	<br/>
	<form action="" method="post">
		<input type="hidden" name="username" value="<%= request.getParameter("username")%>"/>
		<input type="submit" value="Submit"/>		
	</form>
</body>
</html>