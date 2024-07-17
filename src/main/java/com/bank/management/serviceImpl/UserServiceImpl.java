package com.bank.management.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bank.management.modal.User;
import com.bank.management.repository.UserRepository;
import com.bank.management.service.UserService;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepo;

	@Override
	public User addUser(User user) {
		// TODO Auto-generated method stub
		return userRepo.save(user);
	}

	@Override
	public List<User> getUsers() {
		// TODO Auto-generated method stub
		return  userRepo.findAll();
	}

	@Override
	public User getUserById(Long id) {
		// TODO Auto-generated method stub
		Optional<User> userFetchedById = userRepo.findById(id);
		return userFetchedById.orElse(null);
	}

	@Override
	public User deleteUserById(Long id) {
		// TODO Auto-generated method stub
	Optional<User> deleteUser = userRepo.findById(id);
	if(deleteUser.isPresent()) {
 userRepo.deleteById(id);;

	return deleteUser.get();
	
	}
	return  null;
	}

	@Override
	public User updateUserById(Long id, User user) {
		// TODO Auto-generated method stub
		Optional<User> updateUser = userRepo.findById(user.getId());
		if(updateUser.isPresent()) {
			User usr = updateUser.get();
			usr.setAccountNumber(user.getAccountNumber() == null ? usr.getAccountNumber() : user.getAccountNumber());
			usr.setEmail(user.getEmail()==null? usr.getEmail():user.getEmail());
			usr.setAddress(user.getAddress() == null? usr.getEmail(): user.getEmail());
			usr.setPhoneNumber(user.getPhoneNumber()==null ? usr.getPhoneNumber() : user.getPhoneNumber());
			usr.setAge(user.getAge()==null? usr.getAge() : user.getAge());
			usr.setUserName(user.getUserName()==null? usr.getUserName() : user.getUserName());
			usr.setRoles(user.getRoles()==null?usr.getRoles(): user.getRoles());
			usr.setPincode(user.getPincode()==null?usr.getPincode():user.getPincode());
		}
		return null;
		
		

	
	}



	@Override
	public User updateUser(User user) {
		// TODO Auto-generated method stub
		Optional<User> updateUser = userRepo.findById(user.getId());
		if(updateUser.isPresent()) {
			User usr = updateUser.get();
			usr.setAccountNumber(user.getAccountNumber() == null ? usr.getAccountNumber() : user.getAccountNumber());
			usr.setEmail(user.getEmail()==null? usr.getEmail():user.getEmail());
			usr.setAddress(user.getAddress() == null? usr.getEmail(): user.getEmail());
			usr.setPhoneNumber(user.getPhoneNumber()==null ? usr.getPhoneNumber() : user.getPhoneNumber());
			usr.setAge(user.getAge()==null? usr.getAge() : user.getAge());
			usr.setUserName(user.getUserName()==null? usr.getUserName() : user.getUserName());
			usr.setRoles(user.getRoles()==null?usr.getRoles(): user.getRoles());
			usr.setPincode(user.getPincode()==null?usr.getPincode():user.getPincode());
		}
		return null;
	}

	
}
