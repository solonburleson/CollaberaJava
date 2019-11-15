<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hello JSP</title>
</head>
<% int count = 0; %>
<body>
<%@ page errorPage="error.jsp" %>
	<% out.print("<h2>Welcome to JSP!</h2>"); %>
	<% out.println(++count); 
	int i = 5/0;
	%>
</body>
</html>