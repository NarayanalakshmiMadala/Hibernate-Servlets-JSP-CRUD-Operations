<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<body bgcolor="cyan" align="center">
	<table border="2" align="center" >
	<h1 align="center" style=background-color:"grey">Student Records</h1>
	<tr><th>First name</th><th>Last name</th><th>DateOfBirth</th><th>Email</th><th>Contact#</th><th>Course</th><th>User name</th><th>Password</th></tr>
	<c:forEach items="${stds}" var="student">
		<tr><td>${student.firstname}</td><td>${student.lastname}</td><td>${student.dob}</td><td>${student.email}</td><td>${student.contact}</td><td>${student.course}</td><td>${student.username}</td><td>${student.password}</td></tr>
	</c:forEach>
	</table>
	<br><h3><a href="index.html">HomePage</a></h3>
</body>

</body>
</html>