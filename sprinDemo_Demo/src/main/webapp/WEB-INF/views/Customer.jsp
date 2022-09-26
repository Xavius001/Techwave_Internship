<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <!-- Step 2 -->  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="fetch">
		<table>
			<tr>
				<td>CustomerId</td>
				<td><input type="text" name="customerId" /></td>
			</tr>
			<tr>
				<td>CustomerName</td>
				<td><input type="text" name="customerName" /></td>
			</tr>
			<tr>
				<td>Date of Registration</td>
				<td><input type="date" name="dor" /></td>
			</tr>
			<tr>
				<td>Type</td>
				<td>
					<select name="type">
						<option>select</option>
						<option>Guest</option>
						<option>Privileged</option>
					</select>
				</td>
			</tr>
			<tr>
				<td><input type="submit"/></td>
			</tr>
		</table>
	</form>

</body>
</html>