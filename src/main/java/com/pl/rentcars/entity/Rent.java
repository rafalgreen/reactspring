package com.pl.rentcars.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@org.hibernate.annotations.Immutable//niezmienne egzemplarze
@Data
@Table(name = "rents")
public class Rent implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "rent_date", columnDefinition = "DATE",nullable = false)
	private Date rentDate;
	
	@Column(name = "return_date", columnDefinition = "DATE",nullable = false)
	private Date returnDate;
	
	@Column(name = "price_for_rent", columnDefinition = "INT(11)",nullable = false)
	private Integer PriceForRent;
	
	@Column(name = "client_id", columnDefinition = "INT(11)")
	private Long idClient;
	
	@Column(name = "car_id", columnDefinition = "INT(11)")
	private Long idCar;
	
	@Column(name = "rent_from", columnDefinition = "INT(11)")
	private Long rentFrom;	
	
	@Column(name = "return_where", columnDefinition = "INT(11)")
	private Long returnWhere;
	
	
	

}
