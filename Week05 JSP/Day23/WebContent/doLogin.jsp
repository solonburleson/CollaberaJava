<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%@include file="links.jsp" %>
	<%
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	
	if(password.equals("admin123")) {
		out.print("You are successfully logged in!");
		out.print("<br>Welcome, " + name);
		
		session.setAttribute("name", name);
	} else {
		out.print("sorry username or password error!");
		RequestDispatcher rd = request.getRequestDispatcher("login.jsp");
		rd.forward(request, response);
	}
	%>
</body>
</html>