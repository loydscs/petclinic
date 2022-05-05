//package com.example.petclinic.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.DeleteMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.example.petclinic.model.PetsTypes;
//import com.example.petclinic.model.VetSpecialties;
//import com.example.petclinic.service.PetsTypesService;
//import com.example.petclinic.service.VetSpecialtiesService;
//
//@RestController
//@RequestMapping("/vetSpecialties/")
//public class VetSpecialtiesController {
//	
//	
//		@Autowired
//		VetSpecialtiesService  vetSpecialtiesService;
//		
//		
////		@PostMapping("add")
////		public void addUser(@RequestBody VetSpecialties role) {
////			vetSpecialtiesService.save(role);
////		}
//
//		@GetMapping("{id}")
//		public VetSpecialties getUser(@PathVariable Integer id) {
//			return vetSpecialtiesService.findById(id);
//		}
//
//		@GetMapping("allusers")
//		public List<VetSpecialties> retrieveAllUsers() {
//			return vetSpecialtiesService.findAll();
//		}
//
////		@DeleteMapping("{id}")
////		public void deleteUser(@PathVariable Integer id) {
////			vetSpecialtiesService.deleteById(id);
////		
////	}
//	}
//
