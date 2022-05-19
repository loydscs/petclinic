package com.example.petclinic.dto;

import java.util.List;

import com.example.petclinic.model.Users;
import com.example.petclinic.model.Specialities;
public class VeterinarianDto extends Users{
	
	private List<Specialities> Specialities;

	public List<Specialities> getSpecialities() {
		return Specialities;
	}

	public void setSpecialities(List<Specialities> specialities) {
		Specialities = specialities;
	}
	
	

}