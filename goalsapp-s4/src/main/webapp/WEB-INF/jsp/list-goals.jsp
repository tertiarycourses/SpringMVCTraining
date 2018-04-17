<%@include file="header.jsp"%>

<h1>My Goals</h1>
<table border="1">
	<thead>
		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Target Date</th>
			<th>Description</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach var="goal" items="${myGoals}">
			<tr>
				<td>${goal.id}</td>
				<td>${goal.title}</td>
				<td>${goal.target}</td>
				<td>${goal.description}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>

<%@include file="footer.jsp"%>