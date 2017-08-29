package com.pl.rentcars.service;

import com.pl.rentcars.entity.Car;
import com.pl.rentcars.repository.CarRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class CarService {

	@Autowired
	private CarRepository carRepository;
	
	public void addCar() {
		Car car = new Car();
	carRepository.save(new Car());
	}

}
