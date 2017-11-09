<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
	<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
	
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
	<table width="100%" border="1" cellpadding="0" height="350px" cellspacing="0" align="left">
		
		<tr>
			<td colspan="2" align="left" height="10%"><tiles:insertAttribute  name="header"/></td>
		</tr>
		<tr>
			<td valign="middle" bgcolor="#FFA500"><tiles:insertAttribute name="body"/></td>
		</tr>
		<tr>
			<td colspan="2" align="left" height="10%"><tiles:insertAttribute name="footer"/></td>
		</tr>
		
	</table>
</body>
</html>