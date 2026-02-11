package com.lostfound.controller;

import java.io.IOException;

import com.lostfound.dao.UserDAOInterface;
import com.lostfound.dao.impl.UserDAO;
import com.lostfound.model.User;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		
		
		
		 UserDAOInterface userDAO = new UserDAO();
		 User user = userDAO.loginUser(email, password);
		 
		 if (user != null) {
				HttpSession session = request.getSession();
				session.setAttribute("loggedUser", user);

				// Role-based navigation
				if ("ADMIN".equals(user.getRole())) {
					response.sendRedirect("adminDashboard.jsp");
				} else {
					response.sendRedirect("userDashboard.jsp");
				}

			} else {
				response.sendRedirect("login.jsp");
			}
		
	
	}

}
