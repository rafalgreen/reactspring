package com.pl.rentcars.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pl.rentcars.entity.Client;
import com.pl.rentcars.repository.ClientRepository;

@Service
@Transactional
public class ClientService {

	@Autowired
	private ClientRepository clientRepository;

	public void addClient(Client client) {
		clientRepository.save(client);
	}

	public void removeClient(Long id) {
		clientRepository.delete(id);
	}
	public List<Client> findAll(){
		return clientRepository.findAll();
	}

}
