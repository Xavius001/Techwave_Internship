<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.err
{
color:red;
}

</style>
</head>
<body>
	<f:form action="getvalidEmp" modelAttribute="emp">
		<table>
			<tr>
				<td>Empno</td>
				<td><f:input path="empno" />
				<td><f:errors path="empno" cssClass="err"></f:errors></td>
			</tr>
			<tr>
				<td>Emp Name</td>
				<td><f:input path="empno" />
				<td><f:errors path="ename" cssClass="err"></f:errors></td>
			</tr>

			<tr>
				<td>Job</td>
				<td><f:input path="job" />
				<td><f:errors path="job" cssClass="err"></f:errors></td>
			</tr>
			<tr>
				<td>Mgr</td>
				<td><f:input path="mgr" />
				<td><f:errors path="mgr" cssClass="err"></f:errors></td>
			</tr>
			<tr>
				<td>Hiredate</td>
				<td><f:input path="hiredate" type="date" />
				<td><f:errors path="hiredate" cssClass="err"></f:errors></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td><f:input path="sal" />
				<td><f:errors path="sal" cssClass="err"></f:errors></td>
			</tr>
			<tr>
				<td>Comm</td>
				<td><f:input path="comm" />
				<td><f:errors path="comm" cssClass="err"></f:errors></td>
			</tr>
			<tr>
			<td>Deptno</td>
			<td>
				<f:select path="deptno">
				<f:option value="-1">Select</f:option>
				<a:forEach var="d" items="${dlist}">
					<f:option value="${d.deptno }">${d.deptno}</f:option>
				</a:forEach>
				</f:select>
			</td>
			<td>
				<f:errors path="deptno" cssClass="err"></f:errors>
			</td>
			</tr>
	<tr><td><input type="submit"></td></tr>
		</table>


	</f:form>


</body>
</html>