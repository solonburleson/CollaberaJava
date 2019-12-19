<%@ include file="common/header.jspf" %>
<%@ include file="common/nav.jspf" %>

<h1>Custom Login page</h1>

<c:if test="${not empty errorMessage}" >
	<div style="color:red;">${errorMessage}</div>
</c:if>

<form name="login" action="/login" method="POST">
	<fieldset>
		<label for="username">User name:</label>
		<input type="text" name="username" />
	</fieldset>
	<fieldset>
		<label for="password">Password:</label>
		<input type="password" name="password" />
	</fieldset>
		<input type="submit" />
</form>

<%@ include file="common/footer.jspf" %>