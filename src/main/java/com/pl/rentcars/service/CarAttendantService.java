package com.pl.rentcars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pl.rentcars.entity.CarAttendant;
import com.pl.rentcars.repository.CarAttendantRepository;


@Service
@Transactional(readOnly = true)
public class CarAttendantService {
	
	@Autowired
	private CarAttendantRepository carAttendantRepository;

	public void addCarAttendant(CarAttendant carAttendant) {
		carAttendantRepository.save(carAttendant);
	}

	public void removeCarAttendant(Long id) {
		carAttendantRepository.delete(id);
	}
	
	public List<CarAttendant> findAll(){
		return carAttendantRepository.findAll();
	}

}
