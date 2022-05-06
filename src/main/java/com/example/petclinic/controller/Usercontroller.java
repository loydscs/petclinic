package com.example.petclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public ResponseEntity<?> create(@RequestBody Users users) {
		try {
			Users user = userService.save(users);
			return ResponseEntity.ok(user);
		} catch(Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("update")
	public ResponseEntity<?> update(@RequestBody Users users) {
		try {
			Boolean user = userService.updateUser(users);
			if(user)
				return new ResponseEntity<String>(HttpStatus.OK);
			else
				return new ResponseEntity<String>(HttpStatus.NOT_FOUND);
					
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

	@DeleteMapping("/delete/{userId}")
	public ResponseEntity<String> deleteUser(@PathVariable Integer userId) {
		try {
			Boolean isDeleted = userService.deleteById(userId);
			if (isDeleted)
				return new ResponseEntity<String>(HttpStatus.OK);
			else
				return new ResponseEntity<String>(HttpStatus.FORBIDDEN);
		} catch (Exception e) {
			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}
	
//	@PutMapping("/update")
//	public ResponseEntity<?> updateUser(@RequestBody Users users) {
//		try {
//			Users user = userService.save(users);
//			return ResponseEntity.ok(user);
//		} catch(Exception e) {
//			return new ResponseEntity<String>(HttpStatus.INTERNAL_SERVER_ERROR);
//		}
//	}
	
}
