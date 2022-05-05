package com.example.petclinic.model;

import java.util.Set;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "veterenarian")
public class Veterinarian {
	
	@Id
	@GeneratedValue
	@Column(name = "vet_id")
	private int id;
	private String firstName;
	private String lastName;
	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinTable(
	        name = "vet_specialities", //name of the table
	        joinColumns = @JoinColumn(name = "vet_id"),
	        inverseJoinColumns = @JoinColumn(name = "speciality_id"))
	private Set<Specialities> specialities;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Veterinarian() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}
