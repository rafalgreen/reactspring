package com.pl.rentcars;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class RentCarsApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentCarsApplication.class, args);
	}
}
