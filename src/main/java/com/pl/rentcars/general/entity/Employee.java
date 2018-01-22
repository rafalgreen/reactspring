package com.pl.rentcars.general.entity;

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
@Table(name = "employees")
public class Employee implements Serializable {
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

	@Column(name = "date_of_birth", columnDefinition = "DATE")
	private Date dateOfBirth;

	@Column(name = "phone_number", columnDefinition = "INT(11)")
	private String phoneNumber;

	@Column(name = "id_agency", columnDefinition = "INT(11)")
	private Long idAgency;

	@Column(name = "id_position", columnDefinition = "INT(11)")
	private PositionDictionary position;

	@OneToOne(mappedBy = "employee")
	private EmployeeAddress employeeAddress;

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

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Long getIdAgency() {
		return idAgency;
	}

	public void setIdAgency(Long idAgency) {
		this.idAgency = idAgency;
	}

	public PositionDictionary getPosition() {
		return position;
	}

	public void setPosition(PositionDictionary position) {
		this.position = position;
	}

	public EmployeeAddress getEmployeeAddress() {
		return employeeAddress;
	}

	public void setEmployeeAddress(EmployeeAddress employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public Employee(Long id, String firstName, String lastName, Date dateOfBirth, String phoneNumber, Long idAgency,
			PositionDictionary position, EmployeeAddress employeeAddress) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.phoneNumber = phoneNumber;
		this.idAgency = idAgency;
		this.position = position;
		this.employeeAddress = employeeAddress;
	}

	public Employee() {

	}

}
