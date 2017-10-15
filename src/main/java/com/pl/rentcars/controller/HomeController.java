package com.pl.rentcars.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/")
    public String index() {
        return "index";
    }

    @GetMapping
    public ResponseEntity cos(){
        Object object = new Object();
        return ResponseEntity.ok().build();
    }
}
