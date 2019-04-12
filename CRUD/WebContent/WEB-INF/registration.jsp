<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login Page</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<style>
.btn {
	padding: 10px 20px;
	font-size: 20px;
	border-radius: 55px;
}

.form-control {
	padding: 10px 20px;
	font-size: 20px;
	border-radius: 55px;
}
</style>
<body>
	<div class="container col-5">
		<p class="display-4 text-center">Welcome to Registration Form</p>
		<br>

		<form action="ControllerServlet">
			<div class="form-group">
				<label for="username">User Name:</label> <input type="text"
					class="form-control" placeholder="Enter UserName" name="username">
			</div>
			<div class="form-group">
				<label for="name">Name:</label> <input type="text"
					class="form-control" placeholder="Enter Name" name="name">
			</div>
			<div class="form-group">
				<label for="email">Email ID:</label> <input type="text"
					class="form-control" placeholder="Enter Email Id" name="email">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" placeholder="Enter password" name="password">
			</div>

			<div class="btn-group d-flex" role="group">
				<input type="submit" class="btn btn-success" name="buttonName"
					value="Register">
			</div>

		</form>
	</div>




</body>
</html>