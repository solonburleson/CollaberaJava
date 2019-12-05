<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.collabera.day25.dao.*" %>
<%@ page import="com.collabera.day25.models.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
	<% 
	EmployeeDao empDao = new EmployeeDao();
	
	int id = Integer.parseInt(request.getParameter("id"));
	String firstName = request.getParameter("firstName");
	String lastName = request.getParameter("lastName");
	
	Employee emp = new Employee(id,firstName,lastName);
	emp = empDao.insert(emp);
	%>
	<p>Added: <%= emp.toString() %></p>
	<a href="view.jsp?page=1">View Employees</a>
</body>
</html>