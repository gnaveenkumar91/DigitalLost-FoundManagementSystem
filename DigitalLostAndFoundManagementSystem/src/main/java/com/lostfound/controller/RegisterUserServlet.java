package com.lostfound.controller;

import java.io.IOException;

import com.lostfound.dao.impl.UserDAO;
import com.lostfound.model.User;
import com.lostfound.dao.UserDAOInterface;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/RegisterUserServlet")
public class RegisterUserServlet extends HttpServlet {
	//private static final long serialVersionUID = 1L;
	
	public RegisterUserServlet(){
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		String role=request.getParameter("role");
		
		
		System.out.println("controller data : "+name+ " : "  +email+ " : "  +password+ " : "  +role);
		
		
		User user=new User();
		user.setName(name);
		user.setEmail(email);
		user.setPassword(password);
		user.setRole(role);
		
		System.out.println(user);
		
		UserDAOInterface  userDAO=new UserDAO();
		boolean result=userDAO.registerUser(user);
		
		if(result) {
			response.sendRedirect("login.jsp");
		}else {
			response.sendRedirect("index.jsp");
		}
		
		
	}

}
