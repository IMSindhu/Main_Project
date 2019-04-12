<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add a Post</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css">
</head>
<body>
	<%
		if (request.getSession(false).getAttribute("loginStatus") == null)
			response.sendRedirect("http://localhost:8080/PostsCRUD/login.jsp");
	%>

	
	<form action="ControllerServlet">
		<div class="container">
			<p class="display-4 text-center">View Post Here</p>
		</div>
		<br> <input type="submit" name="buttonName"
			class="btn btn-success" value="view">
	</form>
	<br>

	<jsp:include page="footer.jsp"></jsp:include>
</body>
</html>