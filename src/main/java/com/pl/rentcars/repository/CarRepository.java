package com.pl.rentcars.repository;

import com.pl.rentcars.entity.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Repository //warstwa pobierania danych
@Transactional(readOnly = true)
public interface CarRepository extends JpaRepository<Car, Long> {


    public List<Car> findByBrandAndColor(String brand, String color);

    public List<Car> findByRegistrationNumber(String registationNumber);

}
