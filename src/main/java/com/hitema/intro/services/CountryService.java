package com.hitema.intro.services;

import com.hitema.intro.models.Country;

import java.util.List;

public interface CountryService {
    public Country create(Country country);
    public Country read(Long id);
    public Country update(Country country);
    public Boolean delete(Long id);
    public List<Country> readAll();
}
