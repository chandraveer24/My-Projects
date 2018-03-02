<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Scholar List</title>
	</head> 
	<body>
		<h1>Scholar List</h1>
		<table border="2">
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
						<td>
						  <a href="${pageContext.request.contextPath}/scholar/edit/${list.id}">Edit</a>|
						  <a href="${pageContext.request.contextPath}/scholar/delete/${list.id}">Delete</a>						 	
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<a href="${pageContext.request.contextPath}/">Go back to Home</a><br/>		
	</body>
</html>
