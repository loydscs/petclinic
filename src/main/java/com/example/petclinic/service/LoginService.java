package com.example.petclinic.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petclinic.model.Users;
import com.example.petclinic.repository.UsersRepository;

@Service
public class LoginService {

	@Autowired
	UsersRepository usersRepository;
	
	public String validate(String email, String password) {
		Users user = usersRepository.findByEmail(email);
		if (null == user) {
			return "Invalid";
		}
		if (!user.getEmail().equals(email) || !user.getPassword().equals(password)) {
			return "Invalid";
		}
		return "Valid";
	} 
}
