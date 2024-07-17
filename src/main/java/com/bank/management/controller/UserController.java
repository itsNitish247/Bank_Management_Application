package com.bank.management.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.management.modal.User;
import com.bank.management.service.UserService;

@RestController
@RequestMapping("/api")
public class UserController {
	
	
	@Autowired
	private UserService userSer;
	
	
	@PostMapping("/add_user")
	public ResponseEntity<User> addNewUser(@RequestBody User user){
		User newUser= userSer.addUser(user);
		return ResponseEntity.ok(newUser);
		
	}
	
	@PutMapping("/update_all_user")
	public ResponseEntity<User> updateUser(@RequestBody User user){
		User updateAllUser=userSer.updateUser(user);
		return ResponseEntity.ok(updateAllUser);
	
	}
	
	@PutMapping("/update_all_user/{id}")
	public ResponseEntity<User> updateUserById(@PathVariable  Long id , User user) {
		User updateUser=userSer.updateUserById(id, user);
		return ResponseEntity.ok(updateUser);

	}
	
	@DeleteMapping("/delete_users_by_id/{id}")
	public ResponseEntity<User> deleteUsers(@PathVariable Long id){
		User DeleteUser = userSer.deleteUserById(id);
		return ResponseEntity.ok(DeleteUser);
	}



}
