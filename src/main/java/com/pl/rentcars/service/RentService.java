package com.pl.rentcars.service;

import com.pl.rentcars.entity.Car;
import com.pl.rentcars.entity.Rent;
import com.pl.rentcars.repository.RentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
@Transactional
public class RentService {
	
	@Autowired
	private RentRepository rentRepository;

	public void addRent(Rent rent) {
		rentRepository.save(rent);
	}

	public void delete(Long id) {
		rentRepository.delete(id);
	}

	public List<Rent> findAll(){
		return rentRepository.findAll();
	}




	public Date getRentDateOrReturnDate() {
		Rent rent = rentRepository.getOne(1L);

		Car car = carService.getCar();

		if (car != null) {
			if (rent.getReturnDate() != null) {
				return rent.getReturnDate();
			} else if (rent.getRentDate() != null) {
				return rent.getRentDate();
			}
		}

		return null;

	}

	@Autowired
	private CarService carService;
}
