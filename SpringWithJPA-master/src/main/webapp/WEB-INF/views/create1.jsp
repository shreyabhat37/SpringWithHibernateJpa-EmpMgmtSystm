<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
<head>
<title>Add Employee</title>
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
<br>
&nbsp&nbsp&nbsp&nbsp <input type="button"  class="btn btn-primary"  onclick="location.href='http://localhost:8080/SpringWithJPA/loginUser?uname=shreya&pass=bruno';" value="Admin Home" />
	<br><br><div class="container">
		<h2>Add An Employee</h2>
		<form action="./addEmployee" method="post">
			
			<div class="form-group">
				<label for="email">First Name:</label> <input type="text"
					class="form-control" id="empFirstName" placeholder="Enter First Name"
					name="empFirstName">
			</div>
			
			<div class="form-group">
				<label for="email">Last Name:</label> <input type="text"
					class="form-control" id="empLastName" placeholder="Enter Last Name"
					name="empLastName">
			</div>
			
			<div class="form-group">
				<label for="email">DOB:</label> <input type="text"
					class="form-control" id="empDateofBirth" placeholder="Enter Last Name"
					name="empDateofBirth">
			</div>
			
			<div class="form-group">
				<label for="email">DOJ</label> <input type="text"
					class="form-control" id="empDateofJoining" placeholder="Enter Last Name"
					name="empDateofJoining">
			</div>
			
			<div class="form-group">
				<label for="email">D_ID:</label> <input type="text"
					class="form-control" id="empDeptID" placeholder="Enter Last Name"
					name="empDeptID">
			</div>
			
			<div class="form-group">
				<label for="email">E_Grade:</label> <input type="text"
					class="form-control" id="empGrade" placeholder="Enter Last Name"
					name="empGrade">
			</div>
			
			<div class="form-group">
				<label for="email">Designation:</label> <input type="text"
					class="form-control" id="empDesignation" placeholder="Enter Last Name"
					name="empDesignation">
			</div>
			
			<div class="form-group">
				<label for="email">Salary:</label> <input type="text"
					class="form-control" id="empBasic" placeholder="Enter Last Name"
					name="empBasic">
			</div>
			<div class="form-group">
				<label for="email">Gender:</label> <input type="text"
					class="form-control" id="empGender" placeholder="Enter Last Name"
					name="empGender">
			</div>
			<div class="form-group">
				<label for="email">:M_Stat</label> <input type="text"
					class="form-control" id="empMaritalStatus" placeholder="Enter Last Name"
					name="empMaritalStatus">
			</div>
			<div class="form-group">
				<label for="email">Address:</label> <input type="text"
					class="form-control" id="empHomeAddress" placeholder="Enter Last Name"
					name="empHomeAddress">
			</div>
			<div class="form-group">
				<label for="email">Contact:</label> <input type="text"
					class="form-control" id="empContactNum" placeholder="Enter Last Name"
					name="empContactNum">
			</div>
			
			
			
			<button type="submit" class="btn btn-default">Submit</button>
		
		</form>
	</div>
</body>
</html>