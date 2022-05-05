package com.example.petclinic.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
@Entity
@Data
@Table(name = "pets")
public class Pets {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private Date DOB;
	
	@Column(name = "pet_type_id")
	private int petTypeId;
	
	@Column(name = "user_id")
	private int userId;

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

	public int getPetTypeId() {
		return petTypeId;
	}

	public void setPetTypeId(int petTypeId) {
		this.petTypeId = petTypeId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}
	
	
	
}
