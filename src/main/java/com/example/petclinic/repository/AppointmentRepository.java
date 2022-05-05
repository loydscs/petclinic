package com.example.petclinic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.petclinic.model.Appointment;

public interface AppointmentRepository extends JpaRepository<Appointment, Integer>{

}
