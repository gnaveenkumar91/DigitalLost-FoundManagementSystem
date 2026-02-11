<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.lostfound.model.User" %>

<%
    User admin = (User) session.getAttribute("loggedUser");

    // Security check
    if (admin == null || !"ADMIN".equals(admin.getRole())) {
        response.sendRedirect("login.jsp");
        return;
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Admin Dashboard</title>
</head>
<body>

<h2>Welcome Admin, <%= admin.getName() %> </h2>

<hr>

<h3>Admin Actions</h3>
<ul>
    <li><a href="ViewItemsServlet">View All Items</a></li>
    <li><a href="ViewClaimsServlet">View Claims</a></li>
    <li><a href="LogoutServlet">Logout</a></li>
</ul>

</body>
</html>