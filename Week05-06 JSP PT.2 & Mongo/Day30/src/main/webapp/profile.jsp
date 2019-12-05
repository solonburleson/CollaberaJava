<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
	<a href="employeeList.jsp">Employee List</a>
	<a href="logout.jsp">Logout</a>
	<h1>Welcome, <%= session.getAttribute("username") %></h1>
</body>
</html>