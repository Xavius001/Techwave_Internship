<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="m"%>
<m:Master title="Extract By Id">
    <jsp:attribute name="head"></jsp:attribute>
    <jsp:attribute name="content">
    <f:form  modelAttribute="vendor">
        <table>
            <tr>
                <td>VendorId</td>
                <td><f:input path="vendorId" /></td>
                <td><f:errors path="vendorId"></f:errors></td>
                <td><input type="submit" value="Extract" formaction="getVendorId"></td>
            </tr>
            <tr>
                <td>Name of the Vendor</td>
                <td><f:input path="name" /></td>
                <td><f:errors path="name"></f:errors></td>
            </tr>
            <tr>
                <td>Date of Registration</td>
                <td><f:input path="dateofRegitration" type="date" /></td>
                <td><f:errors path="dateofRegitration"></f:errors></td>
            </tr>
            <tr>
                <td>Duration</td>
                <td><f:input path="durationinDays" /></td>
                <td><f:errors path="durationinDays"></f:errors></td>
            </tr>
           <tr>
                <td><input type="submit" value="Update" formaction="update"></td>
                <td><input type="submit" value="Delete" formaction="delete"></td>
            </tr>
       </table>
       <c:out value="${msg}"></c:out>
    </f:form>
    </jsp:attribute>
</m:Master>