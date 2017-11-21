package com.pl.rentcars.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Date;

@Entity
@org.hibernate.annotations.Immutable//niezmienne egzemplarze
@Data
@Table(name = "rents")
@AllArgsConstructor
@NoArgsConstructor
public class Rent implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column(name = "rent_date", columnDefinition = "DATE")
	private Date rentDate;
	
	@Column(name = "return_date", columnDefinition = "DATE")
	private Date returnDate;
	
	@Column(name = "price_for_rent", columnDefinition = "INT(11)")
	private Integer priceForRent;
	
	@Column(name = "client_id", columnDefinition = "INT(11)")
	private Long idClient;
	
	@Column(name = "car_id", columnDefinition = "INT(11)")
	private Long idCar;
	
	@Column(name = "rent_from", columnDefinition = "INT(11)")
	private Long rentFrom;	
	
	@Column(name = "return_where", columnDefinition = "INT(11)")
	private Long returnWhere;

	/*
	{id: 1
 rentDate: "2017-01-01",
 returnDate: "2017-02-01"
 priceForRent: 10,
 idClient: 1,
 idCar: 1,
 rentFrom: 1,
 returnWhere: 1,
}
	 */

}
