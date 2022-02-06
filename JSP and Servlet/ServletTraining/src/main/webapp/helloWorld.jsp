<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.Date" %>

<%!
	public void jspInit() {
		System.out.println("JSP Initialized Successfully");
	}

	public void jspDestroy() {
		System.out.println("Destroying JSP Page");
	}
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>My First JSP</title>
</head>
<body>
<h1>Welcome to JSP&Servlet Course</h1>
<p>This is my first JSP</p>

25 multiplied 4 is <%= 25*4 %>
<br/>
is 75 less than 69 <%= 75<69 %>
<br/>
Today's date is - <%= new Date() %>
<br/>
<%! String someStr = "hello-world"; %>
Uppercase of hello-world is <%= someStr.toUpperCase() %>
<br/>

<%!
	String makeLower(String data) {
		return data.toLowerCase();
	}
%>
Lowercase of hello-world is <%= makeLower("HELLO-WORLD") %>

<br/>

<%
	System.out.print("Hello World from JSP");
	out.println("Hello World from JSP");
%>
<br/>
<ul>
<%
	int i=0;
	for(; i<5; i++) {
%>
<li>i = <%= i %></li>
<%
	}
%>
</ul>

<br/>

<h3>Implicit Object Example - application</h3>
<p>sampleInitParamFromWebXML2 = <%= application.getInitParameter("sampleInitParamFromWebXML2") %></p>
<br/>

<h3>Implicit Object Example - pageContext</h3>
<p>
	setting some in pageContext->requestScope
	<%
	pageContext.setAttribute("requestAttrSetFromPage-helloWorld", "someValue" , PageContext.REQUEST_SCOPE);
	request.getRequestDispatcher("first-servlet").forward(request, response);
	%>
</p>

</body>
</html>