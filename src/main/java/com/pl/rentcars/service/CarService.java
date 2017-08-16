package com.pl.rentcars.service;

import com.pl.rentcars.entity.Car;
import com.pl.rentcars.repository.CarRepository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class CarService {

    public void addCar(){
        System.out.println("ELO");
    }

    public List<Car> getCars(){
        final List cars = carRepository.findAll();
        log.info("getCars");
        return cars;
    }

    @Autowired
    private CarRepository carRepository;
}
