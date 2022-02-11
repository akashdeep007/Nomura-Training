<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Include another JSP</title>
</head>
<body>
<%-- <jsp:include page="contentToInclude.jsp"/> --%>
<%@ include file="contentToInclude.jsp" %>
<br/>
<h3>This is not included content</h3>
</body>
</html>