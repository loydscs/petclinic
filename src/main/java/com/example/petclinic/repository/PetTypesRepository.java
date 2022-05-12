package com.example.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petclinic.model.PetTypes;

public interface PetTypesRepository extends JpaRepository<PetTypes, Integer> {

}
