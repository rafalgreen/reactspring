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
import com.pl.rentcars.entity.Rent;
import com.pl.rentcars.service.RentService;


@RestController
@RequestMapping("api/rent")
public class RentRestController {
	
	@Autowired
	private RentService rentService;

	@GetMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity findRent() {
		final List<Rent> rents = rentService.findAll();
		return ResponseEntity.ok().body("List of clients: " + rents);
	}


	// do dodawania
	@PostMapping("")
	public ResponseEntity addRent(Rent rent) {
		// settery
		rentService.addRent(rent);
		return ResponseEntity.ok().body("addRent");
	}
	
	
}
