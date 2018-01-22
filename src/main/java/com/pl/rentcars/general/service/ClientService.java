package com.pl.rentcars.general.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pl.rentcars.general.entity.Client;
import com.pl.rentcars.general.repository.ClientRepository;

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
