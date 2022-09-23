package com.example.fisairlineadmin.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.fisairlineadmin.modal.Adminrole;
import com.example.fisairlineadmin.service.AdminService;

@RestController
@RequestMapping("/airline")

public class admincontroller {
	
	@Autowired
	AdminService service;
	
	@GetMapping("/all")
	public List<Adminrole> getall()
	{
		return service.getalldata();
	}
	
	@PostMapping("/add")
	public Adminrole  adddata(@RequestBody Adminrole admin) {
		return service.addData(admin);
	}
	
	@PutMapping("/update")
	public Adminrole  updatedata(@RequestBody Adminrole admin) {
		return service.updateData(admin);
	}
	
	@DeleteMapping("/delete/{fl_id}")
	public String deleteNotes(@PathVariable("fl_id")int flid) {
		return service.deleteData(flid);
	}
	
	@DeleteMapping("/deletePassenger/{profile_id}")
	public String deletePassenger(@PathVariable("profile_id")int profile_id) {
		return service.deleteData(profile_id);
	}
	
}
