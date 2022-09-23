package com.example.fisairlineadmin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.fisairlineadmin.modal.Adminrole;
import com.example.fisairlineadmin.repo.AdminroleRepository;

@Service
public class AdminServiceImpl implements AdminService {
	
	@Autowired
	AdminroleRepository repo;
	
	@Autowired
	FeignProxy proxy;

	
	@Override
	public List<Adminrole> getalldata() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}
	
	
	@Override
	public Adminrole addData(Adminrole admin) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}

	@Override
	public Adminrole updateData(Adminrole admin) {
		// TODO Auto-generated method stub
		return repo.save(admin);
	}

	@Override
	public String deleteData(int fl_id) {
		// TODO Auto-generated method stub
		repo.deleteById(fl_id);
		return "deleted";
	}


	@Override
	public String deletePassenger(int profile_id) {
		// TODO Auto-generated method stub
		return proxy.deleteNotes(profile_id);
	}

	

}
