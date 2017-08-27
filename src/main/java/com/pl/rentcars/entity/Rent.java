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
@Table(name = "rents")
public class Rent implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "rent_date", columnDefinition = "DATE")
	private String rentDate;
	@Column(name = "return_date", columnDefinition = "DATE")
	private String returnDate;
	@Column(name = "price_for_rent", columnDefinition = "INT(11)")
	private String PriceForRent;
	@Column(name = "client_id", columnDefinition = "INT(11)")
	private String idClient;
	@Column(name = "car_id", columnDefinition = "INT(11)")
	private String idCar;
	@Column(name = "rent_from", columnDefinition = "INT(11)")
	private String rentFrom;	
	@Column(name = "return_where", columnDefinition = "INT(11)")
	private String returnWhere;
	

}
