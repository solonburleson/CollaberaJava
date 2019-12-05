<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.*,com.collabera.mongo.*, com.collabera.models.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
	<%
	UserMongoDao dao = new UserMongoDao();
	dao.connectToMongo();
	
	String username = request.getParameter("username");
	String password = request.getParameter("password");
	
	User u = dao.findByUserName(username);
	if(u == null || !password.equals(u.getPassword())) {
	%>
	<span>Login credentials invalid.</span>
	<%@ include file="login.jsp" %>
	<% 
	} else {
		session.setAttribute("id", u.getId());
		session.setAttribute("username", u.getUsername());
	%>
	<%@ include file="profile.jsp" %>
	<% } %>
</body>
</html>