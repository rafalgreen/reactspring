package com.pl.rentcars.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pl.rentcars.entity.Car;
import com.pl.rentcars.service.CarService;

@RestController
@RequestMapping("api/car")
public class CarRestController {

	@Autowired
	private CarService carService;

	// clean code, wykorzystujemy metody
	// jestem w kontekscie car
	// do pobierania
	// get i post przez protokol http

	@GetMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity findCars() {
		// responseEntity to co chce zwrocic
		// posiada status zadania
		// moze przyjmowac status
		final List<Car> cars = carService.findCars();
		return ResponseEntity.ok().body("Cars list: " + cars);
	}

	// do dodawania
	@PostMapping("")
	public ResponseEntity addCars(Car car) {
		// settery
		carService.addCar(car);
		return ResponseEntity.ok().body("addCars");
	}

}
