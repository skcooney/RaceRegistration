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
<div align="center">
	<img src="images/runners.jpg">
	
        <table border="1" cellpadding="5">

	<h1>List of Races</h1>
            <tr>
                <th>Select Race</th>
                <th>Date</th>
                <th>City</th>
                <th>State</th>
                <th>Race Type</th>
            </tr>
            <c:forEach items="${all}" var ="item">
                <tr>
                	<td><input type="radio" name="id"
						value="${item.id}"></td>
                    <td><c:out value="${item.date}" /></td>
                    <td><c:out value="${item.city}" /></td>
                    <td><c:out value="${item.state}" /></td>
                    <td><c:out value="${item.raceType}" /></td>
                </tr>
            </c:forEach>
		</table>
		</div>
		<br />
		<hr style="text-align: left; margin-left: 0; width: 25%">
		<br />
 	<a href = "registrationForm.mvc">Register for Race</a>
	<br />        
	<a href="menu.mvc">Return to Main Menu</a>
</body>
</html>