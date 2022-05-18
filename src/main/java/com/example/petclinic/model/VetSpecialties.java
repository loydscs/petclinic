package com.example.petclinic.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "vet_specialties")
public class VetSpecialties {

	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "veterinarian_id")
	private int veterinarianId;
	
	@Column(name = "specialty_id")
	private int specialtyId;


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getVeterinarianId() {
		return veterinarianId;
	}

	public void setVeterinarianId(int veterinarianId) {
		this.veterinarianId = veterinarianId;
	}

	public int getSpecialtyId() {
		return specialtyId;
	}

	public void setSpecialtyId(int specialtyId) {
		this.specialtyId = specialtyId;
	}	
}
