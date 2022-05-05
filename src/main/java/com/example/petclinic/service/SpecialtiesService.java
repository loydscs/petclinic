package com.example.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petclinic.model.Specialities;
import com.example.petclinic.repository.SpecialtiesRepository;

@Service
public class SpecialtiesService {
	
	@Autowired
	SpecialtiesRepository specialtiesRepository;
	
	public void save(  Specialities user ) {
		specialtiesRepository.save(user);
	}
	
	public Specialities findById( Integer id ) {
		return specialtiesRepository.findById( id).get();
	}
	
	public List<Specialities> findAll () {
		return specialtiesRepository.findAll();
	}
	
	public void deleteById (Integer id) {
		specialtiesRepository.deleteById(id);
	}
}
