<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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
<br>
<a href="menu.mvc">Back to main menu</a>
</body>
</html>