<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h1 align="center">Product</h1>
		<form:form method="POST" action="product" modelAttribute="ProductDTO">
			<table width="40%" align="center" bgcolor="#696969" height="200px">
				<tr>
					<td style="color: #ffffff">Product Name</td>
					<td><form:input type="text" path="proname" /></td>
				</tr>
				<tr>
					<td style="color: #ffffff">Product Price</td>
					<td><form:input type="text" path="proprise" /></td>
				</tr>
				<tr>
					<td style="color: #ffffff">Product Code</td>
					<td><form:input type="text" path="procode" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Save"></td>
					<td><input type="button" value="Cancle"></td>
				</tr>
			</table>
		</form:form>
	</div>
	<div  style="margin-left:200 px ">

		<h1 align="center">PRODUCT DETAILES</h1>
		<table align="center" border="1px" width="40%" ]>
			<tr>
				<td style="color: #000000">Product ID</td>
				<td style="color: #000000">Product Name</td>
				<td style="color: #000000">Product Prise</td>
				<td style="color: #000000">Product Code</td>
			</tr>
			<c:forEach items="${pdto}" var="ab">
			<tr>
				<td><c:out value="${ab.id}"></c:out>
				<td><c:out value="${ab.proname}"></c:out>
				<td><c:out value="${ab.proprise}"></c:out>
				<td><c:out value="${ab.procode}"></c:out>
				
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>