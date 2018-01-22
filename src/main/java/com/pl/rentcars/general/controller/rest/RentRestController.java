package com.pl.rentcars.general.controller.rest;

import com.pl.rentcars.general.converter.RentConverter;
import com.pl.rentcars.general.dto.RentDTO;
import com.pl.rentcars.general.entity.Rent;
import com.pl.rentcars.promotion.PromotionService;
import com.pl.rentcars.general.service.RentService;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CommonsLog
@RestController
@RequestMapping("api/rent")
public class RentRestController {

    @Autowired
    private RentService rentService;

    @Autowired
    private PromotionService promotion;

    @Autowired
    private RentConverter rentConverter;

    @GetMapping(value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity findRent() {
        final List<Rent> rents = rentService.findAll();
        return ResponseEntity.ok().body("List of rents: " + rents);
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

    @PutMapping(value = "", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity update(@RequestBody RentDTO rentDto) {
        Rent rent = rentService.findOne(rentDto.getId());
        RentConverter rentConverter = new RentConverter();
        rent = rentConverter.convert(rentDto);
       // rentService.save(rent);
        return ResponseEntity.ok().build();
    }
}
