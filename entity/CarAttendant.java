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
@Table(name = "cars_attendant")

public class CarAttendant implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@Column(name = "id_car", columnDefinition = "INT")
	private String idCar;
	@Column(name = "id_employee", columnDefinition = "INT")
	private String idEmployee;

}
