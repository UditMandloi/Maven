<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Login</title>

</head>
<body class="body1">
	<div class="body">
		<form:form class="form" method="POST" action="submitLogin"
			modelAttribute="UserDTO">
			<header class="header">Login</header>
			<label class="label">Username <span class="span">*</span></label>
			<form:input class="input" type="email" path="email" />
			<label class="label">Password <span class="span">*</span></label>
			<form:input class="input" type="Password" path="password" />
			<input class="button" type="submit" value="Login">
		</form:form>
	</div>
</body>
</html>
