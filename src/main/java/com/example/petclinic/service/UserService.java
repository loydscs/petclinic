package com.example.petclinic.service;

import java.util.List;
import java.util.Optional;

import javax.management.relation.Role;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.petclinic.model.Pets;
import com.example.petclinic.model.Roles;
import com.example.petclinic.model.Users;
import com.example.petclinic.repository.RolesRepository;
import com.example.petclinic.repository.UsersRepository;

@Service
public class UserService {
	
	@Autowired
	RolesRepository  roleRepository ;
	
	@Autowired
	UsersRepository  userRepository ;
	
	public Users save(Users user ) {
//		Optional<Roles> userRole = roleRepository.findById(user.getRoleId());
//		if (userRole.isEmpty()) {
//		throw new IllegalArgumentException("Invalid User");
//	} else {
//	}

		return  userRepository.save(user);

	}
 
//	public void save(Integer id, Users user ) {
//		Users loggedUser = userRepository.getById(id);
//		int roleId = loggedUser.getRoleId();
//		if (roleId != 1 && roleId!= 2 && roleId!=3) {
//			userRepository.save(user);
//			
//		}else
//			throw new IllegalArgumentException("Unauthorized user");
//	
//	}
//	

	public Users findById( Integer id ) {
		return userRepository.findById( id).get();
	}
	
	public List<Users> findAll () {
		return userRepository.findAll();
	}
	
	public Boolean deleteById ( Integer userId) {
		Boolean isDeleted = false;
		Users user = userRepository.getById(userId);
		int roleId = user.getRoleId();
		if(roleId == 1) {
			userRepository.deleteById(userId);
			isDeleted = true;
		} else {
			isDeleted = false;
		}		
		return isDeleted;
	}
	
	
     public void update (Integer userId) {
    	 
    	  
    	 
     }

	public Boolean updateUser(Users user) {
		Optional<Users> findUser = userRepository.findById(user.getId());
		Boolean isUpdated = false;
		if(findUser.isPresent()) {
			userRepository.save(user);
			isUpdated = true;
		}
		else
			isUpdated = false;
			
		return isUpdated;
	}

}


