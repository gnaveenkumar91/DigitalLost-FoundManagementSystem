package com.lostfound.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.lostfound.dao.UserDAOInterface;
import com.lostfound.model.User;
import com.lostfound.utility.DBConnection;


public class UserDAO implements UserDAOInterface {
	Connection con = null;
	boolean status = false;
	@Override
	public boolean registerUser(User user) {
		try {
		DBConnection dbc=new DBConnection();
		con=dbc.getConnection();
		PreparedStatement ps =con.prepareStatement("INSERT INTO users(name, email, password, role) VALUES (?, ?, ?, ?)");
		  ps.setString(1, user.getName());
          ps.setString(2, user.getEmail());
          ps.setString(3, user.getPassword());
          ps.setString(4, user.getRole());
          int n = ps.executeUpdate();
			if (n > 0) { 
				status = true;
			}
			
		}catch(Exception e) {
			System.out.println(e);
		}
		return status;
	}
	@Override
	public User loginUser(String email, String password) {
		 User user = null;

	        try {
	    		    DBConnection dbc=new DBConnection();
	    		    con=dbc.getConnection();
	            PreparedStatement ps = con.prepareStatement(
	                "SELECT * FROM users WHERE email=? AND password=?"
	            );

	            ps.setString(1, email);
	            ps.setString(2, password);

	            ResultSet rs = ps.executeQuery();

	            if (rs.next()) {
	                user = new User();
	                user.setId(rs.getInt("id"));
	                user.setName(rs.getString("name"));
	                user.setEmail(rs.getString("email"));
	                user.setRole(rs.getString("role"));
	            }

	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	        return user;
	}

	

}
