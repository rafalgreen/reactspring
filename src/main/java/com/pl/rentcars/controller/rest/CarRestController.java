package com.pl.rentcars.controller.rest;

import com.pl.rentcars.dto.CarDTO;
import com.pl.rentcars.entity.Car;
import com.pl.rentcars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/car")
public class CarRestController {
//TODO
    //aktualizacja statusow
    //zmiana kwoty
    //Rent- oddawanie i wypozyczanie
    @Autowired
    private CarService carService;

    @GetMapping(value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity findCars() {
        final List<Car> cars = carService.findCars();
        return ResponseEntity.ok().body("Cars list: " + cars);
    }

    @GetMapping(value = "{id}")
    public ResponseEntity getCar(@PathVariable(value = "id") Long id) {
        Car car = carService.getById(id);
        return ResponseEntity.ok().body(car);
    }

    @PostMapping(value = "")
    public ResponseEntity addCar(CarDTO carDto) {
        carService.addCar(carDto);
        return ResponseEntity.ok().build();
    }
}

