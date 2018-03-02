<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %><html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Home Page</title>
</head>
<body>
	${message}


	<div style="width: 400px;">
		
			<h1 style="color: red;">Welcome <security:authentication property="name"/></h1>
			
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

				<li>List all the Scholars by last name: <a
					href="${pageContext.request.contextPath}/scholar/search"
					style="color: blue">Search</a></li>
			</ul>
	</div>

	<!-- <a href="/add">Add Data</a>
	<a href="/list">List Data</a> -->


</body>
</html>