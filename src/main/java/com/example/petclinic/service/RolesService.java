package com.example.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petclinic.model.Roles;
import com.example.petclinic.repository.RolesRepository;
@Service
public class RolesService {

	@Autowired
	RolesRepository rolesRepository ;
	
	
	public void save(  Roles user ) {
		rolesRepository.save(user);
	}
	
	public Roles findById( Integer id ) {
		return rolesRepository.findById( id).get();
	}
	
	public List<Roles> findAll () {
		return rolesRepository.findAll();
	}
	
	public void deleteById (Integer id) {
		rolesRepository.deleteById(id);
	}
	
}
