<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add a Post</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<style>
.btn {
	padding: 10px 30px;
	font-size: 20px;
	border-radius: 30px;
}

.form-control {
	padding: 10px 20px;
	font-size: 15px;
	border-radius: 55px;
}
</style>
<body>

	<%
		if (request.getSession(false).getAttribute("loginStatus") == null)
			response.sendRedirect("http://localhost:8080/PostsCRUD/login.jsp");
	%>

	<div class="container col-5">
		<p class="display-4 text-center">Add Post Here</p>
		<br>

		<form action="ControllerServlet">
			<div class="form-group">
				<label for="username"></label> <input type="text"
					class="form-control" placeholder="Enter Title" name="title">
			</div>
			<div class="form-group">
				<label for="pwd"></label> <input type="text" class="form-control"
					placeholder="Enter body" name="body">
			</div>

			<button type="submit" class="btn btn-success btn-lg" value="add"
				name="buttonName">Add</button>

		</form>
	</div>
	<br />
	<br />
	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>