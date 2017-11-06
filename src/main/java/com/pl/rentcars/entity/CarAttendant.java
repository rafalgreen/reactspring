package com.pl.rentcars.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "cars_attendant")

public class CarAttendant implements Serializable{
	
	//@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	//private Long id;
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name = "id_car", columnDefinition = "INT(11)", unique = true, nullable = false)
	private Long idCar;
	
	@Column(name = "id_employee", columnDefinition = "INT(11)",nullable = false)
	private Long idEmployee;

	
}
