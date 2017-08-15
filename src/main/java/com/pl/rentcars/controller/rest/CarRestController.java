package com.pl.rentcars.controller.rest;


import com.pl.rentcars.service.CarService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@Log4j2
@RequestMapping("api/car")
public class CarRestController {

    @GetMapping("")
    public ResponseEntity getCars(){
        final List cars = carService.getCars();
        log.info("getCars");
        return ResponseEntity.ok().body("cars list: " + cars);
    }

    @PostMapping("")
    public ResponseEntity addCars(){
        return ResponseEntity.ok().body("addCars");
    }



    @Autowired
    private CarService carService;

}
