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
@Table(name = "clients_addresses")
public class ClientAddress implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "city", columnDefinition = "VARCHAR(45)",nullable = false)
	private String city;
	
	@Column(name = "street", columnDefinition = "VARCHAR(128)",nullable = false)
	private String street;
	
	@Column(name = "number", columnDefinition = "INT(11)",nullable = false)
	private String number;
	
	@Column(name = "zipe_code", columnDefinition = "VARCHAR(6)",nullable = false)
	private String zipCode;
	
	@OneToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY, optional = true)
	@JoinColumn(name = "id")
	private Client client;

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

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public ClientAddress(Long id, String city, String street, String number, String zipCode, Client client) {
		super();
		this.id = id;
		this.city = city;
		this.street = street;
		this.number = number;
		this.zipCode = zipCode;
		this.client = client;
	}
	
	public ClientAddress() {
		
	}

}
