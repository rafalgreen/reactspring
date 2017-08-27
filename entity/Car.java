package com.pl.rentcars.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name = "cars")
public class Car implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "name", columnDefinition = "VARCHAR(45)")
	private String name;
	
	@Column(name = "brand", columnDefinition = "VARCHAR(45)")
	private String brand;
	
	@Column(name = "identity_number", columnDefinition = "VARCHAR(64)")
	private String identityNumber;
	
	@Column(name = "price_for_day", columnDefinition = "INT(11)")
	private String priceForDay;
	
	@Column(name = "color", columnDefinition = "VARCHAR(45)")
	private String color;
	
	@Column(name = "enigne_power", columnDefinition = "INT(11)")
	private String enginePower;
	
	@Column(name = "enigne_size", columnDefinition = "INT(11)")
	private String engineSize;
	
	@Column(name = "is_available", columnDefinition = "TINYINT(1)")
	private String isAvailable;
	
	@Column(name = "id_agency", columnDefinition = "INT(11)")
	private String idAgency;
	
	


}

// ZROBIC REPOSITORY I SERVICY
// ZROBIC REST CONTROLLERY