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

import com.example.petclinic.model.PetsTypes;
import com.example.petclinic.service.PetsTypesService;
@RestController
@RequestMapping("/petstypes/")
public class PetsTypesController {
	@Autowired
	PetsTypesService  petsTypesService;
	
	
//	@PostMapping("add")
//	public void addUser(@RequestBody PetsTypes role) {
//		petsTypesService.save(role);
//	}

	@GetMapping("{id}")
	public PetsTypes getUser(@PathVariable Integer id) {
		return petsTypesService.findById(id);
	}

	@GetMapping("allusers")
	public List<PetsTypes> retrieveAllUsers() {
		return petsTypesService.findAll();
	}

//	@DeleteMapping("{id}")
//	public void deleteUser(@PathVariable Integer id) {
//		petsTypesService.deleteById(id);
//	
//}
}
