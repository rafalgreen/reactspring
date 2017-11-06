package com.pl.rentcars.entity;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@org.hibernate.annotations.Immutable//niezmienne egzemplarze
@Data
@Table(name = "rents")
public class Rent implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getRentDate() {
		return rentDate;
	}

	public void setRentDate(Date rentDate) {
		this.rentDate = rentDate;
	}

	public Date getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(Date returnDate) {
		this.returnDate = returnDate;
	}

	public Integer getPriceForRent() {
		return PriceForRent;
	}

	public void setPriceForRent(Integer priceForRent) {
		PriceForRent = priceForRent;
	}

	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}

	public Long getIdCar() {
		return idCar;
	}

	public void setIdCar(Long idCar) {
		this.idCar = idCar;
	}

	public Long getRentFrom() {
		return rentFrom;
	}

	public void setRentFrom(Long rentFrom) {
		this.rentFrom = rentFrom;
	}

	public Long getReturnWhere() {
		return returnWhere;
	}

	public void setReturnWhere(Long returnWhere) {
		this.returnWhere = returnWhere;
	}

	public Rent(Long id, Date rentDate, Date returnDate, Integer priceForRent, Long idClient, Long idCar, Long rentFrom,
			Long returnWhere) {
		super();
		this.id = id;
		this.rentDate = rentDate;
		this.returnDate = returnDate;
		PriceForRent = priceForRent;
		this.idClient = idClient;
		this.idCar = idCar;
		this.rentFrom = rentFrom;
		this.returnWhere = returnWhere;
	}
	
	
	public Rent() {
		
	}
	
	

}
