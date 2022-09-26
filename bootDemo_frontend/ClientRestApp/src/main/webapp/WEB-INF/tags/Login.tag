<%@ tag language="java" pageEncoding="ISO-8859-1"%>
<%@ attribute name="title" required="true" rtexprvalue="true"%>
<%@ attribute name="head" fragment="true"%>
<%@ attribute name="content" fragment="true"%>
<!DOCTYPE html>
<html>
<head>
	<link href="${pageContext.request.contextPath}/resources/styles/MyStyle.css" rel="StyleSheet">
<meta charset="ISO-8859-1">
<title>${title}</title>
<jsp:invoke fragment="head"></jsp:invoke>
</head>
<body>



<div style="position:absolute;top:10px;left:0px;width:50%;height:80%">
		<img
			src="${pageContext.request.contextPath}/resources/images/Login.jpg"
			style="width: 100%; height: 100%">
</div>




<div style="position:absolute;top:0%;width:50%;left:50%;height:10%">
<ul>
  <li><a href="Services">Services</a></li>
  <li><a href="Contactus">Contact Us</a></li>
   <li style="float:right"><a class="active" href="login">Login</a></li>
</ul>
</div>

<div style="position:absolute;top:30%;width:100%;left:60%;height:100%">
	<jsp:invoke fragment="content"></jsp:invoke>
</div>
</body>
</html>
