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
import com.example.petclinic.service.AppointmentService;
@RestController
@RequestMapping("/appointment/")
public class AppointmentController {

	@Autowired
	AppointmentService  appointmentService ; 
	
	@PostMapping("add")
	public void addUser(@RequestBody Appointment role) {
		appointmentService.save(role);
	}

	@GetMapping("{id}")
	public Appointment getUser(@PathVariable Integer id) {
		return appointmentService.findById(id);
	}

	@GetMapping("allusers")
	public List<Appointment> retrieveAllUsers() {
		return appointmentService.findAll();
	}

	@DeleteMapping("{id}")
	public void deleteUser(@PathVariable Integer id) {
		appointmentService.deleteById(id);
	
}
	
}
