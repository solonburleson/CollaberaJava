<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.collabera.day25.dao.*" %>
<%@ page import="com.collabera.day25.models.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Delete</title>
</head>
<body>
	<% 
	EmployeeDao empDao = new EmployeeDao();
	
	int id = Integer.parseInt(request.getParameter("id"));
	
	Employee emp = empDao.getById(id);
	
	empDao.delete(id);
	%>
	<p>Deleted: <%= emp.toString() %></p>
	<a href="view.jsp?page=1">View Employees</a>
</body>
</html>