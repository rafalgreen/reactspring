package com.pl.rentcars.controller.rest;

import com.pl.rentcars.entity.Rent;
import com.pl.rentcars.service.RentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;


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
	public ResponseEntity addRent(@RequestBody Rent rent) {
		// settery
		rentService.addRent(rent);
		return ResponseEntity.ok().body("addRent");
	}

	public ResponseEntity<Date> getSomeDate(){
		Date date =   rentService.getRentDateOrReturnDate();
		return ResponseEntity.ok().body(date);
	}
	
	
}
