package com.pl.rentcars.general.dto;

import lombok.Data;

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
