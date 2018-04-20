<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All Participants</title>
</head>
<body>
	<div align="center">
		<img src="images/runners.jpg">

		<div align="center">
			<table border="1" cellpadding="5">
				<h1>Select participant to register</h1>
				<mvc:form modelAttribute="registration"
					action="registrationResult.mvc">
					<tr>
						<th>Select</th>
						<th>First Name</th>
						<th>Last Name</th>
						<th>Age</th>
						<th>Gender</th>
						<th>City</th>
						<th>State</th>
					</tr>
					<c:forEach items="${all}" var="item">
						<tr>
							<td><input type="radio" name="id" value="${item.id}"></td>
							<td><c:out value="${item.firstName}" /></td>
							<td><c:out value="${item.lastName}" /></td>
							<td><c:out value="${item.age}" /></td>
							<td><c:out value="${item.gender}" /></td>
							<td><c:out value="${item.city}" /></td>
							<td><c:out value="${item.state}" /></td>
						</tr>
					</c:forEach>
			</table>
			<tr>
				<td colspan="2"><input type="submit" value="Submit" /></td>
			</tr>
			<!-- <br /> -->

			<%-- <h2>Select Race you would like to register for:</h2>
			<tr>
				<th>Select Race</th>
				<th>Date</th>
				<th>City</th>
				<th>State</th>
				<th>Race Type</th>
			</tr>
			<c:forEach items="${all}" var="item">
				<tr>
					<form>
						<td><input type="radio" name="id" value="${item.id}"></td>
						<td><c:out value="${item.date}" /></td>
						<td><c:out value="${item.city}" /></td>
						<td><c:out value="${item.state}" /></td>
						<td><c:out value="${item.raceType}" /></td>
						<!-- button here -->
					</form>

				</tr>
			</c:forEach>
			</table> --%>
			</mvc:form>
			<br />
			<hr style="text-align: left; margin-left: 0; width: 25%">
			<a href="viewAllRaceInfo.mvc">Register for Race</a> <br /> <a
				href="menu.mvc">Back to main menu</a> <br />
</body>
</html>