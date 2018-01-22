package com.pl.rentcars.promotion;

import com.pl.rentcars.general.entity.Rent;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class PromotionService {

    @Value("${rentcars.promotion.carId}")
    private int carId;

    @Async
    public String start(Rent rent) throws InterruptedException {
        Thread.sleep(10000);
        if (true) {
            throw new RuntimeException();
        }
        if (rent.getIdCar() == carId) {
            return "Dzieki " + rent.getIdClient() + " za wypozyczenie auta o id " + rent.getIdCar();
        }
        return null;
    }
}
