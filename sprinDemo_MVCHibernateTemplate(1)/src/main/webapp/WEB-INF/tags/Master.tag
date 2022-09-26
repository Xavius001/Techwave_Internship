<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="title" required="true" rtexprvalue="true"%>
<%@ attribute name="head" fragment="true"%>
<%@ attribute name="content" fragment="true"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a" %>
<!DOCTYPE html>
<html>
<head>
	<link href="${pageContext.request.contextPath}/resources/styles/MyStyle.css" rel="StyleSheet">
<meta charset="ISO-8859-1">
<title>${title}</title>
<jsp:invoke fragment="head"></jsp:invoke>
</head>
<body>
<a:choose>
	<a:when test="${sessionScope.user==null }">
		<a:redirect url="login"></a:redirect>
	</a:when>
	<a:otherwise>

<div style="position:absolute;top:0px;left:0px;width:100%;height:15%">
		<img
			src="${pageContext.request.contextPath}/resources/images/logo.png"
			style="width: 100%; height: 100%">
</div>


<div style="position:absolute;top:15%;width:100%;left:0px;height:10%">
<ul>
  <li><a href="insertbook">Insert Book</a></li>
  <li><a href="getemps">Get Emp Details</a></li>
  <li><a href="updateBook">Update Book</a></li>
  <li style="float:right"><a class="active" href="Logout">Logout</a></li>
</ul>
<h1> Welcome<a:out value="${sessionScope.user}"></a:out></h1>
</div>

<div style="position:absolute;top:30%;width:100%;left:5%;height:100%">
	<jsp:invoke fragment="content"></jsp:invoke>
</div>
</a:otherwise>
</a:choose>
</body>
</html>
