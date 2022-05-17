package com.example.petclinic.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "appointment")
public class Appointment {
	@Id
	@GeneratedValue
	private int id;
	
	@Column(name = "appoinment_date")
	private Date appointmentDate;

	@ManyToOne
	@JoinColumn(name = "pet_id")
	private Pets pet;
	
	@ManyToOne
	@JoinColumn(name = "veterinarian_id")
	private Users veterinarian;
	
	@Column(name = "description")
	private String description;	
	
	@Column(name = "is_approved")
	private boolean isApproved;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getAppointmentDate() {
		return appointmentDate;
	}

	public void setAppointmentDate(Date  appointmentDate) {
		this.appointmentDate = appointmentDate;
	}

	public boolean isApproved() {
		return isApproved;
	}

	public void setApproved(boolean isApproved) {
		this.isApproved = isApproved;
	}

	public Appointment() {
	}

	public Pets getPet() {
		return pet;
	}

	public void setPet(Pets pet) {
		this.pet = pet;
	}

	public Users getVeterinarian() {
		return veterinarian;
	}

	public void setVeterinarian(Users veterinarian) {
		this.veterinarian = veterinarian;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
