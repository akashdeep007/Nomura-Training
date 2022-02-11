<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Title - <c:if test="${sessionScope.username!=null}">Welcome ${sessionScope.username}</c:if></title>
</head>
<body>
<c:choose>
	<c:when test="${sessionScope.username==null}">
		You are not authorized to access this page. Please login first.
	</c:when>
	
	<c:otherwise>
		Welcome <%= session.getAttribute("username") %><br/>
		Your Session ID - <%= session.getId() %> <hr/>
		<a href="logout">Logout</a>
	</c:otherwise>
</c:choose>
</body>
</html>