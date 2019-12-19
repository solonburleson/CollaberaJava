<%@ include file="common/header.jspf" %>
<%@ include file="common/nav.jspf" %>
	<div class="container">
		<h1>Add Todo ${name}</h1>
		<form:form method="post" modelAttribute="todo">
			<form:hidden path="id"></form:hidden>
			<form:hidden path="user"></form:hidden>
			<fieldset class="form-group">
				<form:label path="desc">Description:</form:label>
				<form:input class="form-control" type="text" path="desc" required="required" />
				<form:errors path="desc" class="text-danger"></form:errors>
			</fieldset>
			<fieldset class="form-group">
				<form:label path="targetDate">Description:</form:label>
				<form:input class="form-control" type="text" path="targetDate" required="required" />
				<form:errors path="targetDate" class="text-danger"></form:errors>
			</fieldset>
			<input class="btn btn-success" type="submit" value="Add"/>
		</form:form>
	</div>
	
<%@ include file="common/footer.jspf" %>