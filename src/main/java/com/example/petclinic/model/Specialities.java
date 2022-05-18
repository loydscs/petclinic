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
	@ManyToMany(mappedBy = "specialities", fetch= FetchType.LAZY) //name of the field in vet entity
	private Set<Veterinarian> veterinarian;
	public Specialities() {
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
	
}
