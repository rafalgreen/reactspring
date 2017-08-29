package com.pl.rentcars.entity;

import java.io.Serializable;
import java.sql.Date;

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
@Table(name = "clients")
public class Client implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "first_name", columnDefinition = "VARCHAR(45)")
	private String firstName; 
	
	@Column(name = "last_name", columnDefinition = "VARCHAR(45)")
	private String lastName;
	
	@Column(name = "email", columnDefinition = "VARCHAR(45)")
	private String email;
	
	@Column(name = "date_of_birth", columnDefinition = "VARCHAR(45)")
	private Date dateOfBirth;
	
	@Column(name = "phone_number", columnDefinition = "INT")
	private Date phoneNumber;
	
	@Column(name = "credit_card", columnDefinition = "INT")
	private int creditCard;
	
	@Column(name = "id_agency", columnDefinition = "INT")
	private Long idAgency;
	
	@OneToOne(mappedBy = "client")//nazwa zmiennej w CLientAddress
    private ClientAddress clientAddress;
	
	

}
