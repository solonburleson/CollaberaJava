<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>List Todos</title>
<link href="webjars/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light">
	  <a class="navbar-brand" href="#">Logo</a>
	
	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav">
	      <li class="nav-item">
	        <a class="nav-link" href="/welcome">Welcome</span></a>
	      </li>
	      <li class="nav-item active">
	        <a class="nav-link" href="/listtodos">Todos</a>
	      </li>
	  </div>
	</nav>
	<h1>List Todos for ${userName}</h1>
	<a href="/todo">Add new Todo</a>
	<div class="container">
		<table class="table table-bordered table-striped table-dark">
			<thead>	
				<tr>
					<th>Description</th>
					<th>Target Date</th>
					<th>Status</th>
					<th>Action</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach var="todo" items="${todos}">
				<tr>
					<td>${todo.desc}</td>
					<td>${todo.targetDate}</td>
					<td>
						<c:if test="${todo.status == true}">
							<p class="text-success">&#10004;</p>
						</c:if>
						<c:if test="${todo.status == false}">
							<p>&#10060;</p>
						</c:if>
					</td>
					<td><a href="/deletetodo?id=${todo.id}" role="button" class="btn btn-danger">Delete</a></td>
				</tr>
				</c:forEach>
			</tbody>
		</table>
	</div>
	<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>