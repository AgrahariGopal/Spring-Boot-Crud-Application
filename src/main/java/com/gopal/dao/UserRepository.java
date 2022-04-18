package com.gopal.dao;

import java.util.List;

import com.gopal.entity.User;

public interface UserRepository {

	 User saveUser(User user);
	 
	 User updateUser(User user);
	 
	 User getById(int id);
	 
	  String deleteById(int id);
	  
	  List<User> allUsers();
}
