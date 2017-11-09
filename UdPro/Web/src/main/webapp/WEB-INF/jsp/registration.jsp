<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style1.css">
<title>Registration</title>
</head>
<body class="body1">
	<div class="lang">offered in:&nbsp&nbsp <a id=a href="?language=en">English</a>&nbsp|&nbsp<a id=a href="?language=hi">हिंदी</a>&nbsp|&nbsp
	<a id=a href="?language=fr">French</a>&nbsp|&nbsp<a id=a href="?language=zh">Chinese</a></div>
	<div class="body">
		<form:form class="form" method="POST" action="registration"
			modelAttribute="RegistrationDTO">
			<header class="header">Registration </header>


			<label class="label"><spring:message code="label.fname.value" />
				<span class="span1"> <form:errors path="fname"></form:errors></span></label>
			<form:input class="input" type="text" path="fname" />


			<label class="label"><spring:message code="label.lname.value" /><span
				class="span1"><form:errors path="lname"></form:errors></span></label>
			<form:input class="input" type="text" path="lname" />


			<label class="label"><spring:message code="label.email.value" /><span
				class="span1"><form:errors path="email"></form:errors></span></label>
			<form:input class="input" type="text" path="email" />


			<label class="label"><spring:message
					code="label.password.value" /><span class="span1"><form:errors
						path="password"></form:errors></span></label>
			<form:input class="input" type="Password" path="password" />



			<label class="label"><spring:message
					code="label.contact.value" /><span class="span1"><form:errors
						path="contact"></form:errors></span></label>
			<form:input class="input" type="text" path="contact" />


			<label class="label"><spring:message
					code="label.address.value" /><span class="span1"><form:errors
						path="address"></form:errors></span></label>
			<form:input class="input" type="text" path="address" />


			<label class="label"><spring:message code="label.city.value" /><span
				class="span1"><form:errors path="city"></form:errors></span></label>
			<form:input class="input" type="text" path="city" />

			<input class="button" type="submit" value="Register">

		</form:form>
	</div>
</body>
</html>
