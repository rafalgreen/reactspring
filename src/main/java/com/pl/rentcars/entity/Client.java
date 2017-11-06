package com.pl.rentcars.entity;

import java.io.Serializable;
import java.sql.Date;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "clients")
public class Client implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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
	
	public Client() {
		
	}

	public Client(Long id, String firstName, String lastName, String email, Date dateOfBirth, Date phoneNumber,
			int creditCard, Long idAgency, ClientAddress clientAddress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.creditCard = creditCard;
		this.idAgency = idAgency;
		this.clientAddress = clientAddress;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Date getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(Date phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public int getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(int creditCard) {
		this.creditCard = creditCard;
	}

	public Long getIdAgency() {
		return idAgency;
	}

	public void setIdAgency(Long idAgency) {
		this.idAgency = idAgency;
	}

	public ClientAddress getClientAddress() {
		return clientAddress;
	}

	public void setClientAddress(ClientAddress clientAddress) {
		this.clientAddress = clientAddress;
	}
	
	

}
