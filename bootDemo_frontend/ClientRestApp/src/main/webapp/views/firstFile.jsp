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
			<td>VendorId</td>
			<td>Name</td>
			<td>Date of Registration</td>
			<td>Duration</td>
		</tr>
		<c:forEach var="v" items="${vlist}">
			<tr>
				<td>${v.vendorId}</td>
				<td>${v.name}</td>
				<td>${v.dateofRegitration}</td>
				<td>${v.durationinDays}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>