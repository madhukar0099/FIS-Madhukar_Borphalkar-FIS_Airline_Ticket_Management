package com.springbootstarter.genericService.Impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springbootstarter.flight.flight;
import com.springbootstarter.flightDTO.flightDTO;
import com.springbootstarter.genericService.genericService;
import com.springbootstarter.user.User;
import com.springbootstarter.userDTO.userDTO;

@Service
public class genericServiceImpl implements genericService {

	private List<User> users = new ArrayList<>(Arrays.asList(
			new User(1, "Atharv", 9766, "at@gmail.com", "Pune", "12345")
			));
	private List<flight> flights = new ArrayList<>(Arrays.asList(
			new flight(1, 1, "Vistara", "Pune", "Delhi", "12:00:00", "00:00:00", "12:00", 100)
			));
	
	public List<User> getUserList() {
		return users;
	}

	@Override
	public Optional<User> getUserById(int id) {
		return users.stream().filter(u -> u.getID()==id ).findFirst();
	}

	@Override
	public boolean addUser(userDTO user) {
		User u = new User();
		u.setID(user.getID());
		u.setName(user.getName());
		u.setContactNo(user.getContactNo());

		return ( users.add(u) );
		
	}

	@Override
	public boolean updateUser(userDTO user, int id) {
		boolean flag = false;
		
		for(int i=0; i<users.size(); i++) {
			User u = users.get(i);
			if(u.getID() == id) {
				u.setContactNo(user.getContactNo());
				u.setName(user.getName());
				flag=true;
			}
		}
		
		return flag;
	}

	@Override
	public boolean deleteUser(int id) {
		boolean flag = false;
		flag = users.removeIf(u -> u.getID() == id);
		return flag;
	}

	@Override
	public boolean addFlight(flightDTO flight) {
		flight fli = new flight();
		fli.setAirline_from(flight.getAirline_from());
		fli.setAirline_id(flight.getAirline_id());
		fli.setAirline_name(flight.getAirline_name());
		fli.setAirline_to(flight.getAirline_to());
		fli.setArr_time(flight.getArr_time());
		fli.setDept_time(flight.getDept_time());
		fli.setDur(flight.getDur());
		fli.setTotal_seat(flight.getTotal_seat());
		fli.setFlight_id(flight.getFlight_id());
		return (flights.add(fli));
	}

	@Override
	public boolean updateFlight(flightDTO flight, int flight_id) {
		boolean flag = false;
		
		for(int i=0; i<flights.size(); i++) {
			flight fli = flights.get(i);
			if(fli.getFlight_id() == flight_id) {
				fli.setAirline_from(flight.getAirline_from());
				fli.setAirline_id(flight.getAirline_id());
				fli.setAirline_name(flight.getAirline_name());
				fli.setAirline_to(flight.getAirline_to());
				fli.setArr_time(flight.getArr_time());
				fli.setDept_time(flight.getDept_time());
				fli.setDur(flight.getDur());
				fli.setTotal_seat(flight.getTotal_seat());
				fli.setFlight_id(flight.getFlight_id());
				flag=true;
			}
		}
		
		return flag;
	}

	@Override
	public List<flight> getFlightList() {
		return flights;
	}

	@Override
	public boolean deleteFlight(int id) {
		boolean flag = false;
		flag = flights.removeIf(fli -> fli.getFlight_id() == id);
		return flag;
	}
}
