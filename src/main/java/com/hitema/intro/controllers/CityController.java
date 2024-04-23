package com.hitema.intro.controllers;

import com.hitema.intro.models.City;
import com.hitema.intro.models.Country;
import com.hitema.intro.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public List<City> readAll(){
        return cityService.readAll();
    }

    @GetMapping("/city/{id}")
    public City read(@PathVariable long id){
        return cityService.read(id);
    }

    @PostMapping("/city/create")
    public City create(@RequestBody City city){
        return cityService.create(city);
    }
}
