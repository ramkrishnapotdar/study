<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Create Ticket here</title>
</head>
<body>
	<form action="createTicket" method = "post">
		Movie Name : <input type = "text" name = "movie_name">
		Screen Name : <input type = "text" name = "screen_name">
		Seat Number : <input type = "text" name = "seat_number">
		<input type = "submit" value = "purchase" >
	</form>
 ${msg}	
</body>
</html>