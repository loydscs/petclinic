package com.example.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petclinic.model.Specialities;

public interface SpecialtiesRepository extends JpaRepository<Specialities, Integer> {

}
