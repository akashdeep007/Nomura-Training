<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>All Student</title>
<!-- CSS only -->
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3"
	crossorigin="anonymous">
<!-- JavaScript Bundle with Popper -->
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js"
	integrity="sha384-ka7Sk0Gln4gmtz2MlQnikT1wXgYsOg+OMhuP+IlRH9sENBO0LRn5q+8nbTov4+1p"
	crossorigin="anonymous"></script>
</head>
<body>
<c:set var="context" value="${pageContext.request.contextPath}" />
	<c:choose>
		<c:when test="${not empty allStudents}">
			<h3>Student Data</h3>
			<table class="table table-bordered"">
				<thead class="thead-dark">
					<tr>
						<th>Id</th>
						<th>Name</th>
						<th>Gender</th>
						<th>Age</th>
						<th>Skills</th>
						<th>Country</th>
						<th>StreetName</th>
						<th>City</th>
						<th>Pincode</th>
					</tr>
				</thead>
				<tbody>
					<c:forEach items="${allStudents}" var="Eachstudent">
						<tr>
							<td>${Eachstudent.key}</td>
							<td>${Eachstudent.value.name}</td>
							<td>${Eachstudent.value.gender}</td>
							<td>${Eachstudent.value.age}</td>
							<td>${Eachstudent.value.skills}</td>
							<td>${Eachstudent.value.country}</td>

							<td>${Eachstudent.value.address.streetName}</td>
							<td>${Eachstudent.value.address.city}</td>
							<td>${Eachstudent.value.address.pin}</td>
						</tr>
					</c:forEach>

				</tbody>

			</table>
			<div class="text-center">
				<a class="btn btn-primary" href="${context}">Add more Students</a>
			</div>
		</c:when>
		<c:otherwise>
			<div class="text-center ">
				<h3>No Student Data is present</h3>
				<br> <a class="btn btn-primary" href="${context}">Add a
					Student</a>
			</div>
		</c:otherwise>
	</c:choose>
</body>
</html>