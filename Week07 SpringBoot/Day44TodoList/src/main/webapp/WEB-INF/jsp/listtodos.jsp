<%@ include file="common/header.jspf" %>
<%@ include file="common/nav.jspf" %>

<h1>List Todos for ${userName}</h1>
<a href="/todo">Add new Todo</a>
<div class="container">
	<table class="table table-bordered table-striped table-dark">
		<thead>	
			<tr>
				<th>Description</th>
				<th>Target Date</th>
				<th>Status</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="todo" items="${todos}">
			<tr>
				<td>${todo.desc}</td>
				<td><fmt:formatDate value="${todo.targetDate}" pattern="MM/dd/yyyy" /></td>
				<td>
					<c:if test="${todo.status == true}">
						<p class="text-success">&#10004;</p>
					</c:if>
					<c:if test="${todo.status == false}">
						<p>&#10060;</p>
					</c:if>
				</td>
				<td>
					<a href="/edittodo?id=${todo.id}" role="button" class="btn btn-warning">Edit</a>
					<a href="/deletetodo?id=${todo.id}" role="button" class="btn btn-danger">Delete</a>
				</td>
			</tr>
			</c:forEach>
		</tbody>
	</table>
</div>

<%@ include file="common/footer.jspf" %>