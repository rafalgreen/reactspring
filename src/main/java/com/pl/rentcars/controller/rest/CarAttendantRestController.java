package com.pl.rentcars.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pl.rentcars.entity.CarAttendant;

import com.pl.rentcars.service.CarAttendantService;

@RestController
@RequestMapping("api/carattendant")
public class CarAttendantRestController {

	@Autowired
	private CarAttendantService carAttendantService;

	@GetMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity findCarAttendant() {
		final List<CarAttendant> carAttendants = carAttendantService.findAll();
		return ResponseEntity.ok().body("CarAttendants list: " + carAttendants);
	}

	@PostMapping("")
	public ResponseEntity addCarAttendant(CarAttendant carAttendant) {
		// settery
		carAttendantService.addCarAttendant(carAttendant);
		return ResponseEntity.ok().body("CarAttendant");
	}

}
