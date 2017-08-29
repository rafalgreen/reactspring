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

}
