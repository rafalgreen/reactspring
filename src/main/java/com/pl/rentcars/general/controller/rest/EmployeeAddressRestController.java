package com.pl.rentcars.general.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.pl.rentcars.general.entity.EmployeeAddress;
import com.pl.rentcars.general.service.EmployeeAddressService;

@RestController
@RequestMapping("api/employeeaddress")
public class EmployeeAddressRestController {

	@Autowired
	private EmployeeAddressService employeeAddressService;

	@GetMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity findClientAddress() {
		final List<EmployeeAddress> employeeAddresses = employeeAddressService.findAll();
		return ResponseEntity.ok().body("Addresses of employees: " + employeeAddresses);
	}

	@PostMapping("")
	public ResponseEntity addEmployeeAddress(EmployeeAddress employeeAddress) {
		// settery
		employeeAddressService.addEmployeeAddress(employeeAddress);
		return ResponseEntity.ok().body("addEmployeeAddress");
	}

}
