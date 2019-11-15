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
	Employee emp = new Employee(-1,"","");
	String readonly= "";
	
	if(id >= 0){
		readonly = "readonly";
		emp = empDao.getById(id);
	}
	%>
	<h1>Add/Update Employee</h1>
	<form action="doUpdate.jsp" method="POST">
		<div>
			<label for="id">ID:</label>
			<input type="text" name="id" value="<%= id %>" <%= readonly %>/>
		</div>
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