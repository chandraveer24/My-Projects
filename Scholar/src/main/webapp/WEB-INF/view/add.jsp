<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="security"
	uri="http://www.springframework.org/security/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8">
<title>Add Scholar</title>
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

input[type=text] {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

label, legend
{
	font-weight: bolder;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
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
	
<div style="margin-top:25px;">
		<fieldset>
			<legend style="color:blue; font-size: 18px;">Add Scholar</legend>

			<form:form modelAttribute="scholar" method="POST"
				action="${pageContext.request.contextPath}/scholar/create">
							<label>First Name</label>
							<form:input path="firstName" placeholder="Your Name..."/>
						
						    <label>Last Name</label>
							<form:input path="lastName" placeholder="Your Last Name..."/>
						
						    <label>Email Id</label>
							<form:input path="emailId" placeholder="Your Email..."/>
						
				<input type="submit" value="Add" />
			</form:form>

		</fieldset>

	</div>
	<!--  <br />
	<br />
	<a href="${pageContext.request.contextPath}/">Go back to Home</a>-->

</body>
</html>


