package com.pl.rentcars.service;

import com.pl.rentcars.controller.rest.ObjectDTO;
import com.pl.rentcars.entity.Car;
import com.pl.rentcars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service//warstwa logiki biznesowej
@Transactional(readOnly = true)
public class CarService {
	

	@Autowired
	private CarRepository carRepository;

	public void addCar(Car car) {
		carRepository.save(car);
	}

	public void removeCar(Long id) {
		carRepository.delete(id);
	}

	public void updateData(Car car) {
	Car carFromDatabase = carRepository.findOne(car.getId());
		carFromDatabase.setBrand(car.getBrand());
		carFromDatabase.setIdentityNumber(car.getIdentityNumber());
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

	public Car getCar(){
		return carRepository.findOne(1L);
	}


	public List<ObjectDTO> getAllCarsPart() {
		List<Car> cars = carRepository.findAll();

		List<ObjectDTO> carsPart = new ArrayList<>();

		for(Car car: cars){
			carsPart.add(convert(car));
		}

		return carsPart;
	}

	@Cacheable("carsBest")
	public List<ObjectDTO> getAllCarsPartBestPerformance(){
		return carRepository.findAllPart();
	}

	private ObjectDTO convert(Car car){
		if(car != null){
			ObjectDTO objectDTO = new ObjectDTO();
			objectDTO.setBrand(car.getBrand());
			objectDTO.setInteger(car.getEngineSize());
			return objectDTO;
		} else {
			return null;
		}
	}
}
