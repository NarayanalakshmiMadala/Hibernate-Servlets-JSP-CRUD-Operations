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

<form action="./DeleteRecordServlet" method="post">
	<c:if test="${student!=null}">
	<table border="2" align="center" >
	<h1 align="center" style=background-color:"grey">Record  Found in the Database</h1>
	<tr><td>First name</td><td>${student.firstname}</td></tr>
	<tr><td>Last name</td><td>${student.lastname}</td></tr>
	<tr><td>Date of birth</td><td>${student.dob}</td></tr>
	<tr><td>Email</td><td>${student.email}</td></tr>
	<tr><td>Course</td><td>${student.course}</td></tr>
	<tr><td>Contact#</td><td>${student.contact}</td></tr>
	<tr><td>User name</td><td>${student.username}</td></tr>
	</table>
	<br/><input type="submit" value="delete">
	</c:if>
	<c:if test="${student==null}">
		<h1>No Record  Found in the Database...</h1>
	</c:if>
	
	</form>
	<h3><a href="index.html">HomePage</a></h3>
</body>
</html>