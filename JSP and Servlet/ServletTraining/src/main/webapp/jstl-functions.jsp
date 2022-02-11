<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>
<%@ taglib prefix="mt" uri="/WEB-INF/tld/myTagLibrary" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JSTL Functions</title>
</head>
<body>
	<c:set var="strVar" value="Hello Wrold"/>
	<!-- contains -->
	<c:if test="${fn:contains(strVar, 'world')}">
		Found world in "hello world"
	</c:if>
	<c:if test="${fn:contains('hello', 'world')}">
		Found world in "hello"
	</c:if>
	
	<br/>
	
	<!-- containsIgnoreCase -->
	<c:if test="${fn:containsIgnoreCase('hello world', 'WORLD')}">
		Found WORLD in "hello world"
	</c:if>
	
	<br/>
	
	<!-- endsWith -->
	<c:if test="${fn:endsWith('hello world', 'world')}">
		"hello world" is ending with 'world'
	</c:if>
	
	<br/>
	
	<!-- startsWith -->
	
	<!-- trim -->
	${fn:trim(' anjali ')}
	
	<br/>
	
	<!-- substring -->
	${fn:substring('hello world', 7,9)}
	
	<br/>
	
	${mt:getSum(2,3)}
	
</body>
</html>