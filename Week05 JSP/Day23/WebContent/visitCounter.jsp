<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Visit Counter</title>
</head>
<body>
	<% 
	Integer hitsCount = (Integer) application.getAttribute("hitCounter");
	if(hitsCount == null || hitsCount == 0) {
		out.print("welcome to my website");
		hitsCount = 1;
	} else {
		out.println("Welcome back to my website!");
		hitsCount += 1;
	}
	application.setAttribute("hitCounter", hitsCount);
	%>
	<div style="text-align: center;">
		<p>Total number of visits: <%= hitsCount %></p>
	</div>
</body>
</html>