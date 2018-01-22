package com.pl.rentcars.general.converter;

import com.pl.rentcars.general.dto.CarDTO;
import com.pl.rentcars.general.entity.Car;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;

import java.util.ArrayList;
import java.util.List;

public class CarConverter {

    Mapper mapper = new DozerBeanMapper();

    public Car convert(CarDTO carDto) {
        Car car = mapper.map(carDto, Car.class);
        return car;
    }

    public CarDTO convert(Car car) {
        CarDTO carDto = mapper.map(car, CarDTO.class);
        return carDto;
    }

    public List<CarDTO> convert(List<Car> cars) {
        List<CarDTO> carsDTO = new ArrayList<>();
        for (Car car : cars) {
            carsDTO.add(convert(car));
        }
        return carsDTO;
    }
}
