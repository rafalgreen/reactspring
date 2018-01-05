package com.pl.rentcars.controller.rest;

import com.pl.rentcars.entity.Rent;
import com.pl.rentcars.promotion.PromotionService;
import com.pl.rentcars.service.RentService;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@CommonsLog
@RestController
@RequestMapping("api/rent")
public class RentRestController {

    @Autowired
    private RentService rentService;

    @Autowired
    private PromotionService promotion;

    @GetMapping(value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity findRent() {
        final List<Rent> rents = rentService.findAll();
        return ResponseEntity.ok().body("List of clients: " + rents);
    }

    @PostMapping("")
    public ResponseEntity addRent(@RequestBody Rent rent) {
        rentService.addRent(rent);
        String message = "Dziekujemy za wypozyczenie";
        try {
            message = promotion.start(rent);
        } catch (Exception ex) {
            log.error("promotion exception for rent id: " + rent.getId(), ex);
        }
        return ResponseEntity.ok().body(message);
    }
}
