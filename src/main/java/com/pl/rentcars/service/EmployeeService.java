package com.pl.rentcars.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.pl.rentcars.entity.Employee;
import com.pl.rentcars.repository.EmployeeRepository;

@Service
@Transactional
public class EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	public void addEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	public void removeClient(Long id) {
		employeeRepository.delete(id);
	}
	
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}

}
