package com.pl.rentcars.converter;

import com.pl.rentcars.dto.CarDTO;
import com.pl.rentcars.entity.Car;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

public class CarConverter {

    Mapper mapper = new DozerBeanMapper();

    public Car convert(CarDTO carDto) {
        Car car = mapper.map(carDto, Car.class);
        return car;
    }
}
