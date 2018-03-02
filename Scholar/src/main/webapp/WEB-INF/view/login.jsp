<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Login Page</h1>
	<c:url var="loginVal" value="/login"/>
	<form method="post" action="${loginVal}">
		<table>
			<tr>
				<td> User Name</td>
				<td> <input type="text" name="username"/></td>				
			</tr>
			<tr>
				<td> Password</td>
				<td> <input type="password" name="password"/></td>								
			</tr>
			<tr>
				<td> 
					<input type="hidden" value="${_csrf.token}" name="${_csrf.parameterName}"/>
					<input type="submit" value="Login"/>
				</td>								
			</tr>
		</table>
	</form>
</body>
</html>