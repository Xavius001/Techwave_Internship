<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<f:form action="getBook" modelAttribute="book">
<table>
	<tr><td>Bookid</td><td><f:input path="bookid"/> </td></tr>
	<tr><td>Bookname</td><td><f:input path="bookname"/> </td></tr>
	<tr><td>Date of Publication</td><td><f:input path="dop" type="date"/> </td></tr>
	<tr><td><input type="submit" ></td></tr>
</table>
<a:out value="${msg}"></a:out>
</f:form>
</body>
</html>