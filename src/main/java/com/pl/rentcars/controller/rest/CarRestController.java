package com.pl.rentcars.controller.rest;

import com.pl.rentcars.entity.Car;
import com.pl.rentcars.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/car")
public class CarRestController {

	@Autowired
	private CarService carService;

	@GetMapping(value = "", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity findCars() {
		final List<Car> cars = carService.findCars();
		return ResponseEntity.ok().body("Cars list: " + cars);
	}

	@GetMapping(value = "{id}")
	public ResponseEntity addCars(

			@PathVariable(value = "id")   Car car) {
		
		carService.addCar(car);
		return ResponseEntity.ok().body("addCars");
	}

	@GetMapping(value = "/partbest")
	public ResponseEntity<List<ObjectDTO>> getCarSmallPartBest(){
		List<ObjectDTO> carsPart = carService.getAllCarsPartBestPerformance();
		return ResponseEntity.ok().body(carsPart);
	}

	@GetMapping(value = "/part")
	public ResponseEntity<List<ObjectDTO>> getCarSmallPart(){
		List<ObjectDTO> carsPart = carService.getAllCarsPart();
		return ResponseEntity.ok().body(carsPart);
	}




}
