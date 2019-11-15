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
	Employee emp = new Employee(-1,"","");
	
	if(id > 0){
		emp = empDao.getById(id);
	}
	%>
	<h1>Add/Update Employee</h1>
	<form action="doUpdate.jsp" method="POST">
		<input type="hidden" name="id" value="<%= emp.getId() %>" />
		<div>
			<label for="firstName">First Name:</label>
			<input type="text" name="firstName" value="<%= emp.getFirstName() %>" />
		</div>
		<div>
			<label for="lastName">Last Name:</label>
			<input type="text" name="lastName" value="<%= emp.getLastName() %>" />
		</div>
		<input type="submit" />
	</form>
	<a href="view.jsp?page=1">View Employees</a>
</body>
</html>