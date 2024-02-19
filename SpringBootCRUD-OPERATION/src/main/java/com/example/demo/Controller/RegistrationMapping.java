package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Entity.Registration;
import com.example.demo.Service.RegistrationService;

@RestController
public class RegistrationMapping {

	@Autowired
	public RegistrationService registrationService;
	
	//POST METHOD
	@PostMapping("/Add")
	public Registration SaveRegistration(@RequestBody Registration registration) {
		
		return registrationService.SaveDetails(registration);
	}
	
	//GET METHOD
	@GetMapping("/get")
	public List<Registration> fecthRegistration() {
		return registrationService.FindDetails();
	}
	
	//PUT METHOD
	@PutMapping("/update")
	public Registration updateRegistrationDetails( @RequestBody Registration registration) {
		
		return registrationService.updateDetails(registration);
	}
	
	//DELETE METHOD
	@DeleteMapping("/deleted/{id}")
	public String deletedRegistrationValues(@PathVariable int id) {
		return registrationService.DeleteMapping(id);
		 
	}
	
	
}
