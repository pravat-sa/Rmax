package com.rmax.dao;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.rmax.model.Employee;
import com.rmax.model.User;

@Repository("userDAO")
public class UserDAOImpl extends AbstractDAO<Integer, User> implements UserDAO{

	@Override
	public void addUser(User user) {
		persist(user);		
	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> userList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteUser(Long id) {
		// TODO Auto-generated method stub
		
	}

	

}
