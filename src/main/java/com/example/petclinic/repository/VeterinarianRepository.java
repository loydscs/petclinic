package com.example.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petclinic.model.Veterinarian;

public interface VeterinarianRepository extends JpaRepository<Veterinarian, Integer>{
	
}
