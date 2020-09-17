<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>
<h3>Welcome to home page</h3>
<br>
<form action="addAlien" method="post">
	Enter your Id: <input type="text" name="aid"><br>
	Enter your Name: <input type="text" name="aname"><br>
	<input type="submit">
</form>
<hr>
<h3>Enter Id to get specific alien details</h3>
<form action="getAlien" method="get">
	Enter your Id: <input type="text" name="aid"><br>
	<input type="submit">
</form>
<hr>
<h3>Enter Name to get specific alien details</h3>
<form action="getAlienByAname" method="get">
	Enter your Name: <input type="text" name="aname"><br>
	<input type="submit">
</form>
<hr>
<h3>Enter Id to delete</h3>
<form action="deleteAlien" method="get">
	Enter your Id: <input type="text" name="aid"><br>
	<input type="submit">
</form>

</body>
</html>