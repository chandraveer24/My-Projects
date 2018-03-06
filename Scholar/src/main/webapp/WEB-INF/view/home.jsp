<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
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
	${message}

	<h1 style="color: red; text-align: center;">
		Welcome
		<security:authentication property="name" />
	</h1>
	

	<div class="topnav" style="margin-top: 10px;">
		<a class="active" href="${pageContext.request.contextPath}/scholar/list">List Data</a>
		<a href="${pageContext.request.contextPath}/scholar/json/search">Search Last Name in JSON Format</a> 
		<a href="${pageContext.request.contextPath}/scholar/search1">Search Last Name in Table Format</a>
		<security:authorize access="hasRole('ROLE_ADMIN')">
		<a href="${pageContext.request.contextPath}/scholar/add">Add a Scholar</a>
		</security:authorize>
		<a style="float:right;" href="${pageContext.request.contextPath}/logout">Log out</a>
	</div>
	
	<!-- 
	<div style="width: 450px;">

		<h1 style="color: red;">
			Welcome
			<security:authentication property="name" />
		</h1>

		<security:authorize access="hasRole('ROLE_ADMIN')">
				Add scholar: <a
				href="${pageContext.request.contextPath}/scholar/add"
				style="color: blue">Add Data</a>
		</security:authorize>
		<ul>
			<li>Display data: <a
				href="${pageContext.request.contextPath}/scholar/list"
				style="color: blue">List Data</a>
			</li>

			<li>List all the Scholars by last name  in JSON Format: <a
				href="${pageContext.request.contextPath}/scholar/json/search"
				style="color: blue">Search</a></li>

			<li>List all the Scholars by last name: <a
				href="${pageContext.request.contextPath}/scholar/search1"
				style="color: blue">Search</a></li>
		</ul>
	</div>
 -->
	<!-- <a href="/add">Add Data</a>
	<a href="/list">List Data</a> -->


</body>
</html>