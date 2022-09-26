<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
		<c:forEach var="p" items="${projectlist}">
			<tr>
				<td>${p.getProjectId()}</td>
				<td>${p.projectDec}</td>
				<td>${p.duration}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>