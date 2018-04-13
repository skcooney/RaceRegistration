<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix="mvc" %>
<%@ page isELIgnored="false" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Form Handling</title>
</head>
<body>
<h2>Race Information Registration Result</h2>
<table>
        <tr>
            <td>Date of Race:</td>
            <td>${r.date}</td>
        </tr>
        <tr>
            <td>Race City:</td>
            <td>${r.city}</td>
        </tr>
        <tr>
            <td>Race State:</td>
            <td>${r.state}</td>
        </tr>
        <tr>
            <td>Race Type:</td>
            <td>${r.raceType}</td>
        </tr>
        </table>
<a href = "viewAllRaceInfo.mvc">View all Races</a>
</body>
</html>