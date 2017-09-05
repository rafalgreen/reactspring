package com.pl.rentcars.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pl.rentcars.entity.Employee;
import com.pl.rentcars.service.EmployeeService;

@RestController
@RequestMapping("api/employee")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity findEmployee() {
		final List<Employee> employees = employeeService.findAll();
		return ResponseEntity.ok().body("List of employees: " + employees);
	}

	@PostMapping("")
	public ResponseEntity addEmployee(Employee employee) {
		// settery
		employeeService.addEmployee(employee);
		return ResponseEntity.ok().body("addEmployee");
	}

}
