package com.lostfound.dao;

import com.lostfound.model.User;

public interface UserDAOInterface {
	
	    boolean registerUser(User user);
	    User loginUser(String email, String password);
//	    User getUserById(int id);
//	    boolean updateUser(User user);
//	    boolean deleteUser(int id);

}
