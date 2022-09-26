package com.springbootstarter.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springbootstarter.flight.flight;
import com.springbootstarter.flightDTO.flightDTO;
import com.springbootstarter.genericService.Impl.genericServiceImpl;
import com.springbootstarter.user.User;
import com.springbootstarter.userDTO.userDTO;

@RestController
@RequestMapping("/v1")
public class Controller {
	
	@Autowired
	genericServiceImpl genericService;

	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		return "Hello User!";
	}
	
	@RequestMapping(value="/user/list", method=RequestMethod.GET)
	public List<User> userList() {
		return genericService.getUserList();
	}
	
	@RequestMapping(value="/user/{id}", method=RequestMethod.GET)
	public Optional<User> userProfile(@PathVariable int id) {
		return genericService.getUserById(id);
	}
	
	@RequestMapping(value="/user/add", method=RequestMethod.POST)
	public String addUser(@RequestBody userDTO user) {
		if(genericService.addUser(user) == true) {
			return user.toString();
		}
		else
			return "Error Occured!";
	}
	
	@RequestMapping(value="/user/update/{id}", method=RequestMethod.PUT)
	public String updateUser(@RequestBody userDTO user, @PathVariable int id) {
		if(genericService.updateUser(user, id) == true) {
			return "User Updated! ID = "+id;
		}
		return "Failed to update user! ID = "+id;
	}
	
	@RequestMapping(value="/user/delete/{id}", method=RequestMethod.DELETE)
	public String deleteUser(@PathVariable int id) {
		if(genericService.deleteUser(id)==true) {
			return "User Deleted! ID = " + id;
		}
		return "User Not Deleted! ID = "+id;
	}
	
	@RequestMapping(value="/flight/list", method=RequestMethod.GET)
	public List<flight> flightList() {
		return genericService.getFlightList();
	}
	
	@RequestMapping(value="/flight/add", method=RequestMethod.POST)
	public String addFlight(@RequestBody flightDTO flight) {
		if(genericService.addFlight(flight) == true) {
			return flight.toString();
		}
		else
			return "Error Occured!";
	}
	
	@RequestMapping(value="/flight/update/{id}", method=RequestMethod.PUT)
	public String updateFlight(@RequestBody flightDTO flight, @PathVariable int id) {
		if(genericService.updateFlight(flight, id) == true) {
			return "Flight Updated! ID = "+id;
		}
		return "Failed to update flight! ID = "+id;
	}
	
	@RequestMapping(value="/flight/delete/{id}", method=RequestMethod.DELETE)
	public String deleteFlight(@PathVariable int id) {
		if(genericService.deleteFlight(id)==true) {
			return "Flight Deleted! ID = " + id;
		}
		return "Flight Not Deleted! ID = "+id;
	}
}
