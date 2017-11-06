package com.pl.rentcars.entity;

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

	@Column(name = "identity_number", columnDefinition = "VARCHAR(64)", nullable = false)
	private String identityNumber;

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
	
	public Car(Long id, String brand, String identityNumber, Integer priceForDay, String color, Integer enginePower,
			Integer engineSize, Boolean isAvailable, Long idAgency) {
		super();
		this.id = id;
		this.brand = brand;
		this.identityNumber = identityNumber;
		this.priceForDay = priceForDay;
		this.color = color;
		this.enginePower = enginePower;
		this.engineSize = engineSize;
		this.isAvailable = isAvailable;
		this.idAgency = idAgency;
	}
	
	public Car() {
		
	}

	

	// w Car mamy Agency
	// w Agency mamy Client itd itd
	// duzo powiazan

	// @OneToOne
	// @JoinColumn(name = "id_agency")
	// private Agency agency;

}