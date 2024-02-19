package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.demo.Entity.Registration;
import com.example.demo.Repository.RegistrationRepo;

@Service
public class RegistrationService {

	@Autowired
	public RegistrationRepo registrationRepo;
	
	//POST DETAILS
	public Registration SaveDetails(Registration registration) {
		
		return registrationRepo.save(registration);
	}
	
	//GET DETAILS
	public List<Registration> FindDetails() {
		return registrationRepo.findAll();
	}
	
	//UPDATE DETAILS
	public Registration updateDetails(Registration registration) {
		
		Registration updateRegistration = registrationRepo.findById(registration.getStudent_ID()).orElse(null);
		if(updateRegistration!=null) {
			
			updateRegistration.setStudent_Name(registration.getStudent_Name());
			updateRegistration.setPlace(registration.getPlace());
			updateRegistration.setCourse(registration.getCourse());
		registrationRepo.save(updateRegistration);
		return updateRegistration;
		}
		return null;
	}
	
	//DELETE DETAILS
	public  String DeleteMapping(int id) {
		registrationRepo.deleteById(id);
		return "Deleted "+id;	
		}
}
