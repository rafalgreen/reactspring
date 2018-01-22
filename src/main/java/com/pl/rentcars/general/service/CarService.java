package com.pl.rentcars.general.service;

import com.pl.rentcars.general.converter.CarConverter;
import com.pl.rentcars.general.dto.CarDTO;
import com.pl.rentcars.general.entity.Car;
import com.pl.rentcars.general.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service//warstwa logiki biznesowej
@Transactional(readOnly = true)
public class CarService {


    @Autowired
    private CarRepository carRepository;

    public void addCar(CarDTO carDto) {
        CarConverter carConverter = new CarConverter();
        Car car = carConverter.convert(carDto);
        carRepository.save(car);
    }

    public void removeCar(Long id) {
        carRepository.delete(id);
    }

    public void updateData(Car car) {
        Car carFromDatabase = carRepository.findOne(car.getId());
        carFromDatabase.setBrand(car.getBrand());
        carFromDatabase.setRegistrationNumber(car.getRegistrationNumber());
        carFromDatabase.setPriceForDay(car.getPriceForDay());
        carFromDatabase.setColor(car.getColor());
        carFromDatabase.setEnginePower(car.getEnginePower());
        carFromDatabase.setEngineSize(car.getEngineSize());
        carFromDatabase.setIsAvailable(car.getIsAvailable());
        carFromDatabase.setIdAgency(car.getIdAgency());
        carRepository.save(carFromDatabase);
    }

    public List<Car> findCars() {

        return carRepository.findAll();
    }

    public Car getById(Long id) {
        return carRepository.findOne(id);
    }


    public List<CarDTO> search(String text) {
        List<Car> cars = carRepository.findByBrandOrColor(text);
        CarConverter converter = new CarConverter();
        return converter.convert(cars);
    }
}
