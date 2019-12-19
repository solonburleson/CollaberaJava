<%@ include file="common/header.jspf" %>
<%@ include file="common/nav.jspf" %>

<h1>List All Users</h1>
<a href="/user">Add new User</a>
<div class="container">
	<table class="table table-bordered table-striped table-dark">
		<thead>	
			<tr>
				<th>ID</th>
				<th>UserName</th>
				<th>Password</th>
				<th>Full Name</th>
				<th>Roles</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="user" items="${users}">
			<tr>
				<td>${user.id}</td>
				<td>${user.userName}</td>
				<td>${user.password}</td>
				<td>${user.fullName}</td>
				<td>${user.roles}</td>
				<td>
					<a href="/edituser?id=${user.id}" class="btn btn-warning">Edit</a>
					<a href="/deleteuser?id=${user.id}" class="btn btn-danger">Delete</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<%@ include file="common/footer.jspf" %>