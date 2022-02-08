<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Examples</title>
</head>
<body>
<c:set var="someAttr" value="someVal" />
<c:out value="${someAttr}"/>
<br/>
25*5 = <c:out value="${25*5}"/>
<br/>
<c:set var="requestAttr" value="requestVal" scope="request"/>
${requestScope.requestAttr}
<br/>
<c:if test="${3<2}">
	This line will not come in browser
</c:if>
<br/>
<c:choose>
	<c:when test="${3<2}">
		3>2 = true
	</c:when>
	<c:when test="${2>3}">
		2>3 = false
	</c:when>
	<c:otherwise>
		Atleast we get a message
	</c:otherwise>
</c:choose>

<br/>
<c:forEach var="i" items="1,2,3,4,5,6,7,8">
	${i}<br/>
</c:forEach>
<br/>
<c:forEach begin="0" end="6" var="i">
	${i}<br/>
</c:forEach>
<%
	List<String> strList = new ArrayList<>();
	strList.add("ankan");
	strList.add("krishendu");
	strList.add("anjali");
	strList.add("disha");
	request.setAttribute("strList", strList);
%>
<br/>
<c:forEach items="${requestScope.strList}" var="name">
	${name}<br/>
</c:forEach>

<br/>

Today's Date is - <fmt:formatDate value="<%= new java.util.Date() %>" pattern="dd/MM/yyyy HH:mm" timeZone="IST"/>
<br/>
<fmt:parseDate value="06/02/2022" pattern="dd/MM/yyyy" var="parsedDate"/>
Parsed Date is - ${parsedDate} <br/>
<br/>
<fmt:formatNumber value="123456678" type="currency" currencyCode="INR"/>
<br/>
Length of 'debopam' is - ${fn:length('debopam')}
</body>
</html>