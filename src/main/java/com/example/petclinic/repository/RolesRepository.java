package com.example.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petclinic.model.Roles;

public interface RolesRepository extends JpaRepository<Roles, Integer> {

}
