<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>Team List</title>
</head>
<body>
	<h1 style="margin-top: 25px; text-align: center;">Team List</h1>
	<table border="1" align="center">
		<thead>
			<tr>
				<th>ID</th>
				<th>Name</th>
				<th>Ranking</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.id}</td>
					<td>${list.name}</td>
					<td>${list.ranking}</td>
					<td><a href="/edit/${list.id}">Edit</a>| <a
						href="/delete/${list.id}">Delete</a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<div style="margin-top: 25px; width: 450px;">
		<fieldset>
			<legend style="color: blue; font-size: 18px;">Add Team</legend>

			<form:form modelAttribute="team" method="POST" action="/add">

				<label>Team Name</label>
				<form:input path="name" placeholder="Team Name..." /><br>

				<label>Ranking</label>
				<form:input path="ranking" placeholder="Ranking" /><br>

				<input type="submit" value="Add" />
			</form:form>

		</fieldset>

	</div>

</body>
</html>
