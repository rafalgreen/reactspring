package com.pl.rentcars.general.controller.rest;

import com.pl.rentcars.general.dto.CarDTO;
import com.pl.rentcars.general.entity.Car;
import com.pl.rentcars.general.service.CarService;
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

    @GetMapping(value = "/search/{text}")
    public ResponseEntity searchText(@PathVariable(value = "text") String text){
        List<CarDTO> cars = carService.search(text);
        return ResponseEntity.ok(cars);
    }

}

//Path variable argumenty sa zawsze wymagane
//request param moze byc input nullem
