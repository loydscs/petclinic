package com.example.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.petclinic.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer>{
	
	Users findByEmail(String email);
	
	
}
