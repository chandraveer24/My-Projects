<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>Search</title>
	</head> 
	<body>
		<h1>Enter Last Name To Search All The Scholars</h1>
		 
		<form:form modelAttribute="lastName" method="POST" action="${pageContext.request.contextPath}/scholar/lnameSearch1">
			<table>
				<tbody>
					<tr>
						<td>Last Name</td>
						<td><form:input path="lastName"/></td>
					</tr>			
				</tbody>
			</table>
			<input type="submit" value="Search"/>
		</form:form>
		
		
		<a href="${pageContext.request.contextPath}/">Go back to Home</a><br/>				
	</body>
</html>


