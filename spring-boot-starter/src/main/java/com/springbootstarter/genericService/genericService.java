package com.springbootstarter.genericService;

import java.util.List;
import java.util.Optional;

import com.springbootstarter.flight.flight;
import com.springbootstarter.flightDTO.flightDTO;
import com.springbootstarter.user.User;
import com.springbootstarter.userDTO.userDTO;

public interface genericService {
	public List<User> getUserList();
	public Optional<User> getUserById(int id);
	public boolean addUser(userDTO user);
	public boolean updateUser(userDTO user, int id);
	public boolean deleteUser(int id);
	public boolean addFlight(flightDTO flight);
	public boolean updateFlight(flightDTO flight, int flight_id);
	public List<flight> getFlightList();
	boolean deleteFlight(int id);
	
}
