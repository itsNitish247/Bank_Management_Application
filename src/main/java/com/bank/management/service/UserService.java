package com.bank.management.service;

import java.util.List;

import com.bank.management.modal.User;

public interface UserService {

	public User addUser(User user);

	public List<User> getUsers();

	public User getUserById(Long id );

	public User deleteUserById(Long id );

	public User updateUserById(Long id , User user);
	
	public User updateUser(User user);





}
