package com.example.petclinic.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.petclinic.model.Pets;
import com.example.petclinic.service.PetsService;

@RestController
@RequestMapping("/pets/")
public class PetsController {
	
	
	@Autowired
	PetsService  petsService;
	
	
	@PostMapping("add/{id}")
	public void addPet(@PathVariable Integer id, @RequestBody Pets pets) {
		petsService.save(id, pets);
	}
	
	@PutMapping("update/{id}")
	public void updatePet(@PathVariable Integer id, @RequestParam("name") String name,@RequestParam("DOB")Date DOB) {
		petsService.update(id, name,DOB);
	}

	@GetMapping("{id}")
	public Pets getPet(@PathVariable Integer id) {
		return petsService.findById(id);
	}

	@GetMapping("allusers")
	public List<Pets> retrieveAlaPets() {
		return petsService.findAll();
	}

	@DeleteMapping("{id}/delete/{petId}")
	public void deleteUser(@PathVariable Integer id, @PathVariable Integer petId) {
		petsService.deleteById(id);
	
}
}
