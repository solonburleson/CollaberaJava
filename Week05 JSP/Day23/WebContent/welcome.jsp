<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Welcome</title>
</head>
<body>
	<%
	String name = request.getParameter("uname");
	out.print("Welcome, " + name);
	out.print("<br>HTTP Request: " + request.getMethod());
	%>
	
	<% 
	String dname = config.getInitParameter("dname");
	out.print("<hr>Initialized name: " + dname);
	%>
</body>
</html>