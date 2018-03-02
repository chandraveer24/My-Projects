<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
<meta charset="utf-8">
<title>Add Scholar</title>
</head>
<body>
	<fieldset style="width: 350px;">
		<legend>Add Scholar</legend>



		<form:form modelAttribute="scholar" method="POST"
			action="${pageContext.request.contextPath}/scholar/create">
			<table>
				<tbody>
					<tr>
						<td>First Name</td>
						<td><form:input path="firstName" /></td>
					</tr>
					<tr>
						<td>Last Name</td>
						<td><form:input path="lastName" /></td>
					</tr>
					<tr>
						<td>Email Id</td>
						<td><form:input path="emailId" /></td>
					</tr>
				</tbody>
			</table>
			<input type="submit" value="Add" />
		</form:form>

	</fieldset>
	<br />
	<br />
	<a href="${pageContext.request.contextPath}/">Go back to Home</a>
	
</body>
</html>


