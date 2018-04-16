<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>All Race Information</title>
</head>
<body>
<c:forEach items="${all}" var ="item">
	<%-- <c:forEach items="${all }" var="item"> --%>
		<table border="1">
			<tr>
				<td>Date of Race:</td>
				<td>${item.date}</td>
			</tr>
			<tr>
				<td>Race City:</td>
				<td>${item.city}</td>
			</tr>
			<tr>
				<td>Race State:</td>
				<td>${item.state}</td>
			</tr>
			<tr>
				<td>Type of Race:</td>
				<td>${item.raceType}</td>
			</tr>
		</table>
		<br />
		<hr style="text-align: left; margin-left: 0; width: 25%">
		<br />
	</c:forEach>
	<a href="menu.mvc">Return to Main Menu</a>
</body>
</html>