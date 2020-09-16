<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<br>
	<h3>Welcome Back ${name}</h3>
	
	<h3> Your Details: </h3>
	<hr>
	Id is : ${alien.getAid()} <br>
	Name is : ${alien.getAname()}
		
</body>
</html>