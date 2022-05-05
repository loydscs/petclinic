//package com.example.petclinic.service;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import com.example.petclinic.model.VetSpecialties;
//import com.example.petclinic.repository.VetSpecialtiesRepository;
//
//@Service
//public class VetSpecialtiesService {
//	
//	
//	@Autowired
//	VetSpecialtiesRepository vetSpecialtiesRepository ;
//	
//	
//	public void save(  VetSpecialties user ) {
//		vetSpecialtiesRepository.save(user);
//	}
//	
//	public VetSpecialties findById( Integer id ) {
//		return vetSpecialtiesRepository.findById( id).get();
//	}
//	
//	public List<VetSpecialties> findAll () {
//		return vetSpecialtiesRepository.findAll();
//	}
//	
//	public void deleteById (Integer id) {
//		vetSpecialtiesRepository.deleteById(id);
//	}
//}
