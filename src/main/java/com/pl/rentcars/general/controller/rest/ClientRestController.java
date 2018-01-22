package com.pl.rentcars.general.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.pl.rentcars.general.entity.Client;
import com.pl.rentcars.general.service.ClientService;




@RestController
@RequestMapping("api/client")
public class ClientRestController {

	@Autowired
	private ClientService clientService;

	@GetMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity findClient() {
		final List<Client> clients = clientService.findAll();
		return ResponseEntity.ok().body("List of clients: " + clients);
	}


	// do dodawania
	@PostMapping("")
	public ResponseEntity addCleint(Client client) {
		// settery
		clientService.addClient(client);
		return ResponseEntity.ok().body("addClient");
	}
	
}
