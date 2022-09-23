package com.example.fisairlinepassenge.service;

import java.util.List;

import com.example.fisairlinepassenge.modal.Passengerrole;

public interface PassengerService {
	
	//public List<Passengerrole> getalldata();
	public Passengerrole addData(Passengerrole pass);
	public Passengerrole updateData(Passengerrole pass);
	public String deleteData(int profile_id);
	public String deletePassenger(int profile_id);

}
