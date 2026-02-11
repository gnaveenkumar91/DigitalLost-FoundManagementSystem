<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.lostfound.model.User" %>

<%
    User user = (User) session.getAttribute("loggedUser");

    // Session check (security)
    if (user == null) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>User Dashboard</title>
</head>
<body>

<h2>Welcome, <%= user.getName() %></h2>

<p><b>Email:</b> <%= user.getEmail() %></p>
<p><b>Role:</b> <%= user.getRole() %></p>

<hr>

<h3>User Actions</h3>
<ul>
    <li><a href="addLostItem.jsp">Report Lost Item</a></li>
    <li><a href="addFoundItem.jsp">Report Found Item</a></li>
    <li><a href="ViewItemsServlet">View All Items</a></li>
    <li><a href="LogoutServlet">Logout</a></li>
</ul>

</body>
</html>