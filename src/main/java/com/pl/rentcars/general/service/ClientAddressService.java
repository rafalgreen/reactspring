package com.pl.rentcars.general.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.pl.rentcars.general.entity.ClientAddress;
import com.pl.rentcars.general.repository.ClientAddressRepository;

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
