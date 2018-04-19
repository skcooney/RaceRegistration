<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="mvc"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Race Registration Form</h2>
	<mvc:form modelAttribute="registerForRace" action="result.mvc">

<select>
    <c:forEach var="item" items="${obj.participant.id}">
     <option>${item}</option>
    </c:forEach>
</select>


<select>
    <c:forEach var="item" items="${obj.raceInfo.id}">
     <option>${item}</option>
    </c:forEach>
</select>

	
</mvc:form>
<a href = "viewAllParticipants.mvc">View all Participants</a>
<br />
<a href="menu.mvc">Back to main menu</a>
<br />
</body>
</html>