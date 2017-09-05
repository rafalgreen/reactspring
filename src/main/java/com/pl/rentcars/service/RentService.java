package com.pl.rentcars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.pl.rentcars.entity.Rent;
import com.pl.rentcars.repository.RentRepository;

@Service
@Transactional
public class RentService {
	
	@Autowired
	private RentRepository rentRepository;

	public void addRent(Rent rent) {
		rentRepository.save(rent);
	}

	public void removeRentDictionary(Long id) {
		rentRepository.delete(id);
	}
	public List<Rent> findAll(){
		return rentRepository.findAll();
	}
}
