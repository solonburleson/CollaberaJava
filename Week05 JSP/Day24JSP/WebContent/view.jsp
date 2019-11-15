<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.collabera.day24JSP.dao.*" %>
<%@ page import="com.collabera.day24JSP.models.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
</head>
<body>
	<h1>Page #<%= request.getParameter("page") %></h1>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>FirstName</th>
				<th>LastName</th>
			</tr>
		</thead>
		<tbody>
			<%
			int pageSize = 5;
			int pageNum = Integer.parseInt(request.getParameter("page"));
			EmployeeDao empDao = new EmployeeDao();
			
			List<Employee> empList = empDao.getList(pageNum,pageSize);
			for(Employee e : empList) {
				out.print("<tr><td>" + e.getId() + "</td><td>" + e.getFirstName() + "</td><td>" + e.getLastName() + "</td></tr>");
			}
			%>
		</tbody>
	</table>
	<a href="view.jsp?page=1">1</a>
	<a href="view.jsp?page=2">2</a>
	<a href="view.jsp?page=3">3</a>
	<a href="view.jsp?page=4">4</a>
</body>
</html>