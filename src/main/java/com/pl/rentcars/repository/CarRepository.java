package com.pl.rentcars.repository;

import com.pl.rentcars.entity.Car;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface CarRepository extends JpaRepository<Car, Long> {

	@Query("select car from Car car where upper(car.priceForDay) like concat(upper(:price_for_day), '%')")
	public List<Car> findCarsByPrice(@Param("price_for_day") String priceForDay);

}
