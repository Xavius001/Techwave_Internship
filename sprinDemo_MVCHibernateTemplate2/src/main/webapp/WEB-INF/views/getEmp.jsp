<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="getEmpbyDept">
		<a:out value="${dlist.size()}"></a:out>
		Select the Deptno <select name="dno">
			<option value="-1">Select</option>
			<a:forEach var="d" items="${dlist}">
				<option value="${d.deptno}" ${d.deptno==dno?'selected':''}>
					${d.dname}</option>
			</a:forEach>
		</select> <input type="submit">
		
		<a:choose>
			<a:when test="${dno=='-1'}">
				<a:out value="${'Select the dept'}"></a:out>
			
			</a:when>
		
			<a:when test="${Elist.size()>0}">
			<table>
				<tr>
					<td>Empno</td>
					<td>Ename</td>
				</tr>
				<a:forEach var="e" items="${Elist }">
					<tr>
						<td>${e.empno }</td>
						<td>${e.ename }</td>
					</tr>
				</a:forEach>
			</table>
			</a:when>
			<a:otherwise>
				<a:out value="${'No employess found in dept'}"></a:out>
			</a:otherwise>
		</a:choose>

	</form>

</body>
</html>