package com.pl.rentcars.general.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pl.rentcars.general.entity.EmployeeAddress;
import com.pl.rentcars.general.repository.EmployeeAddressRepository;

@Service
@Transactional
public class EmployeeAddressService {

	@Autowired
	private EmployeeAddressRepository employeeAddressRepository;

	public void addEmployeeAddress(EmployeeAddress employeeAddress) {
		employeeAddressRepository.save(employeeAddress);
	}

	public void removeAgency(Long id) {
		employeeAddressRepository.delete(id);
	}

	public List<EmployeeAddress> findAll() {
		return employeeAddressRepository.findAll();
	}

	
}