<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Form data</title>
<!-- CSS only -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" 
integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3" crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p" crossorigin="anonymous"></script>
</head>
<body>
	<h3>This is Student application form entry data</h3>
	<hr>
	<div id="studentForm">
		<%-- <form action="saveStudent" method="post">
		<label >Name </label><input type="text" name="name">
		<label >Age </label><input type="number" name="age" >
		<label >Gender </label><input type="text" name="gender" >
		<label >Country </label><select name="country" >
		<c:forEach var="country" items="${countries}">
			 <option value="${country}" label="${country}"/>
		</c:forEach>
		</select>
		<input type="submit" value="Submit">
		</form> --%>
		<c:set var="context" value="${pageContext.request.contextPath}" />
		<form:form action="saveStudent" method="post" modelAttribute="student">
			
			<form:label path="name" >Name<form:input path="name" required="true" /></form:label>
			
			<form:label path="age">Age<form:input path="age" required="true" /></form:label><br>
			<form:label path="gender">Gender
			<form:radiobutton path="gender" value="M" label="Male"/>
			<form:radiobutton path="gender" value="F" label="Female"/>
			
			</form:label>
			<form:label path="country">Country
			
				<form:select path="country" >
					<form:options items="${countries}" />
				</form:select>
			
			</form:label><br>
			<form:label path="skills" >Skills
				<form:checkboxes items="${skillSet}" path="skills"/>
			</form:label><br>
			Student address
			<hr>
			<form:label path="address.streetName" >Street<form:textarea path="address.streetName" rows="5"/></form:label>
			<form:label path="address.city" >City<form:input path="address.city"/></form:label>
			<form:label path="address.pin" >PIN<form:input path="address.pin"/></form:label>
			<br>
			<form:button name="submit" >Submit</form:button>
			<input type="submit" value="Submit" class="btn btn-success">
			<a class="btn btn-primary" href="${context}/allStudents">View All Students</a>
		</form:form>
	</div>
	<div id="country list">
		<%-- Countries : ${countries}
		<select >
		<c:forEach var="country" items="${countries}">
			 <option value="${country}" label="${country}"/>
		</c:forEach>
		</select> --%>
	</div>
</body>
</html>