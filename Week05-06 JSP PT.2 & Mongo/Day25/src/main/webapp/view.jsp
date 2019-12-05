<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.collabera.day25.dao.*" %>
<%@ page import="com.collabera.day25.models.*" %>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee List</title>
<style type="text/css">
	a {
		margin: 0 2px;
		color: blue;
	}
	table{
		border: 2px solid black;
	}
	td{
		border: 1px solid black;
		width: 25%;
	}
	th{
		border: 1px solid black;
	}
	.active{
		background-color: lightgreen;
		color: white;
	}
	#pagination>a {
		font-size: 36px;
		text-decoration: none;
		padding: 5px;
	}
	#pagination>h3 {
		display: inline-block;
	}
	#pagination>a:hover {
		border: 2px solid lightgreen;
	}
	#pagination {
		margin: 10px 0;
	}
	tr:nth-child(even) {
		background-color: lightblue;
	}
	th {
		background-color: tan;
		color: red;
	}
</style>
</head>
<body>
	<h1>Page #<%= request.getParameter("page") %></h1>
	<a href="update.jsp?id=-1">Add Employee</a>
	<%
	String size = request.getParameter("pageSize");
	int pageSize;
	if(size == null){
		pageSize = 1;
	} else {
		pageSize = Integer.parseInt(size);
	}
	int pageNum = Integer.parseInt(request.getParameter("page"));
	%>
	<form>
		<select name="pageSize" onchange="this.form.submit()">
			<option value="1" <% if(pageSize == 1) out.print("selected"); %>>1</option>
			<option value="3" <% if(pageSize == 3) out.print("selected"); %>>3</option>
			<option value="5" <% if(pageSize == 5) out.print("selected"); %>>5</option>
			<option value="7" <% if(pageSize == 7) out.print("selected"); %>>7</option>
		</select>
		<input type="hidden" name="page" value="<%= pageNum %>" />
	</form>
	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>FirstName</th>
				<th>LastName</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<%
			EmployeeDao empDao = new EmployeeDao();
			
			List<Employee> list = empDao.getList(pageNum, pageSize);
			
			for(Employee e : list) {
			%>
			<tr>
				<td><%= e.getId() %></td>
				<td><%= e.getFirstName() %></td>
				<td><%= e.getLastName() %></td>
				<td>
					<a href="delete.jsp?id=<%= e.getId() %>">Delete</a>
					<a href="update.jsp?id=<%= e.getId() %>">Update</a>
				</td>
			</tr>
			<% } %>
		</tbody>
	</table>
	<div id="pagination">
	<h3>Pages :</h3>
		<%
		int pages = empDao.getTotalRecords() / pageSize;
		int rem = empDao.getTotalRecords() % pageSize;
		
		if(rem > 0){
			pages += 1;
		}
		
		for(int i = 1; i <= pages; i++){
			if(i == pageNum && pageSize == 1){
		%>
				<a class="active" href="view.jsp?page=<%= i  %>"><%= i %></a>
			<%
			} else if(i == pageNum) {
			%>
				<a class="active" href="view.jsp?page=<%= i  %>&pageSize=<%= pageSize %>"><%= i %></a>
			<% } else if(pageSize != 1 && i != pageNum) { %>	
				<a href="view.jsp?page=<%= i  %>&pageSize=<%= pageSize %>"><%= i %></a>
			<% } else { %>
				<a href="view.jsp?page=<%= i  %>"><%= i %></a>
		<%
			}
		}
		%>
	</div>
</body>
</html>