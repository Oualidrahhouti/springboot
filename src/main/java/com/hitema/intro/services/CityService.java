package com.hitema.intro.services;

import com.hitema.intro.models.City;
import com.hitema.intro.models.Country;

import java.util.List;

public interface CityService {

    public City create(City country);
    public City read(Long id);
    public City update(City country);
    public Boolean delete(Long id);
    public List<City> readAll();

}
