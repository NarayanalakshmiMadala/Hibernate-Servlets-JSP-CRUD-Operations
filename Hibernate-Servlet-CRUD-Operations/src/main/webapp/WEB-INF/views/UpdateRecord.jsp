<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="cyan" align="center">
<c:if test="${student!=null}">
	<form action="UpdateConfirmServlet" method="post">
	
	<table border="2" align="center" >
	<h1 align="center" style=background-color:"grey">Record  Found in the Database</h1>
	<tr><td>First name</td><td><input type="text" name="fname" value=${student.firstname}></input></td>
	<tr><td>Last name</td><td><input type="text" name="lname" value=${student.lastname}></input></td>
	<tr><td>Date of birth</td><td><input type="date" name="dob" value=${student.dob}></input></td>
	<tr><td>Email</td><td><input type="email" name="email" value=${student.email}></input></td>
	<tr><td>Course</td><td><input type="text" name="course" value=${student.course}></input></td>
	<tr><td>Contact#</td><td><input type="tel" name="contact" value=${student.contact}></input></td>
	<tr><td>User name</td><td><input type="text" name="uname" value=${student.username} readonly="readonly"></input></td>
	<tr><td>Password</td><td><input type="password" name="passwd" value=${student.password}></input></td>
	</table>
	<br><input type="submit" value="Update">
	
	</form>	
</c:if>
<c:if test="${student==null}">
	<h1 align="center" style=background-color:"grey">Record Not Found in database to Update</h1>
	</c:if>
	<br><h3><a href="index.html">HomePage</a></h3>
</body>
</html>