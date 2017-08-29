package com.pl.rentcars.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "employees_addresses")
public class EmployeeAddress implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "city", columnDefinition = "VARCHAR(45)")
	private String city;
	
	@Column(name = "street", columnDefinition = "VARCHAR(45)")
	private String street;
	
	@Column(name = "number", columnDefinition = "INT(11)")
	private String number;
	
	@Column(name = "zip_code", columnDefinition = "VARCHAR(6)")
	private String zipCode;
	
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "id_employee")
	private Employee employee;

	// @OneToOne
	// @JoinColumn(name = "id_employee")
	// private Employee employee;
	
	

}
