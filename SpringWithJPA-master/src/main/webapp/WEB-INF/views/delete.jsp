<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">

<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<br>
&nbsp&nbsp&nbsp&nbsp
<input type="button" class="btn btn-primary" onclick="location.href='http://localhost:8080/SpringWithJPA/loginUser?uname=shreya&pass=bruno';" value="Admin Home" />

		<form action="./deleteEmployee" method="get">
			<div class="form-group">
			<br>
&nbsp&nbsp&nbsp&nbsp
				<label for="name">ID:</label><input type="text"
					class="form-control" id="empID" placeholder="Enter ID"
					name="empID">
			</div>
			<br>
&nbsp&nbsp&nbsp&nbsp
			<button type="submit" class="btn btn-default" >Submit</button>
		</form>

</body>
</html>