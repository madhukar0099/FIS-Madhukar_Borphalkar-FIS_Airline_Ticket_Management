package com.example.fisairlinepassenge.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.fisairlinepassenge.modal.Passengerrole;

public interface PassengerRepository extends JpaRepository<Passengerrole,Integer> {

}
