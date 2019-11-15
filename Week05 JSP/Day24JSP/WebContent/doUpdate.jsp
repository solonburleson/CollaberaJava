<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.collabera.day24JSP.dao.*" %>
<%@ page import="com.collabera.day24JSP.models.*" %>
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
	Employee emp2 = empDao.insert(emp);
	%>
	<p>Added: <%= emp2.toString() %></p>
	<a href="view.jsp?page=1">View Employees</a>
</body>
</html>