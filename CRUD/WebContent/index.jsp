<%@ taglib prefix="tags" uri="WEB-INF/tags.tld"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Post Book</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<style>
.btn {
	padding: 10px 20px;
	font-size: 20px;
	border-radius: 55px;
}
</style>
<body>

	<tags:check-login />
	<div class="container col-5">
		<p class="display-4 text-center">Welcome to Post Book</p>
		<br>
		<form action="ControllerServlet">
			<div class="form-group">
				<button type="button" class="btn btn-secondary btn-lg btn-block">
					<a href="add.jsp" style="color: inherit"> Add Post</a>
				</button>
				<br> <br>
				<button type="button" class="btn btn-secondary btn-lg btn-block">
					<a href="update.jsp" style="color: inherit"> Update Post</a>
				</button>

				<br> <br>
				<button type="button" class="btn btn-secondary btn-lg btn-block">
					<a href="delete.jsp" style="color: inherit"> Delete Post</a>
				</button>

				<br> <br>
				<button type="button" class="btn btn-secondary btn-lg btn-block">
					<a href="view.jsp" style="color: inherit"> View all Post</a>
				</button>

				<br> <br>
				<button type="button" class="btn btn-secondary btn-lg btn-block">
					<a href="search.jsp" style="color: inherit"> Search a Post</a>
				</button>
			</div>
			</form>
</body>
</html>