<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
 <%@ page isELIgnored="false" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Spring MVC From Handling</title>
</head>
<body> 
<img src="images/participant.jpg">
<h2>Participant Registration Result</h2>
    <table>
        <tr>
            <td>First Name</td>
            <td>${p.firstName}</td>
        </tr>
        <tr>
            <td>Last name</td>
            <td>${p.lastName}</td>
        </tr>
        <tr>
            <td>Age</td>
            <td>${p.age}</td>
        </tr>
        <tr>
            <td>Gender</td>
            <td>${p.gender}</td>
        </tr>
        <tr>
            <td>City</td>
            <td>${p.city}</td>
        </tr>
        <tr>
            <td>State</td>
            <td>${p.state}</td>
        </tr>
        </table>
<a href = "viewAllParticipants.mvc">View all Participants</a>
<br />
<a href="menu.mvc">Back to main menu</a>
<br />
</body>
</html>