<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.collabera.models.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Successful</title>
</head>
<body>
	<% LoginBean bean = (LoginBean) request.getAttribute("bean"); %>
	<h1>Welcome, <%= bean.getName() %></h1>
</body>
</html>