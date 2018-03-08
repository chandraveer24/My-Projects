<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div style="margin-top: 25px;">
		<fieldset>
			<legend style="color: blue; font-size: 18px;">Update Team</legend>

			<form:form modelAttribute="team" method="POST" action="/update">

				<form:input type="hidden" path="id" />
				<label>Team Name</label>
				<form:input path="name" placeholder="Team Name..." />

				<label>Ranking</label>
				<form:input path="ranking" placeholder="Ranking" />

				<input type="submit" value="Update" />
			</form:form>
		</fieldset>
</div>

</body>
</html>