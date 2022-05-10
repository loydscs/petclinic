package com.example.petclinic.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.petclinic.model.Appointment;
import com.example.petclinic.model.Users;
import com.example.petclinic.repository.AppointmentRepository;

@Service
public class AppointmentService {
	
	
		@Autowired
		AppointmentRepository  appointmentRepository ;
		
		
		public Appointment save(  Appointment appointment ) {
			Appointment newAppointment = null;
			 newAppointment = appointmentRepository.save(appointment);
			 return newAppointment;
		}
		
		public Appointment findById( Integer id ) {
			Optional<Appointment> appointment = appointmentRepository.findById( id);
			boolean present = appointment.isPresent();
			if (present) {
				return appointment.get();
			}
			return null;
		}
		
		public List<Appointment> findAll () {
			return appointmentRepository.findAll();
		}
		
		public boolean deleteById (Integer id) {
			Boolean isDeleted = false;
			Appointment appointment = appointmentRepository.getById(id);
				if (null != appointment) {
				appointmentRepository.deleteById(id);
				isDeleted = true;
			} else {
				isDeleted = false;
			}		
			return isDeleted;
		}
		
		public Boolean updateUser(Appointment appointment) {
			Optional<Appointment> findUser = appointmentRepository.findById(appointment.getId());
			Boolean isUpdated = false;
			if(findUser.isPresent()) {
				appointmentRepository.save(appointment);
				isUpdated = true;
			}
			else
				isUpdated = false;
				
			return isUpdated;
		}

		
		
	}


