package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Entity.Registration;

public interface RegistrationRepo extends JpaRepository<Registration, Integer> {

}
