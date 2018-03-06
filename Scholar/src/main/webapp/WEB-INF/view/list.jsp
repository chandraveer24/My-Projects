<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags"%>

<html>
<head>
<meta charset="utf-8">
<title>Scholar List</title>
<style type="text/css">
.topnav {
	overflow: hidden;
	background-color: #333;
}

.topnav a {
	float: left;
	color: #f2f2f2;
	text-align: center;
	padding: 14px 16px;
	text-decoration: none;
	font-size: 17px;
}

.topnav a:hover {
	background-color: #ddd;
	color: black;
}

.topnav a.active {
	background-color: #4CAF50;
	color: white;
}
</style>
</head>
<body>
	<h1 style="color: red; text-align: center;">
		Welcome
		<security:authentication property="name" />
	</h1>


	<div class="topnav" style="margin-top: 10px;">
		<a class="active"
			href="${pageContext.request.contextPath}/scholar/list">List Data</a>
		<a href="${pageContext.request.contextPath}/scholar/json/search">Search
			Last Name in JSON Format</a> <a
			href="${pageContext.request.contextPath}/scholar/search1">Search
			Last Name in Table Format</a>
		<security:authorize access="hasRole('ROLE_ADMIN')">
			<a href="${pageContext.request.contextPath}/scholar/add">Add a
				Scholar</a>
		</security:authorize>
		<a style="float: right;"
			href="${pageContext.request.contextPath}/logout">Log out</a>
	</div>

	<h1 style="margin-top: 25px; text-align: center;">Scholar List</h1>
	<table border="1" align="center">
		<thead>
			<tr>
				<th>ID</th>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email Id</th>
				<th>Action</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${list}" var="list">
				<tr>
					<td>${list.id}</td>
					<td>${list.firstName}</td>
					<td>${list.lastName}</td>
					<td>${list.emailId}</td>
					<td><a
						href="${pageContext.request.contextPath}/scholar/edit/${list.id}">Edit</a>|
						<a
						href="${pageContext.request.contextPath}/scholar/delete/${list.id}">Delete</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>
