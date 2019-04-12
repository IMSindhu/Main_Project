<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
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
		<p class="display-4 text-center">Update Post Here</p>
		<br>

		<form action="ControllerServlet">
			<div class="form-group">
				<label for="username"></label> <input type="text"
					class="form-control" placeholder="Enter Post ID" name="id">
			</div>
			<div class="form-group">
				<label for="pwd"></label> <input type="text" class="form-control"
					placeholder="Enter title" name="title">
			</div>
			<div class="form-group">
				<label for="pwd"></label> <input type="text" class="form-control"
					placeholder="Enter body" name="body">
			</div>

			<button type="submit" class="btn btn-success btn-lg" value="update"
				name="buttonName">Update</button>

		</form>
	</div>
	<br>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>