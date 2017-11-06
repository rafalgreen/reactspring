package com.pl.rentcars.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "agencies")
public class Agency implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
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


	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "name", columnDefinition = "VARCHAR(512)",nullable = false)
	private String name;
	
	@Column(name = "phone_number", columnDefinition = "INT(11)")
	private int phoneNumber;
	
	@Column(name = "city", columnDefinition = "VARCHAR(45)")
	private String city;
	
	@Column(name = "street", columnDefinition = "VARCHAR(128)")
	private String street;
	
	@Column(name = "zip_code", columnDefinition = "VARCHAR(6)")
	private String zipCode;
	
	
	

	public Agency(Long id, String name, int phoneNumber, String city, String street, String zipCode) {
		super();
		this.id = id;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.street = street;
		this.zipCode = zipCode;
	}
	
	public Agency () {
		
	}
	

}
