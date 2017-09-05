package com.pl.rentcars.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.pl.rentcars.entity.EmployeeAddress;
import com.pl.rentcars.repository.EmployeeAddressRepository;

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