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

import com.example.petclinic.model.Appointment;
import com.example.petclinic.model.Veterinarian;
import com.example.petclinic.service.VeterinarianService;

@RestController
@RequestMapping("/vet/")
public class VeterinarianController {

	@Autowired
	VeterinarianService veterinarianService;
	
	@PostMapping("add/{id}")
	public void addVet(@PathVariable Integer id, @RequestBody Veterinarian veterinarian) {
		veterinarianService.save(id, veterinarian);
	}

	@GetMapping("{id}")
	public Veterinarian getUser(@PathVariable Integer id) {
		return veterinarianService.findById(id);
	}

	@GetMapping("allusers")
	public List<Veterinarian> retrieveAllUsers() {
		return veterinarianService.findAll();
	}

	@DeleteMapping("{id}/delete/{vetId}")
	public void deleteVet(@PathVariable Integer id, @PathVariable Integer vetId) {
		veterinarianService.deleteById(id, vetId);
	}
}
