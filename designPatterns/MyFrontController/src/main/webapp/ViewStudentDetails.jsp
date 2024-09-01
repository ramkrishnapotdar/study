<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student details</title>
</head>
<body>
Student id: <jsp:getProperty property="id" name="StudentDetails"/>
Student name: <jsp:getProperty property="Name" name="StudentDetails"/>
</body>
</html>