package com.example.petclinic.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petclinic.model.Pets;
import com.example.petclinic.model.Users;
import com.example.petclinic.repository.PetsRepository;
import com.example.petclinic.repository.UsersRepository;


@Service
public class PetsService {
	
	
	@Autowired
	PetsRepository  petsRepository ;
	
	@Autowired
	UsersRepository usersRepository;
	
	public void save(Integer id, Pets user ) {
		Users loggedUser = usersRepository.getById(id);
		int roleId = loggedUser.getRoleId();
		if (roleId != 2) {
			throw new IllegalArgumentException("Unauthorized user");
		}
		petsRepository.save(user);
	}
	
	public void update(Integer id, String name, Date DOB) {
		Pets pet = petsRepository.getById(id);
		if (null == pet) {
			throw new NullPointerException("Invalid user Id");
		} 
		pet.setName(name);
		pet.setDOB(DOB);
		
		petsRepository.save(pet);
	}
	
	public Pets findById( Integer id ) {
		return petsRepository.findById( id).get();
	}
	
	public List<Pets> findAll () {
		return petsRepository.findAll();
	}
	
	public void deleteById (Integer id) {
		Users loggedUser = usersRepository.getById(id);
		int roleId = loggedUser.getRoleId();
		if (roleId != 2) {
			throw new IllegalArgumentException("Unauthorized user");
		}
		petsRepository.deleteById(id);
	}
}
