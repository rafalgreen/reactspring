package com.pl.rentcars.repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.pl.rentcars.entity.Car;



@Repository//klasa odpowiada za dostep do danych
@Transactional(readOnly = true)
public interface CarRepository extends JpaRepository<Car, Long> {
	                  
	
	

	
	public List<Car> findByBrandAndColor(String brand, String color);
	public List<Car> findByIdentityNumber(String identityNumber);
	
	
	

}
