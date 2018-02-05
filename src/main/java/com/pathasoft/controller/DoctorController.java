package com.pathasoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pathasoft.dao.DoctorRepository;
import com.pathasoft.model.Doctor;

@RestController
public class DoctorController {
	
	@Autowired
	DoctorRepository doctorRepository;

	@GetMapping("/getAllDoctor")
	public List<Doctor> getAllDoctor()
	{
		return doctorRepository.findAll();
	}
	
	
	@GetMapping("/getDoctor/{id}")
	public Doctor getAllDoctor(@PathVariable Long id)
	{
		return doctorRepository.getOne(id);
	}
	
}
