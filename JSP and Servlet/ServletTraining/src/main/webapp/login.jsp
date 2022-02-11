<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login.jsp</title>
</head>
<body>
	<!-- If the user is already logged in, redirect the user to welcome.jsp -->
	<form action="doLogin" method="post">
		Username : <input type="text" name="username"/> <br/>
		Password: <input type="password" name="password"/> <br/>
		<input type="submit" value="Submit"/>
	</form>
</body>
</html>