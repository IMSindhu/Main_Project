<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
		<p class="display-4 text-center">Please Login</p>
		<br>
		<div class="text-center">
			<img src="img.png" id="img1" width="225px" height="225px"
				alt="Cloudy Sky">
		</div>
		<form action="ControllerServlet">
			<div class="form-group">
				<label for="username">Email:</label> <input type="text"
					class="form-control" placeholder="Enter Email" name="username">
			</div>
			<div class="form-group">
				<label for="pwd">Password:</label> <input type="password"
					class="form-control" placeholder="Enter password" name="password">
			</div>

			<div class="btn-group d-flex" role="group">
				<input type="submit" class="btn btn-danger" name="buttonName"
					value="sign up"> <input type="submit"
					class="btn btn-success" name="buttonName" value="sign in">
			</div>

		</form>
	</div>

</body>
</html>