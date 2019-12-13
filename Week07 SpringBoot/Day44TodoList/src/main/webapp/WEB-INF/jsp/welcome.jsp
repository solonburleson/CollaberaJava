<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Todo App</title>
<link href="webjars/bootstrap/4.4.1/css/bootstrap.min.css" rel="stylesheet">
</head>
<body>
	<nav class="navbar navbar-expand-lg navbar-light">
	  <a class="navbar-brand" href="#">Logo</a>
	
	  <div class="collapse navbar-collapse" id="navbarSupportedContent">
	    <ul class="navbar-nav">
	      <li class="nav-item active">
	        <a class="nav-link" href="/welcome">Welcome</span></a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="/listtodos">Todos</a>
	      </li>
	  </div>
	</nav>
	<h1>Welcome ${name}</h1>
	
	<script src="webjars/jquery/3.3.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/4.4.1/js/bootstrap.min.js"></script>
</body>
</html>