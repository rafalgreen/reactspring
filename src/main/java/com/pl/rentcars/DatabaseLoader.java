package com.pl.rentcars;

import com.pl.rentcars.entity.Car;
import com.pl.rentcars.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final CarRepository repository;

    @Autowired
    public DatabaseLoader(CarRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {

        Car car = new Car(null, "Toyota", "1A", 12, "RED", 2,3, Boolean.TRUE, 1L);
        Car car2 = new Car(null, "Toyota", "2B", 33, "GREEN", 3,5, Boolean.FALSE, 1L);

        this.repository.save(car);
        this.repository.save(car2);


    }
}
