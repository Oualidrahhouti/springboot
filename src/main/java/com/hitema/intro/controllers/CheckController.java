package com.hitema.intro.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class CheckController {
    @GetMapping({"/","/check"})
    public  String check(){
        return String.format("<h2 style='color:green;'>le serveur est UP! %s </h2>",LocalDate.now());
    }
}
