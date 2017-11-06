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
public class EmployeeAddress implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

	@OneToOne(cascade = CascadeType.DETACH, fetch = FetchType.EAGER, optional = true)
	// fetch
	@JoinColumn(name = "id")
	private Employee employee;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	public EmployeeAddress(Long id, String city, String street, String number, String zipCode, Employee employee) {
		super();
		this.id = id;
		this.city = city;
		this.street = street;
		this.number = number;
		this.zipCode = zipCode;
		this.employee = employee;
	}

	public EmployeeAddress() {

	}

}
