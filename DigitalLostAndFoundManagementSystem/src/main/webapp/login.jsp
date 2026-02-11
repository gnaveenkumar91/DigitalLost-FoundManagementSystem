<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
        <title>User Login</title>
	</head>
	<body>
		<h2>User Login</h2>

		<form action="LoginServlet" method="post">
		
		    <label>Email:</label>
		    <input type="email" name="email" required><br><br>
		
		    <label>Password:</label>
		    <input type="password" name="password" required><br><br>
		
		    <input type="submit" value="Login">
		
		</form>


<a href="index.jsp">New user? Register here</a>
		
	</body>
</html>