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
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "name", columnDefinition = "VARCHAR(512)")
	private String name;
	
	@Column(name = "phone_number", columnDefinition = "INT(11)")
	private String phoneNumber;
	
	@Column(name = "city", columnDefinition = "VARCHAR(45)")
	private String city;
	
	@Column(name = "street", columnDefinition = "VARCHAR(128)")
	private String street;
	
	@Column(name = "zip_code", columnDefinition = "VARCHAR(6)")
	private String zipCode;
	

}
