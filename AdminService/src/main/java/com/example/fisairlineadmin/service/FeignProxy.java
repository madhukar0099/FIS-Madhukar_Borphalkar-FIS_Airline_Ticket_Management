package com.example.fisairlineadmin.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="passenger",url="http://localhost:9092/airline")
public interface FeignProxy {
	
	@DeleteMapping("/airline/delete/{profile_id}")
	public String deleteNotes(@PathVariable("profile_id")int profile);

}
