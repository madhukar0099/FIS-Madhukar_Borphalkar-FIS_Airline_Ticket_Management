package com.example.fisairlineadmin.service;

import java.util.List;

import com.example.fisairlineadmin.modal.Adminrole;

public interface AdminService {
	
	public List<Adminrole> getalldata();
	public Adminrole addData(Adminrole admin);
	public Adminrole updateData(Adminrole admin);
	public String deleteData(int fl_id);
	public String deletePassenger(int profile_id);
	//public String deletePassenger(int p_id);

}
