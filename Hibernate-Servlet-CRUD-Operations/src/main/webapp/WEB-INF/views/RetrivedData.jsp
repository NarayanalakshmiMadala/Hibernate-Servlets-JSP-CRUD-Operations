<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Retrieved Record</title>
</head>
<body bgcolor="cyan" align="center">
	<table border="2" align="center" >
	<c:if test="${student!=null}">
	<h1 align="center" style=background-color:"grey">Record  Found in the Database</h1>
	<tr><td>First name</td><td>${student.firstname}</td>
	<tr><td>Last name</td><td>${student.lastname}</td>
	<tr><td>Date of birth</td><td>${student.dob}</td>
	<tr><td>Email</td><td>${student.email}</td>
	<tr><td>Course</td><td>${student.course}</td>
	<tr><td>Contact#</td><td>${student.contact}</td>
	<tr><td>User name</td><td>${student.username}</td>
	</c:if>
	<c:if test="${student==null}">
		<h1>No Record  Found in the Database...</h1>
	</c:if>
	</table>
	<br><h3><a href="index.html">HomePage</a></h3>
</body>
</html>