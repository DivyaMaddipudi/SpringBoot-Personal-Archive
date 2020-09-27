<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Expense Tracker</h2>
<h3>YOUR BALANCE</h3>
<h3>${amount}</h3>

<table border="1" width="500px">
<tr>
<th>Income</th>
<th>Expense</th>
</tr>
<tr>
<td>${incomeVal}</td>
<td>${expense}</td>
</tr>
</table>

<hr>

<h3>List of items</h3>

<c:forEach var="item" items="${expList}">
<table>
<tr>
<th>Name</th>
<th>Amount</th>
</tr>
<tr>
<td>${item.getName()}</td>
<td>${item.getAmount()}</td>
</tr>
</table>
</c:forEach>
<hr>
<h3> Add new expenses</h3>
<form action="addExpense" method="post">
	Text :
	<br>
	<input type="text" name="name" placeholder="Items..">
	<br>
	Amount :
	<br>
	(negative -expense, positive +income)
	<br>
	<input type="text" name="amount" placeholder="Amount">
	<br>	
	<input type="submit">
</form>
</body>
</html>