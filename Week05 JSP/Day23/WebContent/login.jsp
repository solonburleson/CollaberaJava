<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
<style>
	form label{
		display: inline-block;
		width: 100px;
	}
</style>
</head>
<body>
	<form action="doLogin.jsp" method="POST">
		<div>
			<label for="name">Name:</label>
			<input type="text" name="name" />
		</div>
		<div>
			<label for="password">Password:</label>
			<input type="password" name="password" />
		</div>
		<input type="submit" />
	</form>
</body>
</html>