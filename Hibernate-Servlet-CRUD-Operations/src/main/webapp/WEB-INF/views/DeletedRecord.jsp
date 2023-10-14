<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete Status</title>
</head>
<body bgcolor="cyan" align="center">
	<c:if test="${result>0}">
		<h1>Record Deleted From Database...</h1>
	</c:if>
	<c:if test="${result==0}">
		<h1>Record Not Deleted From Database...</h1>
	</c:if>
	<a href="index.html">HomePage</a>
</body>
</html>