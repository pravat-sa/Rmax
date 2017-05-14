package com.rmax.service;

import java.util.List;

import com.rmax.model.User;

public interface UserService {
	public void addUser(User user);
	public void updateUser(User user);
	public List<User> userList();
	public User getUserById(Long id);
	public void deleteUser(Long id);
}
