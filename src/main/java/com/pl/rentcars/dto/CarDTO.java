package com.pl.rentcars.dto;

import lombok.Data;

import javax.persistence.Column;

@Data
public class CarDTO {

    private Long id;
    private String brand;
    private String registrationNumber;
    private Integer priceForDay;
    private String color;
    private Integer enginePower;
    private Integer engineSize;
    private Boolean isAvailable;
    private Long idAgency;

}
