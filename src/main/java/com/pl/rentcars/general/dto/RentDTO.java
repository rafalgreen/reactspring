package com.pl.rentcars.general.dto;

import lombok.Data;

import java.util.Date;

@Data
public class RentDTO {

    private Long id;
    private Date rentDate;
    private Date returnDate;
    private Integer priceForRent;
    private Long idClient;
    private Long idCar;
    private Long rentFrom;
    private Long returnWhere;
}
