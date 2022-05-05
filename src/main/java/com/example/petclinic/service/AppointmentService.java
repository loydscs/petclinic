package com.example.petclinic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petclinic.model.Appointment;
import com.example.petclinic.repository.AppointmentRepository;

@Service
public class AppointmentService {
	
	
		@Autowired
		AppointmentRepository  appointmentRepository ;
		
		
		public void save(  Appointment user ) {
			appointmentRepository.save(user);
		}
		
		public Appointment findById( Integer id ) {
			return appointmentRepository.findById( id).get();
		}
		
		public List<Appointment> findAll () {
			return appointmentRepository.findAll();
		}
		
		public void deleteById (Integer id) {
			appointmentRepository.deleteById(id);
		}
	}


