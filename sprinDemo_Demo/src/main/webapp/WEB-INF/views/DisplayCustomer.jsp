<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<table border="1">
		<tr>
			<td>Customer Id</td><td>${customer.customerId}</td>
		</tr>
		<tr>
			<td>Customer Name</td><td>${customer.customerName}</td>
		</tr>
		<tr>
			<td>Date of Registration</td><td>${customer.dor}</td>
		</tr>
		<tr>
			<td>Type</td><td>${customer.type}</td>
		</tr>
	</table>
</body>
</html>