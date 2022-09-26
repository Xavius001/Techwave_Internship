<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="m"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="a"%>
<m:Master title="Update Book">
<jsp:attribute name="head">
<script type="text/javascript">
	function fetch() {
		var bid = document.getElementsByName("bookid")[0].value;
		window.location.href = window.location.origin
				+ "/MVCHibernateTemplate/fetchBook/" + bid;

		//http://localhost:8080/
	}
</script>
</jsp:attribute>
<jsp:attribute name="content">

	<f:form action="/MVCHibernateTemplate/updateNewBook"
			modelAttribute="book">
		<table>
			<tr>
				<td>Book Id</td>
				<td><f:select path="bookid" onblur="fetch();">
						<f:option value="-1">Select</f:option>
						<a:forEach var="b" items="${blist}">
							<f:option value="${b.bookid}">${b.bookid}</f:option>
						</a:forEach>
					</f:select></td>
			</tr>
			<tr>
				<td>Book Name</Td>
				<td><f:input path="bookname" /></td>
			</tr>
			<tr>
				<td>Date of Publication</Td>
				<td><f:input path="dop" type="date" /></td>
			</tr>
			<tr>
					<td><input type="submit" value="Update"></td>
				</tr>
		</table>
		<a:out value="${msg}"></a:out>
	</f:form>
</jsp:attribute>
</m:Master>










