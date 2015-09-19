package com.spring.mvc.service;

import java.util.List;

import com.spring.mvc.bean.User;

public interface IUserService {
	String  addUser(User user);

	boolean login(User user);

	List getAll();

	void deleteUser(int id);

	void deleteUser(User user);


}
