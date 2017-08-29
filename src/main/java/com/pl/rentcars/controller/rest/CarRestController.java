package com.pl.rentcars.controller.rest;

import com.pl.rentcars.service.CarService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/car")
public class CarRestController {

	// @GetMapping("")
	// public ResponseEntity findCars() {
	// final List<Car> cars = carService.findCars();
	// return ResponseEntity.ok().body("cars list: " + cars);
	// }

	@PostMapping("")
	public ResponseEntity addCars() {
		return ResponseEntity.ok().body("addCars");
	}

	@Autowired
	private CarService carService;

}
