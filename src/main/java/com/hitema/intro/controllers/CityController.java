package com.hitema.intro.controllers;

import com.hitema.intro.models.Country;
import com.hitema.intro.services.CityService;
import com.hitema.intro.services.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cities")
public class CityController {

    final private CityService cityService;

    @Autowired
    public CityController(CityService service) {
        this.cityService = service;
    }

    @GetMapping({"/all","/"})
    public List<Country> readAll(){
        return cityService.readAll();
    }

    @GetMapping("/city/{id}")
    public Country read(@PathVariable long id){
        return cityService.read(id);
    }
}
