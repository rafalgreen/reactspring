package com.pl.rentcars.general.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
@Data
@Entity
@Table(name = "cars")
@AllArgsConstructor
@NoArgsConstructor
public class Car implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	// AUTO - provider JPA samodzielnie dobiera strategię
	private Long id;

	@Column(name = "brand", columnDefinition = "VARCHAR(45)", nullable = false)
	private String brand;

	@Column(name = "registration_number", columnDefinition = "VARCHAR(64)", nullable = false)
	private String registrationNumber;

	@Column(name = "price_for_day", columnDefinition = "INT(11)", nullable = false)
	private Integer priceForDay;

	@Column(name = "color", columnDefinition = "VARCHAR(45)", nullable = false)
	private String color;

	@Column(name = "enigne_power", columnDefinition = "INT(11)", nullable = false)
	private Integer enginePower;

	@Column(name = "enigne_size", columnDefinition = "INT(11)", nullable = false)
	private Integer engineSize;

	@Column(name = "is_available", columnDefinition = "TINYINT(1)", nullable = false)
	private Boolean isAvailable;

	@Column(name = "id_agency", columnDefinition = "INT(11)", nullable = false)
	private Long idAgency;
	

	// w Car mamy Agency
	// w Agency mamy Client itd itd
	// duzo powiazan

	// @OneToOne
	// @JoinColumn(name = "id_agency")
	// private Agency agency;

}