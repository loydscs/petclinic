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

import com.example.petclinic.model.Specialities;
import com.example.petclinic.service.SpecialtiesService;
@RestController
@RequestMapping("/specialties/")
public class SpecialtiesController {
	

	 @Autowired
	 SpecialtiesService specialtiesService; 
		
		@PostMapping("add")
		public void addUser(@RequestBody Specialities role) {
			specialtiesService.save(role);
		}

		@GetMapping("{id}")
		public Specialities getUser(@PathVariable Integer id) {
			return specialtiesService.findById(id);
		}

		@GetMapping("allusers")
		public List<Specialities> retrieveAllUsers() {
			return specialtiesService.findAll();
		}

		@DeleteMapping("{id}")
		public void deleteUser(@PathVariable Integer id) {
			specialtiesService.deleteById(id);	
		
	}
}
