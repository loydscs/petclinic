package com.example.petclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Type;

import lombok.Data;
@Entity
@Data
@Table(name = "pets")
public class Pets {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	
	@Type(type="date")
	private Date DOB;
	
	@ManyToOne
	@JoinColumn(name = "pet_type_id")
	PetTypes petType;

	
	@OneToOne
	@JoinColumn(name = "user_id")
	Users petOwner;

	public Pets() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	
	public Users getPetowner() {
		return petOwner;
	}

	public void setPetowner(Users petOwner) {
		this.petOwner = petOwner;
	}

	public PetTypes getPetType() {
		return petType;
	}

	public void setPetType(PetTypes petType) {
		this.petType = petType;
	}
	
}
