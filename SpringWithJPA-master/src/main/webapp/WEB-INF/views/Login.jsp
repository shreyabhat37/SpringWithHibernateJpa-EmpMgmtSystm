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
	<form action="./loginUser" method="get">
	
		
		<div class="form-group">
			<label for="email">User name:</label> <input type="text"
				class="form-control" id="uname" placeholder="Enter Username"
				name="uname">
		</div>

		<div class="form-group">
			<label for="email">Password:</label> <input type="password"
				class="form-control" id="pass" placeholder="Enter Password"
				name="pass">
		</div>
		<button type="submit" class="btn btn-default">Submit</button>
	</form>
</body>
</html>