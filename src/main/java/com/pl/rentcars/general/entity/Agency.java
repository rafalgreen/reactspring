package com.pl.rentcars.general.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "agencies")
@NoArgsConstructor
@AllArgsConstructor
public class Agency implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


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

}
