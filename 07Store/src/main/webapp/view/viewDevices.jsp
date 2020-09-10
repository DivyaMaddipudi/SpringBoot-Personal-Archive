<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${devices.brandName} Store</title>
</head>
<body>
<h3>List of ${devices.brandName} devices</h3>
<hr>
<table>
<tr>
<th> Name </th>
<th> Category </th>
</tr>

<c:forEach var="device" items="${devices.devices}">

<tr> 
<td>${device.name}</td>
<td>${device.type}</td> 
</tr>

</c:forEach>
</table>
</body>
</html>