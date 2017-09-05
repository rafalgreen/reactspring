package com.pl.rentcars.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pl.rentcars.entity.ClientAddress;
import com.pl.rentcars.service.ClientAddressService;

@RestController
@RequestMapping("api/clientaddress")
public class ClientAddressRestController {

	@Autowired
	private ClientAddressService clientAddressService;

	@GetMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity findClientAddress() {
		final List<ClientAddress> clientAddresses = clientAddressService.findAll();
		return ResponseEntity.ok().body("Addresses of clients: " + clientAddresses);
	}

	// do dodawania
	@PostMapping("")
	public ResponseEntity addClientAddress(ClientAddress clientAddress) {
		// settery
		clientAddressService.addClientAddress(clientAddress);
		return ResponseEntity.ok().body("addClientAddress");
	}

}
