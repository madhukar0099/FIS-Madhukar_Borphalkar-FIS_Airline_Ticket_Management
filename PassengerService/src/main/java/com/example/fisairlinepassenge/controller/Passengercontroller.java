package com.example.fisairlinepassenge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fisairlinepassenge.modal.Passengerrole;
import com.example.fisairlinepassenge.service.PassengerService;

@RestController
@RequestMapping("/airpassenger")

public class Passengercontroller {
	
	@Autowired
	PassengerService service;
	
	
	@PostMapping("/add")
	public Passengerrole  adddata(@RequestBody Passengerrole admin) {
		return service.addData(admin);
	}
	
	@PutMapping("/update")
	public Passengerrole  updatedata(@RequestBody Passengerrole admin) {
		return service.updateData(admin);
	}
	
	@DeleteMapping("/delete/{profile_id}")
	public String deletePassenger(@PathVariable("profile_id")int profile_id) {
		return service.deleteData(profile_id);
	}
	
}
