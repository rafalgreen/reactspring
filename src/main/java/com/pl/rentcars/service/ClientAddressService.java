package com.pl.rentcars.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pl.rentcars.entity.ClientAddress;
import com.pl.rentcars.repository.ClientAddressRepository;

@Service
@Transactional(readOnly = true)
public class ClientAddressService {
	
	@Autowired
	private ClientAddressRepository clientAddressRepository;

	public void addClientAddress(ClientAddress clientAddress) {
		clientAddressRepository.save(clientAddress);
	}

	public void removeAgency(Long id) {
		clientAddressRepository.delete(id);
	}
	
	public List<ClientAddress> findAll(){
		return clientAddressRepository.findAll();
	}

}
