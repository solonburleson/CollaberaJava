<%@ include file="common/header.jspf" %>
<%@ include file="common/nav.jspf" %>
	<div class="container">
		<h1>Add User</h1>
		<form:form method="post" modelAttribute="user">
			<form:hidden path="id"></form:hidden>
			<fieldset class="form-group">
				<form:label path="userName">User Name:</form:label>
				<form:input class="form-control" type="text" path="userName" required="required" />
				<form:errors path="userName" class="text-danger"></form:errors>
			</fieldset>
			<fieldset class="form-group">
				<form:label path="password">Password:</form:label>
				<form:input class="form-control" type="password" path="password" required="required" />
				<form:errors path="password" class="text-danger"></form:errors>
			</fieldset>
			<fieldset class="form-group">
				<form:label path="fullName">Full Name:</form:label>
				<form:input class="form-control" type="text" path="fullName" required="required" />
				<form:errors path="fullName" class="text-danger"></form:errors>
			</fieldset>
			<fieldset class="form-group">
				<form:label path="roles">Roles:</form:label>
				<form:input class="form-control" type="text" path="roles" required="required" />
				<form:errors path="roles" class="text-danger"></form:errors>
			</fieldset>
			<input class="btn btn-success" type="submit" value="Add"/>
		</form:form>
	</div>
	
<%@ include file="common/footer.jspf" %>