package com.example.petclinic.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.petclinic.model.Roles;
import com.example.petclinic.model.Specialities;
import com.example.petclinic.repository.RolesRepository;
import com.example.petclinic.service.RolesService;
import com.example.petclinic.service.SpecialtiesService;
@RestController
@RequestMapping("/roles/")
public class RolesController {
	
	 @Autowired
	 RolesService rolesService; 
		
		@PostMapping("add")
		public void addUser(@RequestBody  Roles role) {
			rolesService.save(role);
		}

		@GetMapping("{id}")
		public  Roles getUser(@PathVariable Integer id) {
			return  rolesService.findById(id);
		}

		@GetMapping("allroles")
		public List< Roles> retrieveAllUsers() {
			return rolesService.findAll();
		}

		@DeleteMapping("{id}")
		public void deleteUser(@PathVariable Integer id) {
			rolesService.deleteById(id);	
		
	}
}
