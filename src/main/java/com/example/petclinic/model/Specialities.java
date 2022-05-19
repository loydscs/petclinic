package com.example.petclinic.model;

import java.util.Set;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name ="specialties")
public class Specialities {
	
    @Id
    @GeneratedValue
    @Column(name = "id")
	private int id;
	private String name;

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
	
}
