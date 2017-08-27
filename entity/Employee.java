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
@Table(name = "employees")

public class Employee implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "first_name", columnDefinition = "VARCHAR(45)")
	private String firstName;
	@Column(name = "last_name", columnDefinition = "VARCHAR(45)")
	private String lastName;
	@Column(name = "date_of_birth", columnDefinition = "DATE")
	private String dateOfBirth;
	@Column(name = "phone_number", columnDefinition = "INT(11)")
	private String phoneNumber;
	@Column(name = "id_agency", columnDefinition = "INT(11)")
	private String idAgency;
	@Column(name = "id_position", columnDefinition = "INT(11)")
	private String idPosition;
	
	

}