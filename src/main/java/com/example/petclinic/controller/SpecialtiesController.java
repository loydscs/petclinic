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
@RequestMapping("/api/v1/specialties/")
public class SpecialtiesController {
	

	 @Autowired
	 SpecialtiesService specialtiesService; 
		
		@GetMapping("all")
		public List<Specialities> retrieveAllUsers() {
			return specialtiesService.findAll();
		}

		
	
}
