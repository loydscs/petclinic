package com.example.petclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petclinic.model.Users;
import com.example.petclinic.service.UserService;

@RestController
@RequestMapping("/users/")
public class Usercontroller {
	

 @Autowired
	 UserService userService; 
	
	@PostMapping("add")
	public ResponseEntity<?> addUser(@RequestBody Users users) {
		try {
			Users user = userService.save(users);
			return ResponseEntity.ok(user);
		} catch(Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@GetMapping("{id}")
	public Users getUser(@PathVariable Integer id) {
		return userService.findById(id);
	}

	@GetMapping("allusers")
	public List<Users> retrieveAllUsers() {
		return userService.findAll();
	}

	@DeleteMapping("{id}/delete/{userId}")
	public void deleteUser(@PathVariable Integer id, @PathVariable Integer userId) {
		userService.deleteById(id, userId);
	
}
	
	
}
