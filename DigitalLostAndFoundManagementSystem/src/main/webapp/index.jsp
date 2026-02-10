<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>User Registration</title>
	</head>
	<body>
	      <h1>User Registration</h1>
	      <form name="Registrtion" method="post" action="RegisterUserServlet">
	        <label>Name:</label>
		    <input type="text" name="name" required><br><br>
		
		    <label>Email:</label>
		    <input type="email" name="email" required><br><br>
		
		    <label>Password:</label>
		    <input type="password" name="password" required><br><br>
		
		    <!-- role hidden because normal users only -->
		    <input type="hidden" name="role" value="USER">
		
		    <input type="submit" value="Register">
	      </form>
	      
	      
<a href="login.jsp">Already have an account? Login</a>
	</body>
</html>