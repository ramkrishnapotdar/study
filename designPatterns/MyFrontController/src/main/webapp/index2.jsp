<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
</head>
<body>
<jsp:useBean id="student" class="com.ram.patterns.frontcontroller.Student" scope="request" />
<jsp:getProperty property="id" name="student"/>
</body>
</html>