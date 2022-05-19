package com.example.petclinic.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.management.relation.Role;

import org.codehaus.jettison.json.JSONArray;
import org.codehaus.jettison.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.petclinic.dto.VeterinarianDto;
import com.example.petclinic.model.Pets;
import com.example.petclinic.model.Roles;
import com.example.petclinic.model.Specialities;
import com.example.petclinic.model.Users;
import com.example.petclinic.model.VetSpecialties;
import com.example.petclinic.repository.RolesRepository;
import com.example.petclinic.repository.SpecialtiesRepository;
import com.example.petclinic.repository.UsersRepository;
import com.example.petclinic.repository.VetSpecialtiesRepository;

@Service
public class UserService {
	
	@Autowired
	RolesRepository  roleRepository ;
	
	@Autowired
	UsersRepository  userRepository ;
	
	@Autowired
	VetSpecialtiesRepository vetRepository ;
	private static final int veterinarianRoleId = 3;

	
//	public Users save(Users user ) {
//		Optional<Roles> userRole = roleRepository.findById(user.getRoleId());
//		if (userRole.isEmpty()) {
//		throw new IllegalArgumentException("Invalid User");
//	} else {
//	}
//
//		return  userRepository.save(user);
//
//	}
 
	public Users save(Users user ) {
		return userRepository.save(user);
	}
	

	public Users findById( Integer id ) {
		Optional<Users> user = userRepository.findById( id);
		boolean present = user.isPresent();
		if (present) {
			return user.get();
		}
		return null;
	}
	
	public List<Users> findAll () {
		return userRepository.findAll();
	}
	
	public Boolean deleteById ( Integer userId) {
		Boolean isDeleted = false;
		Optional<Users> user = userRepository.findById(userId);
		//int roleId = user.getRoleId();
		if(user.isPresent()) {
			userRepository.deleteById(userId);
			isDeleted = true;
		} else {
			isDeleted = false;
		}		
		return isDeleted;
	}
	

	public Boolean updateUser(Users user) {
		Optional<Users> findUser = userRepository.findById(user.getId());
		
		Boolean isUpdated = false;
		if(findUser.isPresent()) {
			userRepository.save(user);
			isUpdated = true;
		}
		else
			isUpdated = false;
			
		return isUpdated;
	}
	
	public List<Users> getUsersByRole (int roleId) {
		Roles role = new Roles();
		role.setId(roleId);
		List<Users> users  =  userRepository.findByRole(role);
		return users;
	}


	public Users saveVeterinarian(Users vet, JSONArray specialityIds) throws JSONException {
		Users user = userRepository.save(vet);
		if (user != null) {
			List<VetSpecialties> vetSpecialtyList = new ArrayList<VetSpecialties>();
			for (int i = 0; i < specialityIds.length(); i++) {
				VetSpecialties vetspecial = new VetSpecialties();
				int specialityId = specialityIds.getInt(i);
				vetspecial.setVeterinarianId(user.getId());
				vetspecial.setSpecialtyId(specialityId);
				vetSpecialtyList.add(vetspecial);
			}
			vetRepository.saveAll(vetSpecialtyList);
		}
		return user;
	}


	public List<VeterinarianDto> getVeterinarians() {
		Roles role = new Roles();
		role.setId(veterinarianRoleId);
		List<Users> vetUsers  =  userRepository.findByRole(role);
		List<VeterinarianDto> vetList = new ArrayList<VeterinarianDto>();
		vetUsers.forEach(user -> {
			VeterinarianDto vet = new VeterinarianDto();
			vet.setId(user.getId());
			vet.setFirstName(user.getFirstName());
			vet.setLastName(user.getLastName());
			vet.setEmail(user.getEmail());
			vet.setPhone(user.getPhone());
			List<Specialities> vetSpecialities  =  userRepository.findSpecialtiesByVetId(user.getId());
			vet.setSpecialities(vetSpecialities);
			vetList.add(vet);
		});
		return vetList;
	}

}


