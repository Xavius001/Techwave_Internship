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
	
	<h1>
		<a:set var="a" value="${105}"/> 
		<a:if test="${a>100}">
			<a:out value="${'number is greater than 100'}"/>
		</a:if>
		<a:set var="b" value="${20}"/> 
		<a:choose>
			<a:when test="${b>90}">
				<a:out value="${'value>90'}"/>
			</a:when>
			
			<a:when test="${b>80}">
				<a:out value="${'value>80'}"/>
			</a:when>
			<a:otherwise>
				<a:out value="${'value<80'}"/>
			</a:otherwise>
		
		</a:choose>
	</h1>
</body>
</html>