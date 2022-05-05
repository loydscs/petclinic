package com.example.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petclinic.model.PetsTypes;

public interface PetsTypesRepository extends JpaRepository<PetsTypes, Integer> {

}
