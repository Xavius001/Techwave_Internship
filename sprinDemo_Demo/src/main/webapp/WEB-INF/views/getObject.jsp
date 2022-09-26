<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Project ID</th>
			<th>Project Desc</th>
			<th>Duration</th>
		</tr>
		<tr>
			<td>${project.getProjectId()}</td>
			<td>${project.projectDec}</td>
			<td>${project.duration}</td>
		</tr>
	</table>
</body>
</html>