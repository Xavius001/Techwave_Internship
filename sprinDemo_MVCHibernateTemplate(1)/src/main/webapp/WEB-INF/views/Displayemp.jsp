<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="">
		<table>
			<tr>
				<th>Empno</th>
				<th>Emp Name</th>
				<th>Job</th>
				<th>Mgr</th>
				<th>HireDate</th>
				<th>Sal</th>
				<th>Comm</th>
				<th>Deptno</th>
			</tr>
			<c:forEach var="e" items="${lemp}">
				<tr>
					<td>${e.empno}</td>
					<td>${e.ename}</td>
					<td>${e.job}</td>
					<td>${e.mgr}</td>
					<td>${e.hiredate}</td>
					<td>${e.sal}</td>
					<td>${e.comm}</td>
					<td>${e.deptno}</td>
				</tr>




			</c:forEach>

		</table>



	</form>

</body>
</html>