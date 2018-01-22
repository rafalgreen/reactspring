package com.pl.rentcars.general.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pl.rentcars.general.entity.Agency;
import com.pl.rentcars.general.service.AgencyService;

@RestController
@RequestMapping("api/agency")
public class AgencyRestController {
	
	@Autowired
	private AgencyService agencyService;
	
	@GetMapping( value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity findAgency() {
	final List<Agency> agencies = agencyService.findAll();
	return ResponseEntity.ok().body("Agencies list: " + agencies);
	 }

	
	@PostMapping("")
	public ResponseEntity addAgenyc(Agency agency) {
		agency.setId(agency.getId());
		agency.setCity(agency.getCity());
		agency.setName(agency.getCity());
		agency.setPhoneNumber(agency.getPhoneNumber());
		agency.setStreet(agency.getStreet());
		agency.setZipCode(agency.getZipCode());
		agencyService.addAgency(agency);
		return ResponseEntity.ok().body("addAgency");
	}
}
