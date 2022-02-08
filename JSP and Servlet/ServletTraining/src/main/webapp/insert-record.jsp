<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert Record</title>
</head>
<body>

<%
	if(request.getAttribute("isInserted")==null) {
%>

<!-- Display html form -->
<form action="jdbc-connection-servlet" method="post">
	Username : <input type="text" name="username"/> <br/>
	Password: <input type="password" name="password"/> <br/>
	<input type="submit" value="Submit"/>
</form>

<%
	} else if((boolean)request.getAttribute("isInserted")) {
%>

<!-- Display success message -->
<%= request.getParameter("username") %> inserted successfully in the DB

<%	
	} else {	
%>

<!-- Display error message -->
Something went wrong with this user - <%= request.getParameter("username") %>

<%
	}
%>

</body>
</html>