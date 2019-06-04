<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<title>List All Fname</title>

<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.0/js/bootstrap.min.js"></script>
</head>
<body>
<div align="center">
<br><br><br><br><br>
<input  class="btn btn-primary" type="button" onclick="location.href='http://localhost:8080/SpringWithJPA/loginUser?uname=shreya&pass=bruno';"value="Admin Home" />
&nbsp&nbsp&nbsp&nbsp&nbsp<input  class="btn btn-primary" type="button" onclick="location.href='http://localhost:8080/SpringWithJPA/listbasic';" value="Order By Salary" />
&nbsp&nbsp&nbsp&nbsp&nbsp<input  class="btn btn-primary" type="button" onclick="location.href='http://localhost:8080/SpringWithJPA/listlname';" value="Order By Last Name" />
<br><br><br><br>
	<table border="1">
		<tr>
			<th>EMP ID</th>
			<th>FName</th>
			<th>LName</th>
			<th>DOB</th>
			<th>DOJ</th>
			<th>DId</th>
			<th>EGRADE</th>
			<th>DESIGNATION</th>
			<th>BASIC SAL</th>
			<th>GENDER</th>
			<th>EMPMARSTAT</th>
			<th>ADDRESS</th>
			<th>CONTACT</th>

		</tr>
		<c:forEach var="emp" items="${list}">
			<tr>
				<td align="center">${emp.empID}</td>
				<td align="center">${emp.empFirstName}</td>
				<td align="center">${emp.empLastName}</td>
				<td align="center">${emp.empDateofBirth}</td>
				<td align="center">${emp.empDateofJoining}</td>
				<td align="center">${emp.empDeptID}</td>
				<td align="center">${emp.empGrade}</td>
				<td align="center">${emp.empDesignation}</td>
				<td align="center">${emp.empBasic}</td>
				<td align="center">${emp.empGender}</td>
				<td align="center">${emp.empMaritalStatus}</td>
				<td align="center">${emp.empHomeAddress}</td>
				<td align="center">${emp.empContactNum}</td>
			</tr>
		</c:forEach>
	</table>
</div>
</body>
</html>