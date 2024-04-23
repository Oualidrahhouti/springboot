package com.hitema.intro.services;


import com.hitema.intro.models.City;
import com.hitema.intro.repositories.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CityServiceImpl implements CityService {

    CityRepository cityRepository;

    @Autowired
    public CityServiceImpl(CityRepository cityRepository) {
        this.cityRepository = cityRepository;
    }

    @Override
    public City create(City city) {
        return cityRepository.save(city);
    }

    @Override
    public City read(Long id) {
        return cityRepository.findById(id).orElse(null);
    }

    @Override
    public City update(City city) {
        return cityRepository.save(city);
    }

    @Override
    public Boolean delete(Long id) {
        cityRepository.deleteById(id);
        return read(id)==null;
    }

    @Override
    public List<City> readAll(){
        return cityRepository.findAll();
    }

}
